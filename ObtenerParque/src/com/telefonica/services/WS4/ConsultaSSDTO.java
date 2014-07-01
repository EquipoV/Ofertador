/**
 * ConsultaSSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.services.WS4;

public class ConsultaSSDTO  implements java.io.Serializable {
    private java.lang.String numeroCelular;

    public ConsultaSSDTO() {
    }

    public ConsultaSSDTO(
           java.lang.String numeroCelular) {
           this.numeroCelular = numeroCelular;
    }


    /**
     * Gets the numeroCelular value for this ConsultaSSDTO.
     * 
     * @return numeroCelular
     */
    public java.lang.String getNumeroCelular() {
        return numeroCelular;
    }


    /**
     * Sets the numeroCelular value for this ConsultaSSDTO.
     * 
     * @param numeroCelular
     */
    public void setNumeroCelular(java.lang.String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSSDTO)) return false;
        ConsultaSSDTO other = (ConsultaSSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroCelular==null && other.getNumeroCelular()==null) || 
             (this.numeroCelular!=null &&
              this.numeroCelular.equals(other.getNumeroCelular())));
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
        if (getNumeroCelular() != null) {
            _hashCode += getNumeroCelular().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaSSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "ConsultaSSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "numeroCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
