package com.cas.easycas.service;

import com.cas.easycas.config.CasUserDetail;
import com.cas.easycas.dao.Users;
import com.cas.easycas.repository.UsersRepository;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CasUserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    public CasUserDetail loadUserByUsername(String name) throws UsernameNotFoundException, DataAccessException {
        // returns the get(0) of the user list obtained from the db
        Users user = usersRepository.findByName(name).orElseThrow(()-> new UsernameNotFoundException(name));


        Set<Role> roles = domainUser.getRole();
        logger.debug("role of the user" + roles);

        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for(Role role: roles){
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
            logger.debug("role" + role + " role.getRole()" + (role.getRole()));
        }

        CustomUserDetail customUserDetail=new CustomUserDetail();
        customUserDetail.setUser(domainUser);
        customUserDetail.setAuthorities(authorities);

        return customUserDetail;

    }

}
