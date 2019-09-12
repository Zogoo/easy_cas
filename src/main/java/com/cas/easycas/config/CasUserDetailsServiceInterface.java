package com.cas.easycas.config;

import com.cas.easycas.dao.Users;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface CasUserDetailsServiceInterface {
    Users loadUserByUsernameAndCompany(String companyName, String username) throws UsernameNotFoundException;
}
