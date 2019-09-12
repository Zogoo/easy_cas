/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.CompaniesRecord;

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
public class Companies extends TableImpl<CompaniesRecord> {

    private static final long serialVersionUID = -1692574364;

    /**
     * The reference instance of <code>public.companies</code>
     */
    public static final Companies COMPANIES = new Companies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompaniesRecord> getRecordType() {
        return CompaniesRecord.class;
    }

    /**
     * The column <code>public.companies.id</code>.
     */
    public final TableField<CompaniesRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('companies_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.companies.name</code>.
     */
    public final TableField<CompaniesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>public.companies</code> table reference
     */
    public Companies() {
        this(DSL.name("companies"), null);
    }

    /**
     * Create an aliased <code>public.companies</code> table reference
     */
    public Companies(String alias) {
        this(DSL.name(alias), COMPANIES);
    }

    /**
     * Create an aliased <code>public.companies</code> table reference
     */
    public Companies(Name alias) {
        this(alias, COMPANIES);
    }

    private Companies(Name alias, Table<CompaniesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Companies(Name alias, Table<CompaniesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Companies(Table<O> child, ForeignKey<O, CompaniesRecord> key) {
        super(child, key, COMPANIES);
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
        return Arrays.<Index>asList(Indexes.COMPANIES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CompaniesRecord, Long> getIdentity() {
        return Keys.IDENTITY_COMPANIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompaniesRecord> getPrimaryKey() {
        return Keys.COMPANIES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompaniesRecord>> getKeys() {
        return Arrays.<UniqueKey<CompaniesRecord>>asList(Keys.COMPANIES_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Companies as(String alias) {
        return new Companies(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Companies as(Name alias) {
        return new Companies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Companies rename(String name) {
        return new Companies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Companies rename(Name name) {
        return new Companies(name, null);
    }
}
