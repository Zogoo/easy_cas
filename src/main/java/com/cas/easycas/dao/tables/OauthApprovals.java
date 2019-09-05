/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.OauthApprovalsRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class OauthApprovals extends TableImpl<OauthApprovalsRecord> {

    private static final long serialVersionUID = -732666655;

    /**
     * The reference instance of <code>public.oauth_approvals</code>
     */
    public static final OauthApprovals OAUTH_APPROVALS = new OauthApprovals();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthApprovalsRecord> getRecordType() {
        return OauthApprovalsRecord.class;
    }

    /**
     * The column <code>public.oauth_approvals.userid</code>.
     */
    public final TableField<OauthApprovalsRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.oauth_approvals.clientid</code>.
     */
    public final TableField<OauthApprovalsRecord, String> CLIENTID = createField("clientid", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.oauth_approvals.scope</code>.
     */
    public final TableField<OauthApprovalsRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.oauth_approvals.status</code>.
     */
    public final TableField<OauthApprovalsRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.oauth_approvals.expiresat</code>.
     */
    public final TableField<OauthApprovalsRecord, Timestamp> EXPIRESAT = createField("expiresat", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.oauth_approvals.lastmodifiedat</code>.
     */
    public final TableField<OauthApprovalsRecord, Timestamp> LASTMODIFIEDAT = createField("lastmodifiedat", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.oauth_approvals</code> table reference
     */
    public OauthApprovals() {
        this(DSL.name("oauth_approvals"), null);
    }

    /**
     * Create an aliased <code>public.oauth_approvals</code> table reference
     */
    public OauthApprovals(String alias) {
        this(DSL.name(alias), OAUTH_APPROVALS);
    }

    /**
     * Create an aliased <code>public.oauth_approvals</code> table reference
     */
    public OauthApprovals(Name alias) {
        this(alias, OAUTH_APPROVALS);
    }

    private OauthApprovals(Name alias, Table<OauthApprovalsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthApprovals(Name alias, Table<OauthApprovalsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OauthApprovals(Table<O> child, ForeignKey<O, OauthApprovalsRecord> key) {
        super(child, key, OAUTH_APPROVALS);
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
    public OauthApprovals as(String alias) {
        return new OauthApprovals(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthApprovals as(Name alias) {
        return new OauthApprovals(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthApprovals rename(String name) {
        return new OauthApprovals(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthApprovals rename(Name name) {
        return new OauthApprovals(name, null);
    }
}
