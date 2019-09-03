/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables.records;


import com.cas.easycas.dao.tables.SamlRule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SamlRuleRecord extends UpdatableRecordImpl<SamlRuleRecord> implements Record4<Integer, Long, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1414040987;

    /**
     * Setter for <code>public.saml_rule.id</code>.
     */
    public SamlRuleRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.saml_rule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.saml_rule.chain_id</code>.
     */
    public SamlRuleRecord setChainId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.saml_rule.chain_id</code>.
     */
    public Long getChainId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.saml_rule.created_at</code>.
     */
    public SamlRuleRecord setCreatedAt(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.saml_rule.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.saml_rule.updated_at</code>.
     */
    public SamlRuleRecord setUpdatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.saml_rule.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Long, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Long, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SamlRule.SAML_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SamlRule.SAML_RULE.CHAIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SamlRule.SAML_RULE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SamlRule.SAML_RULE.UPDATED_AT;
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
    public Timestamp component3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
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
    public Timestamp value3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SamlRuleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SamlRuleRecord value2(Long value) {
        setChainId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SamlRuleRecord value3(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SamlRuleRecord value4(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SamlRuleRecord values(Integer value1, Long value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SamlRuleRecord
     */
    public SamlRuleRecord() {
        super(SamlRule.SAML_RULE);
    }

    /**
     * Create a detached, initialised SamlRuleRecord
     */
    public SamlRuleRecord(Integer id, Long chainId, Timestamp createdAt, Timestamp updatedAt) {
        super(SamlRule.SAML_RULE);

        set(0, id);
        set(1, chainId);
        set(2, createdAt);
        set(3, updatedAt);
    }
}
