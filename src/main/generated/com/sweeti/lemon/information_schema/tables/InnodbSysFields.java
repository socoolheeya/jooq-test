/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.InnodbSysFieldsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysFields extends TableImpl<InnodbSysFieldsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_SYS_FIELDS</code>
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = new InnodbSysFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysFieldsRecord> getRecordType() {
        return InnodbSysFieldsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbSysFieldsRecord, ULong> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public final TableField<InnodbSysFieldsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public final TableField<InnodbSysFieldsRecord, UInteger> POS = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table
     * reference
     */
    public InnodbSysFields(String alias) {
        this(DSL.name(alias), INNODB_SYS_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table
     * reference
     */
    public InnodbSysFields(Name alias) {
        this(alias, INNODB_SYS_FIELDS);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_FIELDS</code> table
     * reference
     */
    public InnodbSysFields() {
        this(DSL.name("INNODB_SYS_FIELDS"), null);
    }

    public <O extends Record> InnodbSysFields(Table<O> child, ForeignKey<O, InnodbSysFieldsRecord> key) {
        super(child, key, INNODB_SYS_FIELDS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysFields as(String alias) {
        return new InnodbSysFields(DSL.name(alias), this);
    }

    @Override
    public InnodbSysFields as(Name alias) {
        return new InnodbSysFields(alias, this);
    }

    @Override
    public InnodbSysFields as(Table<?> alias) {
        return new InnodbSysFields(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(String name) {
        return new InnodbSysFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(Name name) {
        return new InnodbSysFields(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(Table<?> name) {
        return new InnodbSysFields(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super ULong, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super ULong, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}