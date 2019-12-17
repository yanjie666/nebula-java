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
public class MultiPutReq implements TBase, java.io.Serializable, Cloneable, Comparable<MultiPutReq> {
  private static final TStruct STRUCT_DESC = new TStruct("MultiPutReq");
  private static final TField SEGMENT_FIELD_DESC = new TField("segment", TType.STRING, (short)1);
  private static final TField PAIRS_FIELD_DESC = new TField("pairs", TType.LIST, (short)2);

  public String segment;
  public List<com.vesoft.nebula.Pair> pairs;
  public static final int SEGMENT = 1;
  public static final int PAIRS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SEGMENT, new FieldMetaData("segment", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(PAIRS, new FieldMetaData("pairs", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.Pair.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MultiPutReq.class, metaDataMap);
  }

  public MultiPutReq() {
  }

  public MultiPutReq(
    String segment,
    List<com.vesoft.nebula.Pair> pairs)
  {
    this();
    this.segment = segment;
    this.pairs = pairs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MultiPutReq(MultiPutReq other) {
    if (other.isSetSegment()) {
      this.segment = TBaseHelper.deepCopy(other.segment);
    }
    if (other.isSetPairs()) {
      this.pairs = TBaseHelper.deepCopy(other.pairs);
    }
  }

  public MultiPutReq deepCopy() {
    return new MultiPutReq(this);
  }

  @Deprecated
  public MultiPutReq clone() {
    return new MultiPutReq(this);
  }

  public String  getSegment() {
    return this.segment;
  }

  public MultiPutReq setSegment(String segment) {
    this.segment = segment;
    return this;
  }

  public void unsetSegment() {
    this.segment = null;
  }

  // Returns true if field segment is set (has been assigned a value) and false otherwise
  public boolean isSetSegment() {
    return this.segment != null;
  }

  public void setSegmentIsSet(boolean value) {
    if (!value) {
      this.segment = null;
    }
  }

  public List<com.vesoft.nebula.Pair>  getPairs() {
    return this.pairs;
  }

  public MultiPutReq setPairs(List<com.vesoft.nebula.Pair> pairs) {
    this.pairs = pairs;
    return this;
  }

  public void unsetPairs() {
    this.pairs = null;
  }

  // Returns true if field pairs is set (has been assigned a value) and false otherwise
  public boolean isSetPairs() {
    return this.pairs != null;
  }

  public void setPairsIsSet(boolean value) {
    if (!value) {
      this.pairs = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SEGMENT:
      if (value == null) {
        unsetSegment();
      } else {
        setSegment((String)value);
      }
      break;

    case PAIRS:
      if (value == null) {
        unsetPairs();
      } else {
        setPairs((List<com.vesoft.nebula.Pair>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return getSegment();

    case PAIRS:
      return getPairs();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SEGMENT:
      return isSetSegment();
    case PAIRS:
      return isSetPairs();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MultiPutReq)
      return this.equals((MultiPutReq)that);
    return false;
  }

  public boolean equals(MultiPutReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_segment = true && this.isSetSegment();
    boolean that_present_segment = true && that.isSetSegment();
    if (this_present_segment || that_present_segment) {
      if (!(this_present_segment && that_present_segment))
        return false;
      if (!TBaseHelper.equalsNobinary(this.segment, that.segment))
        return false;
    }

    boolean this_present_pairs = true && this.isSetPairs();
    boolean that_present_pairs = true && that.isSetPairs();
    if (this_present_pairs || that_present_pairs) {
      if (!(this_present_pairs && that_present_pairs))
        return false;
      if (!TBaseHelper.equalsNobinary(this.pairs, that.pairs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_segment = true && (isSetSegment());
    builder.append(present_segment);
    if (present_segment)
      builder.append(segment);

    boolean present_pairs = true && (isSetPairs());
    builder.append(present_pairs);
    if (present_pairs)
      builder.append(pairs);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(MultiPutReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSegment()).compareTo(other.isSetSegment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(segment, other.segment);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetPairs()).compareTo(other.isSetPairs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(pairs, other.pairs);
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
        case SEGMENT:
          if (field.type == TType.STRING) {
            this.segment = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PAIRS:
          if (field.type == TType.LIST) {
            {
              TList _list63 = iprot.readListBegin();
              this.pairs = new ArrayList<com.vesoft.nebula.Pair>(Math.max(0, _list63.size));
              for (int _i64 = 0; 
                   (_list63.size < 0) ? iprot.peekList() : (_i64 < _list63.size); 
                   ++_i64)
              {
                com.vesoft.nebula.Pair _elem65;
                _elem65 = new com.vesoft.nebula.Pair();
                _elem65.read(iprot);
                this.pairs.add(_elem65);
              }
              iprot.readListEnd();
            }
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
    if (this.segment != null) {
      oprot.writeFieldBegin(SEGMENT_FIELD_DESC);
      oprot.writeString(this.segment);
      oprot.writeFieldEnd();
    }
    if (this.pairs != null) {
      oprot.writeFieldBegin(PAIRS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.pairs.size()));
        for (com.vesoft.nebula.Pair _iter66 : this.pairs)        {
          _iter66.write(oprot);
        }
        oprot.writeListEnd();
      }
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
    StringBuilder sb = new StringBuilder("MultiPutReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("segment");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSegment() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSegment(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("pairs");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getPairs() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getPairs(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

