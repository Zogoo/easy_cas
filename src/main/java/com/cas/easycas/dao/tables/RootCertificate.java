/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.RootCertificateRecord;

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
public class RootCertificate extends TableImpl<RootCertificateRecord> {

    private static final long serialVersionUID = 268646477;

    /**
     * The reference instance of <code>public.root_certificate</code>
     */
    public static final RootCertificate ROOT_CERTIFICATE = new RootCertificate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RootCertificateRecord> getRecordType() {
        return RootCertificateRecord.class;
    }

    /**
     * The column <code>public.root_certificate.id</code>.
     */
    public final TableField<RootCertificateRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('root_certificate_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.root_certificate.company_id</code>.
     */
    public final TableField<RootCertificateRecord, Long> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.root_certificate.name</code>.
     */
    public final TableField<RootCertificateRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.common_name</code>.
     */
    public final TableField<RootCertificateRecord, String> COMMON_NAME = createField("common_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.organization</code>.
     */
    public final TableField<RootCertificateRecord, String> ORGANIZATION = createField("organization", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.organizational_unit</code>.
     */
    public final TableField<RootCertificateRecord, String> ORGANIZATIONAL_UNIT = createField("organizational_unit", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.locality</code>.
     */
    public final TableField<RootCertificateRecord, String> LOCALITY = createField("locality", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.state</code>.
     */
    public final TableField<RootCertificateRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.country_name</code>.
     */
    public final TableField<RootCertificateRecord, String> COUNTRY_NAME = createField("country_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.email</code>.
     */
    public final TableField<RootCertificateRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.root_certificate</code>.
     */
    public final TableField<RootCertificateRecord, String> ROOT_CERTIFICATE_ = createField("root_certificate", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.root_certificate.is_enforced</code>.
     */
    public final TableField<RootCertificateRecord, Boolean> IS_ENFORCED = createField("is_enforced", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.root_certificate.is_default</code>.
     */
    public final TableField<RootCertificateRecord, Boolean> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.root_certificate.created_at</code>.
     */
    public final TableField<RootCertificateRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.root_certificate.updated_at</code>.
     */
    public final TableField<RootCertificateRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.root_certificate</code> table reference
     */
    public RootCertificate() {
        this(DSL.name("root_certificate"), null);
    }

    /**
     * Create an aliased <code>public.root_certificate</code> table reference
     */
    public RootCertificate(String alias) {
        this(DSL.name(alias), ROOT_CERTIFICATE);
    }

    /**
     * Create an aliased <code>public.root_certificate</code> table reference
     */
    public RootCertificate(Name alias) {
        this(alias, ROOT_CERTIFICATE);
    }

    private RootCertificate(Name alias, Table<RootCertificateRecord> aliased) {
        this(alias, aliased, null);
    }

    private RootCertificate(Name alias, Table<RootCertificateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RootCertificate(Table<O> child, ForeignKey<O, RootCertificateRecord> key) {
        super(child, key, ROOT_CERTIFICATE);
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
        return Arrays.<Index>asList(Indexes.ROOT_CERTIFICATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RootCertificateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ROOT_CERTIFICATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RootCertificateRecord> getPrimaryKey() {
        return Keys.ROOT_CERTIFICATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RootCertificateRecord>> getKeys() {
        return Arrays.<UniqueKey<RootCertificateRecord>>asList(Keys.ROOT_CERTIFICATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RootCertificate as(String alias) {
        return new RootCertificate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RootCertificate as(Name alias) {
        return new RootCertificate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RootCertificate rename(String name) {
        return new RootCertificate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RootCertificate rename(Name name) {
        return new RootCertificate(name, null);
    }
}
