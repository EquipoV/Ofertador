/**
 * QueryOfferingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice.types;

public class QueryOfferingResponse  implements java.io.Serializable {
    private java.lang.String returnCode;

    private java.lang.String returnDescription;

    private com.telefonica.midrange.queryproductofferingservice.types.ProductOffering productOffering;

    public QueryOfferingResponse() {
    }

    public QueryOfferingResponse(
           java.lang.String returnCode,
           java.lang.String returnDescription,
           com.telefonica.midrange.queryproductofferingservice.types.ProductOffering productOffering) {
           this.returnCode = returnCode;
           this.returnDescription = returnDescription;
           this.productOffering = productOffering;
    }


    /**
     * Gets the returnCode value for this QueryOfferingResponse.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this QueryOfferingResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnDescription value for this QueryOfferingResponse.
     * 
     * @return returnDescription
     */
    public java.lang.String getReturnDescription() {
        return returnDescription;
    }


    /**
     * Sets the returnDescription value for this QueryOfferingResponse.
     * 
     * @param returnDescription
     */
    public void setReturnDescription(java.lang.String returnDescription) {
        this.returnDescription = returnDescription;
    }


    /**
     * Gets the productOffering value for this QueryOfferingResponse.
     * 
     * @return productOffering
     */
    public com.telefonica.midrange.queryproductofferingservice.types.ProductOffering getProductOffering() {
        return productOffering;
    }


    /**
     * Sets the productOffering value for this QueryOfferingResponse.
     * 
     * @param productOffering
     */
    public void setProductOffering(com.telefonica.midrange.queryproductofferingservice.types.ProductOffering productOffering) {
        this.productOffering = productOffering;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryOfferingResponse)) return false;
        QueryOfferingResponse other = (QueryOfferingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnCode==null && other.getReturnCode()==null) || 
             (this.returnCode!=null &&
              this.returnCode.equals(other.getReturnCode()))) &&
            ((this.returnDescription==null && other.getReturnDescription()==null) || 
             (this.returnDescription!=null &&
              this.returnDescription.equals(other.getReturnDescription()))) &&
            ((this.productOffering==null && other.getProductOffering()==null) || 
             (this.productOffering!=null &&
              this.productOffering.equals(other.getProductOffering())));
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
        if (getReturnCode() != null) {
            _hashCode += getReturnCode().hashCode();
        }
        if (getReturnDescription() != null) {
            _hashCode += getReturnDescription().hashCode();
        }
        if (getProductOffering() != null) {
            _hashCode += getProductOffering().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryOfferingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "QueryOfferingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "returnDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "productOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductOffering"));
        elemField.setMinOccurs(0);
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
