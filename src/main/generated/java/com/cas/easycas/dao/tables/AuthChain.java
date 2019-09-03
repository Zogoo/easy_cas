/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.AuthChainRecord;

import java.sql.Timestamp;
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
public class AuthChain extends TableImpl<AuthChainRecord> {

    private static final long serialVersionUID = -2117691131;

    /**
     * The reference instance of <code>public.auth_chain</code>
     */
    public static final AuthChain AUTH_CHAIN = new AuthChain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthChainRecord> getRecordType() {
        return AuthChainRecord.class;
    }

    /**
     * The column <code>public.auth_chain.id</code>.
     */
    public final TableField<AuthChainRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('auth_chain_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.auth_chain.user_id</code>.
     */
    public final TableField<AuthChainRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.auth_chain.auth_type</code>.
     */
    public final TableField<AuthChainRecord, String> AUTH_TYPE = createField("auth_type", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.auth_chain.rule_id</code>.
     */
    public final TableField<AuthChainRecord, Long> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.auth_chain.created_at</code>.
     */
    public final TableField<AuthChainRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.auth_chain.updated_at</code>.
     */
    public final TableField<AuthChainRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.auth_chain</code> table reference
     */
    public AuthChain() {
        this(DSL.name("auth_chain"), null);
    }

    /**
     * Create an aliased <code>public.auth_chain</code> table reference
     */
    public AuthChain(String alias) {
        this(DSL.name(alias), AUTH_CHAIN);
    }

    /**
     * Create an aliased <code>public.auth_chain</code> table reference
     */
    public AuthChain(Name alias) {
        this(alias, AUTH_CHAIN);
    }

    private AuthChain(Name alias, Table<AuthChainRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthChain(Name alias, Table<AuthChainRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthChain(Table<O> child, ForeignKey<O, AuthChainRecord> key) {
        super(child, key, AUTH_CHAIN);
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
        return Arrays.<Index>asList(Indexes.AUTH_CHAIN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthChainRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTH_CHAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthChainRecord> getPrimaryKey() {
        return Keys.AUTH_CHAIN_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthChainRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthChainRecord>>asList(Keys.AUTH_CHAIN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthChain as(String alias) {
        return new AuthChain(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthChain as(Name alias) {
        return new AuthChain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthChain rename(String name) {
        return new AuthChain(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthChain rename(Name name) {
        return new AuthChain(name, null);
    }
}
