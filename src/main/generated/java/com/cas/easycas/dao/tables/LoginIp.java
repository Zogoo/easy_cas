/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.LoginIpRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginIp extends TableImpl<LoginIpRecord> {

    private static final long serialVersionUID = -560019368;

    /**
     * The reference instance of <code>public.login_ip</code>
     */
    public static final LoginIp LOGIN_IP = new LoginIp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoginIpRecord> getRecordType() {
        return LoginIpRecord.class;
    }

    /**
     * The column <code>public.login_ip.id</code>.
     */
    public final TableField<LoginIpRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('login_ip_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.login_ip.company_id</code>.
     */
    public final TableField<LoginIpRecord, Long> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.login_ip</code> table reference
     */
    public LoginIp() {
        this(DSL.name("login_ip"), null);
    }

    /**
     * Create an aliased <code>public.login_ip</code> table reference
     */
    public LoginIp(String alias) {
        this(DSL.name(alias), LOGIN_IP);
    }

    /**
     * Create an aliased <code>public.login_ip</code> table reference
     */
    public LoginIp(Name alias) {
        this(alias, LOGIN_IP);
    }

    private LoginIp(Name alias, Table<LoginIpRecord> aliased) {
        this(alias, aliased, null);
    }

    private LoginIp(Name alias, Table<LoginIpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LoginIp(Table<O> child, ForeignKey<O, LoginIpRecord> key) {
        super(child, key, LOGIN_IP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LOGIN_IP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LoginIpRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOGIN_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoginIpRecord> getPrimaryKey() {
        return Keys.LOGIN_IP_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoginIpRecord>> getKeys() {
        return Arrays.<UniqueKey<LoginIpRecord>>asList(Keys.LOGIN_IP_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoginIp as(String alias) {
        return new LoginIp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoginIp as(Name alias) {
        return new LoginIp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LoginIp rename(String name) {
        return new LoginIp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LoginIp rename(Name name) {
        return new LoginIp(name, null);
    }
}