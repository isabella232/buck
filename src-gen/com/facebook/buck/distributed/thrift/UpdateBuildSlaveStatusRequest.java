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
public class UpdateBuildSlaveStatusRequest implements org.apache.thrift.TBase<UpdateBuildSlaveStatusRequest, UpdateBuildSlaveStatusRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateBuildSlaveStatusRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateBuildSlaveStatusRequest");

  private static final org.apache.thrift.protocol.TField STAMPEDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stampedeId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("runId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_SLAVE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildSlaveStatus", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UpdateBuildSlaveStatusRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UpdateBuildSlaveStatusRequestTupleSchemeFactory());
  }

  public StampedeId stampedeId; // optional
  public RunId runId; // optional
  public ByteBuffer buildSlaveStatus; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAMPEDE_ID((short)1, "stampedeId"),
    RUN_ID((short)2, "runId"),
    BUILD_SLAVE_STATUS((short)3, "buildSlaveStatus");

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
        case 1: // STAMPEDE_ID
          return STAMPEDE_ID;
        case 2: // RUN_ID
          return RUN_ID;
        case 3: // BUILD_SLAVE_STATUS
          return BUILD_SLAVE_STATUS;
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
  private static final _Fields optionals[] = {_Fields.STAMPEDE_ID,_Fields.RUN_ID,_Fields.BUILD_SLAVE_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAMPEDE_ID, new org.apache.thrift.meta_data.FieldMetaData("stampedeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StampedeId.class)));
    tmpMap.put(_Fields.RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("runId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RunId.class)));
    tmpMap.put(_Fields.BUILD_SLAVE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("buildSlaveStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateBuildSlaveStatusRequest.class, metaDataMap);
  }

  public UpdateBuildSlaveStatusRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateBuildSlaveStatusRequest(UpdateBuildSlaveStatusRequest other) {
    if (other.isSetStampedeId()) {
      this.stampedeId = new StampedeId(other.stampedeId);
    }
    if (other.isSetRunId()) {
      this.runId = new RunId(other.runId);
    }
    if (other.isSetBuildSlaveStatus()) {
      this.buildSlaveStatus = org.apache.thrift.TBaseHelper.copyBinary(other.buildSlaveStatus);
    }
  }

  public UpdateBuildSlaveStatusRequest deepCopy() {
    return new UpdateBuildSlaveStatusRequest(this);
  }

  @Override
  public void clear() {
    this.stampedeId = null;
    this.runId = null;
    this.buildSlaveStatus = null;
  }

  public StampedeId getStampedeId() {
    return this.stampedeId;
  }

  public UpdateBuildSlaveStatusRequest setStampedeId(StampedeId stampedeId) {
    this.stampedeId = stampedeId;
    return this;
  }

  public void unsetStampedeId() {
    this.stampedeId = null;
  }

  /** Returns true if field stampedeId is set (has been assigned a value) and false otherwise */
  public boolean isSetStampedeId() {
    return this.stampedeId != null;
  }

  public void setStampedeIdIsSet(boolean value) {
    if (!value) {
      this.stampedeId = null;
    }
  }

  public RunId getRunId() {
    return this.runId;
  }

  public UpdateBuildSlaveStatusRequest setRunId(RunId runId) {
    this.runId = runId;
    return this;
  }

  public void unsetRunId() {
    this.runId = null;
  }

  /** Returns true if field runId is set (has been assigned a value) and false otherwise */
  public boolean isSetRunId() {
    return this.runId != null;
  }

  public void setRunIdIsSet(boolean value) {
    if (!value) {
      this.runId = null;
    }
  }

  public byte[] getBuildSlaveStatus() {
    setBuildSlaveStatus(org.apache.thrift.TBaseHelper.rightSize(buildSlaveStatus));
    return buildSlaveStatus == null ? null : buildSlaveStatus.array();
  }

  public ByteBuffer bufferForBuildSlaveStatus() {
    return org.apache.thrift.TBaseHelper.copyBinary(buildSlaveStatus);
  }

  public UpdateBuildSlaveStatusRequest setBuildSlaveStatus(byte[] buildSlaveStatus) {
    this.buildSlaveStatus = buildSlaveStatus == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(buildSlaveStatus, buildSlaveStatus.length));
    return this;
  }

  public UpdateBuildSlaveStatusRequest setBuildSlaveStatus(ByteBuffer buildSlaveStatus) {
    this.buildSlaveStatus = org.apache.thrift.TBaseHelper.copyBinary(buildSlaveStatus);
    return this;
  }

  public void unsetBuildSlaveStatus() {
    this.buildSlaveStatus = null;
  }

  /** Returns true if field buildSlaveStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildSlaveStatus() {
    return this.buildSlaveStatus != null;
  }

  public void setBuildSlaveStatusIsSet(boolean value) {
    if (!value) {
      this.buildSlaveStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STAMPEDE_ID:
      if (value == null) {
        unsetStampedeId();
      } else {
        setStampedeId((StampedeId)value);
      }
      break;

    case RUN_ID:
      if (value == null) {
        unsetRunId();
      } else {
        setRunId((RunId)value);
      }
      break;

    case BUILD_SLAVE_STATUS:
      if (value == null) {
        unsetBuildSlaveStatus();
      } else {
        setBuildSlaveStatus((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAMPEDE_ID:
      return getStampedeId();

    case RUN_ID:
      return getRunId();

    case BUILD_SLAVE_STATUS:
      return getBuildSlaveStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAMPEDE_ID:
      return isSetStampedeId();
    case RUN_ID:
      return isSetRunId();
    case BUILD_SLAVE_STATUS:
      return isSetBuildSlaveStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateBuildSlaveStatusRequest)
      return this.equals((UpdateBuildSlaveStatusRequest)that);
    return false;
  }

  public boolean equals(UpdateBuildSlaveStatusRequest that) {
    if (that == null)
      return false;

    boolean this_present_stampedeId = true && this.isSetStampedeId();
    boolean that_present_stampedeId = true && that.isSetStampedeId();
    if (this_present_stampedeId || that_present_stampedeId) {
      if (!(this_present_stampedeId && that_present_stampedeId))
        return false;
      if (!this.stampedeId.equals(that.stampedeId))
        return false;
    }

    boolean this_present_runId = true && this.isSetRunId();
    boolean that_present_runId = true && that.isSetRunId();
    if (this_present_runId || that_present_runId) {
      if (!(this_present_runId && that_present_runId))
        return false;
      if (!this.runId.equals(that.runId))
        return false;
    }

    boolean this_present_buildSlaveStatus = true && this.isSetBuildSlaveStatus();
    boolean that_present_buildSlaveStatus = true && that.isSetBuildSlaveStatus();
    if (this_present_buildSlaveStatus || that_present_buildSlaveStatus) {
      if (!(this_present_buildSlaveStatus && that_present_buildSlaveStatus))
        return false;
      if (!this.buildSlaveStatus.equals(that.buildSlaveStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stampedeId = true && (isSetStampedeId());
    list.add(present_stampedeId);
    if (present_stampedeId)
      list.add(stampedeId);

    boolean present_runId = true && (isSetRunId());
    list.add(present_runId);
    if (present_runId)
      list.add(runId);

    boolean present_buildSlaveStatus = true && (isSetBuildSlaveStatus());
    list.add(present_buildSlaveStatus);
    if (present_buildSlaveStatus)
      list.add(buildSlaveStatus);

    return list.hashCode();
  }

  @Override
  public int compareTo(UpdateBuildSlaveStatusRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStampedeId()).compareTo(other.isSetStampedeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStampedeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stampedeId, other.stampedeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunId()).compareTo(other.isSetRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runId, other.runId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildSlaveStatus()).compareTo(other.isSetBuildSlaveStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildSlaveStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildSlaveStatus, other.buildSlaveStatus);
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
    StringBuilder sb = new StringBuilder("UpdateBuildSlaveStatusRequest(");
    boolean first = true;

    if (isSetStampedeId()) {
      sb.append("stampedeId:");
      if (this.stampedeId == null) {
        sb.append("null");
      } else {
        sb.append(this.stampedeId);
      }
      first = false;
    }
    if (isSetRunId()) {
      if (!first) sb.append(", ");
      sb.append("runId:");
      if (this.runId == null) {
        sb.append("null");
      } else {
        sb.append(this.runId);
      }
      first = false;
    }
    if (isSetBuildSlaveStatus()) {
      if (!first) sb.append(", ");
      sb.append("buildSlaveStatus:");
      if (this.buildSlaveStatus == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.buildSlaveStatus, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stampedeId != null) {
      stampedeId.validate();
    }
    if (runId != null) {
      runId.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UpdateBuildSlaveStatusRequestStandardSchemeFactory implements SchemeFactory {
    public UpdateBuildSlaveStatusRequestStandardScheme getScheme() {
      return new UpdateBuildSlaveStatusRequestStandardScheme();
    }
  }

  private static class UpdateBuildSlaveStatusRequestStandardScheme extends StandardScheme<UpdateBuildSlaveStatusRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateBuildSlaveStatusRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAMPEDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stampedeId = new StampedeId();
              struct.stampedeId.read(iprot);
              struct.setStampedeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.runId = new RunId();
              struct.runId.read(iprot);
              struct.setRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_SLAVE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buildSlaveStatus = iprot.readBinary();
              struct.setBuildSlaveStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateBuildSlaveStatusRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stampedeId != null) {
        if (struct.isSetStampedeId()) {
          oprot.writeFieldBegin(STAMPEDE_ID_FIELD_DESC);
          struct.stampedeId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.runId != null) {
        if (struct.isSetRunId()) {
          oprot.writeFieldBegin(RUN_ID_FIELD_DESC);
          struct.runId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildSlaveStatus != null) {
        if (struct.isSetBuildSlaveStatus()) {
          oprot.writeFieldBegin(BUILD_SLAVE_STATUS_FIELD_DESC);
          oprot.writeBinary(struct.buildSlaveStatus);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateBuildSlaveStatusRequestTupleSchemeFactory implements SchemeFactory {
    public UpdateBuildSlaveStatusRequestTupleScheme getScheme() {
      return new UpdateBuildSlaveStatusRequestTupleScheme();
    }
  }

  private static class UpdateBuildSlaveStatusRequestTupleScheme extends TupleScheme<UpdateBuildSlaveStatusRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateBuildSlaveStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStampedeId()) {
        optionals.set(0);
      }
      if (struct.isSetRunId()) {
        optionals.set(1);
      }
      if (struct.isSetBuildSlaveStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStampedeId()) {
        struct.stampedeId.write(oprot);
      }
      if (struct.isSetRunId()) {
        struct.runId.write(oprot);
      }
      if (struct.isSetBuildSlaveStatus()) {
        oprot.writeBinary(struct.buildSlaveStatus);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateBuildSlaveStatusRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stampedeId = new StampedeId();
        struct.stampedeId.read(iprot);
        struct.setStampedeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.runId = new RunId();
        struct.runId.read(iprot);
        struct.setRunIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildSlaveStatus = iprot.readBinary();
        struct.setBuildSlaveStatusIsSet(true);
      }
    }
  }

}

