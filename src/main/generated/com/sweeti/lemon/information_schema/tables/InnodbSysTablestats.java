/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.InnodbSysTablestatsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysTablestats extends TableImpl<InnodbSysTablestatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_SYS_TABLESTATS</code>
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = new InnodbSysTablestats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysTablestatsRecord> getRecordType() {
        return InnodbSysTablestatsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, Integer> STATS_INITIALIZED = createField(DSL.name("STATS_INITIALIZED"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> NUM_ROWS = createField(DSL.name("NUM_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> CLUST_INDEX_SIZE = createField(DSL.name("CLUST_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> OTHER_INDEX_SIZE = createField(DSL.name("OTHER_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> MODIFIED_COUNTER = createField(DSL.name("MODIFIED_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, ULong> AUTOINC = createField(DSL.name("AUTOINC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    public final TableField<InnodbSysTablestatsRecord, Integer> REF_COUNT = createField(DSL.name("REF_COUNT"), SQLDataType.INTEGER.nullable(false), this, "");

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysTablestats(Name alias, Table<InnodbSysTablestatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code>
     * table reference
     */
    public InnodbSysTablestats(String alias) {
        this(DSL.name(alias), INNODB_SYS_TABLESTATS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code>
     * table reference
     */
    public InnodbSysTablestats(Name alias) {
        this(alias, INNODB_SYS_TABLESTATS);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLESTATS</code> table
     * reference
     */
    public InnodbSysTablestats() {
        this(DSL.name("INNODB_SYS_TABLESTATS"), null);
    }

    public <O extends Record> InnodbSysTablestats(Table<O> child, ForeignKey<O, InnodbSysTablestatsRecord> key) {
        super(child, key, INNODB_SYS_TABLESTATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysTablestats as(String alias) {
        return new InnodbSysTablestats(DSL.name(alias), this);
    }

    @Override
    public InnodbSysTablestats as(Name alias) {
        return new InnodbSysTablestats(alias, this);
    }

    @Override
    public InnodbSysTablestats as(Table<?> alias) {
        return new InnodbSysTablestats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(String name) {
        return new InnodbSysTablestats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(Name name) {
        return new InnodbSysTablestats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysTablestats rename(Table<?> name) {
        return new InnodbSysTablestats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, Integer, ULong, ULong, ULong, ULong, ULong, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super ULong, ? super String, ? super Integer, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super ULong, ? super String, ? super Integer, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
