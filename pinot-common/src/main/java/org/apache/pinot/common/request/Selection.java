/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.pinot.common.request;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * AUTO GENERATED: DO NOT EDIT
 * Selection
 *
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-09-28")
public class Selection implements org.apache.thrift.TBase<Selection, Selection._Fields>, java.io.Serializable, Cloneable, Comparable<Selection> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Selection");

  private static final org.apache.thrift.protocol.TField SELECTION_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("selectionColumns", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SELECTION_SORT_SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("selectionSortSequence", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("offset", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SelectionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SelectionTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> selectionColumns; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<SelectionSort> selectionSortSequence; // optional
  private int offset; // optional
  private int size; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SELECTION_COLUMNS((short)1, "selectionColumns"),
    SELECTION_SORT_SEQUENCE((short)2, "selectionSortSequence"),
    OFFSET((short)3, "offset"),
    SIZE((short)4, "size");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SELECTION_COLUMNS
          return SELECTION_COLUMNS;
        case 2: // SELECTION_SORT_SEQUENCE
          return SELECTION_SORT_SEQUENCE;
        case 3: // OFFSET
          return OFFSET;
        case 4: // SIZE
          return SIZE;
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
    @org.apache.thrift.annotation.Nullable
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
  private static final int __OFFSET_ISSET_ID = 0;
  private static final int __SIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SELECTION_COLUMNS,_Fields.SELECTION_SORT_SEQUENCE,_Fields.OFFSET,_Fields.SIZE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SELECTION_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("selectionColumns", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SELECTION_SORT_SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("selectionSortSequence", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST,
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SelectionSort.class))));
    tmpMap.put(_Fields.OFFSET, new org.apache.thrift.meta_data.FieldMetaData("offset", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.OPTIONAL,
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Selection.class, metaDataMap);
  }

  public Selection() {
    this.offset = 0;

    this.size = 10;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Selection(Selection other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSelectionColumns()) {
      java.util.List<java.lang.String> __this__selectionColumns = new java.util.ArrayList<java.lang.String>(other.selectionColumns);
      this.selectionColumns = __this__selectionColumns;
    }
    if (other.isSetSelectionSortSequence()) {
      java.util.List<SelectionSort> __this__selectionSortSequence = new java.util.ArrayList<SelectionSort>(other.selectionSortSequence.size());
      for (SelectionSort other_element : other.selectionSortSequence) {
        __this__selectionSortSequence.add(new SelectionSort(other_element));
      }
      this.selectionSortSequence = __this__selectionSortSequence;
    }
    this.offset = other.offset;
    this.size = other.size;
  }

  public Selection deepCopy() {
    return new Selection(this);
  }

  @Override
  public void clear() {
    this.selectionColumns = null;
    this.selectionSortSequence = null;
    this.offset = 0;

    this.size = 10;
  }

  public int getSelectionColumnsSize() {
    return (this.selectionColumns == null) ? 0 : this.selectionColumns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getSelectionColumnsIterator() {
    return (this.selectionColumns == null) ? null : this.selectionColumns.iterator();
  }

  public void addToSelectionColumns(java.lang.String elem) {
    if (this.selectionColumns == null) {
      this.selectionColumns = new java.util.ArrayList<java.lang.String>();
    }
    this.selectionColumns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getSelectionColumns() {
    return this.selectionColumns;
  }

  public void setSelectionColumns(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> selectionColumns) {
    this.selectionColumns = selectionColumns;
  }

  public void unsetSelectionColumns() {
    this.selectionColumns = null;
  }

  /** Returns true if field selectionColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetSelectionColumns() {
    return this.selectionColumns != null;
  }

  public void setSelectionColumnsIsSet(boolean value) {
    if (!value) {
      this.selectionColumns = null;
    }
  }

  public int getSelectionSortSequenceSize() {
    return (this.selectionSortSequence == null) ? 0 : this.selectionSortSequence.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SelectionSort> getSelectionSortSequenceIterator() {
    return (this.selectionSortSequence == null) ? null : this.selectionSortSequence.iterator();
  }

  public void addToSelectionSortSequence(SelectionSort elem) {
    if (this.selectionSortSequence == null) {
      this.selectionSortSequence = new java.util.ArrayList<SelectionSort>();
    }
    this.selectionSortSequence.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SelectionSort> getSelectionSortSequence() {
    return this.selectionSortSequence;
  }

  public void setSelectionSortSequence(@org.apache.thrift.annotation.Nullable java.util.List<SelectionSort> selectionSortSequence) {
    this.selectionSortSequence = selectionSortSequence;
  }

  public void unsetSelectionSortSequence() {
    this.selectionSortSequence = null;
  }

  /** Returns true if field selectionSortSequence is set (has been assigned a value) and false otherwise */
  public boolean isSetSelectionSortSequence() {
    return this.selectionSortSequence != null;
  }

  public void setSelectionSortSequenceIsSet(boolean value) {
    if (!value) {
      this.selectionSortSequence = null;
    }
  }

  public int getOffset() {
    return this.offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
    setOffsetIsSet(true);
  }

  public void unsetOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFSET_ISSET_ID);
  }

  public void setOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFSET_ISSET_ID, value);
  }

  public int getSize() {
    return this.size;
  }

  public void setSize(int size) {
    this.size = size;
    setSizeIsSet(true);
  }

  public void unsetSize() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  public void setSizeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SELECTION_COLUMNS:
      if (value == null) {
        unsetSelectionColumns();
      } else {
        setSelectionColumns((java.util.List<java.lang.String>)value);
      }
      break;

    case SELECTION_SORT_SEQUENCE:
      if (value == null) {
        unsetSelectionSortSequence();
      } else {
        setSelectionSortSequence((java.util.List<SelectionSort>)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((java.lang.Integer)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((java.lang.Integer)value);
      }
      break;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SELECTION_COLUMNS:
      return getSelectionColumns();

    case SELECTION_SORT_SEQUENCE:
      return getSelectionSortSequence();

    case OFFSET:
      return getOffset();

    case SIZE:
      return getSize();
    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SELECTION_COLUMNS:
      return isSetSelectionColumns();
    case SELECTION_SORT_SEQUENCE:
      return isSetSelectionSortSequence();
    case OFFSET:
      return isSetOffset();
    case SIZE:
      return isSetSize();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Selection)
      return this.equals((Selection)that);
    return false;
  }

  public boolean equals(Selection that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_selectionColumns = true && this.isSetSelectionColumns();
    boolean that_present_selectionColumns = true && that.isSetSelectionColumns();
    if (this_present_selectionColumns || that_present_selectionColumns) {
      if (!(this_present_selectionColumns && that_present_selectionColumns))
        return false;
      if (!this.selectionColumns.equals(that.selectionColumns))
        return false;
    }

    boolean this_present_selectionSortSequence = true && this.isSetSelectionSortSequence();
    boolean that_present_selectionSortSequence = true && that.isSetSelectionSortSequence();
    if (this_present_selectionSortSequence || that_present_selectionSortSequence) {
      if (!(this_present_selectionSortSequence && that_present_selectionSortSequence))
        return false;
      if (!this.selectionSortSequence.equals(that.selectionSortSequence))
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (this.offset != that.offset)
        return false;
    }

    boolean this_present_size = true && this.isSetSize();
    boolean that_present_size = true && that.isSetSize();
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSelectionColumns()) ? 131071 : 524287);
    if (isSetSelectionColumns())
      hashCode = hashCode * 8191 + selectionColumns.hashCode();

    hashCode = hashCode * 8191 + ((isSetSelectionSortSequence()) ? 131071 : 524287);
    if (isSetSelectionSortSequence())
      hashCode = hashCode * 8191 + selectionSortSequence.hashCode();

    hashCode = hashCode * 8191 + ((isSetOffset()) ? 131071 : 524287);
    if (isSetOffset())
      hashCode = hashCode * 8191 + offset;

    hashCode = hashCode * 8191 + ((isSetSize()) ? 131071 : 524287);
    if (isSetSize())
      hashCode = hashCode * 8191 + size;

    return hashCode;
  }

  @Override
  public int compareTo(Selection other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSelectionColumns()).compareTo(other.isSetSelectionColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelectionColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selectionColumns, other.selectionColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSelectionSortSequence()).compareTo(other.isSetSelectionSortSequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSelectionSortSequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.selectionSortSequence, other.selectionSortSequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offset, other.offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSize()).compareTo(other.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.size, other.size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Selection(");
    boolean first = true;

    if (isSetSelectionColumns()) {
      sb.append("selectionColumns:");
      if (this.selectionColumns == null) {
        sb.append("null");
      } else {
        sb.append(this.selectionColumns);
      }
      first = false;
    }
    if (isSetSelectionSortSequence()) {
      if (!first) sb.append(", ");
      sb.append("selectionSortSequence:");
      if (this.selectionSortSequence == null) {
        sb.append("null");
      } else {
        sb.append(this.selectionSortSequence);
      }
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      sb.append(this.offset);
      first = false;
    }
    if (isSetSize()) {
      if (!first) sb.append(", ");
      sb.append("size:");
      sb.append(this.size);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SelectionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectionStandardScheme getScheme() {
      return new SelectionStandardScheme();
    }
  }

  private static class SelectionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Selection> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Selection struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
          break;
        }
        switch (schemeField.id) {
          case 1: // SELECTION_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list86 = iprot.readListBegin();
                struct.selectionColumns = new java.util.ArrayList<java.lang.String>(_list86.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem87;
                for (int _i88 = 0; _i88 < _list86.size; ++_i88)
                {
                  _elem87 = iprot.readString();
                  struct.selectionColumns.add(_elem87);
                }
                iprot.readListEnd();
              }
              struct.setSelectionColumnsIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SELECTION_SORT_SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list89 = iprot.readListBegin();
                struct.selectionSortSequence = new java.util.ArrayList<SelectionSort>(_list89.size);
                @org.apache.thrift.annotation.Nullable SelectionSort _elem90;
                for (int _i91 = 0; _i91 < _list89.size; ++_i91)
                {
                  _elem90 = new SelectionSort();
                  _elem90.read(iprot);
                  struct.selectionSortSequence.add(_elem90);
                }
                iprot.readListEnd();
              }
              struct.setSelectionSortSequenceIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.offset = iprot.readI32();
              struct.setOffsetIsSet(true);
            } else {
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.size = iprot.readI32();
              struct.setSizeIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Selection struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.selectionColumns != null) {
        if (struct.isSetSelectionColumns()) {
          oprot.writeFieldBegin(SELECTION_COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.selectionColumns.size()));
            for (java.lang.String _iter92 : struct.selectionColumns)
            {
              oprot.writeString(_iter92);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.selectionSortSequence != null) {
        if (struct.isSetSelectionSortSequence()) {
          oprot.writeFieldBegin(SELECTION_SORT_SEQUENCE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.selectionSortSequence.size()));
            for (SelectionSort _iter93 : struct.selectionSortSequence)
            {
              _iter93.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeFieldBegin(OFFSET_FIELD_DESC);
        oprot.writeI32(struct.offset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSize()) {
        oprot.writeFieldBegin(SIZE_FIELD_DESC);
        oprot.writeI32(struct.size);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
  }

  private static class SelectionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SelectionTupleScheme getScheme() {
      return new SelectionTupleScheme();
    }
  }

  private static class SelectionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Selection> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Selection struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSelectionColumns()) {
        optionals.set(0);
      }
      if (struct.isSetSelectionSortSequence()) {
        optionals.set(1);
      }
      if (struct.isSetOffset()) {
        optionals.set(2);
      }
      if (struct.isSetSize()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSelectionColumns()) {
        {
          oprot.writeI32(struct.selectionColumns.size());
          for (java.lang.String _iter94 : struct.selectionColumns)
          {
            oprot.writeString(_iter94);
          }
        }
      }
      if (struct.isSetSelectionSortSequence()) {
        {
          oprot.writeI32(struct.selectionSortSequence.size());
          for (SelectionSort _iter95 : struct.selectionSortSequence)
          {
            _iter95.write(oprot);
          }
        }
      }
      if (struct.isSetOffset()) {
        oprot.writeI32(struct.offset);
      }
      if (struct.isSetSize()) {
        oprot.writeI32(struct.size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Selection struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list96 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.selectionColumns = new java.util.ArrayList<java.lang.String>(_list96.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem97;
          for (int _i98 = 0; _i98 < _list96.size; ++_i98)
          {
            _elem97 = iprot.readString();
            struct.selectionColumns.add(_elem97);
          }
        }
        struct.setSelectionColumnsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list99 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.selectionSortSequence = new java.util.ArrayList<SelectionSort>(_list99.size);
          @org.apache.thrift.annotation.Nullable SelectionSort _elem100;
          for (int _i101 = 0; _i101 < _list99.size; ++_i101)
          {
            _elem100 = new SelectionSort();
            _elem100.read(iprot);
            struct.selectionSortSequence.add(_elem100);
          }
        }
        struct.setSelectionSortSequenceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.offset = iprot.readI32();
        struct.setOffsetIsSet(true);
      }
      if (incoming.get(3)) {
        struct.size = iprot.readI32();
        struct.setSizeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
