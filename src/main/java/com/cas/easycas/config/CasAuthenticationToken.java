package com.cas.easycas.config;

import lombok.Data;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
public class CasAuthenticationToken extends UsernamePasswordAuthenticationToken {

    private String companyName;

    public CasAuthenticationToken(String companyName, Object username, Object credentials) {
        super(username, credentials);
        this.companyName = companyName;
        super.setAuthenticated(false);
    }

    public CasAuthenticationToken(String companyName, Object username, Object credentials,
                                  Collection<? extends GrantedAuthority> authorities) {
        super(username, credentials, authorities);
        this.companyName = companyName;
        super.setAuthenticated(true);
    }
}
