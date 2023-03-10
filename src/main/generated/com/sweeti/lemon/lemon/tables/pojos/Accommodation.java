/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.lemon.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Accommodation implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long accommodationId;
    private final String address;
    private final UInteger basementCount;
    private final String brandName;
    private final String chainName;
    private final LocalDateTime checkIn;
    private final LocalDateTime checkOut;
    private final String contact;
    private final LocalDateTime createdAt;
    private final String caretedBy;
    private final UInteger floorCount;
    private final String name;
    private final Double rating;
    private final UInteger roomCount;
    private final LocalDateTime updatedAt;
    private final String updatedBy;

    public Accommodation(Accommodation value) {
        this.accommodationId = value.accommodationId;
        this.address = value.address;
        this.basementCount = value.basementCount;
        this.brandName = value.brandName;
        this.chainName = value.chainName;
        this.checkIn = value.checkIn;
        this.checkOut = value.checkOut;
        this.contact = value.contact;
        this.createdAt = value.createdAt;
        this.caretedBy = value.caretedBy;
        this.floorCount = value.floorCount;
        this.name = value.name;
        this.rating = value.rating;
        this.roomCount = value.roomCount;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public Accommodation(
        Long accommodationId,
        String address,
        UInteger basementCount,
        String brandName,
        String chainName,
        LocalDateTime checkIn,
        LocalDateTime checkOut,
        String contact,
        LocalDateTime createdAt,
        String caretedBy,
        UInteger floorCount,
        String name,
        Double rating,
        UInteger roomCount,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.accommodationId = accommodationId;
        this.address = address;
        this.basementCount = basementCount;
        this.brandName = brandName;
        this.chainName = chainName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.contact = contact;
        this.createdAt = createdAt;
        this.caretedBy = caretedBy;
        this.floorCount = floorCount;
        this.name = name;
        this.rating = rating;
        this.roomCount = roomCount;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    /**
     * Getter for <code>lemon.accommodation.accommodation_id</code>. ??????ID
     */
    public Long getAccommodationId() {
        return this.accommodationId;
    }

    /**
     * Getter for <code>lemon.accommodation.address</code>. ??????
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Getter for <code>lemon.accommodation.basement_count</code>. ????????? ???
     */
    public UInteger getBasementCount() {
        return this.basementCount;
    }

    /**
     * Getter for <code>lemon.accommodation.brand_name</code>. ????????????
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * Getter for <code>lemon.accommodation.chain_name</code>. ?????????
     */
    public String getChainName() {
        return this.chainName;
    }

    /**
     * Getter for <code>lemon.accommodation.check_in</code>. ?????????
     */
    public LocalDateTime getCheckIn() {
        return this.checkIn;
    }

    /**
     * Getter for <code>lemon.accommodation.check_out</code>. ????????????
     */
    public LocalDateTime getCheckOut() {
        return this.checkOut;
    }

    /**
     * Getter for <code>lemon.accommodation.contact</code>. ?????????
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * Getter for <code>lemon.accommodation.created_at</code>. ?????????
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for <code>lemon.accommodation.careted_by</code>. ?????????
     */
    public String getCaretedBy() {
        return this.caretedBy;
    }

    /**
     * Getter for <code>lemon.accommodation.floor_count</code>. ??? ???
     */
    public UInteger getFloorCount() {
        return this.floorCount;
    }

    /**
     * Getter for <code>lemon.accommodation.name</code>. ?????????
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>lemon.accommodation.rating</code>. ????????????
     */
    public Double getRating() {
        return this.rating;
    }

    /**
     * Getter for <code>lemon.accommodation.room_count</code>. ??? ???
     */
    public UInteger getRoomCount() {
        return this.roomCount;
    }

    /**
     * Getter for <code>lemon.accommodation.updated_at</code>. ?????????
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for <code>lemon.accommodation.updated_by</code>. ?????????
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
        final Accommodation other = (Accommodation) obj;
        if (this.accommodationId == null) {
            if (other.accommodationId != null)
                return false;
        }
        else if (!this.accommodationId.equals(other.accommodationId))
            return false;
        if (this.address == null) {
            if (other.address != null)
                return false;
        }
        else if (!this.address.equals(other.address))
            return false;
        if (this.basementCount == null) {
            if (other.basementCount != null)
                return false;
        }
        else if (!this.basementCount.equals(other.basementCount))
            return false;
        if (this.brandName == null) {
            if (other.brandName != null)
                return false;
        }
        else if (!this.brandName.equals(other.brandName))
            return false;
        if (this.chainName == null) {
            if (other.chainName != null)
                return false;
        }
        else if (!this.chainName.equals(other.chainName))
            return false;
        if (this.checkIn == null) {
            if (other.checkIn != null)
                return false;
        }
        else if (!this.checkIn.equals(other.checkIn))
            return false;
        if (this.checkOut == null) {
            if (other.checkOut != null)
                return false;
        }
        else if (!this.checkOut.equals(other.checkOut))
            return false;
        if (this.contact == null) {
            if (other.contact != null)
                return false;
        }
        else if (!this.contact.equals(other.contact))
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
        if (this.floorCount == null) {
            if (other.floorCount != null)
                return false;
        }
        else if (!this.floorCount.equals(other.floorCount))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.rating == null) {
            if (other.rating != null)
                return false;
        }
        else if (!this.rating.equals(other.rating))
            return false;
        if (this.roomCount == null) {
            if (other.roomCount != null)
                return false;
        }
        else if (!this.roomCount.equals(other.roomCount))
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
        result = prime * result + ((this.accommodationId == null) ? 0 : this.accommodationId.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.basementCount == null) ? 0 : this.basementCount.hashCode());
        result = prime * result + ((this.brandName == null) ? 0 : this.brandName.hashCode());
        result = prime * result + ((this.chainName == null) ? 0 : this.chainName.hashCode());
        result = prime * result + ((this.checkIn == null) ? 0 : this.checkIn.hashCode());
        result = prime * result + ((this.checkOut == null) ? 0 : this.checkOut.hashCode());
        result = prime * result + ((this.contact == null) ? 0 : this.contact.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.caretedBy == null) ? 0 : this.caretedBy.hashCode());
        result = prime * result + ((this.floorCount == null) ? 0 : this.floorCount.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.rating == null) ? 0 : this.rating.hashCode());
        result = prime * result + ((this.roomCount == null) ? 0 : this.roomCount.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Accommodation (");

        sb.append(accommodationId);
        sb.append(", ").append(address);
        sb.append(", ").append(basementCount);
        sb.append(", ").append(brandName);
        sb.append(", ").append(chainName);
        sb.append(", ").append(checkIn);
        sb.append(", ").append(checkOut);
        sb.append(", ").append(contact);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(caretedBy);
        sb.append(", ").append(floorCount);
        sb.append(", ").append(name);
        sb.append(", ").append(rating);
        sb.append(", ").append(roomCount);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
