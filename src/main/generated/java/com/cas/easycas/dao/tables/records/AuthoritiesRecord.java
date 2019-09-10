/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables.records;


import com.cas.easycas.dao.tables.Authorities;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class AuthoritiesRecord extends TableRecordImpl<AuthoritiesRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = -122825336;

    /**
     * Setter for <code>public.authorities.user_id</code>.
     */
    public AuthoritiesRecord setUserId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.authorities.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.authorities.authority</code>.
     */
    public AuthoritiesRecord setAuthority(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.authorities.authority</code>.
     */
    public String getAuthority() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Authorities.AUTHORITIES.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Authorities.AUTHORITIES.AUTHORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAuthority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAuthority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord value2(String value) {
        setAuthority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthoritiesRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthoritiesRecord
     */
    public AuthoritiesRecord() {
        super(Authorities.AUTHORITIES);
    }

    /**
     * Create a detached, initialised AuthoritiesRecord
     */
    public AuthoritiesRecord(Long userId, String authority) {
        super(Authorities.AUTHORITIES);

        set(0, userId);
        set(1, authority);
    }
}
