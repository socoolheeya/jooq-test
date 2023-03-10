/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long regionId;
    private final LocalDateTime createdAt;
    private final String caretedBy;
    private final String regionName;
    private final LocalDateTime updatedAt;
    private final String updatedBy;

    public Region(Region value) {
        this.regionId = value.regionId;
        this.createdAt = value.createdAt;
        this.caretedBy = value.caretedBy;
        this.regionName = value.regionName;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public Region(
        Long regionId,
        LocalDateTime createdAt,
        String caretedBy,
        String regionName,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.regionId = regionId;
        this.createdAt = createdAt;
        this.caretedBy = caretedBy;
        this.regionName = regionName;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>lemon.region.region_id</code>. 리전ID
     */
    public Long getRegionId() {
        return this.regionId;
    }

    /**
     * Getter for <code>lemon.region.created_at</code>. 생성일
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for <code>lemon.region.careted_by</code>. 생성자
     */
    public String getCaretedBy() {
        return this.caretedBy;
    }

    /**
     * Getter for <code>lemon.region.region_name</code>. 리전 이름
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * Getter for <code>lemon.region.updated_at</code>. 수정일
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for <code>lemon.region.updated_by</code>. 수정자
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Region other = (Region) obj;
        if (this.regionId == null) {
            if (other.regionId != null)
                return false;
        }
        else if (!this.regionId.equals(other.regionId))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.caretedBy == null) {
            if (other.caretedBy != null)
                return false;
        }
        else if (!this.caretedBy.equals(other.caretedBy))
            return false;
        if (this.regionName == null) {
            if (other.regionName != null)
                return false;
        }
        else if (!this.regionName.equals(other.regionName))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.regionId == null) ? 0 : this.regionId.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.caretedBy == null) ? 0 : this.caretedBy.hashCode());
        result = prime * result + ((this.regionName == null) ? 0 : this.regionName.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Region (");

        sb.append(regionId);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(caretedBy);
        sb.append(", ").append(regionName);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
