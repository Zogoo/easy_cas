/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.OauthClientTokenRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class OauthClientToken extends TableImpl<OauthClientTokenRecord> {

    private static final long serialVersionUID = 443506605;

    /**
     * The reference instance of <code>public.oauth_client_token</code>
     */
    public static final OauthClientToken OAUTH_CLIENT_TOKEN = new OauthClientToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthClientTokenRecord> getRecordType() {
        return OauthClientTokenRecord.class;
    }

    /**
     * The column <code>public.oauth_client_token.token_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.oauth_client_token.token</code>.
     */
    public final TableField<OauthClientTokenRecord, byte[]> TOKEN = createField("token", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>public.oauth_client_token.authentication_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> AUTHENTICATION_ID = createField("authentication_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.oauth_client_token.user_id</code>.
     */
    public final TableField<OauthClientTokenRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.oauth_client_token.client_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>public.oauth_client_token</code> table reference
     */
    public OauthClientToken() {
        this(DSL.name("oauth_client_token"), null);
    }

    /**
     * Create an aliased <code>public.oauth_client_token</code> table reference
     */
    public OauthClientToken(String alias) {
        this(DSL.name(alias), OAUTH_CLIENT_TOKEN);
    }

    /**
     * Create an aliased <code>public.oauth_client_token</code> table reference
     */
    public OauthClientToken(Name alias) {
        this(alias, OAUTH_CLIENT_TOKEN);
    }

    private OauthClientToken(Name alias, Table<OauthClientTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthClientToken(Name alias, Table<OauthClientTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OauthClientToken(Table<O> child, ForeignKey<O, OauthClientTokenRecord> key) {
        super(child, key, OAUTH_CLIENT_TOKEN);
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
        return Arrays.<Index>asList(Indexes.OAUTH_CLIENT_TOKEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthClientTokenRecord> getPrimaryKey() {
        return Keys.OAUTH_CLIENT_TOKEN_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthClientTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthClientTokenRecord>>asList(Keys.OAUTH_CLIENT_TOKEN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OauthClientTokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OauthClientTokenRecord, ?>>asList(Keys.OAUTH_CLIENT_TOKEN__OAUTH_CLIENT_TOKEN_USER_ID_FKEY);
    }

    public Users users() {
        return new Users(this, Keys.OAUTH_CLIENT_TOKEN__OAUTH_CLIENT_TOKEN_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientToken as(String alias) {
        return new OauthClientToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientToken as(Name alias) {
        return new OauthClientToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientToken rename(String name) {
        return new OauthClientToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientToken rename(Name name) {
        return new OauthClientToken(name, null);
    }
}
