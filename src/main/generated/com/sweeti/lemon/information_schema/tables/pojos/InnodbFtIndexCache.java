/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtIndexCache implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String word;
    private final ULong firstDocId;
    private final ULong lastDocId;
    private final ULong docCount;
    private final ULong docId;
    private final ULong position;

    public InnodbFtIndexCache(InnodbFtIndexCache value) {
        this.word = value.word;
        this.firstDocId = value.firstDocId;
        this.lastDocId = value.lastDocId;
        this.docCount = value.docCount;
        this.docId = value.docId;
        this.position = value.position;
    }

    public InnodbFtIndexCache(
        String word,
        ULong firstDocId,
        ULong lastDocId,
        ULong docCount,
        ULong docId,
        ULong position
    ) {
        this.word = word;
        this.firstDocId = firstDocId;
        this.lastDocId = lastDocId;
        this.docCount = docCount;
        this.docId = docId;
        this.position = position;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
     */
    public String getWord() {
        return this.word;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
     */
    public ULong getFirstDocId() {
        return this.firstDocId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
     */
    public ULong getLastDocId() {
        return this.lastDocId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
     */
    public ULong getDocCount() {
        return this.docCount;
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
     */
    public ULong getDocId() {
        return this.docId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
     */
    public ULong getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbFtIndexCache other = (InnodbFtIndexCache) obj;
        if (this.word == null) {
            if (other.word != null)
                return false;
        }
        else if (!this.word.equals(other.word))
            return false;
        if (this.firstDocId == null) {
            if (other.firstDocId != null)
                return false;
        }
        else if (!this.firstDocId.equals(other.firstDocId))
            return false;
        if (this.lastDocId == null) {
            if (other.lastDocId != null)
                return false;
        }
        else if (!this.lastDocId.equals(other.lastDocId))
            return false;
        if (this.docCount == null) {
            if (other.docCount != null)
                return false;
        }
        else if (!this.docCount.equals(other.docCount))
            return false;
        if (this.docId == null) {
            if (other.docId != null)
                return false;
        }
        else if (!this.docId.equals(other.docId))
            return false;
        if (this.position == null) {
            if (other.position != null)
                return false;
        }
        else if (!this.position.equals(other.position))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.word == null) ? 0 : this.word.hashCode());
        result = prime * result + ((this.firstDocId == null) ? 0 : this.firstDocId.hashCode());
        result = prime * result + ((this.lastDocId == null) ? 0 : this.lastDocId.hashCode());
        result = prime * result + ((this.docCount == null) ? 0 : this.docCount.hashCode());
        result = prime * result + ((this.docId == null) ? 0 : this.docId.hashCode());
        result = prime * result + ((this.position == null) ? 0 : this.position.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbFtIndexCache (");

        sb.append(word);
        sb.append(", ").append(firstDocId);
        sb.append(", ").append(lastDocId);
        sb.append(", ").append(docCount);
        sb.append(", ").append(docId);
        sb.append(", ").append(position);

        sb.append(")");
        return sb.toString();
    }
}
