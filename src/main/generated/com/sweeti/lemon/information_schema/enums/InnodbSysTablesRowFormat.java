/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum InnodbSysTablesRowFormat implements EnumType {

    Redundant("Redundant"),

    Compact("Compact"),

    Compressed("Compressed"),

    Dynamic("Dynamic");

    private final String literal;

    private InnodbSysTablesRowFormat(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "INNODB_SYS_TABLES_ROW_FORMAT";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static InnodbSysTablesRowFormat lookupLiteral(String literal) {
        return EnumType.lookupLiteral(InnodbSysTablesRowFormat.class, literal);
    }
}
