/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.graph;

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

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class ColumnValue extends TUnion<ColumnValue> implements Comparable<ColumnValue> {
  public static boolean DEFAULT_PRETTY_PRINT = true;
  private static final TStruct STRUCT_DESC = new TStruct("ColumnValue");
  private static final TField BOOL_VAL_FIELD_DESC = new TField("bool_val", TType.BOOL, (short)1);
  private static final TField INTEGER_FIELD_DESC = new TField("integer", TType.I64, (short)2);
  private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)3);
  private static final TField SINGLE_PRECISION_FIELD_DESC = new TField("single_precision", TType.FLOAT, (short)4);
  private static final TField DOUBLE_PRECISION_FIELD_DESC = new TField("double_precision", TType.DOUBLE, (short)5);
  private static final TField STR_FIELD_DESC = new TField("str", TType.STRING, (short)6);
  private static final TField TIMESTAMP_FIELD_DESC = new TField("timestamp", TType.I64, (short)7);
  private static final TField YEAR_FIELD_DESC = new TField("year", TType.I16, (short)8);
  private static final TField MONTH_FIELD_DESC = new TField("month", TType.STRUCT, (short)9);
  private static final TField DATE_FIELD_DESC = new TField("date", TType.STRUCT, (short)10);
  private static final TField DATETIME_FIELD_DESC = new TField("datetime", TType.STRUCT, (short)11);
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRUCT, (short)41);

  public static final int BOOL_VAL = 1;
  public static final int INTEGER = 2;
  public static final int ID = 3;
  public static final int SINGLE_PRECISION = 4;
  public static final int DOUBLE_PRECISION = 5;
  public static final int STR = 6;
  public static final int TIMESTAMP = 7;
  public static final int YEAR = 8;
  public static final int MONTH = 9;
  public static final int DATE = 10;
  public static final int DATETIME = 11;
  public static final int PATH = 41;

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(BOOL_VAL, new FieldMetaData("bool_val", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(INTEGER, new FieldMetaData("integer", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(SINGLE_PRECISION, new FieldMetaData("single_precision", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.FLOAT)));
    tmpMetaDataMap.put(DOUBLE_PRECISION, new FieldMetaData("double_precision", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.DOUBLE)));
    tmpMetaDataMap.put(STR, new FieldMetaData("str", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(TIMESTAMP, new FieldMetaData("timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(YEAR, new FieldMetaData("year", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMetaDataMap.put(MONTH, new FieldMetaData("month", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, YearMonth.class)));
    tmpMetaDataMap.put(DATE, new FieldMetaData("date", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Date.class)));
    tmpMetaDataMap.put(DATETIME, new FieldMetaData("datetime", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DateTime.class)));
    tmpMetaDataMap.put(PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Path.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public ColumnValue() {
    super();
  }

  public ColumnValue(int setField, Object value) {
    super(setField, value);
  }

  public ColumnValue(ColumnValue other) {
    super(other);
  }
  public ColumnValue deepCopy() {
    return new ColumnValue(this);
  }

  public static ColumnValue bool_val(boolean value) {
    ColumnValue x = new ColumnValue();
    x.setBool_val(value);
    return x;
  }

  public static ColumnValue integer(long value) {
    ColumnValue x = new ColumnValue();
    x.setInteger(value);
    return x;
  }

  public static ColumnValue id(long value) {
    ColumnValue x = new ColumnValue();
    x.setId(value);
    return x;
  }

  public static ColumnValue single_precision(float value) {
    ColumnValue x = new ColumnValue();
    x.setSingle_precision(value);
    return x;
  }

  public static ColumnValue double_precision(double value) {
    ColumnValue x = new ColumnValue();
    x.setDouble_precision(value);
    return x;
  }

  public static ColumnValue str(byte[] value) {
    ColumnValue x = new ColumnValue();
    x.setStr(value);
    return x;
  }

  public static ColumnValue timestamp(long value) {
    ColumnValue x = new ColumnValue();
    x.setTimestamp(value);
    return x;
  }

  public static ColumnValue year(short value) {
    ColumnValue x = new ColumnValue();
    x.setYear(value);
    return x;
  }

  public static ColumnValue month(YearMonth value) {
    ColumnValue x = new ColumnValue();
    x.setMonth(value);
    return x;
  }

  public static ColumnValue date(Date value) {
    ColumnValue x = new ColumnValue();
    x.setDate(value);
    return x;
  }

  public static ColumnValue datetime(DateTime value) {
    ColumnValue x = new ColumnValue();
    x.setDatetime(value);
    return x;
  }

  public static ColumnValue path(Path value) {
    ColumnValue x = new ColumnValue();
    x.setPath(value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object value) throws ClassCastException {
    switch (setField) {
      case BOOL_VAL:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'bool_val', but got " + value.getClass().getSimpleName());
      case INTEGER:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'integer', but got " + value.getClass().getSimpleName());
      case ID:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'id', but got " + value.getClass().getSimpleName());
      case SINGLE_PRECISION:
        if (value instanceof Float) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Float for field 'single_precision', but got " + value.getClass().getSimpleName());
      case DOUBLE_PRECISION:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'double_precision', but got " + value.getClass().getSimpleName());
      case STR:
        if (value instanceof byte[]) {
          break;
        }
        throw new ClassCastException("Was expecting value of type byte[] for field 'str', but got " + value.getClass().getSimpleName());
      case TIMESTAMP:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'timestamp', but got " + value.getClass().getSimpleName());
      case YEAR:
        if (value instanceof Short) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Short for field 'year', but got " + value.getClass().getSimpleName());
      case MONTH:
        if (value instanceof YearMonth) {
          break;
        }
        throw new ClassCastException("Was expecting value of type YearMonth for field 'month', but got " + value.getClass().getSimpleName());
      case DATE:
        if (value instanceof Date) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Date for field 'date', but got " + value.getClass().getSimpleName());
      case DATETIME:
        if (value instanceof DateTime) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DateTime for field 'datetime', but got " + value.getClass().getSimpleName());
      case PATH:
        if (value instanceof Path) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Path for field 'path', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField field = iprot.readFieldBegin();
    if (field.type != TType.STOP)
    {
      value_ = readValue(iprot, field);
      if (value_ != null)
      {
        switch (field.id) {
          case BOOL_VAL:
            if (field.type == BOOL_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case INTEGER:
            if (field.type == INTEGER_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case ID:
            if (field.type == ID_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case SINGLE_PRECISION:
            if (field.type == SINGLE_PRECISION_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case DOUBLE_PRECISION:
            if (field.type == DOUBLE_PRECISION_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case STR:
            if (field.type == STR_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case TIMESTAMP:
            if (field.type == TIMESTAMP_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case YEAR:
            if (field.type == YEAR_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case MONTH:
            if (field.type == MONTH_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case DATE:
            if (field.type == DATE_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case DATETIME:
            if (field.type == DATETIME_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case PATH:
            if (field.type == PATH_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      iprot.readFieldBegin();
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField field) throws TException {
    switch (field.id) {
      case BOOL_VAL:
        if (field.type == BOOL_VAL_FIELD_DESC.type) {
          Boolean bool_val;
          bool_val = iprot.readBool();
          return bool_val;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case INTEGER:
        if (field.type == INTEGER_FIELD_DESC.type) {
          Long integer;
          integer = iprot.readI64();
          return integer;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case ID:
        if (field.type == ID_FIELD_DESC.type) {
          Long id;
          id = iprot.readI64();
          return id;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case SINGLE_PRECISION:
        if (field.type == SINGLE_PRECISION_FIELD_DESC.type) {
          Float single_precision;
          single_precision = iprot.readFloat();
          return single_precision;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case DOUBLE_PRECISION:
        if (field.type == DOUBLE_PRECISION_FIELD_DESC.type) {
          Double double_precision;
          double_precision = iprot.readDouble();
          return double_precision;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case STR:
        if (field.type == STR_FIELD_DESC.type) {
          byte[] str;
          str = iprot.readBinary();
          return str;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case TIMESTAMP:
        if (field.type == TIMESTAMP_FIELD_DESC.type) {
          Long timestamp;
          timestamp = iprot.readI64();
          return timestamp;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case YEAR:
        if (field.type == YEAR_FIELD_DESC.type) {
          Short year;
          year = iprot.readI16();
          return year;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case MONTH:
        if (field.type == MONTH_FIELD_DESC.type) {
          YearMonth month;
          month = new YearMonth();
          month.read(iprot);
          return month;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case DATE:
        if (field.type == DATE_FIELD_DESC.type) {
          Date date;
          date = new Date();
          date.read(iprot);
          return date;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case DATETIME:
        if (field.type == DATETIME_FIELD_DESC.type) {
          DateTime datetime;
          datetime = new DateTime();
          datetime.read(iprot);
          return datetime;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case PATH:
        if (field.type == PATH_FIELD_DESC.type) {
          Path path;
          path = new Path();
          path.read(iprot);
          return path;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      default:
        TProtocolUtil.skip(iprot, field.type);
        return null;
    }
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object value) throws TException {
    switch (setField) {
      case BOOL_VAL:
        Boolean bool_val = (Boolean)getFieldValue();
        oprot.writeBool(bool_val);
        return;
      case INTEGER:
        Long integer = (Long)getFieldValue();
        oprot.writeI64(integer);
        return;
      case ID:
        Long id = (Long)getFieldValue();
        oprot.writeI64(id);
        return;
      case SINGLE_PRECISION:
        Float single_precision = (Float)getFieldValue();
        oprot.writeFloat(single_precision);
        return;
      case DOUBLE_PRECISION:
        Double double_precision = (Double)getFieldValue();
        oprot.writeDouble(double_precision);
        return;
      case STR:
        byte[] str = (byte[])getFieldValue();
        oprot.writeBinary(str);
        return;
      case TIMESTAMP:
        Long timestamp = (Long)getFieldValue();
        oprot.writeI64(timestamp);
        return;
      case YEAR:
        Short year = (Short)getFieldValue();
        oprot.writeI16(year);
        return;
      case MONTH:
        YearMonth month = (YearMonth)getFieldValue();
        month.write(oprot);
        return;
      case DATE:
        Date date = (Date)getFieldValue();
        date.write(oprot);
        return;
      case DATETIME:
        DateTime datetime = (DateTime)getFieldValue();
        datetime.write(oprot);
        return;
      case PATH:
        Path path = (Path)getFieldValue();
        path.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case BOOL_VAL:
        return BOOL_VAL_FIELD_DESC;
      case INTEGER:
        return INTEGER_FIELD_DESC;
      case ID:
        return ID_FIELD_DESC;
      case SINGLE_PRECISION:
        return SINGLE_PRECISION_FIELD_DESC;
      case DOUBLE_PRECISION:
        return DOUBLE_PRECISION_FIELD_DESC;
      case STR:
        return STR_FIELD_DESC;
      case TIMESTAMP:
        return TIMESTAMP_FIELD_DESC;
      case YEAR:
        return YEAR_FIELD_DESC;
      case MONTH:
        return MONTH_FIELD_DESC;
      case DATE:
        return DATE_FIELD_DESC;
      case DATETIME:
        return DATETIME_FIELD_DESC;
      case PATH:
        return PATH_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  public boolean  isBool_val() {
    if (getSetField() == BOOL_VAL) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'bool_val' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBool_val(boolean value) {
    setField_ = BOOL_VAL;
    value_ = value;
  }

  public long  getInteger() {
    if (getSetField() == INTEGER) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'integer' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setInteger(long value) {
    setField_ = INTEGER;
    value_ = value;
  }

  public long  getId() {
    if (getSetField() == ID) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'id' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setId(long value) {
    setField_ = ID;
    value_ = value;
  }

  public float  getSingle_precision() {
    if (getSetField() == SINGLE_PRECISION) {
      return (Float)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'single_precision' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSingle_precision(float value) {
    setField_ = SINGLE_PRECISION;
    value_ = value;
  }

  public double  getDouble_precision() {
    if (getSetField() == DOUBLE_PRECISION) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'double_precision' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDouble_precision(double value) {
    setField_ = DOUBLE_PRECISION;
    value_ = value;
  }

  public byte[]  getStr() {
    if (getSetField() == STR) {
      return (byte[])getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'str' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStr(byte[] value) {
    if (value == null) throw new NullPointerException();
    setField_ = STR;
    value_ = value;
  }

  public long  getTimestamp() {
    if (getSetField() == TIMESTAMP) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'timestamp' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTimestamp(long value) {
    setField_ = TIMESTAMP;
    value_ = value;
  }

  public short  getYear() {
    if (getSetField() == YEAR) {
      return (Short)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'year' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setYear(short value) {
    setField_ = YEAR;
    value_ = value;
  }

  public YearMonth  getMonth() {
    if (getSetField() == MONTH) {
      return (YearMonth)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'month' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMonth(YearMonth value) {
    if (value == null) throw new NullPointerException();
    setField_ = MONTH;
    value_ = value;
  }

  public Date  getDate() {
    if (getSetField() == DATE) {
      return (Date)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'date' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDate(Date value) {
    if (value == null) throw new NullPointerException();
    setField_ = DATE;
    value_ = value;
  }

  public DateTime  getDatetime() {
    if (getSetField() == DATETIME) {
      return (DateTime)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'datetime' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDatetime(DateTime value) {
    if (value == null) throw new NullPointerException();
    setField_ = DATETIME;
    value_ = value;
  }

  public Path  getPath() {
    if (getSetField() == PATH) {
      return (Path)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'path' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPath(Path value) {
    if (value == null) throw new NullPointerException();
    setField_ = PATH;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof ColumnValue) {
      return equals((ColumnValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(ColumnValue other) {
    return equalsSlowImpl(other);
  }

  @Override
  public int compareTo(ColumnValue other) {
    return compareToImpl(other);
  }


  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(getSetField()).append(getFieldValue()).toHashCode();
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
    StringBuilder sb = new StringBuilder("ColumnValue");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    // Only print this field if it is the set field
    if (getSetField() == BOOL_VAL)
    {
      sb.append(indentStr);
      sb.append("bool_val");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. isBool_val(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == INTEGER)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("integer");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getInteger(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == ID)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("id");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getId(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == SINGLE_PRECISION)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("single_precision");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getSingle_precision(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == DOUBLE_PRECISION)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("double_precision");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getDouble_precision(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == STR)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("str");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getStr() == null) {
        sb.append("null");
      } else {
          int __str_size = Math.min(this. getStr().length, 128);
          for (int i = 0; i < __str_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this. getStr()[i]).length() > 1 ? Integer.toHexString(this. getStr()[i]).substring(Integer.toHexString(this. getStr()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getStr()[i]).toUpperCase());
          }
          if (this. getStr().length > 128) sb.append(" ...");
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == TIMESTAMP)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("timestamp");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getTimestamp(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == YEAR)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("year");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getYear(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == MONTH)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("month");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getMonth() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getMonth(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == DATE)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("date");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getDate() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getDate(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == DATETIME)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("datetime");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getDatetime() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getDatetime(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == PATH)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("path");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getPath() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getPath(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }


}
