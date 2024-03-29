/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.AuthInfoRecord;

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
public class AuthInfo extends TableImpl<AuthInfoRecord> {

    private static final long serialVersionUID = -1817667290;

    /**
     * The reference instance of <code>public.auth_info</code>
     */
    public static final AuthInfo AUTH_INFO = new AuthInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthInfoRecord> getRecordType() {
        return AuthInfoRecord.class;
    }

    /**
     * The column <code>public.auth_info.id</code>.
     */
    public final TableField<AuthInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('auth_info_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.auth_info.last_sign_in_at</code>.
     */
    public final TableField<AuthInfoRecord, Timestamp> LAST_SIGN_IN_AT = createField("last_sign_in_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<AuthInfoRecord, Object> LAST_SIGN_IN_IP = createField("last_sign_in_ip", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"inet\""), this, "");

    /**
     * The column <code>public.auth_info.locked_at</code>.
     */
    public final TableField<AuthInfoRecord, Timestamp> LOCKED_AT = createField("locked_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.auth_info.unlocked_at</code>.
     */
    public final TableField<AuthInfoRecord, Timestamp> UNLOCKED_AT = createField("unlocked_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.auth_info.created_at</code>.
     */
    public final TableField<AuthInfoRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.auth_info.updated_at</code>.
     */
    public final TableField<AuthInfoRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.auth_info</code> table reference
     */
    public AuthInfo() {
        this(DSL.name("auth_info"), null);
    }

    /**
     * Create an aliased <code>public.auth_info</code> table reference
     */
    public AuthInfo(String alias) {
        this(DSL.name(alias), AUTH_INFO);
    }

    /**
     * Create an aliased <code>public.auth_info</code> table reference
     */
    public AuthInfo(Name alias) {
        this(alias, AUTH_INFO);
    }

    private AuthInfo(Name alias, Table<AuthInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthInfo(Name alias, Table<AuthInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthInfo(Table<O> child, ForeignKey<O, AuthInfoRecord> key) {
        super(child, key, AUTH_INFO);
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
        return Arrays.<Index>asList(Indexes.AUTH_INFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AuthInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTH_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthInfoRecord> getPrimaryKey() {
        return Keys.AUTH_INFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthInfoRecord>>asList(Keys.AUTH_INFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthInfo as(String alias) {
        return new AuthInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthInfo as(Name alias) {
        return new AuthInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthInfo rename(String name) {
        return new AuthInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthInfo rename(Name name) {
        return new AuthInfo(name, null);
    }
}
