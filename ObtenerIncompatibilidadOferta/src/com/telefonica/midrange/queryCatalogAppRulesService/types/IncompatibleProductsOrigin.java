/**
 * IncompatibleProductsOrigin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryCatalogAppRulesService.types;

public class IncompatibleProductsOrigin  implements java.io.Serializable {
    private java.lang.String nameIncompatibleProducts;

    public IncompatibleProductsOrigin() {
    }

    public IncompatibleProductsOrigin(
           java.lang.String nameIncompatibleProducts) {
           this.nameIncompatibleProducts = nameIncompatibleProducts;
    }


    /**
     * Gets the nameIncompatibleProducts value for this IncompatibleProductsOrigin.
     * 
     * @return nameIncompatibleProducts
     */
    public java.lang.String getNameIncompatibleProducts() {
        return nameIncompatibleProducts;
    }


    /**
     * Sets the nameIncompatibleProducts value for this IncompatibleProductsOrigin.
     * 
     * @param nameIncompatibleProducts
     */
    public void setNameIncompatibleProducts(java.lang.String nameIncompatibleProducts) {
        this.nameIncompatibleProducts = nameIncompatibleProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncompatibleProductsOrigin)) return false;
        IncompatibleProductsOrigin other = (IncompatibleProductsOrigin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameIncompatibleProducts==null && other.getNameIncompatibleProducts()==null) || 
             (this.nameIncompatibleProducts!=null &&
              this.nameIncompatibleProducts.equals(other.getNameIncompatibleProducts())));
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
        if (getNameIncompatibleProducts() != null) {
            _hashCode += getNameIncompatibleProducts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncompatibleProductsOrigin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "IncompatibleProductsOrigin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameIncompatibleProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "nameIncompatibleProducts"));
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
