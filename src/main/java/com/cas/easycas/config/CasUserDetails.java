package com.cas.easycas.config;

import com.cas.easycas.dao.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CasUserDetails implements UserDetails {

    private Users currentUser;

    public CasUserDetails (Users user) {
        this.currentUser = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
       return this.currentUser.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.currentUser.getEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.currentUser.getEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.currentUser.getEnabled();
    }

    @Override
    public boolean isEnabled() {
        return this.currentUser.getEnabled();
    }
}
