/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import com.sweeti.lemon.information_schema.enums.InnodbBufferPageLruIoFix;

import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPageLru implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger poolId;
    private final ULong lruPosition;
    private final UInteger space;
    private final UInteger pageNumber;
    private final String pageType;
    private final UInteger flushType;
    private final UInteger fixCount;
    private final Integer isHashed;
    private final ULong newestModification;
    private final ULong oldestModification;
    private final ULong accessTime;
    private final String tableName;
    private final String indexName;
    private final ULong numberRecords;
    private final ULong dataSize;
    private final ULong compressedSize;
    private final Integer compressed;
    private final InnodbBufferPageLruIoFix ioFix;
    private final Integer isOld;
    private final ULong freePageClock;

    public InnodbBufferPageLru(InnodbBufferPageLru value) {
        this.poolId = value.poolId;
        this.lruPosition = value.lruPosition;
        this.space = value.space;
        this.pageNumber = value.pageNumber;
        this.pageType = value.pageType;
        this.flushType = value.flushType;
        this.fixCount = value.fixCount;
        this.isHashed = value.isHashed;
        this.newestModification = value.newestModification;
        this.oldestModification = value.oldestModification;
        this.accessTime = value.accessTime;
        this.tableName = value.tableName;
        this.indexName = value.indexName;
        this.numberRecords = value.numberRecords;
        this.dataSize = value.dataSize;
        this.compressedSize = value.compressedSize;
        this.compressed = value.compressed;
        this.ioFix = value.ioFix;
        this.isOld = value.isOld;
        this.freePageClock = value.freePageClock;
    }

    public InnodbBufferPageLru(
        UInteger poolId,
        ULong lruPosition,
        UInteger space,
        UInteger pageNumber,
        String pageType,
        UInteger flushType,
        UInteger fixCount,
        Integer isHashed,
        ULong newestModification,
        ULong oldestModification,
        ULong accessTime,
        String tableName,
        String indexName,
        ULong numberRecords,
        ULong dataSize,
        ULong compressedSize,
        Integer compressed,
        InnodbBufferPageLruIoFix ioFix,
        Integer isOld,
        ULong freePageClock
    ) {
        this.poolId = poolId;
        this.lruPosition = lruPosition;
        this.space = space;
        this.pageNumber = pageNumber;
        this.pageType = pageType;
        this.flushType = flushType;
        this.fixCount = fixCount;
        this.isHashed = isHashed;
        this.newestModification = newestModification;
        this.oldestModification = oldestModification;
        this.accessTime = accessTime;
        this.tableName = tableName;
        this.indexName = indexName;
        this.numberRecords = numberRecords;
        this.dataSize = dataSize;
        this.compressedSize = compressedSize;
        this.compressed = compressed;
        this.ioFix = ioFix;
        this.isOld = isOld;
        this.freePageClock = freePageClock;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
     */
    public UInteger getPoolId() {
        return this.poolId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
     */
    public ULong getLruPosition() {
        return this.lruPosition;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
     */
    public UInteger getSpace() {
        return this.space;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
     */
    public UInteger getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
     */
    public String getPageType() {
        return this.pageType;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
     */
    public UInteger getFlushType() {
        return this.flushType;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
     */
    public UInteger getFixCount() {
        return this.fixCount;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
     */
    public Integer getIsHashed() {
        return this.isHashed;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
     */
    public ULong getNewestModification() {
        return this.newestModification;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
     */
    public ULong getOldestModification() {
        return this.oldestModification;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
     */
    public ULong getAccessTime() {
        return this.accessTime;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
     */
    public ULong getNumberRecords() {
        return this.numberRecords;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
     */
    public ULong getDataSize() {
        return this.dataSize;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
     */
    public ULong getCompressedSize() {
        return this.compressedSize;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
     */
    public Integer getCompressed() {
        return this.compressed;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
     */
    public InnodbBufferPageLruIoFix getIoFix() {
        return this.ioFix;
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
     */
    public Integer getIsOld() {
        return this.isOld;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
     */
    public ULong getFreePageClock() {
        return this.freePageClock;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbBufferPageLru other = (InnodbBufferPageLru) obj;
        if (this.poolId == null) {
            if (other.poolId != null)
                return false;
        }
        else if (!this.poolId.equals(other.poolId))
            return false;
        if (this.lruPosition == null) {
            if (other.lruPosition != null)
                return false;
        }
        else if (!this.lruPosition.equals(other.lruPosition))
            return false;
        if (this.space == null) {
            if (other.space != null)
                return false;
        }
        else if (!this.space.equals(other.space))
            return false;
        if (this.pageNumber == null) {
            if (other.pageNumber != null)
                return false;
        }
        else if (!this.pageNumber.equals(other.pageNumber))
            return false;
        if (this.pageType == null) {
            if (other.pageType != null)
                return false;
        }
        else if (!this.pageType.equals(other.pageType))
            return false;
        if (this.flushType == null) {
            if (other.flushType != null)
                return false;
        }
        else if (!this.flushType.equals(other.flushType))
            return false;
        if (this.fixCount == null) {
            if (other.fixCount != null)
                return false;
        }
        else if (!this.fixCount.equals(other.fixCount))
            return false;
        if (this.isHashed == null) {
            if (other.isHashed != null)
                return false;
        }
        else if (!this.isHashed.equals(other.isHashed))
            return false;
        if (this.newestModification == null) {
            if (other.newestModification != null)
                return false;
        }
        else if (!this.newestModification.equals(other.newestModification))
            return false;
        if (this.oldestModification == null) {
            if (other.oldestModification != null)
                return false;
        }
        else if (!this.oldestModification.equals(other.oldestModification))
            return false;
        if (this.accessTime == null) {
            if (other.accessTime != null)
                return false;
        }
        else if (!this.accessTime.equals(other.accessTime))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.indexName == null) {
            if (other.indexName != null)
                return false;
        }
        else if (!this.indexName.equals(other.indexName))
            return false;
        if (this.numberRecords == null) {
            if (other.numberRecords != null)
                return false;
        }
        else if (!this.numberRecords.equals(other.numberRecords))
            return false;
        if (this.dataSize == null) {
            if (other.dataSize != null)
                return false;
        }
        else if (!this.dataSize.equals(other.dataSize))
            return false;
        if (this.compressedSize == null) {
            if (other.compressedSize != null)
                return false;
        }
        else if (!this.compressedSize.equals(other.compressedSize))
            return false;
        if (this.compressed == null) {
            if (other.compressed != null)
                return false;
        }
        else if (!this.compressed.equals(other.compressed))
            return false;
        if (this.ioFix == null) {
            if (other.ioFix != null)
                return false;
        }
        else if (!this.ioFix.equals(other.ioFix))
            return false;
        if (this.isOld == null) {
            if (other.isOld != null)
                return false;
        }
        else if (!this.isOld.equals(other.isOld))
            return false;
        if (this.freePageClock == null) {
            if (other.freePageClock != null)
                return false;
        }
        else if (!this.freePageClock.equals(other.freePageClock))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.poolId == null) ? 0 : this.poolId.hashCode());
        result = prime * result + ((this.lruPosition == null) ? 0 : this.lruPosition.hashCode());
        result = prime * result + ((this.space == null) ? 0 : this.space.hashCode());
        result = prime * result + ((this.pageNumber == null) ? 0 : this.pageNumber.hashCode());
        result = prime * result + ((this.pageType == null) ? 0 : this.pageType.hashCode());
        result = prime * result + ((this.flushType == null) ? 0 : this.flushType.hashCode());
        result = prime * result + ((this.fixCount == null) ? 0 : this.fixCount.hashCode());
        result = prime * result + ((this.isHashed == null) ? 0 : this.isHashed.hashCode());
        result = prime * result + ((this.newestModification == null) ? 0 : this.newestModification.hashCode());
        result = prime * result + ((this.oldestModification == null) ? 0 : this.oldestModification.hashCode());
        result = prime * result + ((this.accessTime == null) ? 0 : this.accessTime.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.indexName == null) ? 0 : this.indexName.hashCode());
        result = prime * result + ((this.numberRecords == null) ? 0 : this.numberRecords.hashCode());
        result = prime * result + ((this.dataSize == null) ? 0 : this.dataSize.hashCode());
        result = prime * result + ((this.compressedSize == null) ? 0 : this.compressedSize.hashCode());
        result = prime * result + ((this.compressed == null) ? 0 : this.compressed.hashCode());
        result = prime * result + ((this.ioFix == null) ? 0 : this.ioFix.hashCode());
        result = prime * result + ((this.isOld == null) ? 0 : this.isOld.hashCode());
        result = prime * result + ((this.freePageClock == null) ? 0 : this.freePageClock.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbBufferPageLru (");

        sb.append(poolId);
        sb.append(", ").append(lruPosition);
        sb.append(", ").append(space);
        sb.append(", ").append(pageNumber);
        sb.append(", ").append(pageType);
        sb.append(", ").append(flushType);
        sb.append(", ").append(fixCount);
        sb.append(", ").append(isHashed);
        sb.append(", ").append(newestModification);
        sb.append(", ").append(oldestModification);
        sb.append(", ").append(accessTime);
        sb.append(", ").append(tableName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(numberRecords);
        sb.append(", ").append(dataSize);
        sb.append(", ").append(compressedSize);
        sb.append(", ").append(compressed);
        sb.append(", ").append(ioFix);
        sb.append(", ").append(isOld);
        sb.append(", ").append(freePageClock);

        sb.append(")");
        return sb.toString();
    }
}
