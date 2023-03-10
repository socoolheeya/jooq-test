/*
 * This file is generated by jOOQ.
 */
package com.sweeti.lemon.information_schema.tables.records;


import com.sweeti.lemon.information_schema.tables.Parameters;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParametersRecord extends TableRecordImpl<ParametersRecord> implements Record16<String, String, String, Integer, String, String, String, Integer, Integer, Integer, Integer, ULong, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public ParametersRecord setSpecificCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public ParametersRecord setSpecificSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public ParametersRecord setSpecificName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public ParametersRecord setOrdinalPosition(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    public ParametersRecord setParameterMode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    public String getParameterMode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    public ParametersRecord setParameterName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    public String getParameterName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    public ParametersRecord setDataType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public ParametersRecord setCharacterMaximumLength(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public ParametersRecord setCharacterOctetLength(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public ParametersRecord setNumericPrecision(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public ParametersRecord setNumericScale(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public ParametersRecord setDatetimePrecision(ULong value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public ULong getDatetimePrecision() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public ParametersRecord setCharacterSetName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    public ParametersRecord setCollationName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public ParametersRecord setDtdIdentifier(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    public ParametersRecord setRoutineType(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    public String getRoutineType() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<String, String, String, Integer, String, String, String, Integer, Integer, Integer, Integer, ULong, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<String, String, String, Integer, String, String, String, Integer, Integer, Integer, Integer, ULong, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Parameters.PARAMETERS.SPECIFIC_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Parameters.PARAMETERS.SPECIFIC_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Parameters.PARAMETERS.SPECIFIC_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Parameters.PARAMETERS.ORDINAL_POSITION;
    }

    @Override
    public Field<String> field5() {
        return Parameters.PARAMETERS.PARAMETER_MODE;
    }

    @Override
    public Field<String> field6() {
        return Parameters.PARAMETERS.PARAMETER_NAME;
    }

    @Override
    public Field<String> field7() {
        return Parameters.PARAMETERS.DATA_TYPE;
    }

    @Override
    public Field<Integer> field8() {
        return Parameters.PARAMETERS.CHARACTER_MAXIMUM_LENGTH;
    }

    @Override
    public Field<Integer> field9() {
        return Parameters.PARAMETERS.CHARACTER_OCTET_LENGTH;
    }

    @Override
    public Field<Integer> field10() {
        return Parameters.PARAMETERS.NUMERIC_PRECISION;
    }

    @Override
    public Field<Integer> field11() {
        return Parameters.PARAMETERS.NUMERIC_SCALE;
    }

    @Override
    public Field<ULong> field12() {
        return Parameters.PARAMETERS.DATETIME_PRECISION;
    }

    @Override
    public Field<String> field13() {
        return Parameters.PARAMETERS.CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field14() {
        return Parameters.PARAMETERS.COLLATION_NAME;
    }

    @Override
    public Field<String> field15() {
        return Parameters.PARAMETERS.DTD_IDENTIFIER;
    }

    @Override
    public Field<String> field16() {
        return Parameters.PARAMETERS.ROUTINE_TYPE;
    }

    @Override
    public String component1() {
        return getSpecificCatalog();
    }

    @Override
    public String component2() {
        return getSpecificSchema();
    }

    @Override
    public String component3() {
        return getSpecificName();
    }

    @Override
    public Integer component4() {
        return getOrdinalPosition();
    }

    @Override
    public String component5() {
        return getParameterMode();
    }

    @Override
    public String component6() {
        return getParameterName();
    }

    @Override
    public String component7() {
        return getDataType();
    }

    @Override
    public Integer component8() {
        return getCharacterMaximumLength();
    }

    @Override
    public Integer component9() {
        return getCharacterOctetLength();
    }

    @Override
    public Integer component10() {
        return getNumericPrecision();
    }

    @Override
    public Integer component11() {
        return getNumericScale();
    }

    @Override
    public ULong component12() {
        return getDatetimePrecision();
    }

    @Override
    public String component13() {
        return getCharacterSetName();
    }

    @Override
    public String component14() {
        return getCollationName();
    }

    @Override
    public String component15() {
        return getDtdIdentifier();
    }

    @Override
    public String component16() {
        return getRoutineType();
    }

    @Override
    public String value1() {
        return getSpecificCatalog();
    }

    @Override
    public String value2() {
        return getSpecificSchema();
    }

    @Override
    public String value3() {
        return getSpecificName();
    }

    @Override
    public Integer value4() {
        return getOrdinalPosition();
    }

    @Override
    public String value5() {
        return getParameterMode();
    }

    @Override
    public String value6() {
        return getParameterName();
    }

    @Override
    public String value7() {
        return getDataType();
    }

    @Override
    public Integer value8() {
        return getCharacterMaximumLength();
    }

    @Override
    public Integer value9() {
        return getCharacterOctetLength();
    }

    @Override
    public Integer value10() {
        return getNumericPrecision();
    }

    @Override
    public Integer value11() {
        return getNumericScale();
    }

    @Override
    public ULong value12() {
        return getDatetimePrecision();
    }

    @Override
    public String value13() {
        return getCharacterSetName();
    }

    @Override
    public String value14() {
        return getCollationName();
    }

    @Override
    public String value15() {
        return getDtdIdentifier();
    }

    @Override
    public String value16() {
        return getRoutineType();
    }

    @Override
    public ParametersRecord value1(String value) {
        setSpecificCatalog(value);
        return this;
    }

    @Override
    public ParametersRecord value2(String value) {
        setSpecificSchema(value);
        return this;
    }

    @Override
    public ParametersRecord value3(String value) {
        setSpecificName(value);
        return this;
    }

    @Override
    public ParametersRecord value4(Integer value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public ParametersRecord value5(String value) {
        setParameterMode(value);
        return this;
    }

    @Override
    public ParametersRecord value6(String value) {
        setParameterName(value);
        return this;
    }

    @Override
    public ParametersRecord value7(String value) {
        setDataType(value);
        return this;
    }

    @Override
    public ParametersRecord value8(Integer value) {
        setCharacterMaximumLength(value);
        return this;
    }

    @Override
    public ParametersRecord value9(Integer value) {
        setCharacterOctetLength(value);
        return this;
    }

    @Override
    public ParametersRecord value10(Integer value) {
        setNumericPrecision(value);
        return this;
    }

    @Override
    public ParametersRecord value11(Integer value) {
        setNumericScale(value);
        return this;
    }

    @Override
    public ParametersRecord value12(ULong value) {
        setDatetimePrecision(value);
        return this;
    }

    @Override
    public ParametersRecord value13(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public ParametersRecord value14(String value) {
        setCollationName(value);
        return this;
    }

    @Override
    public ParametersRecord value15(String value) {
        setDtdIdentifier(value);
        return this;
    }

    @Override
    public ParametersRecord value16(String value) {
        setRoutineType(value);
        return this;
    }

    @Override
    public ParametersRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, String value7, Integer value8, Integer value9, Integer value10, Integer value11, ULong value12, String value13, String value14, String value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParametersRecord
     */
    public ParametersRecord() {
        super(Parameters.PARAMETERS);
    }

    /**
     * Create a detached, initialised ParametersRecord
     */
    public ParametersRecord(String specificCatalog, String specificSchema, String specificName, Integer ordinalPosition, String parameterMode, String parameterName, String dataType, Integer characterMaximumLength, Integer characterOctetLength, Integer numericPrecision, Integer numericScale, ULong datetimePrecision, String characterSetName, String collationName, String dtdIdentifier, String routineType) {
        super(Parameters.PARAMETERS);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setOrdinalPosition(ordinalPosition);
        setParameterMode(parameterMode);
        setParameterName(parameterName);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setNumericPrecision(numericPrecision);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setCharacterSetName(characterSetName);
        setCollationName(collationName);
        setDtdIdentifier(dtdIdentifier);
        setRoutineType(routineType);
    }

    /**
     * Create a detached, initialised ParametersRecord
     */
    public ParametersRecord(com.sweeti.lemon.information_schema.tables.pojos.Parameters value) {
        super(Parameters.PARAMETERS);

        if (value != null) {
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setOrdinalPosition(value.getOrdinalPosition());
            setParameterMode(value.getParameterMode());
            setParameterName(value.getParameterName());
            setDataType(value.getDataType());
            setCharacterMaximumLength(value.getCharacterMaximumLength());
            setCharacterOctetLength(value.getCharacterOctetLength());
            setNumericPrecision(value.getNumericPrecision());
            setNumericScale(value.getNumericScale());
            setDatetimePrecision(value.getDatetimePrecision());
            setCharacterSetName(value.getCharacterSetName());
            setCollationName(value.getCollationName());
            setDtdIdentifier(value.getDtdIdentifier());
            setRoutineType(value.getRoutineType());
        }
    }
}
