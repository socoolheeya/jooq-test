/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.enums.InnodbBufferPageLruIoFix;
import com.sweeti.lemon.information_schema.tables.InnodbBufferPageLru;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPageLruRecord extends TableRecordImpl<InnodbBufferPageLruRecord> implements Record20<UInteger, ULong, UInteger, UInteger, String, UInteger, UInteger, Integer, ULong, ULong, ULong, String, String, ULong, ULong, ULong, Integer, InnodbBufferPageLruIoFix, Integer, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
     */
    public InnodbBufferPageLruRecord setPoolId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
     */
    public UInteger getPoolId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
     */
    public InnodbBufferPageLruRecord setLruPosition(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
     */
    public ULong getLruPosition() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
     */
    public InnodbBufferPageLruRecord setSpace(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
     */
    public InnodbBufferPageLruRecord setPageNumber(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
     */
    public UInteger getPageNumber() {
        return (UInteger) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
     */
    public InnodbBufferPageLruRecord setPageType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
     */
    public String getPageType() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
     */
    public InnodbBufferPageLruRecord setFlushType(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
     */
    public UInteger getFlushType() {
        return (UInteger) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
     */
    public InnodbBufferPageLruRecord setFixCount(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
     */
    public UInteger getFixCount() {
        return (UInteger) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
     */
    public InnodbBufferPageLruRecord setIsHashed(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
     */
    public Integer getIsHashed() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
     */
    public InnodbBufferPageLruRecord setNewestModification(ULong value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
     */
    public ULong getNewestModification() {
        return (ULong) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
     */
    public InnodbBufferPageLruRecord setOldestModification(ULong value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
     */
    public ULong getOldestModification() {
        return (ULong) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
     */
    public InnodbBufferPageLruRecord setAccessTime(ULong value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
     */
    public ULong getAccessTime() {
        return (ULong) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
     */
    public InnodbBufferPageLruRecord setTableName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
     */
    public InnodbBufferPageLruRecord setIndexName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
     */
    public InnodbBufferPageLruRecord setNumberRecords(ULong value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
     */
    public ULong getNumberRecords() {
        return (ULong) get(13);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
     */
    public InnodbBufferPageLruRecord setDataSize(ULong value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
     */
    public ULong getDataSize() {
        return (ULong) get(14);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
     */
    public InnodbBufferPageLruRecord setCompressedSize(ULong value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
     */
    public ULong getCompressedSize() {
        return (ULong) get(15);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
     */
    public InnodbBufferPageLruRecord setCompressed(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
     */
    public Integer getCompressed() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
     */
    public InnodbBufferPageLruRecord setIoFix(InnodbBufferPageLruIoFix value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
     */
    public InnodbBufferPageLruIoFix getIoFix() {
        return (InnodbBufferPageLruIoFix) get(17);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
     */
    public InnodbBufferPageLruRecord setIsOld(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
     */
    public Integer getIsOld() {
        return (Integer) get(18);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
     */
    public InnodbBufferPageLruRecord setFreePageClock(ULong value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
     */
    public ULong getFreePageClock() {
        return (ULong) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<UInteger, ULong, UInteger, UInteger, String, UInteger, UInteger, Integer, ULong, ULong, ULong, String, String, ULong, ULong, ULong, Integer, InnodbBufferPageLruIoFix, Integer, ULong> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<UInteger, ULong, UInteger, UInteger, String, UInteger, UInteger, Integer, ULong, ULong, ULong, String, String, ULong, ULong, ULong, Integer, InnodbBufferPageLruIoFix, Integer, ULong> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.POOL_ID;
    }

    @Override
    public Field<ULong> field2() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.LRU_POSITION;
    }

    @Override
    public Field<UInteger> field3() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.SPACE;
    }

    @Override
    public Field<UInteger> field4() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER;
    }

    @Override
    public Field<String> field5() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE;
    }

    @Override
    public Field<UInteger> field6() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE;
    }

    @Override
    public Field<UInteger> field7() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FIX_COUNT;
    }

    @Override
    public Field<Integer> field8() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_HASHED;
    }

    @Override
    public Field<ULong> field9() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION;
    }

    @Override
    public Field<ULong> field10() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION;
    }

    @Override
    public Field<ULong> field11() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME;
    }

    @Override
    public Field<String> field12() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.TABLE_NAME;
    }

    @Override
    public Field<String> field13() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.INDEX_NAME;
    }

    @Override
    public Field<ULong> field14() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS;
    }

    @Override
    public Field<ULong> field15() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.DATA_SIZE;
    }

    @Override
    public Field<ULong> field16() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE;
    }

    @Override
    public Field<Integer> field17() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED;
    }

    @Override
    public Field<InnodbBufferPageLruIoFix> field18() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IO_FIX;
    }

    @Override
    public Field<Integer> field19() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_OLD;
    }

    @Override
    public Field<ULong> field20() {
        return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK;
    }

    @Override
    public UInteger component1() {
        return getPoolId();
    }

    @Override
    public ULong component2() {
        return getLruPosition();
    }

    @Override
    public UInteger component3() {
        return getSpace();
    }

    @Override
    public UInteger component4() {
        return getPageNumber();
    }

    @Override
    public String component5() {
        return getPageType();
    }

    @Override
    public UInteger component6() {
        return getFlushType();
    }

    @Override
    public UInteger component7() {
        return getFixCount();
    }

    @Override
    public Integer component8() {
        return getIsHashed();
    }

    @Override
    public ULong component9() {
        return getNewestModification();
    }

    @Override
    public ULong component10() {
        return getOldestModification();
    }

    @Override
    public ULong component11() {
        return getAccessTime();
    }

    @Override
    public String component12() {
        return getTableName();
    }

    @Override
    public String component13() {
        return getIndexName();
    }

    @Override
    public ULong component14() {
        return getNumberRecords();
    }

    @Override
    public ULong component15() {
        return getDataSize();
    }

    @Override
    public ULong component16() {
        return getCompressedSize();
    }

    @Override
    public Integer component17() {
        return getCompressed();
    }

    @Override
    public InnodbBufferPageLruIoFix component18() {
        return getIoFix();
    }

    @Override
    public Integer component19() {
        return getIsOld();
    }

    @Override
    public ULong component20() {
        return getFreePageClock();
    }

    @Override
    public UInteger value1() {
        return getPoolId();
    }

    @Override
    public ULong value2() {
        return getLruPosition();
    }

    @Override
    public UInteger value3() {
        return getSpace();
    }

    @Override
    public UInteger value4() {
        return getPageNumber();
    }

    @Override
    public String value5() {
        return getPageType();
    }

    @Override
    public UInteger value6() {
        return getFlushType();
    }

    @Override
    public UInteger value7() {
        return getFixCount();
    }

    @Override
    public Integer value8() {
        return getIsHashed();
    }

    @Override
    public ULong value9() {
        return getNewestModification();
    }

    @Override
    public ULong value10() {
        return getOldestModification();
    }

    @Override
    public ULong value11() {
        return getAccessTime();
    }

    @Override
    public String value12() {
        return getTableName();
    }

    @Override
    public String value13() {
        return getIndexName();
    }

    @Override
    public ULong value14() {
        return getNumberRecords();
    }

    @Override
    public ULong value15() {
        return getDataSize();
    }

    @Override
    public ULong value16() {
        return getCompressedSize();
    }

    @Override
    public Integer value17() {
        return getCompressed();
    }

    @Override
    public InnodbBufferPageLruIoFix value18() {
        return getIoFix();
    }

    @Override
    public Integer value19() {
        return getIsOld();
    }

    @Override
    public ULong value20() {
        return getFreePageClock();
    }

    @Override
    public InnodbBufferPageLruRecord value1(UInteger value) {
        setPoolId(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value2(ULong value) {
        setLruPosition(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value3(UInteger value) {
        setSpace(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value4(UInteger value) {
        setPageNumber(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value5(String value) {
        setPageType(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value6(UInteger value) {
        setFlushType(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value7(UInteger value) {
        setFixCount(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value8(Integer value) {
        setIsHashed(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value9(ULong value) {
        setNewestModification(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value10(ULong value) {
        setOldestModification(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value11(ULong value) {
        setAccessTime(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value12(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value13(String value) {
        setIndexName(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value14(ULong value) {
        setNumberRecords(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value15(ULong value) {
        setDataSize(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value16(ULong value) {
        setCompressedSize(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value17(Integer value) {
        setCompressed(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value18(InnodbBufferPageLruIoFix value) {
        setIoFix(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value19(Integer value) {
        setIsOld(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord value20(ULong value) {
        setFreePageClock(value);
        return this;
    }

    @Override
    public InnodbBufferPageLruRecord values(UInteger value1, ULong value2, UInteger value3, UInteger value4, String value5, UInteger value6, UInteger value7, Integer value8, ULong value9, ULong value10, ULong value11, String value12, String value13, ULong value14, ULong value15, ULong value16, Integer value17, InnodbBufferPageLruIoFix value18, Integer value19, ULong value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbBufferPageLruRecord
     */
    public InnodbBufferPageLruRecord() {
        super(InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);
    }

    /**
     * Create a detached, initialised InnodbBufferPageLruRecord
     */
    public InnodbBufferPageLruRecord(UInteger poolId, ULong lruPosition, UInteger space, UInteger pageNumber, String pageType, UInteger flushType, UInteger fixCount, Integer isHashed, ULong newestModification, ULong oldestModification, ULong accessTime, String tableName, String indexName, ULong numberRecords, ULong dataSize, ULong compressedSize, Integer compressed, InnodbBufferPageLruIoFix ioFix, Integer isOld, ULong freePageClock) {
        super(InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);

        setPoolId(poolId);
        setLruPosition(lruPosition);
        setSpace(space);
        setPageNumber(pageNumber);
        setPageType(pageType);
        setFlushType(flushType);
        setFixCount(fixCount);
        setIsHashed(isHashed);
        setNewestModification(newestModification);
        setOldestModification(oldestModification);
        setAccessTime(accessTime);
        setTableName(tableName);
        setIndexName(indexName);
        setNumberRecords(numberRecords);
        setDataSize(dataSize);
        setCompressedSize(compressedSize);
        setCompressed(compressed);
        setIoFix(ioFix);
        setIsOld(isOld);
        setFreePageClock(freePageClock);
    }

    /**
     * Create a detached, initialised InnodbBufferPageLruRecord
     */
    public InnodbBufferPageLruRecord(com.sweeti.lemon.information_schema.tables.pojos.InnodbBufferPageLru value) {
        super(InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);

        if (value != null) {
            setPoolId(value.getPoolId());
            setLruPosition(value.getLruPosition());
            setSpace(value.getSpace());
            setPageNumber(value.getPageNumber());
            setPageType(value.getPageType());
            setFlushType(value.getFlushType());
            setFixCount(value.getFixCount());
            setIsHashed(value.getIsHashed());
            setNewestModification(value.getNewestModification());
            setOldestModification(value.getOldestModification());
            setAccessTime(value.getAccessTime());
            setTableName(value.getTableName());
            setIndexName(value.getIndexName());
            setNumberRecords(value.getNumberRecords());
            setDataSize(value.getDataSize());
            setCompressedSize(value.getCompressedSize());
            setCompressed(value.getCompressed());
            setIoFix(value.getIoFix());
            setIsOld(value.getIsOld());
            setFreePageClock(value.getFreePageClock());
        }
    }
}
