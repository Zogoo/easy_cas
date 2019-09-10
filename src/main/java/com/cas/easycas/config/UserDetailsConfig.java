package com.cas.easycas.config;

import com.cas.easycas.dao.tables.Users;
import com.cas.easycas.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsConfig implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<Users> users = usersRepository.findByName(username);
        Users existingUser = users.orElseThrow(() -> new UsernameNotFoundException(username));

    }
}
