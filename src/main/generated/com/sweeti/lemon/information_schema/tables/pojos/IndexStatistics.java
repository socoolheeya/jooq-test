/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndexStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableSchema;
    private final String tableName;
    private final String indexName;
    private final Long rowsRead;

    public IndexStatistics(IndexStatistics value) {
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.indexName = value.indexName;
        this.rowsRead = value.rowsRead;
    }

    public IndexStatistics(
        String tableSchema,
        String tableName,
        String indexName,
        Long rowsRead
    ) {
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.indexName = indexName;
        this.rowsRead = rowsRead;
    }

    /**
     * Getter for <code>information_schema.INDEX_STATISTICS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.INDEX_STATISTICS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.INDEX_STATISTICS.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Getter for <code>information_schema.INDEX_STATISTICS.ROWS_READ</code>.
     */
    public Long getRowsRead() {
        return this.rowsRead;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final IndexStatistics other = (IndexStatistics) obj;
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
        if (this.indexName == null) {
            if (other.indexName != null)
                return false;
        }
        else if (!this.indexName.equals(other.indexName))
            return false;
        if (this.rowsRead == null) {
            if (other.rowsRead != null)
                return false;
        }
        else if (!this.rowsRead.equals(other.rowsRead))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.indexName == null) ? 0 : this.indexName.hashCode());
        result = prime * result + ((this.rowsRead == null) ? 0 : this.rowsRead.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IndexStatistics (");

        sb.append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(indexName);
        sb.append(", ").append(rowsRead);

        sb.append(")");
        return sb.toString();
    }
}