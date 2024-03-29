/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables.records;


import com.cas.easycas.dao.tables.OauthClientToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OauthClientTokenRecord extends UpdatableRecordImpl<OauthClientTokenRecord> implements Record5<String, byte[], String, Long, String> {

    private static final long serialVersionUID = -1020897324;

    /**
     * Setter for <code>public.oauth_client_token.token_id</code>.
     */
    public OauthClientTokenRecord setTokenId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.oauth_client_token.token_id</code>.
     */
    public String getTokenId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.oauth_client_token.token</code>.
     */
    public OauthClientTokenRecord setToken(byte... value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.oauth_client_token.token</code>.
     */
    public byte[] getToken() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>public.oauth_client_token.authentication_id</code>.
     */
    public OauthClientTokenRecord setAuthenticationId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.oauth_client_token.authentication_id</code>.
     */
    public String getAuthenticationId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.oauth_client_token.user_id</code>.
     */
    public OauthClientTokenRecord setUserId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.oauth_client_token.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.oauth_client_token.client_id</code>.
     */
    public OauthClientTokenRecord setClientId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.oauth_client_token.client_id</code>.
     */
    public String getClientId() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, byte[], String, Long, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, byte[], String, Long, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.AUTHENTICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OauthClientToken.OAUTH_CLIENT_TOKEN.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAuthenticationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value1(String value) {
        setTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value2(byte... value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value3(String value) {
        setAuthenticationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value4(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord value5(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientTokenRecord values(String value1, byte[] value2, String value3, Long value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthClientTokenRecord
     */
    public OauthClientTokenRecord() {
        super(OauthClientToken.OAUTH_CLIENT_TOKEN);
    }

    /**
     * Create a detached, initialised OauthClientTokenRecord
     */
    public OauthClientTokenRecord(String tokenId, byte[] token, String authenticationId, Long userId, String clientId) {
        super(OauthClientToken.OAUTH_CLIENT_TOKEN);

        set(0, tokenId);
        set(1, token);
        set(2, authenticationId);
        set(3, userId);
        set(4, clientId);
    }
}
