package com.cas.easycas.service;

import com.cas.easycas.config.CasAuthenticationToken;
import com.cas.easycas.config.CasUserDetails;
import com.cas.easycas.config.CasUserDetailsService;
import com.cas.easycas.config.filter.CasAuthenticationFilter;
import com.cas.easycas.dao.Users;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Component
public class PasswordAuthenticationService extends AbstractUserDetailsAuthenticationProvider {

    private PasswordEncoder passwordEncoder;
    private CasUserDetailsService userDetailsService;

    public PasswordAuthenticationService(PasswordEncoder passwordEncoder, CasUserDetailsService userDetailsService) {
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }

    @Autowired(required = false)
    private HttpServletRequest request;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        String credentials = Optional.of(authentication.getCredentials())
                .orElseThrow(()-> new BadCredentialsException("Bad credentials")).toString();
        if(!passwordEncoder.matches(credentials, userDetails.getPassword())){
            throw new BadCredentialsException("Wrong credentials");
        }
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        CasAuthenticationToken auth = (CasAuthenticationToken) authentication;
        Users currentUser;

        currentUser = this.userDetailsService.loadUserByUsernameAndCompany(auth.getCompanyName(), auth.getPrincipal().toString());

        return new CasUserDetails(currentUser);
    }

    @Override
    protected void doAfterPropertiesSet() throws Exception {
        Assert.notNull(this.userDetailsService, "A UserDetailsService must be set");
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        String companyName = request.getParameter(CasAuthenticationFilter.COMPANY_NAME_KEY);

        return new CasAuthenticationToken(companyName, name, password);
    }

    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(CasAuthenticationToken.class);
    }

}
