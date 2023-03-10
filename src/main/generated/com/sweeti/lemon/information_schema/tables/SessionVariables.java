/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables;


import com.sweeti.lemon.information_schema.InformationSchema;
import com.sweeti.lemon.information_schema.tables.records.SessionVariablesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionVariables extends TableImpl<SessionVariablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.SESSION_VARIABLES</code>
     */
    public static final SessionVariables SESSION_VARIABLES = new SessionVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionVariablesRecord> getRecordType() {
        return SessionVariablesRecord.class;
    }

    /**
     * The column
     * <code>information_schema.SESSION_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SESSION_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionVariables(Name alias, Table<SessionVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table
     * reference
     */
    public SessionVariables(String alias) {
        this(DSL.name(alias), SESSION_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.SESSION_VARIABLES</code> table
     * reference
     */
    public SessionVariables(Name alias) {
        this(alias, SESSION_VARIABLES);
    }

    /**
     * Create a <code>information_schema.SESSION_VARIABLES</code> table
     * reference
     */
    public SessionVariables() {
        this(DSL.name("SESSION_VARIABLES"), null);
    }

    public <O extends Record> SessionVariables(Table<O> child, ForeignKey<O, SessionVariablesRecord> key) {
        super(child, key, SESSION_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SessionVariables as(String alias) {
        return new SessionVariables(DSL.name(alias), this);
    }

    @Override
    public SessionVariables as(Name alias) {
        return new SessionVariables(alias, this);
    }

    @Override
    public SessionVariables as(Table<?> alias) {
        return new SessionVariables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(String name) {
        return new SessionVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(Name name) {
        return new SessionVariables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(Table<?> name) {
        return new SessionVariables(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
