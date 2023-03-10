/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon.tables;


import com.sweeti.lemon.lemon.Keys;
import com.sweeti.lemon.lemon.Lemon;
import com.sweeti.lemon.lemon.tables.records.RoomBedRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoomBed extends TableImpl<RoomBedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>lemon.room_bed</code>
     */
    public static final RoomBed ROOM_BED = new RoomBed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoomBedRecord> getRecordType() {
        return RoomBedRecord.class;
    }

    /**
     * The column <code>lemon.room_bed.room_bed_id</code>. 룸배드ID
     */
    public final TableField<RoomBedRecord, Long> ROOM_BED_ID = createField(DSL.name("room_bed_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "룸배드ID");

    /**
     * The column <code>lemon.room_bed.bunk_bed</code>. 벙커배드 수
     */
    public final TableField<RoomBedRecord, UByte> BUNK_BED = createField(DSL.name("bunk_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "벙커배드 수");

    /**
     * The column <code>lemon.room_bed.created_at</code>. 생성일
     */
    public final TableField<RoomBedRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "생성일");

    /**
     * The column <code>lemon.room_bed.careted_by</code>. 생성자
     */
    public final TableField<RoomBedRecord, String> CARETED_BY = createField(DSL.name("careted_by"), SQLDataType.VARCHAR(2000).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "생성자");

    /**
     * The column <code>lemon.room_bed.double_bed</code>. 싱글배드 수
     */
    public final TableField<RoomBedRecord, UByte> DOUBLE_BED = createField(DSL.name("double_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "싱글배드 수");

    /**
     * The column <code>lemon.room_bed.double_sofa_bed</code>. 더블소파배드 수
     */
    public final TableField<RoomBedRecord, UByte> DOUBLE_SOFA_BED = createField(DSL.name("double_sofa_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "더블소파배드 수");

    /**
     * The column <code>lemon.room_bed.futons</code>. 매트리스
     */
    public final TableField<RoomBedRecord, UByte> FUTONS = createField(DSL.name("futons"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "매트리스");

    /**
     * The column <code>lemon.room_bed.king_bed</code>. 킹배드 수
     */
    public final TableField<RoomBedRecord, UByte> KING_BED = createField(DSL.name("king_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "킹배드 수");

    /**
     * The column <code>lemon.room_bed.large_twin_bed</code>. 라지 트윈 배드 수
     */
    public final TableField<RoomBedRecord, UByte> LARGE_TWIN_BED = createField(DSL.name("large_twin_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "라지 트윈 배드 수");

    /**
     * The column <code>lemon.room_bed.ondol</code>. 온돌
     */
    public final TableField<RoomBedRecord, UByte> ONDOL = createField(DSL.name("ondol"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "온돌");

    /**
     * The column <code>lemon.room_bed.queen_bed</code>. 퀸배드 수
     */
    public final TableField<RoomBedRecord, UByte> QUEEN_BED = createField(DSL.name("queen_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "퀸배드 수");

    /**
     * The column <code>lemon.room_bed.queen_murphy_bed</code>. 퀸머피배드 수
     */
    public final TableField<RoomBedRecord, UByte> QUEEN_MURPHY_BED = createField(DSL.name("queen_murphy_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "퀸머피배드 수");

    /**
     * The column <code>lemon.room_bed.single_bed</code>. 싱글배드 수
     */
    public final TableField<RoomBedRecord, UByte> SINGLE_BED = createField(DSL.name("single_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "싱글배드 수");

    /**
     * The column <code>lemon.room_bed.twin_bed</code>. 트윈배드 수
     */
    public final TableField<RoomBedRecord, UByte> TWIN_BED = createField(DSL.name("twin_bed"), SQLDataType.TINYINTUNSIGNED.defaultValue(DSL.field("NULL", SQLDataType.TINYINTUNSIGNED)), this, "트윈배드 수");

    /**
     * The column <code>lemon.room_bed.updated_at</code>. 수정일
     */
    public final TableField<RoomBedRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("NULL", SQLDataType.LOCALDATETIME)), this, "수정일");

    /**
     * The column <code>lemon.room_bed.updated_by</code>. 수정자
     */
    public final TableField<RoomBedRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(2000).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "수정자");

    /**
     * The column <code>lemon.room_bed.room_id</code>. Room ID
     */
    public final TableField<RoomBedRecord, Long> ROOM_ID = createField(DSL.name("room_id"), SQLDataType.BIGINT.defaultValue(DSL.field("NULL", SQLDataType.BIGINT)), this, "Room ID");

    private RoomBed(Name alias, Table<RoomBedRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoomBed(Name alias, Table<RoomBedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>lemon.room_bed</code> table reference
     */
    public RoomBed(String alias) {
        this(DSL.name(alias), ROOM_BED);
    }

    /**
     * Create an aliased <code>lemon.room_bed</code> table reference
     */
    public RoomBed(Name alias) {
        this(alias, ROOM_BED);
    }

    /**
     * Create a <code>lemon.room_bed</code> table reference
     */
    public RoomBed() {
        this(DSL.name("room_bed"), null);
    }

    public <O extends Record> RoomBed(Table<O> child, ForeignKey<O, RoomBedRecord> key) {
        super(child, key, ROOM_BED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Lemon.LEMON;
    }

    @Override
    public Identity<RoomBedRecord, Long> getIdentity() {
        return (Identity<RoomBedRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<RoomBedRecord> getPrimaryKey() {
        return Keys.KEY_ROOM_BED_PRIMARY;
    }

    @Override
    public RoomBed as(String alias) {
        return new RoomBed(DSL.name(alias), this);
    }

    @Override
    public RoomBed as(Name alias) {
        return new RoomBed(alias, this);
    }

    @Override
    public RoomBed as(Table<?> alias) {
        return new RoomBed(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoomBed rename(String name) {
        return new RoomBed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoomBed rename(Name name) {
        return new RoomBed(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoomBed rename(Table<?> name) {
        return new RoomBed(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, UByte, LocalDateTime, String, UByte, UByte, UByte, UByte, UByte, UByte, UByte, UByte, UByte, UByte, LocalDateTime, String, Long> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super Long, ? super UByte, ? super LocalDateTime, ? super String, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super LocalDateTime, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super Long, ? super UByte, ? super LocalDateTime, ? super String, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super UByte, ? super LocalDateTime, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
