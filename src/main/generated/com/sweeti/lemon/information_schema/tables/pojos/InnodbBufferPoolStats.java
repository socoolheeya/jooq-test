/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPoolStats implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger poolId;
    private final ULong poolSize;
    private final ULong freeBuffers;
    private final ULong databasePages;
    private final ULong oldDatabasePages;
    private final ULong modifiedDatabasePages;
    private final ULong pendingDecompress;
    private final ULong pendingReads;
    private final ULong pendingFlushLru;
    private final ULong pendingFlushList;
    private final ULong pagesMadeYoung;
    private final ULong pagesNotMadeYoung;
    private final Double pagesMadeYoungRate;
    private final Double pagesMadeNotYoungRate;
    private final ULong numberPagesRead;
    private final ULong numberPagesCreated;
    private final ULong numberPagesWritten;
    private final Double pagesReadRate;
    private final Double pagesCreateRate;
    private final Double pagesWrittenRate;
    private final ULong numberPagesGet;
    private final ULong hitRate;
    private final ULong youngMakePerThousandGets;
    private final ULong notYoungMakePerThousandGets;
    private final ULong numberPagesReadAhead;
    private final ULong numberReadAheadEvicted;
    private final Double readAheadRate;
    private final Double readAheadEvictedRate;
    private final ULong lruIoTotal;
    private final ULong lruIoCurrent;
    private final ULong uncompressTotal;
    private final ULong uncompressCurrent;

    public InnodbBufferPoolStats(InnodbBufferPoolStats value) {
        this.poolId = value.poolId;
        this.poolSize = value.poolSize;
        this.freeBuffers = value.freeBuffers;
        this.databasePages = value.databasePages;
        this.oldDatabasePages = value.oldDatabasePages;
        this.modifiedDatabasePages = value.modifiedDatabasePages;
        this.pendingDecompress = value.pendingDecompress;
        this.pendingReads = value.pendingReads;
        this.pendingFlushLru = value.pendingFlushLru;
        this.pendingFlushList = value.pendingFlushList;
        this.pagesMadeYoung = value.pagesMadeYoung;
        this.pagesNotMadeYoung = value.pagesNotMadeYoung;
        this.pagesMadeYoungRate = value.pagesMadeYoungRate;
        this.pagesMadeNotYoungRate = value.pagesMadeNotYoungRate;
        this.numberPagesRead = value.numberPagesRead;
        this.numberPagesCreated = value.numberPagesCreated;
        this.numberPagesWritten = value.numberPagesWritten;
        this.pagesReadRate = value.pagesReadRate;
        this.pagesCreateRate = value.pagesCreateRate;
        this.pagesWrittenRate = value.pagesWrittenRate;
        this.numberPagesGet = value.numberPagesGet;
        this.hitRate = value.hitRate;
        this.youngMakePerThousandGets = value.youngMakePerThousandGets;
        this.notYoungMakePerThousandGets = value.notYoungMakePerThousandGets;
        this.numberPagesReadAhead = value.numberPagesReadAhead;
        this.numberReadAheadEvicted = value.numberReadAheadEvicted;
        this.readAheadRate = value.readAheadRate;
        this.readAheadEvictedRate = value.readAheadEvictedRate;
        this.lruIoTotal = value.lruIoTotal;
        this.lruIoCurrent = value.lruIoCurrent;
        this.uncompressTotal = value.uncompressTotal;
        this.uncompressCurrent = value.uncompressCurrent;
    }

    public InnodbBufferPoolStats(
        UInteger poolId,
        ULong poolSize,
        ULong freeBuffers,
        ULong databasePages,
        ULong oldDatabasePages,
        ULong modifiedDatabasePages,
        ULong pendingDecompress,
        ULong pendingReads,
        ULong pendingFlushLru,
        ULong pendingFlushList,
        ULong pagesMadeYoung,
        ULong pagesNotMadeYoung,
        Double pagesMadeYoungRate,
        Double pagesMadeNotYoungRate,
        ULong numberPagesRead,
        ULong numberPagesCreated,
        ULong numberPagesWritten,
        Double pagesReadRate,
        Double pagesCreateRate,
        Double pagesWrittenRate,
        ULong numberPagesGet,
        ULong hitRate,
        ULong youngMakePerThousandGets,
        ULong notYoungMakePerThousandGets,
        ULong numberPagesReadAhead,
        ULong numberReadAheadEvicted,
        Double readAheadRate,
        Double readAheadEvictedRate,
        ULong lruIoTotal,
        ULong lruIoCurrent,
        ULong uncompressTotal,
        ULong uncompressCurrent
    ) {
        this.poolId = poolId;
        this.poolSize = poolSize;
        this.freeBuffers = freeBuffers;
        this.databasePages = databasePages;
        this.oldDatabasePages = oldDatabasePages;
        this.modifiedDatabasePages = modifiedDatabasePages;
        this.pendingDecompress = pendingDecompress;
        this.pendingReads = pendingReads;
        this.pendingFlushLru = pendingFlushLru;
        this.pendingFlushList = pendingFlushList;
        this.pagesMadeYoung = pagesMadeYoung;
        this.pagesNotMadeYoung = pagesNotMadeYoung;
        this.pagesMadeYoungRate = pagesMadeYoungRate;
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
        this.numberPagesRead = numberPagesRead;
        this.numberPagesCreated = numberPagesCreated;
        this.numberPagesWritten = numberPagesWritten;
        this.pagesReadRate = pagesReadRate;
        this.pagesCreateRate = pagesCreateRate;
        this.pagesWrittenRate = pagesWrittenRate;
        this.numberPagesGet = numberPagesGet;
        this.hitRate = hitRate;
        this.youngMakePerThousandGets = youngMakePerThousandGets;
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
        this.numberPagesReadAhead = numberPagesReadAhead;
        this.numberReadAheadEvicted = numberReadAheadEvicted;
        this.readAheadRate = readAheadRate;
        this.readAheadEvictedRate = readAheadEvictedRate;
        this.lruIoTotal = lruIoTotal;
        this.lruIoCurrent = lruIoCurrent;
        this.uncompressTotal = uncompressTotal;
        this.uncompressCurrent = uncompressCurrent;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
     */
    public UInteger getPoolId() {
        return this.poolId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
     */
    public ULong getPoolSize() {
        return this.poolSize;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
     */
    public ULong getFreeBuffers() {
        return this.freeBuffers;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
     */
    public ULong getDatabasePages() {
        return this.databasePages;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
     */
    public ULong getOldDatabasePages() {
        return this.oldDatabasePages;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
     */
    public ULong getModifiedDatabasePages() {
        return this.modifiedDatabasePages;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
     */
    public ULong getPendingDecompress() {
        return this.pendingDecompress;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
     */
    public ULong getPendingReads() {
        return this.pendingReads;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
     */
    public ULong getPendingFlushLru() {
        return this.pendingFlushLru;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
     */
    public ULong getPendingFlushList() {
        return this.pendingFlushList;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
     */
    public ULong getPagesMadeYoung() {
        return this.pagesMadeYoung;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
     */
    public ULong getPagesNotMadeYoung() {
        return this.pagesNotMadeYoung;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
     */
    public Double getPagesMadeYoungRate() {
        return this.pagesMadeYoungRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
     */
    public Double getPagesMadeNotYoungRate() {
        return this.pagesMadeNotYoungRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
     */
    public ULong getNumberPagesRead() {
        return this.numberPagesRead;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
     */
    public ULong getNumberPagesCreated() {
        return this.numberPagesCreated;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
     */
    public ULong getNumberPagesWritten() {
        return this.numberPagesWritten;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
     */
    public Double getPagesReadRate() {
        return this.pagesReadRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
     */
    public Double getPagesCreateRate() {
        return this.pagesCreateRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
     */
    public Double getPagesWrittenRate() {
        return this.pagesWrittenRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
     */
    public ULong getNumberPagesGet() {
        return this.numberPagesGet;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
     */
    public ULong getHitRate() {
        return this.hitRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    public ULong getYoungMakePerThousandGets() {
        return this.youngMakePerThousandGets;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
     */
    public ULong getNotYoungMakePerThousandGets() {
        return this.notYoungMakePerThousandGets;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
     */
    public ULong getNumberPagesReadAhead() {
        return this.numberPagesReadAhead;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
     */
    public ULong getNumberReadAheadEvicted() {
        return this.numberReadAheadEvicted;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
     */
    public Double getReadAheadRate() {
        return this.readAheadRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
     */
    public Double getReadAheadEvictedRate() {
        return this.readAheadEvictedRate;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
     */
    public ULong getLruIoTotal() {
        return this.lruIoTotal;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
     */
    public ULong getLruIoCurrent() {
        return this.lruIoCurrent;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
     */
    public ULong getUncompressTotal() {
        return this.uncompressTotal;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
     */
    public ULong getUncompressCurrent() {
        return this.uncompressCurrent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbBufferPoolStats other = (InnodbBufferPoolStats) obj;
        if (this.poolId == null) {
            if (other.poolId != null)
                return false;
        }
        else if (!this.poolId.equals(other.poolId))
            return false;
        if (this.poolSize == null) {
            if (other.poolSize != null)
                return false;
        }
        else if (!this.poolSize.equals(other.poolSize))
            return false;
        if (this.freeBuffers == null) {
            if (other.freeBuffers != null)
                return false;
        }
        else if (!this.freeBuffers.equals(other.freeBuffers))
            return false;
        if (this.databasePages == null) {
            if (other.databasePages != null)
                return false;
        }
        else if (!this.databasePages.equals(other.databasePages))
            return false;
        if (this.oldDatabasePages == null) {
            if (other.oldDatabasePages != null)
                return false;
        }
        else if (!this.oldDatabasePages.equals(other.oldDatabasePages))
            return false;
        if (this.modifiedDatabasePages == null) {
            if (other.modifiedDatabasePages != null)
                return false;
        }
        else if (!this.modifiedDatabasePages.equals(other.modifiedDatabasePages))
            return false;
        if (this.pendingDecompress == null) {
            if (other.pendingDecompress != null)
                return false;
        }
        else if (!this.pendingDecompress.equals(other.pendingDecompress))
            return false;
        if (this.pendingReads == null) {
            if (other.pendingReads != null)
                return false;
        }
        else if (!this.pendingReads.equals(other.pendingReads))
            return false;
        if (this.pendingFlushLru == null) {
            if (other.pendingFlushLru != null)
                return false;
        }
        else if (!this.pendingFlushLru.equals(other.pendingFlushLru))
            return false;
        if (this.pendingFlushList == null) {
            if (other.pendingFlushList != null)
                return false;
        }
        else if (!this.pendingFlushList.equals(other.pendingFlushList))
            return false;
        if (this.pagesMadeYoung == null) {
            if (other.pagesMadeYoung != null)
                return false;
        }
        else if (!this.pagesMadeYoung.equals(other.pagesMadeYoung))
            return false;
        if (this.pagesNotMadeYoung == null) {
            if (other.pagesNotMadeYoung != null)
                return false;
        }
        else if (!this.pagesNotMadeYoung.equals(other.pagesNotMadeYoung))
            return false;
        if (this.pagesMadeYoungRate == null) {
            if (other.pagesMadeYoungRate != null)
                return false;
        }
        else if (!this.pagesMadeYoungRate.equals(other.pagesMadeYoungRate))
            return false;
        if (this.pagesMadeNotYoungRate == null) {
            if (other.pagesMadeNotYoungRate != null)
                return false;
        }
        else if (!this.pagesMadeNotYoungRate.equals(other.pagesMadeNotYoungRate))
            return false;
        if (this.numberPagesRead == null) {
            if (other.numberPagesRead != null)
                return false;
        }
        else if (!this.numberPagesRead.equals(other.numberPagesRead))
            return false;
        if (this.numberPagesCreated == null) {
            if (other.numberPagesCreated != null)
                return false;
        }
        else if (!this.numberPagesCreated.equals(other.numberPagesCreated))
            return false;
        if (this.numberPagesWritten == null) {
            if (other.numberPagesWritten != null)
                return false;
        }
        else if (!this.numberPagesWritten.equals(other.numberPagesWritten))
            return false;
        if (this.pagesReadRate == null) {
            if (other.pagesReadRate != null)
                return false;
        }
        else if (!this.pagesReadRate.equals(other.pagesReadRate))
            return false;
        if (this.pagesCreateRate == null) {
            if (other.pagesCreateRate != null)
                return false;
        }
        else if (!this.pagesCreateRate.equals(other.pagesCreateRate))
            return false;
        if (this.pagesWrittenRate == null) {
            if (other.pagesWrittenRate != null)
                return false;
        }
        else if (!this.pagesWrittenRate.equals(other.pagesWrittenRate))
            return false;
        if (this.numberPagesGet == null) {
            if (other.numberPagesGet != null)
                return false;
        }
        else if (!this.numberPagesGet.equals(other.numberPagesGet))
            return false;
        if (this.hitRate == null) {
            if (other.hitRate != null)
                return false;
        }
        else if (!this.hitRate.equals(other.hitRate))
            return false;
        if (this.youngMakePerThousandGets == null) {
            if (other.youngMakePerThousandGets != null)
                return false;
        }
        else if (!this.youngMakePerThousandGets.equals(other.youngMakePerThousandGets))
            return false;
        if (this.notYoungMakePerThousandGets == null) {
            if (other.notYoungMakePerThousandGets != null)
                return false;
        }
        else if (!this.notYoungMakePerThousandGets.equals(other.notYoungMakePerThousandGets))
            return false;
        if (this.numberPagesReadAhead == null) {
            if (other.numberPagesReadAhead != null)
                return false;
        }
        else if (!this.numberPagesReadAhead.equals(other.numberPagesReadAhead))
            return false;
        if (this.numberReadAheadEvicted == null) {
            if (other.numberReadAheadEvicted != null)
                return false;
        }
        else if (!this.numberReadAheadEvicted.equals(other.numberReadAheadEvicted))
            return false;
        if (this.readAheadRate == null) {
            if (other.readAheadRate != null)
                return false;
        }
        else if (!this.readAheadRate.equals(other.readAheadRate))
            return false;
        if (this.readAheadEvictedRate == null) {
            if (other.readAheadEvictedRate != null)
                return false;
        }
        else if (!this.readAheadEvictedRate.equals(other.readAheadEvictedRate))
            return false;
        if (this.lruIoTotal == null) {
            if (other.lruIoTotal != null)
                return false;
        }
        else if (!this.lruIoTotal.equals(other.lruIoTotal))
            return false;
        if (this.lruIoCurrent == null) {
            if (other.lruIoCurrent != null)
                return false;
        }
        else if (!this.lruIoCurrent.equals(other.lruIoCurrent))
            return false;
        if (this.uncompressTotal == null) {
            if (other.uncompressTotal != null)
                return false;
        }
        else if (!this.uncompressTotal.equals(other.uncompressTotal))
            return false;
        if (this.uncompressCurrent == null) {
            if (other.uncompressCurrent != null)
                return false;
        }
        else if (!this.uncompressCurrent.equals(other.uncompressCurrent))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.poolId == null) ? 0 : this.poolId.hashCode());
        result = prime * result + ((this.poolSize == null) ? 0 : this.poolSize.hashCode());
        result = prime * result + ((this.freeBuffers == null) ? 0 : this.freeBuffers.hashCode());
        result = prime * result + ((this.databasePages == null) ? 0 : this.databasePages.hashCode());
        result = prime * result + ((this.oldDatabasePages == null) ? 0 : this.oldDatabasePages.hashCode());
        result = prime * result + ((this.modifiedDatabasePages == null) ? 0 : this.modifiedDatabasePages.hashCode());
        result = prime * result + ((this.pendingDecompress == null) ? 0 : this.pendingDecompress.hashCode());
        result = prime * result + ((this.pendingReads == null) ? 0 : this.pendingReads.hashCode());
        result = prime * result + ((this.pendingFlushLru == null) ? 0 : this.pendingFlushLru.hashCode());
        result = prime * result + ((this.pendingFlushList == null) ? 0 : this.pendingFlushList.hashCode());
        result = prime * result + ((this.pagesMadeYoung == null) ? 0 : this.pagesMadeYoung.hashCode());
        result = prime * result + ((this.pagesNotMadeYoung == null) ? 0 : this.pagesNotMadeYoung.hashCode());
        result = prime * result + ((this.pagesMadeYoungRate == null) ? 0 : this.pagesMadeYoungRate.hashCode());
        result = prime * result + ((this.pagesMadeNotYoungRate == null) ? 0 : this.pagesMadeNotYoungRate.hashCode());
        result = prime * result + ((this.numberPagesRead == null) ? 0 : this.numberPagesRead.hashCode());
        result = prime * result + ((this.numberPagesCreated == null) ? 0 : this.numberPagesCreated.hashCode());
        result = prime * result + ((this.numberPagesWritten == null) ? 0 : this.numberPagesWritten.hashCode());
        result = prime * result + ((this.pagesReadRate == null) ? 0 : this.pagesReadRate.hashCode());
        result = prime * result + ((this.pagesCreateRate == null) ? 0 : this.pagesCreateRate.hashCode());
        result = prime * result + ((this.pagesWrittenRate == null) ? 0 : this.pagesWrittenRate.hashCode());
        result = prime * result + ((this.numberPagesGet == null) ? 0 : this.numberPagesGet.hashCode());
        result = prime * result + ((this.hitRate == null) ? 0 : this.hitRate.hashCode());
        result = prime * result + ((this.youngMakePerThousandGets == null) ? 0 : this.youngMakePerThousandGets.hashCode());
        result = prime * result + ((this.notYoungMakePerThousandGets == null) ? 0 : this.notYoungMakePerThousandGets.hashCode());
        result = prime * result + ((this.numberPagesReadAhead == null) ? 0 : this.numberPagesReadAhead.hashCode());
        result = prime * result + ((this.numberReadAheadEvicted == null) ? 0 : this.numberReadAheadEvicted.hashCode());
        result = prime * result + ((this.readAheadRate == null) ? 0 : this.readAheadRate.hashCode());
        result = prime * result + ((this.readAheadEvictedRate == null) ? 0 : this.readAheadEvictedRate.hashCode());
        result = prime * result + ((this.lruIoTotal == null) ? 0 : this.lruIoTotal.hashCode());
        result = prime * result + ((this.lruIoCurrent == null) ? 0 : this.lruIoCurrent.hashCode());
        result = prime * result + ((this.uncompressTotal == null) ? 0 : this.uncompressTotal.hashCode());
        result = prime * result + ((this.uncompressCurrent == null) ? 0 : this.uncompressCurrent.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbBufferPoolStats (");

        sb.append(poolId);
        sb.append(", ").append(poolSize);
        sb.append(", ").append(freeBuffers);
        sb.append(", ").append(databasePages);
        sb.append(", ").append(oldDatabasePages);
        sb.append(", ").append(modifiedDatabasePages);
        sb.append(", ").append(pendingDecompress);
        sb.append(", ").append(pendingReads);
        sb.append(", ").append(pendingFlushLru);
        sb.append(", ").append(pendingFlushList);
        sb.append(", ").append(pagesMadeYoung);
        sb.append(", ").append(pagesNotMadeYoung);
        sb.append(", ").append(pagesMadeYoungRate);
        sb.append(", ").append(pagesMadeNotYoungRate);
        sb.append(", ").append(numberPagesRead);
        sb.append(", ").append(numberPagesCreated);
        sb.append(", ").append(numberPagesWritten);
        sb.append(", ").append(pagesReadRate);
        sb.append(", ").append(pagesCreateRate);
        sb.append(", ").append(pagesWrittenRate);
        sb.append(", ").append(numberPagesGet);
        sb.append(", ").append(hitRate);
        sb.append(", ").append(youngMakePerThousandGets);
        sb.append(", ").append(notYoungMakePerThousandGets);
        sb.append(", ").append(numberPagesReadAhead);
        sb.append(", ").append(numberReadAheadEvicted);
        sb.append(", ").append(readAheadRate);
        sb.append(", ").append(readAheadEvictedRate);
        sb.append(", ").append(lruIoTotal);
        sb.append(", ").append(lruIoCurrent);
        sb.append(", ").append(uncompressTotal);
        sb.append(", ").append(uncompressCurrent);

        sb.append(")");
        return sb.toString();
    }
}
