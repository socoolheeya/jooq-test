/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Statistics implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final Long nonUnique;
    private final String indexSchema;
    private final String indexName;
    private final Long seqInIndex;
    private final String columnName;
    private final String collation;
    private final Long cardinality;
    private final Long subPart;
    private final String packed;
    private final String nullable;
    private final String indexType;
    private final String comment;
    private final String indexComment;
    private final String ignored;

    public Statistics(Statistics value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.nonUnique = value.nonUnique;
        this.indexSchema = value.indexSchema;
        this.indexName = value.indexName;
        this.seqInIndex = value.seqInIndex;
        this.columnName = value.columnName;
        this.collation = value.collation;
        this.cardinality = value.cardinality;
        this.subPart = value.subPart;
        this.packed = value.packed;
        this.nullable = value.nullable;
        this.indexType = value.indexType;
        this.comment = value.comment;
        this.indexComment = value.indexComment;
        this.ignored = value.ignored;
    }

    public Statistics(
        String tableCatalog,
        String tableSchema,
        String tableName,
        Long nonUnique,
        String indexSchema,
        String indexName,
        Long seqInIndex,
        String columnName,
        String collation,
        Long cardinality,
        Long subPart,
        String packed,
        String nullable,
        String indexType,
        String comment,
        String indexComment,
        String ignored
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.nonUnique = nonUnique;
        this.indexSchema = indexSchema;
        this.indexName = indexName;
        this.seqInIndex = seqInIndex;
        this.columnName = columnName;
        this.collation = collation;
        this.cardinality = cardinality;
        this.subPart = subPart;
        this.packed = packed;
        this.nullable = nullable;
        this.indexType = indexType;
        this.comment = comment;
        this.indexComment = indexComment;
        this.ignored = ignored;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public Long getNonUnique() {
        return this.nonUnique;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public String getIndexSchema() {
        return this.indexSchema;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public Long getSeqInIndex() {
        return this.seqInIndex;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public String getCollation() {
        return this.collation;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public Long getCardinality() {
        return this.cardinality;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public Long getSubPart() {
        return this.subPart;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.PACKED</code>.
     */
    public String getPacked() {
        return this.packed;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public String getNullable() {
        return this.nullable;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public String getIndexComment() {
        return this.indexComment;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.IGNORED</code>.
     */
    public String getIgnored() {
        return this.ignored;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Statistics other = (Statistics) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.nonUnique == null) {
            if (other.nonUnique != null)
                return false;
        }
        else if (!this.nonUnique.equals(other.nonUnique))
            return false;
        if (this.indexSchema == null) {
            if (other.indexSchema != null)
                return false;
        }
        else if (!this.indexSchema.equals(other.indexSchema))
            return false;
        if (this.indexName == null) {
            if (other.indexName != null)
                return false;
        }
        else if (!this.indexName.equals(other.indexName))
            return false;
        if (this.seqInIndex == null) {
            if (other.seqInIndex != null)
                return false;
        }
        else if (!this.seqInIndex.equals(other.seqInIndex))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.collation == null) {
            if (other.collation != null)
                return false;
        }
        else if (!this.collation.equals(other.collation))
            return false;
        if (this.cardinality == null) {
            if (other.cardinality != null)
                return false;
        }
        else if (!this.cardinality.equals(other.cardinality))
            return false;
        if (this.subPart == null) {
            if (other.subPart != null)
                return false;
        }
        else if (!this.subPart.equals(other.subPart))
            return false;
        if (this.packed == null) {
            if (other.packed != null)
                return false;
        }
        else if (!this.packed.equals(other.packed))
            return false;
        if (this.nullable == null) {
            if (other.nullable != null)
                return false;
        }
        else if (!this.nullable.equals(other.nullable))
            return false;
        if (this.indexType == null) {
            if (other.indexType != null)
                return false;
        }
        else if (!this.indexType.equals(other.indexType))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.indexComment == null) {
            if (other.indexComment != null)
                return false;
        }
        else if (!this.indexComment.equals(other.indexComment))
            return false;
        if (this.ignored == null) {
            if (other.ignored != null)
                return false;
        }
        else if (!this.ignored.equals(other.ignored))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.nonUnique == null) ? 0 : this.nonUnique.hashCode());
        result = prime * result + ((this.indexSchema == null) ? 0 : this.indexSchema.hashCode());
        result = prime * result + ((this.indexName == null) ? 0 : this.indexName.hashCode());
        result = prime * result + ((this.seqInIndex == null) ? 0 : this.seqInIndex.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.collation == null) ? 0 : this.collation.hashCode());
        result = prime * result + ((this.cardinality == null) ? 0 : this.cardinality.hashCode());
        result = prime * result + ((this.subPart == null) ? 0 : this.subPart.hashCode());
        result = prime * result + ((this.packed == null) ? 0 : this.packed.hashCode());
        result = prime * result + ((this.nullable == null) ? 0 : this.nullable.hashCode());
        result = prime * result + ((this.indexType == null) ? 0 : this.indexType.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.indexComment == null) ? 0 : this.indexComment.hashCode());
        result = prime * result + ((this.ignored == null) ? 0 : this.ignored.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Statistics (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(nonUnique);
        sb.append(", ").append(indexSchema);
        sb.append(", ").append(indexName);
        sb.append(", ").append(seqInIndex);
        sb.append(", ").append(columnName);
        sb.append(", ").append(collation);
        sb.append(", ").append(cardinality);
        sb.append(", ").append(subPart);
        sb.append(", ").append(packed);
        sb.append(", ").append(nullable);
        sb.append(", ").append(indexType);
        sb.append(", ").append(comment);
        sb.append(", ").append(indexComment);
        sb.append(", ").append(ignored);

        sb.append(")");
        return sb.toString();
    }
}