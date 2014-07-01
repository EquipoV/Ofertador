/**
 * ProductSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice.types;

public class ProductSpecification  implements java.io.Serializable {
    private java.lang.String codProduct;

    private java.lang.String name;

    private java.lang.String status;

    private com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic[] productSpecificationCharacteristic;

    public ProductSpecification() {
    }

    public ProductSpecification(
           java.lang.String codProduct,
           java.lang.String name,
           java.lang.String status,
           com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic[] productSpecificationCharacteristic) {
           this.codProduct = codProduct;
           this.name = name;
           this.status = status;
           this.productSpecificationCharacteristic = productSpecificationCharacteristic;
    }


    /**
     * Gets the codProduct value for this ProductSpecification.
     * 
     * @return codProduct
     */
    public java.lang.String getCodProduct() {
        return codProduct;
    }


    /**
     * Sets the codProduct value for this ProductSpecification.
     * 
     * @param codProduct
     */
    public void setCodProduct(java.lang.String codProduct) {
        this.codProduct = codProduct;
    }


    /**
     * Gets the name value for this ProductSpecification.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductSpecification.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ProductSpecification.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductSpecification.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the productSpecificationCharacteristic value for this ProductSpecification.
     * 
     * @return productSpecificationCharacteristic
     */
    public com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic[] getProductSpecificationCharacteristic() {
        return productSpecificationCharacteristic;
    }


    /**
     * Sets the productSpecificationCharacteristic value for this ProductSpecification.
     * 
     * @param productSpecificationCharacteristic
     */
    public void setProductSpecificationCharacteristic(com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic[] productSpecificationCharacteristic) {
        this.productSpecificationCharacteristic = productSpecificationCharacteristic;
    }

    public com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic getProductSpecificationCharacteristic(int i) {
        return this.productSpecificationCharacteristic[i];
    }

    public void setProductSpecificationCharacteristic(int i, com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic _value) {
        this.productSpecificationCharacteristic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSpecification)) return false;
        ProductSpecification other = (ProductSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codProduct==null && other.getCodProduct()==null) || 
             (this.codProduct!=null &&
              this.codProduct.equals(other.getCodProduct()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.productSpecificationCharacteristic==null && other.getProductSpecificationCharacteristic()==null) || 
             (this.productSpecificationCharacteristic!=null &&
              java.util.Arrays.equals(this.productSpecificationCharacteristic, other.getProductSpecificationCharacteristic())));
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
        if (getCodProduct() != null) {
            _hashCode += getCodProduct().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProductSpecificationCharacteristic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductSpecificationCharacteristic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductSpecificationCharacteristic(), i);
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
        new org.apache.axis.description.TypeDesc(ProductSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "codProduct"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationCharacteristic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "productSpecificationCharacteristic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductSpecificationCharacteristic"));
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
