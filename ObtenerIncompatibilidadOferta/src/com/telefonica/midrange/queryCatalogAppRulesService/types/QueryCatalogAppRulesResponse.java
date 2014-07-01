/**
 * QueryCatalogAppRulesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryCatalogAppRulesService.types;

public class QueryCatalogAppRulesResponse  implements java.io.Serializable {
    private java.lang.String returnCode;

    private java.lang.String returnDescription;

    private com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny[] incompatibleProductsDestiny;

    public QueryCatalogAppRulesResponse() {
    }

    public QueryCatalogAppRulesResponse(
           java.lang.String returnCode,
           java.lang.String returnDescription,
           com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny[] incompatibleProductsDestiny) {
           this.returnCode = returnCode;
           this.returnDescription = returnDescription;
           this.incompatibleProductsDestiny = incompatibleProductsDestiny;
    }


    /**
     * Gets the returnCode value for this QueryCatalogAppRulesResponse.
     * 
     * @return returnCode
     */
    public java.lang.String getReturnCode() {
        return returnCode;
    }


    /**
     * Sets the returnCode value for this QueryCatalogAppRulesResponse.
     * 
     * @param returnCode
     */
    public void setReturnCode(java.lang.String returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * Gets the returnDescription value for this QueryCatalogAppRulesResponse.
     * 
     * @return returnDescription
     */
    public java.lang.String getReturnDescription() {
        return returnDescription;
    }


    /**
     * Sets the returnDescription value for this QueryCatalogAppRulesResponse.
     * 
     * @param returnDescription
     */
    public void setReturnDescription(java.lang.String returnDescription) {
        this.returnDescription = returnDescription;
    }


    /**
     * Gets the incompatibleProductsDestiny value for this QueryCatalogAppRulesResponse.
     * 
     * @return incompatibleProductsDestiny
     */
    public com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny[] getIncompatibleProductsDestiny() {
        return incompatibleProductsDestiny;
    }


    /**
     * Sets the incompatibleProductsDestiny value for this QueryCatalogAppRulesResponse.
     * 
     * @param incompatibleProductsDestiny
     */
    public void setIncompatibleProductsDestiny(com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny[] incompatibleProductsDestiny) {
        this.incompatibleProductsDestiny = incompatibleProductsDestiny;
    }

    public com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny getIncompatibleProductsDestiny(int i) {
        return this.incompatibleProductsDestiny[i];
    }

    public void setIncompatibleProductsDestiny(int i, com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny _value) {
        this.incompatibleProductsDestiny[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCatalogAppRulesResponse)) return false;
        QueryCatalogAppRulesResponse other = (QueryCatalogAppRulesResponse) obj;
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
            ((this.incompatibleProductsDestiny==null && other.getIncompatibleProductsDestiny()==null) || 
             (this.incompatibleProductsDestiny!=null &&
              java.util.Arrays.equals(this.incompatibleProductsDestiny, other.getIncompatibleProductsDestiny())));
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
        if (getIncompatibleProductsDestiny() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncompatibleProductsDestiny());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncompatibleProductsDestiny(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCatalogAppRulesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "queryCatalogAppRulesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "returnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "returnDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incompatibleProductsDestiny");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "incompatibleProductsDestiny"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService/types", "IncompatibleProductsDestiny"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
