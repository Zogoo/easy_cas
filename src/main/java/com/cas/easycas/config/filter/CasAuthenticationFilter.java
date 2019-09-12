package com.cas.easycas.config.filter;

import com.cas.easycas.config.CasAuthenticationToken;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
public class CasAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    public static final String COMPANY_NAME_KEY = "company";

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        if (!request.getMethod().equals("POST")) {
            throw new AuthenticationServiceException("Not supported request:" + request.getMethod());
        }

        CasAuthenticationToken authRequest = getAuthRequest(request);
        setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
    }

    private CasAuthenticationToken getAuthRequest(HttpServletRequest request) {
        String username = Optional.of(obtainUsername(request)).orElse("");
        String password = Optional.of(obtainPassword(request)).orElse("");
        String companyName = Optional.of(obtainCompanyName(request)).orElse("");
        return new CasAuthenticationToken(companyName, username, password);
    }

    private String obtainCompanyName(HttpServletRequest request) {
        return request.getParameter(COMPANY_NAME_KEY);
    }
}
