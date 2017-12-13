/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-12-03")
public class BuildSlaveEventsRange implements org.apache.thrift.TBase<BuildSlaveEventsRange, BuildSlaveEventsRange._Fields>, java.io.Serializable, Cloneable, Comparable<BuildSlaveEventsRange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildSlaveEventsRange");

  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField QUERY_FIELD_DESC = new org.apache.thrift.protocol.TField("query", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("events", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildSlaveEventsRangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildSlaveEventsRangeTupleSchemeFactory());
  }

  public boolean success; // optional
  public String errorMessage; // optional
  public BuildSlaveEventsQuery query; // optional
  public List<SequencedBuildSlaveEvent> events; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS((short)1, "success"),
    ERROR_MESSAGE((short)2, "errorMessage"),
    QUERY((short)3, "query"),
    EVENTS((short)4, "events");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUCCESS
          return SUCCESS;
        case 2: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        case 3: // QUERY
          return QUERY;
        case 4: // EVENTS
          return EVENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SUCCESS,_Fields.ERROR_MESSAGE,_Fields.QUERY,_Fields.EVENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUERY, new org.apache.thrift.meta_data.FieldMetaData("query", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildSlaveEventsQuery.class)));
    tmpMap.put(_Fields.EVENTS, new org.apache.thrift.meta_data.FieldMetaData("events", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SequencedBuildSlaveEvent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildSlaveEventsRange.class, metaDataMap);
  }

  public BuildSlaveEventsRange() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildSlaveEventsRange(BuildSlaveEventsRange other) {
    __isset_bitfield = other.__isset_bitfield;
    this.success = other.success;
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
    if (other.isSetQuery()) {
      this.query = new BuildSlaveEventsQuery(other.query);
    }
    if (other.isSetEvents()) {
      List<SequencedBuildSlaveEvent> __this__events = new ArrayList<SequencedBuildSlaveEvent>(other.events.size());
      for (SequencedBuildSlaveEvent other_element : other.events) {
        __this__events.add(new SequencedBuildSlaveEvent(other_element));
      }
      this.events = __this__events;
    }
  }

  public BuildSlaveEventsRange deepCopy() {
    return new BuildSlaveEventsRange(this);
  }

  @Override
  public void clear() {
    setSuccessIsSet(false);
    this.success = false;
    this.errorMessage = null;
    this.query = null;
    this.events = null;
  }

  public boolean isSuccess() {
    return this.success;
  }

  public BuildSlaveEventsRange setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public BuildSlaveEventsRange setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public BuildSlaveEventsQuery getQuery() {
    return this.query;
  }

  public BuildSlaveEventsRange setQuery(BuildSlaveEventsQuery query) {
    this.query = query;
    return this;
  }

  public void unsetQuery() {
    this.query = null;
  }

  /** Returns true if field query is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  public int getEventsSize() {
    return (this.events == null) ? 0 : this.events.size();
  }

  public java.util.Iterator<SequencedBuildSlaveEvent> getEventsIterator() {
    return (this.events == null) ? null : this.events.iterator();
  }

  public void addToEvents(SequencedBuildSlaveEvent elem) {
    if (this.events == null) {
      this.events = new ArrayList<SequencedBuildSlaveEvent>();
    }
    this.events.add(elem);
  }

  public List<SequencedBuildSlaveEvent> getEvents() {
    return this.events;
  }

  public BuildSlaveEventsRange setEvents(List<SequencedBuildSlaveEvent> events) {
    this.events = events;
    return this;
  }

  public void unsetEvents() {
    this.events = null;
  }

  /** Returns true if field events is set (has been assigned a value) and false otherwise */
  public boolean isSetEvents() {
    return this.events != null;
  }

  public void setEventsIsSet(boolean value) {
    if (!value) {
      this.events = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((String)value);
      }
      break;

    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((BuildSlaveEventsQuery)value);
      }
      break;

    case EVENTS:
      if (value == null) {
        unsetEvents();
      } else {
        setEvents((List<SequencedBuildSlaveEvent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS:
      return isSuccess();

    case ERROR_MESSAGE:
      return getErrorMessage();

    case QUERY:
      return getQuery();

    case EVENTS:
      return getEvents();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS:
      return isSetSuccess();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    case QUERY:
      return isSetQuery();
    case EVENTS:
      return isSetEvents();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildSlaveEventsRange)
      return this.equals((BuildSlaveEventsRange)that);
    return false;
  }

  public boolean equals(BuildSlaveEventsRange that) {
    if (that == null)
      return false;

    boolean this_present_success = true && this.isSetSuccess();
    boolean that_present_success = true && that.isSetSuccess();
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
        return false;
    }

    boolean this_present_events = true && this.isSetEvents();
    boolean that_present_events = true && that.isSetEvents();
    if (this_present_events || that_present_events) {
      if (!(this_present_events && that_present_events))
        return false;
      if (!this.events.equals(that.events))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_success = true && (isSetSuccess());
    list.add(present_success);
    if (present_success)
      list.add(success);

    boolean present_errorMessage = true && (isSetErrorMessage());
    list.add(present_errorMessage);
    if (present_errorMessage)
      list.add(errorMessage);

    boolean present_query = true && (isSetQuery());
    list.add(present_query);
    if (present_query)
      list.add(query);

    boolean present_events = true && (isSetEvents());
    list.add(present_events);
    if (present_events)
      list.add(events);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildSlaveEventsRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuery()).compareTo(other.isSetQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query, other.query);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEvents()).compareTo(other.isSetEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.events, other.events);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildSlaveEventsRange(");
    boolean first = true;

    if (isSetSuccess()) {
      sb.append("success:");
      sb.append(this.success);
      first = false;
    }
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    if (isSetQuery()) {
      if (!first) sb.append(", ");
      sb.append("query:");
      if (this.query == null) {
        sb.append("null");
      } else {
        sb.append(this.query);
      }
      first = false;
    }
    if (isSetEvents()) {
      if (!first) sb.append(", ");
      sb.append("events:");
      if (this.events == null) {
        sb.append("null");
      } else {
        sb.append(this.events);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (query != null) {
      query.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildSlaveEventsRangeStandardSchemeFactory implements SchemeFactory {
    public BuildSlaveEventsRangeStandardScheme getScheme() {
      return new BuildSlaveEventsRangeStandardScheme();
    }
  }

  private static class BuildSlaveEventsRangeStandardScheme extends StandardScheme<BuildSlaveEventsRange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildSlaveEventsRange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // QUERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query = new BuildSlaveEventsQuery();
              struct.query.read(iprot);
              struct.setQueryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
                struct.events = new ArrayList<SequencedBuildSlaveEvent>(_list42.size);
                SequencedBuildSlaveEvent _elem43;
                for (int _i44 = 0; _i44 < _list42.size; ++_i44)
                {
                  _elem43 = new SequencedBuildSlaveEvent();
                  _elem43.read(iprot);
                  struct.events.add(_elem43);
                }
                iprot.readListEnd();
              }
              struct.setEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildSlaveEventsRange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        oprot.writeBool(struct.success);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.query != null) {
        if (struct.isSetQuery()) {
          oprot.writeFieldBegin(QUERY_FIELD_DESC);
          struct.query.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.events != null) {
        if (struct.isSetEvents()) {
          oprot.writeFieldBegin(EVENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.events.size()));
            for (SequencedBuildSlaveEvent _iter45 : struct.events)
            {
              _iter45.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildSlaveEventsRangeTupleSchemeFactory implements SchemeFactory {
    public BuildSlaveEventsRangeTupleScheme getScheme() {
      return new BuildSlaveEventsRangeTupleScheme();
    }
  }

  private static class BuildSlaveEventsRangeTupleScheme extends TupleScheme<BuildSlaveEventsRange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEventsRange struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSuccess()) {
        optionals.set(0);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(1);
      }
      if (struct.isSetQuery()) {
        optionals.set(2);
      }
      if (struct.isSetEvents()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
      if (struct.isSetQuery()) {
        struct.query.write(oprot);
      }
      if (struct.isSetEvents()) {
        {
          oprot.writeI32(struct.events.size());
          for (SequencedBuildSlaveEvent _iter46 : struct.events)
          {
            _iter46.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildSlaveEventsRange struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.query = new BuildSlaveEventsQuery();
        struct.query.read(iprot);
        struct.setQueryIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.events = new ArrayList<SequencedBuildSlaveEvent>(_list47.size);
          SequencedBuildSlaveEvent _elem48;
          for (int _i49 = 0; _i49 < _list47.size; ++_i49)
          {
            _elem48 = new SequencedBuildSlaveEvent();
            _elem48.read(iprot);
            struct.events.add(_elem48);
          }
        }
        struct.setEventsIsSet(true);
      }
    }
  }

}

