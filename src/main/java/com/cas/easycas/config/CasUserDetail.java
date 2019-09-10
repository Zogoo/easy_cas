package com.cas.easycas.config;

import com.cas.easycas.dao.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

public class CasUserDetail implements UserDetails {
    private static final long serialVersionUID = 1L;
    private Users user;

    Set<GrantedAuthority> authorities=null;

    public User getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities)
    {
        this.authorities=authorities;
    }

    public String getPassword() {
        return user.();
    }

    public String getUsername() {
        return user.getProfileName();
    }

    public boolean isAccountNonExpired() {
        return user.isAccountNonExpired();
    }

    public boolean isAccountNonLocked() {
        return user.isAccountNonLocked();
    }

    public boolean isCredentialsNonExpired() {
        return user.isCredentialsNonExpired();
    }

    public boolean isEnabled() {
        return user.isAccountEnabled();
    }
}
