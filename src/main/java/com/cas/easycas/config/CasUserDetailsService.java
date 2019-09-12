package com.cas.easycas.config;

import com.cas.easycas.dao.Users;
import com.cas.easycas.repository.UsersRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CasUserDetailsService implements CasUserDetailsServiceInterface {

    private UsersRepository usersRepository;

    public void CasUserDetailsService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users loadUserByUsernameAndCompany(String companyName, String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByCompanyAndUserName(companyName, username)
                .orElseThrow(() -> new UsernameNotFoundException("Company or Username doesn't exists"));
        return user;
    }
}
