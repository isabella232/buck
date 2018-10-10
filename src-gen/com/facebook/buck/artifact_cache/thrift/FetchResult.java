/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class FetchResult implements org.apache.thrift.TBase<FetchResult, FetchResult._Fields>, java.io.Serializable, Cloneable, Comparable<FetchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FetchResult");

  private static final org.apache.thrift.protocol.TField RESULT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resultType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DEBUG_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("debugInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField PAYLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("payload", org.apache.thrift.protocol.TType.STRING, (short)100);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FetchResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FetchResultTupleSchemeFactory();

  /**
   * 
   * @see FetchResultType
   */
  public FetchResultType resultType; // optional
  public ArtifactMetadata metadata; // optional
  public FetchDebugInfo debugInfo; // optional
  public java.nio.ByteBuffer payload; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FetchResultType
     */
    RESULT_TYPE((short)1, "resultType"),
    METADATA((short)2, "metadata"),
    DEBUG_INFO((short)3, "debugInfo"),
    PAYLOAD((short)100, "payload");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESULT_TYPE
          return RESULT_TYPE;
        case 2: // METADATA
          return METADATA;
        case 3: // DEBUG_INFO
          return DEBUG_INFO;
        case 100: // PAYLOAD
          return PAYLOAD;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.RESULT_TYPE,_Fields.METADATA,_Fields.DEBUG_INFO,_Fields.PAYLOAD};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resultType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FetchResultType.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ArtifactMetadata.class)));
    tmpMap.put(_Fields.DEBUG_INFO, new org.apache.thrift.meta_data.FieldMetaData("debugInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FetchDebugInfo.class)));
    tmpMap.put(_Fields.PAYLOAD, new org.apache.thrift.meta_data.FieldMetaData("payload", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FetchResult.class, metaDataMap);
  }

  public FetchResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FetchResult(FetchResult other) {
    if (other.isSetResultType()) {
      this.resultType = other.resultType;
    }
    if (other.isSetMetadata()) {
      this.metadata = new ArtifactMetadata(other.metadata);
    }
    if (other.isSetDebugInfo()) {
      this.debugInfo = new FetchDebugInfo(other.debugInfo);
    }
    if (other.isSetPayload()) {
      this.payload = org.apache.thrift.TBaseHelper.copyBinary(other.payload);
    }
  }

  public FetchResult deepCopy() {
    return new FetchResult(this);
  }

  @Override
  public void clear() {
    this.resultType = null;
    this.metadata = null;
    this.debugInfo = null;
    this.payload = null;
  }

  /**
   * 
   * @see FetchResultType
   */
  public FetchResultType getResultType() {
    return this.resultType;
  }

  /**
   * 
   * @see FetchResultType
   */
  public FetchResult setResultType(FetchResultType resultType) {
    this.resultType = resultType;
    return this;
  }

  public void unsetResultType() {
    this.resultType = null;
  }

  /** Returns true if field resultType is set (has been assigned a value) and false otherwise */
  public boolean isSetResultType() {
    return this.resultType != null;
  }

  public void setResultTypeIsSet(boolean value) {
    if (!value) {
      this.resultType = null;
    }
  }

  public ArtifactMetadata getMetadata() {
    return this.metadata;
  }

  public FetchResult setMetadata(ArtifactMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public FetchDebugInfo getDebugInfo() {
    return this.debugInfo;
  }

  public FetchResult setDebugInfo(FetchDebugInfo debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  public void unsetDebugInfo() {
    this.debugInfo = null;
  }

  /** Returns true if field debugInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetDebugInfo() {
    return this.debugInfo != null;
  }

  public void setDebugInfoIsSet(boolean value) {
    if (!value) {
      this.debugInfo = null;
    }
  }

  public byte[] getPayload() {
    setPayload(org.apache.thrift.TBaseHelper.rightSize(payload));
    return payload == null ? null : payload.array();
  }

  public java.nio.ByteBuffer bufferForPayload() {
    return org.apache.thrift.TBaseHelper.copyBinary(payload);
  }

  public FetchResult setPayload(byte[] payload) {
    this.payload = payload == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(payload.clone());
    return this;
  }

  public FetchResult setPayload(java.nio.ByteBuffer payload) {
    this.payload = org.apache.thrift.TBaseHelper.copyBinary(payload);
    return this;
  }

  public void unsetPayload() {
    this.payload = null;
  }

  /** Returns true if field payload is set (has been assigned a value) and false otherwise */
  public boolean isSetPayload() {
    return this.payload != null;
  }

  public void setPayloadIsSet(boolean value) {
    if (!value) {
      this.payload = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case RESULT_TYPE:
      if (value == null) {
        unsetResultType();
      } else {
        setResultType((FetchResultType)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((ArtifactMetadata)value);
      }
      break;

    case DEBUG_INFO:
      if (value == null) {
        unsetDebugInfo();
      } else {
        setDebugInfo((FetchDebugInfo)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        if (value instanceof byte[]) {
          setPayload((byte[])value);
        } else {
          setPayload((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_TYPE:
      return getResultType();

    case METADATA:
      return getMetadata();

    case DEBUG_INFO:
      return getDebugInfo();

    case PAYLOAD:
      return getPayload();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESULT_TYPE:
      return isSetResultType();
    case METADATA:
      return isSetMetadata();
    case DEBUG_INFO:
      return isSetDebugInfo();
    case PAYLOAD:
      return isSetPayload();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof FetchResult)
      return this.equals((FetchResult)that);
    return false;
  }

  public boolean equals(FetchResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resultType = true && this.isSetResultType();
    boolean that_present_resultType = true && that.isSetResultType();
    if (this_present_resultType || that_present_resultType) {
      if (!(this_present_resultType && that_present_resultType))
        return false;
      if (!this.resultType.equals(that.resultType))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_debugInfo = true && this.isSetDebugInfo();
    boolean that_present_debugInfo = true && that.isSetDebugInfo();
    if (this_present_debugInfo || that_present_debugInfo) {
      if (!(this_present_debugInfo && that_present_debugInfo))
        return false;
      if (!this.debugInfo.equals(that.debugInfo))
        return false;
    }

    boolean this_present_payload = true && this.isSetPayload();
    boolean that_present_payload = true && that.isSetPayload();
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (!this.payload.equals(that.payload))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResultType()) ? 131071 : 524287);
    if (isSetResultType())
      hashCode = hashCode * 8191 + resultType.getValue();

    hashCode = hashCode * 8191 + ((isSetMetadata()) ? 131071 : 524287);
    if (isSetMetadata())
      hashCode = hashCode * 8191 + metadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetDebugInfo()) ? 131071 : 524287);
    if (isSetDebugInfo())
      hashCode = hashCode * 8191 + debugInfo.hashCode();

    hashCode = hashCode * 8191 + ((isSetPayload()) ? 131071 : 524287);
    if (isSetPayload())
      hashCode = hashCode * 8191 + payload.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FetchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetResultType()).compareTo(other.isSetResultType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultType, other.resultType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDebugInfo()).compareTo(other.isSetDebugInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebugInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debugInfo, other.debugInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPayload()).compareTo(other.isSetPayload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payload, other.payload);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchResult(");
    boolean first = true;

    if (isSetResultType()) {
      sb.append("resultType:");
      if (this.resultType == null) {
        sb.append("null");
      } else {
        sb.append(this.resultType);
      }
      first = false;
    }
    if (isSetMetadata()) {
      if (!first) sb.append(", ");
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata);
      }
      first = false;
    }
    if (isSetDebugInfo()) {
      if (!first) sb.append(", ");
      sb.append("debugInfo:");
      if (this.debugInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.debugInfo);
      }
      first = false;
    }
    if (isSetPayload()) {
      if (!first) sb.append(", ");
      sb.append("payload:");
      if (this.payload == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.payload, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (metadata != null) {
      metadata.validate();
    }
    if (debugInfo != null) {
      debugInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FetchResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FetchResultStandardScheme getScheme() {
      return new FetchResultStandardScheme();
    }
  }

  private static class FetchResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<FetchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FetchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resultType = com.facebook.buck.artifact_cache.thrift.FetchResultType.findByValue(iprot.readI32());
              struct.setResultTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metadata = new ArtifactMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEBUG_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.debugInfo = new FetchDebugInfo();
              struct.debugInfo.read(iprot);
              struct.setDebugInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 100: // PAYLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.payload = iprot.readBinary();
              struct.setPayloadIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FetchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resultType != null) {
        if (struct.isSetResultType()) {
          oprot.writeFieldBegin(RESULT_TYPE_FIELD_DESC);
          oprot.writeI32(struct.resultType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          struct.metadata.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.debugInfo != null) {
        if (struct.isSetDebugInfo()) {
          oprot.writeFieldBegin(DEBUG_INFO_FIELD_DESC);
          struct.debugInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.payload != null) {
        if (struct.isSetPayload()) {
          oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
          oprot.writeBinary(struct.payload);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FetchResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FetchResultTupleScheme getScheme() {
      return new FetchResultTupleScheme();
    }
  }

  private static class FetchResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<FetchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FetchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResultType()) {
        optionals.set(0);
      }
      if (struct.isSetMetadata()) {
        optionals.set(1);
      }
      if (struct.isSetDebugInfo()) {
        optionals.set(2);
      }
      if (struct.isSetPayload()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetResultType()) {
        oprot.writeI32(struct.resultType.getValue());
      }
      if (struct.isSetMetadata()) {
        struct.metadata.write(oprot);
      }
      if (struct.isSetDebugInfo()) {
        struct.debugInfo.write(oprot);
      }
      if (struct.isSetPayload()) {
        oprot.writeBinary(struct.payload);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FetchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.resultType = com.facebook.buck.artifact_cache.thrift.FetchResultType.findByValue(iprot.readI32());
        struct.setResultTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.metadata = new ArtifactMetadata();
        struct.metadata.read(iprot);
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.debugInfo = new FetchDebugInfo();
        struct.debugInfo.read(iprot);
        struct.setDebugInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.payload = iprot.readBinary();
        struct.setPayloadIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

