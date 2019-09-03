/*
 * This file is generated by jOOQ.
 */
package com.cas.easycas.dao.tables;


import com.cas.easycas.dao.Indexes;
import com.cas.easycas.dao.Keys;
import com.cas.easycas.dao.Public;
import com.cas.easycas.dao.tables.records.IpRuleRecord;

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
public class IpRule extends TableImpl<IpRuleRecord> {

    private static final long serialVersionUID = -692501688;

    /**
     * The reference instance of <code>public.ip_rule</code>
     */
    public static final IpRule IP_RULE = new IpRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IpRuleRecord> getRecordType() {
        return IpRuleRecord.class;
    }

    /**
     * The column <code>public.ip_rule.id</code>.
     */
    public final TableField<IpRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('ip_rule_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.ip_rule.chain_id</code>.
     */
    public final TableField<IpRuleRecord, Long> CHAIN_ID = createField("chain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.ip_rule.address</code>.
     */
    public final TableField<IpRuleRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.ip_rule.created_at</code>.
     */
    public final TableField<IpRuleRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.ip_rule.updated_at</code>.
     */
    public final TableField<IpRuleRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.ip_rule</code> table reference
     */
    public IpRule() {
        this(DSL.name("ip_rule"), null);
    }

    /**
     * Create an aliased <code>public.ip_rule</code> table reference
     */
    public IpRule(String alias) {
        this(DSL.name(alias), IP_RULE);
    }

    /**
     * Create an aliased <code>public.ip_rule</code> table reference
     */
    public IpRule(Name alias) {
        this(alias, IP_RULE);
    }

    private IpRule(Name alias, Table<IpRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private IpRule(Name alias, Table<IpRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IpRule(Table<O> child, ForeignKey<O, IpRuleRecord> key) {
        super(child, key, IP_RULE);
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
        return Arrays.<Index>asList(Indexes.IP_RULE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IpRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_IP_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IpRuleRecord> getPrimaryKey() {
        return Keys.IP_RULE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IpRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<IpRuleRecord>>asList(Keys.IP_RULE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<IpRuleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IpRuleRecord, ?>>asList(Keys.IP_RULE__IP_RULE_CHAIN_ID_FKEY);
    }

    public AuthChain authChain() {
        return new AuthChain(this, Keys.IP_RULE__IP_RULE_CHAIN_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IpRule as(String alias) {
        return new IpRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IpRule as(Name alias) {
        return new IpRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IpRule rename(String name) {
        return new IpRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IpRule rename(Name name) {
        return new IpRule(name, null);
    }
}