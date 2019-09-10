package com.cas.easycas.repository;

import com.cas.easycas.dao.Roles;
import com.cas.easycas.dao.Users;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.cas.easycas.dao.tables.Users.USERS;
import static com.cas.easycas.dao.tables.Authorities.AUTHORITIES;

public class UsersRepository {
    @Autowired
    DSLContext dslContext; //JOOQ context based on database datasource

    @Transactional(readOnly = true)
    public Optional<Users> findByName(String userName) {
        return dslContext.select()
                .from(USERS)
                .where(USERS.USER_NAME.equal(userName))
                .fetchOptionalInto(Users.class);
    }

    @Transactional(readOnly = true)
    public List<Roles> getUserRoles(String userName) {
        return dslContext.select().from(AUTHORITIES.join(USERS).on(AUTHORITIES.USER_ID.eq(USERS.ID))).fetchInto(Roles.class);
    }

    public UserDetails fetchUserDetailsByName(String userName) {
        Users users = dslContext.select()
                .from(USERS)
                .where(USERS.USER_NAME.equal(userName))
                .fetchOptionalInto(Users.class)
                .orElseThrow(() -> new UsernameNotFoundException(userName));
        return new User(
                users.getUserName(),
                "!QAZ2wsx",
                users.getEnabled(),
                true,
                true,
                true,
                getUserRoles(userName)
        );
    }

    public List<GrantedAuthority> getAuthorities(String userName) {
        return getUserRoles();
    }
}
