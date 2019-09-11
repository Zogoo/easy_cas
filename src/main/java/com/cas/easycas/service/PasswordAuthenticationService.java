package com.cas.easycas.service;

import com.cas.easycas.config.CasAuthenticationToken;
import com.cas.easycas.config.filter.CasAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PasswordAuthenticationService implements AuthenticationProvider {

    @Autowired(required = false)
    private HttpServletRequest request;

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
