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
public class InnodbTablespacesEncryption implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger space;
    private final String name;
    private final UInteger encryptionScheme;
    private final UInteger keyserverRequests;
    private final UInteger minKeyVersion;
    private final UInteger currentKeyVersion;
    private final ULong keyRotationPageNumber;
    private final ULong keyRotationMaxPageNumber;
    private final UInteger currentKeyId;
    private final Integer rotatingOrFlushing;

    public InnodbTablespacesEncryption(InnodbTablespacesEncryption value) {
        this.space = value.space;
        this.name = value.name;
        this.encryptionScheme = value.encryptionScheme;
        this.keyserverRequests = value.keyserverRequests;
        this.minKeyVersion = value.minKeyVersion;
        this.currentKeyVersion = value.currentKeyVersion;
        this.keyRotationPageNumber = value.keyRotationPageNumber;
        this.keyRotationMaxPageNumber = value.keyRotationMaxPageNumber;
        this.currentKeyId = value.currentKeyId;
        this.rotatingOrFlushing = value.rotatingOrFlushing;
    }

    public InnodbTablespacesEncryption(
        UInteger space,
        String name,
        UInteger encryptionScheme,
        UInteger keyserverRequests,
        UInteger minKeyVersion,
        UInteger currentKeyVersion,
        ULong keyRotationPageNumber,
        ULong keyRotationMaxPageNumber,
        UInteger currentKeyId,
        Integer rotatingOrFlushing
    ) {
        this.space = space;
        this.name = name;
        this.encryptionScheme = encryptionScheme;
        this.keyserverRequests = keyserverRequests;
        this.minKeyVersion = minKeyVersion;
        this.currentKeyVersion = currentKeyVersion;
        this.keyRotationPageNumber = keyRotationPageNumber;
        this.keyRotationMaxPageNumber = keyRotationMaxPageNumber;
        this.currentKeyId = currentKeyId;
        this.rotatingOrFlushing = rotatingOrFlushing;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.SPACE</code>.
     */
    public UInteger getSpace() {
        return this.space;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.ENCRYPTION_SCHEME</code>.
     */
    public UInteger getEncryptionScheme() {
        return this.encryptionScheme;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEYSERVER_REQUESTS</code>.
     */
    public UInteger getKeyserverRequests() {
        return this.keyserverRequests;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.MIN_KEY_VERSION</code>.
     */
    public UInteger getMinKeyVersion() {
        return this.minKeyVersion;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.CURRENT_KEY_VERSION</code>.
     */
    public UInteger getCurrentKeyVersion() {
        return this.currentKeyVersion;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEY_ROTATION_PAGE_NUMBER</code>.
     */
    public ULong getKeyRotationPageNumber() {
        return this.keyRotationPageNumber;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.KEY_ROTATION_MAX_PAGE_NUMBER</code>.
     */
    public ULong getKeyRotationMaxPageNumber() {
        return this.keyRotationMaxPageNumber;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.CURRENT_KEY_ID</code>.
     */
    public UInteger getCurrentKeyId() {
        return this.currentKeyId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESPACES_ENCRYPTION.ROTATING_OR_FLUSHING</code>.
     */
    public Integer getRotatingOrFlushing() {
        return this.rotatingOrFlushing;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbTablespacesEncryption other = (InnodbTablespacesEncryption) obj;
        if (this.space == null) {
            if (other.space != null)
                return false;
        }
        else if (!this.space.equals(other.space))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.encryptionScheme == null) {
            if (other.encryptionScheme != null)
                return false;
        }
        else if (!this.encryptionScheme.equals(other.encryptionScheme))
            return false;
        if (this.keyserverRequests == null) {
            if (other.keyserverRequests != null)
                return false;
        }
        else if (!this.keyserverRequests.equals(other.keyserverRequests))
            return false;
        if (this.minKeyVersion == null) {
            if (other.minKeyVersion != null)
                return false;
        }
        else if (!this.minKeyVersion.equals(other.minKeyVersion))
            return false;
        if (this.currentKeyVersion == null) {
            if (other.currentKeyVersion != null)
                return false;
        }
        else if (!this.currentKeyVersion.equals(other.currentKeyVersion))
            return false;
        if (this.keyRotationPageNumber == null) {
            if (other.keyRotationPageNumber != null)
                return false;
        }
        else if (!this.keyRotationPageNumber.equals(other.keyRotationPageNumber))
            return false;
        if (this.keyRotationMaxPageNumber == null) {
            if (other.keyRotationMaxPageNumber != null)
                return false;
        }
        else if (!this.keyRotationMaxPageNumber.equals(other.keyRotationMaxPageNumber))
            return false;
        if (this.currentKeyId == null) {
            if (other.currentKeyId != null)
                return false;
        }
        else if (!this.currentKeyId.equals(other.currentKeyId))
            return false;
        if (this.rotatingOrFlushing == null) {
            if (other.rotatingOrFlushing != null)
                return false;
        }
        else if (!this.rotatingOrFlushing.equals(other.rotatingOrFlushing))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.space == null) ? 0 : this.space.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.encryptionScheme == null) ? 0 : this.encryptionScheme.hashCode());
        result = prime * result + ((this.keyserverRequests == null) ? 0 : this.keyserverRequests.hashCode());
        result = prime * result + ((this.minKeyVersion == null) ? 0 : this.minKeyVersion.hashCode());
        result = prime * result + ((this.currentKeyVersion == null) ? 0 : this.currentKeyVersion.hashCode());
        result = prime * result + ((this.keyRotationPageNumber == null) ? 0 : this.keyRotationPageNumber.hashCode());
        result = prime * result + ((this.keyRotationMaxPageNumber == null) ? 0 : this.keyRotationMaxPageNumber.hashCode());
        result = prime * result + ((this.currentKeyId == null) ? 0 : this.currentKeyId.hashCode());
        result = prime * result + ((this.rotatingOrFlushing == null) ? 0 : this.rotatingOrFlushing.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTablespacesEncryption (");

        sb.append(space);
        sb.append(", ").append(name);
        sb.append(", ").append(encryptionScheme);
        sb.append(", ").append(keyserverRequests);
        sb.append(", ").append(minKeyVersion);
        sb.append(", ").append(currentKeyVersion);
        sb.append(", ").append(keyRotationPageNumber);
        sb.append(", ").append(keyRotationMaxPageNumber);
        sb.append(", ").append(currentKeyId);
        sb.append(", ").append(rotatingOrFlushing);

        sb.append(")");
        return sb.toString();
    }
}
