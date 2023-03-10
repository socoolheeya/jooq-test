/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon.tables;


import com.sweeti.lemon.lemon.Keys;
import com.sweeti.lemon.lemon.Lemon;
import com.sweeti.lemon.lemon.tables.records.PackageRoomRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PackageRoom extends TableImpl<PackageRoomRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>lemon.package_room</code>
     */
    public static final PackageRoom PACKAGE_ROOM = new PackageRoom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PackageRoomRecord> getRecordType() {
        return PackageRoomRecord.class;
    }

    /**
     * The column <code>lemon.package_room.package_room_id</code>. 패키지룸ID
     */
    public final TableField<PackageRoomRecord, Long> PACKAGE_ROOM_ID = createField(DSL.name("package_room_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "패키지룸ID");

    /**
     * The column <code>lemon.package_room.package_id</code>. 패키지ID
     */
    public final TableField<PackageRoomRecord, Long> PACKAGE_ID = createField(DSL.name("package_id"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "패키지ID");

    /**
     * The column <code>lemon.package_room.room_id</code>. Room ID
     */
    public final TableField<PackageRoomRecord, Long> ROOM_ID = createField(DSL.name("room_id"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "Room ID");

    private PackageRoom(Name alias, Table<PackageRoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private PackageRoom(Name alias, Table<PackageRoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>lemon.package_room</code> table reference
     */
    public PackageRoom(String alias) {
        this(DSL.name(alias), PACKAGE_ROOM);
    }

    /**
     * Create an aliased <code>lemon.package_room</code> table reference
     */
    public PackageRoom(Name alias) {
        this(alias, PACKAGE_ROOM);
    }

    /**
     * Create a <code>lemon.package_room</code> table reference
     */
    public PackageRoom() {
        this(DSL.name("package_room"), null);
    }

    public <O extends Record> PackageRoom(Table<O> child, ForeignKey<O, PackageRoomRecord> key) {
        super(child, key, PACKAGE_ROOM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Lemon.LEMON;
    }

    @Override
    public Identity<PackageRoomRecord, Long> getIdentity() {
        return (Identity<PackageRoomRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PackageRoomRecord> getPrimaryKey() {
        return Keys.KEY_PACKAGE_ROOM_PRIMARY;
    }

    @Override
    public PackageRoom as(String alias) {
        return new PackageRoom(DSL.name(alias), this);
    }

    @Override
    public PackageRoom as(Name alias) {
        return new PackageRoom(alias, this);
    }

    @Override
    public PackageRoom as(Table<?> alias) {
        return new PackageRoom(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageRoom rename(String name) {
        return new PackageRoom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageRoom rename(Name name) {
        return new PackageRoom(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageRoom rename(Table<?> name) {
        return new PackageRoom(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
