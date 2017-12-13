/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-12-07")
public class DeleteDebugInfo implements org.apache.thrift.TBase<DeleteDebugInfo, DeleteDebugInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteDebugInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteDebugInfo");

  private static final org.apache.thrift.protocol.TField STORES_DELETED_FROM_FIELD_DESC = new org.apache.thrift.protocol.TField("storesDeletedFrom", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DeleteDebugInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DeleteDebugInfoTupleSchemeFactory();

  public java.util.List<java.lang.String> storesDeletedFrom; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORES_DELETED_FROM((short)1, "storesDeletedFrom");

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
        case 1: // STORES_DELETED_FROM
          return STORES_DELETED_FROM;
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
  private static final _Fields optionals[] = {_Fields.STORES_DELETED_FROM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORES_DELETED_FROM, new org.apache.thrift.meta_data.FieldMetaData("storesDeletedFrom", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteDebugInfo.class, metaDataMap);
  }

  public DeleteDebugInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteDebugInfo(DeleteDebugInfo other) {
    if (other.isSetStoresDeletedFrom()) {
      java.util.List<java.lang.String> __this__storesDeletedFrom = new java.util.ArrayList<java.lang.String>(other.storesDeletedFrom);
      this.storesDeletedFrom = __this__storesDeletedFrom;
    }
  }

  public DeleteDebugInfo deepCopy() {
    return new DeleteDebugInfo(this);
  }

  @Override
  public void clear() {
    this.storesDeletedFrom = null;
  }

  public int getStoresDeletedFromSize() {
    return (this.storesDeletedFrom == null) ? 0 : this.storesDeletedFrom.size();
  }

  public java.util.Iterator<java.lang.String> getStoresDeletedFromIterator() {
    return (this.storesDeletedFrom == null) ? null : this.storesDeletedFrom.iterator();
  }

  public void addToStoresDeletedFrom(java.lang.String elem) {
    if (this.storesDeletedFrom == null) {
      this.storesDeletedFrom = new java.util.ArrayList<java.lang.String>();
    }
    this.storesDeletedFrom.add(elem);
  }

  public java.util.List<java.lang.String> getStoresDeletedFrom() {
    return this.storesDeletedFrom;
  }

  public DeleteDebugInfo setStoresDeletedFrom(java.util.List<java.lang.String> storesDeletedFrom) {
    this.storesDeletedFrom = storesDeletedFrom;
    return this;
  }

  public void unsetStoresDeletedFrom() {
    this.storesDeletedFrom = null;
  }

  /** Returns true if field storesDeletedFrom is set (has been assigned a value) and false otherwise */
  public boolean isSetStoresDeletedFrom() {
    return this.storesDeletedFrom != null;
  }

  public void setStoresDeletedFromIsSet(boolean value) {
    if (!value) {
      this.storesDeletedFrom = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STORES_DELETED_FROM:
      if (value == null) {
        unsetStoresDeletedFrom();
      } else {
        setStoresDeletedFrom((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STORES_DELETED_FROM:
      return getStoresDeletedFrom();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STORES_DELETED_FROM:
      return isSetStoresDeletedFrom();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteDebugInfo)
      return this.equals((DeleteDebugInfo)that);
    return false;
  }

  public boolean equals(DeleteDebugInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_storesDeletedFrom = true && this.isSetStoresDeletedFrom();
    boolean that_present_storesDeletedFrom = true && that.isSetStoresDeletedFrom();
    if (this_present_storesDeletedFrom || that_present_storesDeletedFrom) {
      if (!(this_present_storesDeletedFrom && that_present_storesDeletedFrom))
        return false;
      if (!this.storesDeletedFrom.equals(that.storesDeletedFrom))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStoresDeletedFrom()) ? 131071 : 524287);
    if (isSetStoresDeletedFrom())
      hashCode = hashCode * 8191 + storesDeletedFrom.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DeleteDebugInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStoresDeletedFrom()).compareTo(other.isSetStoresDeletedFrom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoresDeletedFrom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storesDeletedFrom, other.storesDeletedFrom);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteDebugInfo(");
    boolean first = true;

    if (isSetStoresDeletedFrom()) {
      sb.append("storesDeletedFrom:");
      if (this.storesDeletedFrom == null) {
        sb.append("null");
      } else {
        sb.append(this.storesDeletedFrom);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteDebugInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DeleteDebugInfoStandardScheme getScheme() {
      return new DeleteDebugInfoStandardScheme();
    }
  }

  private static class DeleteDebugInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<DeleteDebugInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteDebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORES_DELETED_FROM
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
                struct.storesDeletedFrom = new java.util.ArrayList<java.lang.String>(_list82.size);
                java.lang.String _elem83;
                for (int _i84 = 0; _i84 < _list82.size; ++_i84)
                {
                  _elem83 = iprot.readString();
                  struct.storesDeletedFrom.add(_elem83);
                }
                iprot.readListEnd();
              }
              struct.setStoresDeletedFromIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteDebugInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storesDeletedFrom != null) {
        if (struct.isSetStoresDeletedFrom()) {
          oprot.writeFieldBegin(STORES_DELETED_FROM_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.storesDeletedFrom.size()));
            for (java.lang.String _iter85 : struct.storesDeletedFrom)
            {
              oprot.writeString(_iter85);
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

  private static class DeleteDebugInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DeleteDebugInfoTupleScheme getScheme() {
      return new DeleteDebugInfoTupleScheme();
    }
  }

  private static class DeleteDebugInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<DeleteDebugInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteDebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStoresDeletedFrom()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStoresDeletedFrom()) {
        {
          oprot.writeI32(struct.storesDeletedFrom.size());
          for (java.lang.String _iter86 : struct.storesDeletedFrom)
          {
            oprot.writeString(_iter86);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteDebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list87 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.storesDeletedFrom = new java.util.ArrayList<java.lang.String>(_list87.size);
          java.lang.String _elem88;
          for (int _i89 = 0; _i89 < _list87.size; ++_i89)
          {
            _elem88 = iprot.readString();
            struct.storesDeletedFrom.add(_elem88);
          }
        }
        struct.setStoresDeletedFromIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

