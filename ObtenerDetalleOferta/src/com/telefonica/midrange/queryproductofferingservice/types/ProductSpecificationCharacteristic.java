/**
 * ProductSpecificationCharacteristic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice.types;

public class ProductSpecificationCharacteristic  implements java.io.Serializable {
    private java.lang.String codCharacteristic;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String technology;

    private java.lang.String typeUnit;

    private java.lang.String unit;

    private java.lang.String maximumSpeed;

    private java.lang.String reducedSpeed;

    public ProductSpecificationCharacteristic() {
    }

    public ProductSpecificationCharacteristic(
           java.lang.String codCharacteristic,
           java.lang.String name,
           java.lang.String description,
           java.lang.String technology,
           java.lang.String typeUnit,
           java.lang.String unit,
           java.lang.String maximumSpeed,
           java.lang.String reducedSpeed) {
           this.codCharacteristic = codCharacteristic;
           this.name = name;
           this.description = description;
           this.technology = technology;
           this.typeUnit = typeUnit;
           this.unit = unit;
           this.maximumSpeed = maximumSpeed;
           this.reducedSpeed = reducedSpeed;
    }


    /**
     * Gets the codCharacteristic value for this ProductSpecificationCharacteristic.
     * 
     * @return codCharacteristic
     */
    public java.lang.String getCodCharacteristic() {
        return codCharacteristic;
    }


    /**
     * Sets the codCharacteristic value for this ProductSpecificationCharacteristic.
     * 
     * @param codCharacteristic
     */
    public void setCodCharacteristic(java.lang.String codCharacteristic) {
        this.codCharacteristic = codCharacteristic;
    }


    /**
     * Gets the name value for this ProductSpecificationCharacteristic.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductSpecificationCharacteristic.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ProductSpecificationCharacteristic.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductSpecificationCharacteristic.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the technology value for this ProductSpecificationCharacteristic.
     * 
     * @return technology
     */
    public java.lang.String getTechnology() {
        return technology;
    }


    /**
     * Sets the technology value for this ProductSpecificationCharacteristic.
     * 
     * @param technology
     */
    public void setTechnology(java.lang.String technology) {
        this.technology = technology;
    }


    /**
     * Gets the typeUnit value for this ProductSpecificationCharacteristic.
     * 
     * @return typeUnit
     */
    public java.lang.String getTypeUnit() {
        return typeUnit;
    }


    /**
     * Sets the typeUnit value for this ProductSpecificationCharacteristic.
     * 
     * @param typeUnit
     */
    public void setTypeUnit(java.lang.String typeUnit) {
        this.typeUnit = typeUnit;
    }


    /**
     * Gets the unit value for this ProductSpecificationCharacteristic.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ProductSpecificationCharacteristic.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the maximumSpeed value for this ProductSpecificationCharacteristic.
     * 
     * @return maximumSpeed
     */
    public java.lang.String getMaximumSpeed() {
        return maximumSpeed;
    }


    /**
     * Sets the maximumSpeed value for this ProductSpecificationCharacteristic.
     * 
     * @param maximumSpeed
     */
    public void setMaximumSpeed(java.lang.String maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }


    /**
     * Gets the reducedSpeed value for this ProductSpecificationCharacteristic.
     * 
     * @return reducedSpeed
     */
    public java.lang.String getReducedSpeed() {
        return reducedSpeed;
    }


    /**
     * Sets the reducedSpeed value for this ProductSpecificationCharacteristic.
     * 
     * @param reducedSpeed
     */
    public void setReducedSpeed(java.lang.String reducedSpeed) {
        this.reducedSpeed = reducedSpeed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSpecificationCharacteristic)) return false;
        ProductSpecificationCharacteristic other = (ProductSpecificationCharacteristic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codCharacteristic==null && other.getCodCharacteristic()==null) || 
             (this.codCharacteristic!=null &&
              this.codCharacteristic.equals(other.getCodCharacteristic()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.technology==null && other.getTechnology()==null) || 
             (this.technology!=null &&
              this.technology.equals(other.getTechnology()))) &&
            ((this.typeUnit==null && other.getTypeUnit()==null) || 
             (this.typeUnit!=null &&
              this.typeUnit.equals(other.getTypeUnit()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.maximumSpeed==null && other.getMaximumSpeed()==null) || 
             (this.maximumSpeed!=null &&
              this.maximumSpeed.equals(other.getMaximumSpeed()))) &&
            ((this.reducedSpeed==null && other.getReducedSpeed()==null) || 
             (this.reducedSpeed!=null &&
              this.reducedSpeed.equals(other.getReducedSpeed())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodCharacteristic() != null) {
            _hashCode += getCodCharacteristic().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTechnology() != null) {
            _hashCode += getTechnology().hashCode();
        }
        if (getTypeUnit() != null) {
            _hashCode += getTypeUnit().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getMaximumSpeed() != null) {
            _hashCode += getMaximumSpeed().hashCode();
        }
        if (getReducedSpeed() != null) {
            _hashCode += getReducedSpeed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSpecificationCharacteristic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductSpecificationCharacteristic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCharacteristic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "codCharacteristic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "technology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "typeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "maximumSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reducedSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "reducedSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
