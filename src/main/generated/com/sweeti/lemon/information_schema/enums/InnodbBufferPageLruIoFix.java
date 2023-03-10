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
public enum InnodbBufferPageLruIoFix implements EnumType {

    IO_NONE("IO_NONE"),

    IO_READ("IO_READ"),

    IO_WRITE("IO_WRITE");

    private final String literal;

    private InnodbBufferPageLruIoFix(String literal) {
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
        return "INNODB_BUFFER_PAGE_LRU_IO_FIX";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static InnodbBufferPageLruIoFix lookupLiteral(String literal) {
        return EnumType.lookupLiteral(InnodbBufferPageLruIoFix.class, literal);
    }
}
