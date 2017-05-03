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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-05-02")
public class SequencedBuildSlaveEvent implements org.apache.thrift.TBase<SequencedBuildSlaveEvent, SequencedBuildSlaveEvent._Fields>, java.io.Serializable, Cloneable, Comparable<SequencedBuildSlaveEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SequencedBuildSlaveEvent");

  private static final org.apache.thrift.protocol.TField EVENT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("eventNumber", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("event", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SequencedBuildSlaveEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SequencedBuildSlaveEventTupleSchemeFactory());
  }

  public int eventNumber; // optional
  public ByteBuffer event; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EVENT_NUMBER((short)1, "eventNumber"),
    EVENT((short)2, "event");

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
        case 1: // EVENT_NUMBER
          return EVENT_NUMBER;
        case 2: // EVENT
          return EVENT;
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
  private static final int __EVENTNUMBER_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EVENT_NUMBER,_Fields.EVENT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("eventNumber", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EVENT, new org.apache.thrift.meta_data.FieldMetaData("event", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SequencedBuildSlaveEvent.class, metaDataMap);
  }

  public SequencedBuildSlaveEvent() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SequencedBuildSlaveEvent(SequencedBuildSlaveEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.eventNumber = other.eventNumber;
    if (other.isSetEvent()) {
      this.event = org.apache.thrift.TBaseHelper.copyBinary(other.event);
    }
  }

  public SequencedBuildSlaveEvent deepCopy() {
    return new SequencedBuildSlaveEvent(this);
  }

  @Override
  public void clear() {
    setEventNumberIsSet(false);
    this.eventNumber = 0;
    this.event = null;
  }

  public int getEventNumber() {
    return this.eventNumber;
  }

  public SequencedBuildSlaveEvent setEventNumber(int eventNumber) {
    this.eventNumber = eventNumber;
    setEventNumberIsSet(true);
    return this;
  }

  public void unsetEventNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EVENTNUMBER_ISSET_ID);
  }

  /** Returns true if field eventNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetEventNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __EVENTNUMBER_ISSET_ID);
  }

  public void setEventNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EVENTNUMBER_ISSET_ID, value);
  }

  public byte[] getEvent() {
    setEvent(org.apache.thrift.TBaseHelper.rightSize(event));
    return event == null ? null : event.array();
  }

  public ByteBuffer bufferForEvent() {
    return org.apache.thrift.TBaseHelper.copyBinary(event);
  }

  public SequencedBuildSlaveEvent setEvent(byte[] event) {
    this.event = event == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(event, event.length));
    return this;
  }

  public SequencedBuildSlaveEvent setEvent(ByteBuffer event) {
    this.event = org.apache.thrift.TBaseHelper.copyBinary(event);
    return this;
  }

  public void unsetEvent() {
    this.event = null;
  }

  /** Returns true if field event is set (has been assigned a value) and false otherwise */
  public boolean isSetEvent() {
    return this.event != null;
  }

  public void setEventIsSet(boolean value) {
    if (!value) {
      this.event = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EVENT_NUMBER:
      if (value == null) {
        unsetEventNumber();
      } else {
        setEventNumber((Integer)value);
      }
      break;

    case EVENT:
      if (value == null) {
        unsetEvent();
      } else {
        setEvent((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_NUMBER:
      return getEventNumber();

    case EVENT:
      return getEvent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EVENT_NUMBER:
      return isSetEventNumber();
    case EVENT:
      return isSetEvent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SequencedBuildSlaveEvent)
      return this.equals((SequencedBuildSlaveEvent)that);
    return false;
  }

  public boolean equals(SequencedBuildSlaveEvent that) {
    if (that == null)
      return false;

    boolean this_present_eventNumber = true && this.isSetEventNumber();
    boolean that_present_eventNumber = true && that.isSetEventNumber();
    if (this_present_eventNumber || that_present_eventNumber) {
      if (!(this_present_eventNumber && that_present_eventNumber))
        return false;
      if (this.eventNumber != that.eventNumber)
        return false;
    }

    boolean this_present_event = true && this.isSetEvent();
    boolean that_present_event = true && that.isSetEvent();
    if (this_present_event || that_present_event) {
      if (!(this_present_event && that_present_event))
        return false;
      if (!this.event.equals(that.event))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_eventNumber = true && (isSetEventNumber());
    list.add(present_eventNumber);
    if (present_eventNumber)
      list.add(eventNumber);

    boolean present_event = true && (isSetEvent());
    list.add(present_event);
    if (present_event)
      list.add(event);

    return list.hashCode();
  }

  @Override
  public int compareTo(SequencedBuildSlaveEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEventNumber()).compareTo(other.isSetEventNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventNumber, other.eventNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEvent()).compareTo(other.isSetEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.event, other.event);
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
    StringBuilder sb = new StringBuilder("SequencedBuildSlaveEvent(");
    boolean first = true;

    if (isSetEventNumber()) {
      sb.append("eventNumber:");
      sb.append(this.eventNumber);
      first = false;
    }
    if (isSetEvent()) {
      if (!first) sb.append(", ");
      sb.append("event:");
      if (this.event == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.event, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class SequencedBuildSlaveEventStandardSchemeFactory implements SchemeFactory {
    public SequencedBuildSlaveEventStandardScheme getScheme() {
      return new SequencedBuildSlaveEventStandardScheme();
    }
  }

  private static class SequencedBuildSlaveEventStandardScheme extends StandardScheme<SequencedBuildSlaveEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SequencedBuildSlaveEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventNumber = iprot.readI32();
              struct.setEventNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.event = iprot.readBinary();
              struct.setEventIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SequencedBuildSlaveEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetEventNumber()) {
        oprot.writeFieldBegin(EVENT_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.eventNumber);
        oprot.writeFieldEnd();
      }
      if (struct.event != null) {
        if (struct.isSetEvent()) {
          oprot.writeFieldBegin(EVENT_FIELD_DESC);
          oprot.writeBinary(struct.event);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SequencedBuildSlaveEventTupleSchemeFactory implements SchemeFactory {
    public SequencedBuildSlaveEventTupleScheme getScheme() {
      return new SequencedBuildSlaveEventTupleScheme();
    }
  }

  private static class SequencedBuildSlaveEventTupleScheme extends TupleScheme<SequencedBuildSlaveEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SequencedBuildSlaveEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEventNumber()) {
        optionals.set(0);
      }
      if (struct.isSetEvent()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetEventNumber()) {
        oprot.writeI32(struct.eventNumber);
      }
      if (struct.isSetEvent()) {
        oprot.writeBinary(struct.event);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SequencedBuildSlaveEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.eventNumber = iprot.readI32();
        struct.setEventNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.event = iprot.readBinary();
        struct.setEventIsSet(true);
      }
    }
  }

}

