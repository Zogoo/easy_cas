package com.cas.easycas.repository;

import com.cas.easycas.dao.Roles;
import com.cas.easycas.dao.Users;
import com.cas.easycas.dao.tables.PasswordRule;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.cas.easycas.dao.tables.Users.USERS;
import static com.cas.easycas.dao.tables.Authorities.AUTHORITIES;
import static com.cas.easycas.dao.tables.AuthChain.AUTH_CHAIN;
import static com.cas.easycas.dao.tables.PasswordRule.PASSWORD_RULE;
import static com.cas.easycas.dao.tables.Companies.COMPANIES;

@Repository
public class UsersRepository {
    @Autowired
    DSLContext dslContext; //JOOQ context based on database datasource

    @Transactional(readOnly = true)
    public Optional<Users> findByCompanyAndUserName(String companyName, String userName) {
        return dslContext.select()
                .from(USERS)
                .join(COMPANIES)
                .on(USERS.COMPANY_ID.eq(COMPANIES.ID))
                .where(USERS.USER_NAME.equal(userName).and(COMPANIES.NAME.equal(companyName)))
                .fetchOptionalInto(Users.class);
    }

    @Transactional(readOnly = true)
    public List<Roles> getUserRoles(String userName) {
        return dslContext.select()
                .from(AUTHORITIES)
                .join(USERS)
                .on(AUTHORITIES.USER_ID.eq(USERS.ID))
                .where(USERS.USER_NAME.eq(userName))
                .fetchInto(Roles.class);
    }

    @Transactional(readOnly = true)
    public List<PasswordRule> getUserPasswordRules(String userName) {
        return dslContext.select()
                .from(PASSWORD_RULE)
                .join(AUTH_CHAIN)
                .on(PASSWORD_RULE.CHAIN_ID.eq(AUTH_CHAIN.ID))
                .join(USERS).on(AUTH_CHAIN.USER_ID.eq(USERS.ID))
                .where(USERS.USER_NAME.eq(userName))
                .fetchInto(PasswordRule.class);
    }
}
