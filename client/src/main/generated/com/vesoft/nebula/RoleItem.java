/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

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
public class RoleItem implements TBase, java.io.Serializable, Cloneable, Comparable<RoleItem> {
  private static final TStruct STRUCT_DESC = new TStruct("RoleItem");
  private static final TField USER_FIELD_DESC = new TField("user", TType.STRING, (short)1);
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)2);
  private static final TField ROLE_TYPE_FIELD_DESC = new TField("role_type", TType.I32, (short)3);

  public String user;
  public int space_id;
  /**
   * 
   * @see RoleType
   */
  public int role_type;
  public static final int USER = 1;
  public static final int SPACE_ID = 2;
  public static final int ROLE_TYPE = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __ROLE_TYPE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(USER, new FieldMetaData("user", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(ROLE_TYPE, new FieldMetaData("role_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(RoleItem.class, metaDataMap);
  }

  public RoleItem() {
  }

  public RoleItem(
    String user,
    int space_id,
    int role_type)
  {
    this();
    this.user = user;
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.role_type = role_type;
    setRole_typeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RoleItem(RoleItem other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetUser()) {
      this.user = TBaseHelper.deepCopy(other.user);
    }
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    this.role_type = TBaseHelper.deepCopy(other.role_type);
  }

  public RoleItem deepCopy() {
    return new RoleItem(this);
  }

  @Deprecated
  public RoleItem clone() {
    return new RoleItem(this);
  }

  public String  getUser() {
    return this.user;
  }

  public RoleItem setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  // Returns true if field user is set (has been assigned a value) and false otherwise
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public RoleItem setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  /**
   * 
   * @see RoleType
   */
  public int  getRole_type() {
    return this.role_type;
  }

  /**
   * 
   * @see RoleType
   */
  public RoleItem setRole_type(int role_type) {
    this.role_type = role_type;
    setRole_typeIsSet(true);
    return this;
  }

  public void unsetRole_type() {
    __isset_bit_vector.clear(__ROLE_TYPE_ISSET_ID);
  }

  // Returns true if field role_type is set (has been assigned a value) and false otherwise
  public boolean isSetRole_type() {
    return __isset_bit_vector.get(__ROLE_TYPE_ISSET_ID);
  }

  public void setRole_typeIsSet(boolean value) {
    __isset_bit_vector.set(__ROLE_TYPE_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case ROLE_TYPE:
      if (value == null) {
        unsetRole_type();
      } else {
        setRole_type((Integer)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case USER:
      return getUser();

    case SPACE_ID:
      return new Integer(getSpace_id());

    case ROLE_TYPE:
      return getRole_type();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case USER:
      return isSetUser();
    case SPACE_ID:
      return isSetSpace_id();
    case ROLE_TYPE:
      return isSetRole_type();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RoleItem)
      return this.equals((RoleItem)that);
    return false;
  }

  public boolean equals(RoleItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!TBaseHelper.equalsNobinary(this.user, that.user))
        return false;
    }

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_role_type = true;
    boolean that_present_role_type = true;
    if (this_present_role_type || that_present_role_type) {
      if (!(this_present_role_type && that_present_role_type))
        return false;
      if (!TBaseHelper.equalsNobinary(this.role_type, that.role_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_user = true && (isSetUser());
    builder.append(present_user);
    if (present_user)
      builder.append(user);

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_role_type = true;
    builder.append(present_role_type);
    if (present_role_type)
      builder.append(role_type);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(RoleItem other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(user, other.user);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRole_type()).compareTo(other.isSetRole_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(role_type, other.role_type);
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
        case USER:
          if (field.type == TType.STRING) {
            this.user = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ROLE_TYPE:
          if (field.type == TType.I32) {
            this.role_type = iprot.readI32();
            setRole_typeIsSet(true);
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
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.user != null) {
      oprot.writeFieldBegin(USER_FIELD_DESC);
      oprot.writeString(this.user);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ROLE_TYPE_FIELD_DESC);
    oprot.writeI32(this.role_type);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("RoleItem");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("user");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getUser() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getUser(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("role_type");
    sb.append(space);
    sb.append(":").append(space);
    String role_type_name = RoleType.VALUES_TO_NAMES.get(this. getRole_type());
    if (role_type_name != null) {
      sb.append(role_type_name);
      sb.append(" (");
    }
    sb.append(this. getRole_type());
    if (role_type_name != null) {
      sb.append(")");
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetRole_type() && !RoleType.VALID_VALUES.contains(role_type)){
      throw new TProtocolException("The field 'role_type' has been assigned the invalid value " + role_type);
    }
  }

}
