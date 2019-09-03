/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables.records;


import com.cas.easycas.dao.tables.PasswordRule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class PasswordRuleRecord extends UpdatableRecordImpl<PasswordRuleRecord> implements Record14<Integer, Long, Long, Integer, Integer, Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1073713995;

    /**
     * Setter for <code>public.password_rule.id</code>.
     */
    public PasswordRuleRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.password_rule.chain_id</code>.
     */
    public PasswordRuleRecord setChainId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.chain_id</code>.
     */
    public Long getChainId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.password_rule.auth_info_id</code>.
     */
    public PasswordRuleRecord setAuthInfoId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.auth_info_id</code>.
     */
    public Long getAuthInfoId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.password_rule.allowed_retry_count</code>.
     */
    public PasswordRuleRecord setAllowedRetryCount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.allowed_retry_count</code>.
     */
    public Integer getAllowedRetryCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.password_rule.failed_attempts</code>.
     */
    public PasswordRuleRecord setFailedAttempts(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.failed_attempts</code>.
     */
    public Integer getFailedAttempts() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.password_rule.sign_in_count</code>.
     */
    public PasswordRuleRecord setSignInCount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.sign_in_count</code>.
     */
    public Integer getSignInCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.password_rule.password_salt</code>.
     */
    public PasswordRuleRecord setPasswordSalt(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.password_salt</code>.
     */
    public String getPasswordSalt() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.password_rule.email</code>.
     */
    public PasswordRuleRecord setEmail(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.email</code>.
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.password_rule.encrypted_password</code>.
     */
    public PasswordRuleRecord setEncryptedPassword(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.encrypted_password</code>.
     */
    public String getEncryptedPassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.password_rule.confirmation_token</code>.
     */
    public PasswordRuleRecord setConfirmationToken(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.confirmation_token</code>.
     */
    public String getConfirmationToken() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.password_rule.confirmed_at</code>.
     */
    public PasswordRuleRecord setConfirmedAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.confirmed_at</code>.
     */
    public Timestamp getConfirmedAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>public.password_rule.confirmation_sent_at</code>.
     */
    public PasswordRuleRecord setConfirmationSentAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.confirmation_sent_at</code>.
     */
    public Timestamp getConfirmationSentAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>public.password_rule.created_at</code>.
     */
    public PasswordRuleRecord setCreatedAt(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>public.password_rule.updated_at</code>.
     */
    public PasswordRuleRecord setUpdatedAt(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.password_rule.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Long, Long, Integer, Integer, Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Long, Long, Integer, Integer, Integer, String, String, String, String, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PasswordRule.PASSWORD_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PasswordRule.PASSWORD_RULE.CHAIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PasswordRule.PASSWORD_RULE.AUTH_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PasswordRule.PASSWORD_RULE.ALLOWED_RETRY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PasswordRule.PASSWORD_RULE.FAILED_ATTEMPTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return PasswordRule.PASSWORD_RULE.SIGN_IN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PasswordRule.PASSWORD_RULE.PASSWORD_SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PasswordRule.PASSWORD_RULE.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return PasswordRule.PASSWORD_RULE.ENCRYPTED_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return PasswordRule.PASSWORD_RULE.CONFIRMATION_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return PasswordRule.PASSWORD_RULE.CONFIRMED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return PasswordRule.PASSWORD_RULE.CONFIRMATION_SENT_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return PasswordRule.PASSWORD_RULE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return PasswordRule.PASSWORD_RULE.UPDATED_AT;
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
        return getAuthInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAllowedRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFailedAttempts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSignInCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPasswordSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getConfirmationToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getConfirmedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getConfirmationSentAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
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
        return getAuthInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAllowedRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFailedAttempts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSignInCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPasswordSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEncryptedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getConfirmationToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getConfirmedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getConfirmationSentAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value2(Long value) {
        setChainId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value3(Long value) {
        setAuthInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value4(Integer value) {
        setAllowedRetryCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value5(Integer value) {
        setFailedAttempts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value6(Integer value) {
        setSignInCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value7(String value) {
        setPasswordSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value9(String value) {
        setEncryptedPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value10(String value) {
        setConfirmationToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value11(Timestamp value) {
        setConfirmedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value12(Timestamp value) {
        setConfirmationSentAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value13(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord value14(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordRuleRecord values(Integer value1, Long value2, Long value3, Integer value4, Integer value5, Integer value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12, Timestamp value13, Timestamp value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PasswordRuleRecord
     */
    public PasswordRuleRecord() {
        super(PasswordRule.PASSWORD_RULE);
    }

    /**
     * Create a detached, initialised PasswordRuleRecord
     */
    public PasswordRuleRecord(Integer id, Long chainId, Long authInfoId, Integer allowedRetryCount, Integer failedAttempts, Integer signInCount, String passwordSalt, String email, String encryptedPassword, String confirmationToken, Timestamp confirmedAt, Timestamp confirmationSentAt, Timestamp createdAt, Timestamp updatedAt) {
        super(PasswordRule.PASSWORD_RULE);

        set(0, id);
        set(1, chainId);
        set(2, authInfoId);
        set(3, allowedRetryCount);
        set(4, failedAttempts);
        set(5, signInCount);
        set(6, passwordSalt);
        set(7, email);
        set(8, encryptedPassword);
        set(9, confirmationToken);
        set(10, confirmedAt);
        set(11, confirmationSentAt);
        set(12, createdAt);
        set(13, updatedAt);
    }
}
