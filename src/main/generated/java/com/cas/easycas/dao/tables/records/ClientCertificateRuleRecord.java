/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables.records;


import com.cas.easycas.dao.tables.ClientCertificateRule;

import java.sql.Timestamp;

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
public class ClientCertificateRuleRecord extends UpdatableRecordImpl<ClientCertificateRuleRecord> implements Record5<Integer, Long, Long, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1903386688;

    /**
     * Setter for <code>public.client_certificate_rule.id</code>.
     */
    public ClientCertificateRuleRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.client_certificate_rule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.client_certificate_rule.chain_id</code>.
     */
    public ClientCertificateRuleRecord setChainId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.client_certificate_rule.chain_id</code>.
     */
    public Long getChainId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.client_certificate_rule.root_certificate_id</code>.
     */
    public ClientCertificateRuleRecord setRootCertificateId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.client_certificate_rule.root_certificate_id</code>.
     */
    public Long getRootCertificateId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.client_certificate_rule.created_at</code>.
     */
    public ClientCertificateRuleRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.client_certificate_rule.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.client_certificate_rule.updated_at</code>.
     */
    public ClientCertificateRuleRecord setUpdatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.client_certificate_rule.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, Long, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, Long, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClientCertificateRule.CLIENT_CERTIFICATE_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ClientCertificateRule.CLIENT_CERTIFICATE_RULE.CHAIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ClientCertificateRule.CLIENT_CERTIFICATE_RULE.ROOT_CERTIFICATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ClientCertificateRule.CLIENT_CERTIFICATE_RULE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ClientCertificateRule.CLIENT_CERTIFICATE_RULE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getChainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRootCertificateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getChainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRootCertificateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord value2(Long value) {
        setChainId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord value3(Long value) {
        setRootCertificateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCertificateRuleRecord values(Integer value1, Long value2, Long value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached ClientCertificateRuleRecord
     */
    public ClientCertificateRuleRecord() {
        super(ClientCertificateRule.CLIENT_CERTIFICATE_RULE);
    }

    /**
     * Create a detached, initialised ClientCertificateRuleRecord
     */
    public ClientCertificateRuleRecord(Integer id, Long chainId, Long rootCertificateId, Timestamp createdAt, Timestamp updatedAt) {
        super(ClientCertificateRule.CLIENT_CERTIFICATE_RULE);

        set(0, id);
        set(1, chainId);
        set(2, rootCertificateId);
        set(3, createdAt);
        set(4, updatedAt);
    }
}
