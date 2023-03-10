/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.Files;

import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilesRecord extends TableRecordImpl<FilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public FilesRecord setFileId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_ID</code>.
     */
    public Long getFileId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public FilesRecord setFileName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public FilesRecord setFileType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
     */
    public String getFileType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public FilesRecord setTablespaceName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public FilesRecord setTableCatalog(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public FilesRecord setTableSchema(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public FilesRecord setTableName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public FilesRecord setLogfileGroupName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    public String getLogfileGroupName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public FilesRecord setLogfileGroupNumber(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    public Long getLogfileGroupNumber() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>information_schema.FILES.ENGINE</code>.
     */
    public FilesRecord setEngine(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public FilesRecord setFulltextKeys(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    public String getFulltextKeys() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public FilesRecord setDeletedRows(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    public Long getDeletedRows() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public FilesRecord setUpdateCount(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    public Long getUpdateCount() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public FilesRecord setFreeExtents(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    public Long getFreeExtents() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public FilesRecord setTotalExtents(Long value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    public Long getTotalExtents() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public FilesRecord setExtentSize(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    public Long getExtentSize() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public FilesRecord setInitialSize(ULong value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    public ULong getInitialSize() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public FilesRecord setMaximumSize(ULong value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    public ULong getMaximumSize() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public FilesRecord setAutoextendSize(ULong value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    public ULong getAutoextendSize() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public FilesRecord setCreationTime(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public FilesRecord setLastUpdateTime(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    public LocalDateTime getLastUpdateTime() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public FilesRecord setLastAccessTime(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    public LocalDateTime getLastAccessTime() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public FilesRecord setRecoverTime(Long value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    public Long getRecoverTime() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public FilesRecord setTransactionCounter(Long value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    public Long getTransactionCounter() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>information_schema.FILES.VERSION</code>.
     */
    public FilesRecord setVersion(ULong value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.VERSION</code>.
     */
    public ULong getVersion() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public FilesRecord setRowFormat(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(25);
    }

    /**
     * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public FilesRecord setTableRows(ULong value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    public ULong getTableRows() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public FilesRecord setAvgRowLength(ULong value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    public ULong getAvgRowLength() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public FilesRecord setDataLength(ULong value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    public ULong getDataLength() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public FilesRecord setMaxDataLength(ULong value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    public ULong getMaxDataLength() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public FilesRecord setIndexLength(ULong value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    public ULong getIndexLength() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public FilesRecord setDataFree(ULong value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.DATA_FREE</code>.
     */
    public ULong getDataFree() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public FilesRecord setCreateTime(LocalDateTime value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(32);
    }

    /**
     * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public FilesRecord setUpdateTime(LocalDateTime value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(33);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public FilesRecord setCheckTime(LocalDateTime value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
     */
    public LocalDateTime getCheckTime() {
        return (LocalDateTime) get(34);
    }

    /**
     * Setter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public FilesRecord setChecksum(ULong value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.CHECKSUM</code>.
     */
    public ULong getChecksum() {
        return (ULong) get(35);
    }

    /**
     * Setter for <code>information_schema.FILES.STATUS</code>.
     */
    public FilesRecord setStatus(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(36);
    }

    /**
     * Setter for <code>information_schema.FILES.EXTRA</code>.
     */
    public FilesRecord setExtra(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.FILES.EXTRA</code>.
     */
    public String getExtra() {
        return (String) get(37);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilesRecord
     */
    public FilesRecord() {
        super(Files.FILES);
    }

    /**
     * Create a detached, initialised FilesRecord
     */
    public FilesRecord(Long fileId, String fileName, String fileType, String tablespaceName, String tableCatalog, String tableSchema, String tableName, String logfileGroupName, Long logfileGroupNumber, String engine, String fulltextKeys, Long deletedRows, Long updateCount, Long freeExtents, Long totalExtents, Long extentSize, ULong initialSize, ULong maximumSize, ULong autoextendSize, LocalDateTime creationTime, LocalDateTime lastUpdateTime, LocalDateTime lastAccessTime, Long recoverTime, Long transactionCounter, ULong version, String rowFormat, ULong tableRows, ULong avgRowLength, ULong dataLength, ULong maxDataLength, ULong indexLength, ULong dataFree, LocalDateTime createTime, LocalDateTime updateTime, LocalDateTime checkTime, ULong checksum, String status, String extra) {
        super(Files.FILES);

        setFileId(fileId);
        setFileName(fileName);
        setFileType(fileType);
        setTablespaceName(tablespaceName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setLogfileGroupName(logfileGroupName);
        setLogfileGroupNumber(logfileGroupNumber);
        setEngine(engine);
        setFulltextKeys(fulltextKeys);
        setDeletedRows(deletedRows);
        setUpdateCount(updateCount);
        setFreeExtents(freeExtents);
        setTotalExtents(totalExtents);
        setExtentSize(extentSize);
        setInitialSize(initialSize);
        setMaximumSize(maximumSize);
        setAutoextendSize(autoextendSize);
        setCreationTime(creationTime);
        setLastUpdateTime(lastUpdateTime);
        setLastAccessTime(lastAccessTime);
        setRecoverTime(recoverTime);
        setTransactionCounter(transactionCounter);
        setVersion(version);
        setRowFormat(rowFormat);
        setTableRows(tableRows);
        setAvgRowLength(avgRowLength);
        setDataLength(dataLength);
        setMaxDataLength(maxDataLength);
        setIndexLength(indexLength);
        setDataFree(dataFree);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
        setCheckTime(checkTime);
        setChecksum(checksum);
        setStatus(status);
        setExtra(extra);
    }

    /**
     * Create a detached, initialised FilesRecord
     */
    public FilesRecord(com.sweeti.lemon.information_schema.tables.pojos.Files value) {
        super(Files.FILES);

        if (value != null) {
            setFileId(value.getFileId());
            setFileName(value.getFileName());
            setFileType(value.getFileType());
            setTablespaceName(value.getTablespaceName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setLogfileGroupName(value.getLogfileGroupName());
            setLogfileGroupNumber(value.getLogfileGroupNumber());
            setEngine(value.getEngine());
            setFulltextKeys(value.getFulltextKeys());
            setDeletedRows(value.getDeletedRows());
            setUpdateCount(value.getUpdateCount());
            setFreeExtents(value.getFreeExtents());
            setTotalExtents(value.getTotalExtents());
            setExtentSize(value.getExtentSize());
            setInitialSize(value.getInitialSize());
            setMaximumSize(value.getMaximumSize());
            setAutoextendSize(value.getAutoextendSize());
            setCreationTime(value.getCreationTime());
            setLastUpdateTime(value.getLastUpdateTime());
            setLastAccessTime(value.getLastAccessTime());
            setRecoverTime(value.getRecoverTime());
            setTransactionCounter(value.getTransactionCounter());
            setVersion(value.getVersion());
            setRowFormat(value.getRowFormat());
            setTableRows(value.getTableRows());
            setAvgRowLength(value.getAvgRowLength());
            setDataLength(value.getDataLength());
            setMaxDataLength(value.getMaxDataLength());
            setIndexLength(value.getIndexLength());
            setDataFree(value.getDataFree());
            setCreateTime(value.getCreateTime());
            setUpdateTime(value.getUpdateTime());
            setCheckTime(value.getCheckTime());
            setChecksum(value.getChecksum());
            setStatus(value.getStatus());
            setExtra(value.getExtra());
        }
    }
}
