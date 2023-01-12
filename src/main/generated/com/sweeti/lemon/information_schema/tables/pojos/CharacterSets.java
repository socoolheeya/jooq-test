/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSets implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String characterSetName;
    private final String defaultCollateName;
    private final String description;
    private final Long maxlen;

    public CharacterSets(CharacterSets value) {
        this.characterSetName = value.characterSetName;
        this.defaultCollateName = value.defaultCollateName;
        this.description = value.description;
        this.maxlen = value.maxlen;
    }

    public CharacterSets(
        String characterSetName,
        String defaultCollateName,
        String description,
        Long maxlen
    ) {
        this.characterSetName = characterSetName;
        this.defaultCollateName = defaultCollateName;
        this.description = description;
        this.maxlen = maxlen;
    }

    /**
     * Getter for
     * <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Getter for
     * <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public String getDefaultCollateName() {
        return this.defaultCollateName;
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public Long getMaxlen() {
        return this.maxlen;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final CharacterSets other = (CharacterSets) obj;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.defaultCollateName == null) {
            if (other.defaultCollateName != null)
                return false;
        }
        else if (!this.defaultCollateName.equals(other.defaultCollateName))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.maxlen == null) {
            if (other.maxlen != null)
                return false;
        }
        else if (!this.maxlen.equals(other.maxlen))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.defaultCollateName == null) ? 0 : this.defaultCollateName.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.maxlen == null) ? 0 : this.maxlen.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CharacterSets (");

        sb.append(characterSetName);
        sb.append(", ").append(defaultCollateName);
        sb.append(", ").append(description);
        sb.append(", ").append(maxlen);

        sb.append(")");
        return sb.toString();
    }
}