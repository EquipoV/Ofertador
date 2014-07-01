/**
 * Price.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice.types;

public class Price  implements java.io.Serializable {
    private java.lang.String supplementaryService;

    private int price;

    private java.lang.String billingName;

    private int billableConcept;

    private java.lang.String appraisalCode;

    private java.lang.String offerDiscount;

    private java.lang.String moneyType;

    private com.telefonica.midrange.queryproductofferingservice.types.Channel[] channel;

    public Price() {
    }

    public Price(
           java.lang.String supplementaryService,
           int price,
           java.lang.String billingName,
           int billableConcept,
           java.lang.String appraisalCode,
           java.lang.String offerDiscount,
           java.lang.String moneyType,
           com.telefonica.midrange.queryproductofferingservice.types.Channel[] channel) {
           this.supplementaryService = supplementaryService;
           this.price = price;
           this.billingName = billingName;
           this.billableConcept = billableConcept;
           this.appraisalCode = appraisalCode;
           this.offerDiscount = offerDiscount;
           this.moneyType = moneyType;
           this.channel = channel;
    }


    /**
     * Gets the supplementaryService value for this Price.
     * 
     * @return supplementaryService
     */
    public java.lang.String getSupplementaryService() {
        return supplementaryService;
    }


    /**
     * Sets the supplementaryService value for this Price.
     * 
     * @param supplementaryService
     */
    public void setSupplementaryService(java.lang.String supplementaryService) {
        this.supplementaryService = supplementaryService;
    }


    /**
     * Gets the price value for this Price.
     * 
     * @return price
     */
    public int getPrice() {
        return price;
    }


    /**
     * Sets the price value for this Price.
     * 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    /**
     * Gets the billingName value for this Price.
     * 
     * @return billingName
     */
    public java.lang.String getBillingName() {
        return billingName;
    }


    /**
     * Sets the billingName value for this Price.
     * 
     * @param billingName
     */
    public void setBillingName(java.lang.String billingName) {
        this.billingName = billingName;
    }


    /**
     * Gets the billableConcept value for this Price.
     * 
     * @return billableConcept
     */
    public int getBillableConcept() {
        return billableConcept;
    }


    /**
     * Sets the billableConcept value for this Price.
     * 
     * @param billableConcept
     */
    public void setBillableConcept(int billableConcept) {
        this.billableConcept = billableConcept;
    }


    /**
     * Gets the appraisalCode value for this Price.
     * 
     * @return appraisalCode
     */
    public java.lang.String getAppraisalCode() {
        return appraisalCode;
    }


    /**
     * Sets the appraisalCode value for this Price.
     * 
     * @param appraisalCode
     */
    public void setAppraisalCode(java.lang.String appraisalCode) {
        this.appraisalCode = appraisalCode;
    }


    /**
     * Gets the offerDiscount value for this Price.
     * 
     * @return offerDiscount
     */
    public java.lang.String getOfferDiscount() {
        return offerDiscount;
    }


    /**
     * Sets the offerDiscount value for this Price.
     * 
     * @param offerDiscount
     */
    public void setOfferDiscount(java.lang.String offerDiscount) {
        this.offerDiscount = offerDiscount;
    }


    /**
     * Gets the moneyType value for this Price.
     * 
     * @return moneyType
     */
    public java.lang.String getMoneyType() {
        return moneyType;
    }


    /**
     * Sets the moneyType value for this Price.
     * 
     * @param moneyType
     */
    public void setMoneyType(java.lang.String moneyType) {
        this.moneyType = moneyType;
    }


    /**
     * Gets the channel value for this Price.
     * 
     * @return channel
     */
    public com.telefonica.midrange.queryproductofferingservice.types.Channel[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Price.
     * 
     * @param channel
     */
    public void setChannel(com.telefonica.midrange.queryproductofferingservice.types.Channel[] channel) {
        this.channel = channel;
    }

    public com.telefonica.midrange.queryproductofferingservice.types.Channel getChannel(int i) {
        return this.channel[i];
    }

    public void setChannel(int i, com.telefonica.midrange.queryproductofferingservice.types.Channel _value) {
        this.channel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Price)) return false;
        Price other = (Price) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supplementaryService==null && other.getSupplementaryService()==null) || 
             (this.supplementaryService!=null &&
              this.supplementaryService.equals(other.getSupplementaryService()))) &&
            this.price == other.getPrice() &&
            ((this.billingName==null && other.getBillingName()==null) || 
             (this.billingName!=null &&
              this.billingName.equals(other.getBillingName()))) &&
            this.billableConcept == other.getBillableConcept() &&
            ((this.appraisalCode==null && other.getAppraisalCode()==null) || 
             (this.appraisalCode!=null &&
              this.appraisalCode.equals(other.getAppraisalCode()))) &&
            ((this.offerDiscount==null && other.getOfferDiscount()==null) || 
             (this.offerDiscount!=null &&
              this.offerDiscount.equals(other.getOfferDiscount()))) &&
            ((this.moneyType==null && other.getMoneyType()==null) || 
             (this.moneyType!=null &&
              this.moneyType.equals(other.getMoneyType()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel())));
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
        if (getSupplementaryService() != null) {
            _hashCode += getSupplementaryService().hashCode();
        }
        _hashCode += getPrice();
        if (getBillingName() != null) {
            _hashCode += getBillingName().hashCode();
        }
        _hashCode += getBillableConcept();
        if (getAppraisalCode() != null) {
            _hashCode += getAppraisalCode().hashCode();
        }
        if (getOfferDiscount() != null) {
            _hashCode += getOfferDiscount().hashCode();
        }
        if (getMoneyType() != null) {
            _hashCode += getMoneyType().hashCode();
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
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
        new org.apache.axis.description.TypeDesc(Price.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "Price"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "supplementaryService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "billingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableConcept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "billableConcept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appraisalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "appraisalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "offerDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "moneyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "Channel"));
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
