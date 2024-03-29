/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.DeviseRuleRecord;

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
public class DeviseRule extends TableImpl<DeviseRuleRecord> {

    private static final long serialVersionUID = -772270011;

    /**
     * The reference instance of <code>public.devise_rule</code>
     */
    public static final DeviseRule DEVISE_RULE = new DeviseRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeviseRuleRecord> getRecordType() {
        return DeviseRuleRecord.class;
    }

    /**
     * The column <code>public.devise_rule.id</code>.
     */
    public final TableField<DeviseRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('devise_rule_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.devise_rule.chain_id</code>.
     */
    public final TableField<DeviseRuleRecord, Long> CHAIN_ID = createField("chain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.devise_rule.created_at</code>.
     */
    public final TableField<DeviseRuleRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.devise_rule.updated_at</code>.
     */
    public final TableField<DeviseRuleRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.devise_rule</code> table reference
     */
    public DeviseRule() {
        this(DSL.name("devise_rule"), null);
    }

    /**
     * Create an aliased <code>public.devise_rule</code> table reference
     */
    public DeviseRule(String alias) {
        this(DSL.name(alias), DEVISE_RULE);
    }

    /**
     * Create an aliased <code>public.devise_rule</code> table reference
     */
    public DeviseRule(Name alias) {
        this(alias, DEVISE_RULE);
    }

    private DeviseRule(Name alias, Table<DeviseRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeviseRule(Name alias, Table<DeviseRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DeviseRule(Table<O> child, ForeignKey<O, DeviseRuleRecord> key) {
        super(child, key, DEVISE_RULE);
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
        return Arrays.<Index>asList(Indexes.DEVISE_RULE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DeviseRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DEVISE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DeviseRuleRecord> getPrimaryKey() {
        return Keys.DEVISE_RULE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DeviseRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<DeviseRuleRecord>>asList(Keys.DEVISE_RULE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DeviseRuleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DeviseRuleRecord, ?>>asList(Keys.DEVISE_RULE__DEVISE_RULE_CHAIN_ID_FKEY);
    }

    public AuthChain authChain() {
        return new AuthChain(this, Keys.DEVISE_RULE__DEVISE_RULE_CHAIN_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviseRule as(String alias) {
        return new DeviseRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeviseRule as(Name alias) {
        return new DeviseRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeviseRule rename(String name) {
        return new DeviseRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeviseRule rename(Name name) {
        return new DeviseRule(name, null);
    }
}
