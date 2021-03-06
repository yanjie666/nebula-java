/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ColumnTypeDef implements TBase, java.io.Serializable, Cloneable, Comparable<ColumnTypeDef> {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnTypeDef");
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)1);
  private static final TField TYPE_LENGTH_FIELD_DESC = new TField("type_length", TType.I16, (short)2);

  /**
   * 
   * @see PropertyType
   */
  public int type;
  public short type_length;
  public static final int TYPE = 1;
  public static final int TYPE_LENGTH = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __TYPE_LENGTH_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(TYPE_LENGTH, new FieldMetaData("type_length", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ColumnTypeDef.class, metaDataMap);
  }

  public ColumnTypeDef() {
    this.type_length = (short)0;

  }

  public ColumnTypeDef(
    int type)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
  }

  public ColumnTypeDef(
    int type,
    short type_length)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
    this.type_length = type_length;
    setType_lengthIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnTypeDef(ColumnTypeDef other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.type = TBaseHelper.deepCopy(other.type);
    this.type_length = TBaseHelper.deepCopy(other.type_length);
  }

  public ColumnTypeDef deepCopy() {
    return new ColumnTypeDef(this);
  }

  @Deprecated
  public ColumnTypeDef clone() {
    return new ColumnTypeDef(this);
  }

  /**
   * 
   * @see PropertyType
   */
  public int  getType() {
    return this.type;
  }

  /**
   * 
   * @see PropertyType
   */
  public ColumnTypeDef setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bit_vector.clear(__TYPE_ISSET_ID);
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return __isset_bit_vector.get(__TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_ISSET_ID, value);
  }

  public short  getType_length() {
    return this.type_length;
  }

  public ColumnTypeDef setType_length(short type_length) {
    this.type_length = type_length;
    setType_lengthIsSet(true);
    return this;
  }

  public void unsetType_length() {
    __isset_bit_vector.clear(__TYPE_LENGTH_ISSET_ID);
  }

  // Returns true if field type_length is set (has been assigned a value) and false otherwise
  public boolean isSetType_length() {
    return __isset_bit_vector.get(__TYPE_LENGTH_ISSET_ID);
  }

  public void setType_lengthIsSet(boolean value) {
    __isset_bit_vector.set(__TYPE_LENGTH_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((Integer)value);
      }
      break;

    case TYPE_LENGTH:
      if (value == null) {
        unsetType_length();
      } else {
        setType_length((Short)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TYPE:
      return getType();

    case TYPE_LENGTH:
      return new Short(getType_length());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case TYPE:
      return isSetType();
    case TYPE_LENGTH:
      return isSetType_length();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnTypeDef)
      return this.equals((ColumnTypeDef)that);
    return false;
  }

  public boolean equals(ColumnTypeDef that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type, that.type))
        return false;
    }

    boolean this_present_type_length = true && this.isSetType_length();
    boolean that_present_type_length = true && that.isSetType_length();
    if (this_present_type_length || that_present_type_length) {
      if (!(this_present_type_length && that_present_type_length))
        return false;
      if (!TBaseHelper.equalsNobinary(this.type_length, that.type_length))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_type = true;
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_type_length = true && (isSetType_length());
    builder.append(present_type_length);
    if (present_type_length)
      builder.append(type_length);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ColumnTypeDef other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(type, other.type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetType_length()).compareTo(other.isSetType_length());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(type_length, other.type_length);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            setTypeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE_LENGTH:
          if (field.type == TType.I16) {
            this.type_length = iprot.readI16();
            setType_lengthIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetType()) {
      throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    if (isSetType_length()) {
      oprot.writeFieldBegin(TYPE_LENGTH_FIELD_DESC);
      oprot.writeI16(this.type_length);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ColumnTypeDef");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    String type_name = PropertyType.VALUES_TO_NAMES.get(this. getType());
    if (type_name != null) {
      sb.append(type_name);
      sb.append(" (");
    }
    sb.append(this. getType());
    if (type_name != null) {
      sb.append(")");
    }
    first = false;
    if (isSetType_length())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("type_length");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getType_length(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'type' because it's a primitive and you chose the non-beans generator.
    // check that fields of type enum have valid values
    if (isSetType() && !PropertyType.VALID_VALUES.contains(type)){
      throw new TProtocolException("The field 'type' has been assigned the invalid value " + type);
    }
  }

}

