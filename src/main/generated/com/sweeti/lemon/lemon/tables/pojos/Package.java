/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long packageId;
    private final BigDecimal cost;
    private final String description;
    private final BigDecimal discountCost;
    private final String name;
    private final String roomStatus;
    private final BigDecimal totalCost;
    private final String useYn;
    private final Long bookingId;

    public Package(Package value) {
        this.packageId = value.packageId;
        this.cost = value.cost;
        this.description = value.description;
        this.discountCost = value.discountCost;
        this.name = value.name;
        this.roomStatus = value.roomStatus;
        this.totalCost = value.totalCost;
        this.useYn = value.useYn;
        this.bookingId = value.bookingId;
    }

    public Package(
        Long packageId,
        BigDecimal cost,
        String description,
        BigDecimal discountCost,
        String name,
        String roomStatus,
        BigDecimal totalCost,
        String useYn,
        Long bookingId
    ) {
        this.packageId = packageId;
        this.cost = cost;
        this.description = description;
        this.discountCost = discountCost;
        this.name = name;
        this.roomStatus = roomStatus;
        this.totalCost = totalCost;
        this.useYn = useYn;
        this.bookingId = bookingId;
    }

    /**
     * Getter for <code>lemon.package.package_id</code>. 패키지ID
     */
    public Long getPackageId() {
        return this.packageId;
    }

    /**
     * Getter for <code>lemon.package.cost</code>. 일반요금
     */
    public BigDecimal getCost() {
        return this.cost;
    }

    /**
     * Getter for <code>lemon.package.description</code>. 패키지 설명
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for <code>lemon.package.discount_cost</code>. 할인금액
     */
    public BigDecimal getDiscountCost() {
        return this.discountCost;
    }

    /**
     * Getter for <code>lemon.package.name</code>. 패키지명
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>lemon.package.room_status</code>. 예약상태
     */
    public String getRoomStatus() {
        return this.roomStatus;
    }

    /**
     * Getter for <code>lemon.package.total_cost</code>. 총 요금
     */
    public BigDecimal getTotalCost() {
        return this.totalCost;
    }

    /**
     * Getter for <code>lemon.package.use_yn</code>. 사용여부
     */
    public String getUseYn() {
        return this.useYn;
    }

    /**
     * Getter for <code>lemon.package.booking_id</code>. 예약ID
     */
    public Long getBookingId() {
        return this.bookingId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Package other = (Package) obj;
        if (this.packageId == null) {
            if (other.packageId != null)
                return false;
        }
        else if (!this.packageId.equals(other.packageId))
            return false;
        if (this.cost == null) {
            if (other.cost != null)
                return false;
        }
        else if (!this.cost.equals(other.cost))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.discountCost == null) {
            if (other.discountCost != null)
                return false;
        }
        else if (!this.discountCost.equals(other.discountCost))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.roomStatus == null) {
            if (other.roomStatus != null)
                return false;
        }
        else if (!this.roomStatus.equals(other.roomStatus))
            return false;
        if (this.totalCost == null) {
            if (other.totalCost != null)
                return false;
        }
        else if (!this.totalCost.equals(other.totalCost))
            return false;
        if (this.useYn == null) {
            if (other.useYn != null)
                return false;
        }
        else if (!this.useYn.equals(other.useYn))
            return false;
        if (this.bookingId == null) {
            if (other.bookingId != null)
                return false;
        }
        else if (!this.bookingId.equals(other.bookingId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.packageId == null) ? 0 : this.packageId.hashCode());
        result = prime * result + ((this.cost == null) ? 0 : this.cost.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.discountCost == null) ? 0 : this.discountCost.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.roomStatus == null) ? 0 : this.roomStatus.hashCode());
        result = prime * result + ((this.totalCost == null) ? 0 : this.totalCost.hashCode());
        result = prime * result + ((this.useYn == null) ? 0 : this.useYn.hashCode());
        result = prime * result + ((this.bookingId == null) ? 0 : this.bookingId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Package (");

        sb.append(packageId);
        sb.append(", ").append(cost);
        sb.append(", ").append(description);
        sb.append(", ").append(discountCost);
        sb.append(", ").append(name);
        sb.append(", ").append(roomStatus);
        sb.append(", ").append(totalCost);
        sb.append(", ").append(useYn);
        sb.append(", ").append(bookingId);

        sb.append(")");
        return sb.toString();
    }
}
