/**
 * FindProductOfferingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.findproductofferingservice.types;

public class FindProductOfferingRequest  implements java.io.Serializable {
    private java.lang.String codOffering;

    private java.lang.String productOfferingName;

    private java.lang.Integer visualizacionType;

    private java.lang.Integer productOfferingStatus;

    private java.lang.String productOfferingStartDateTime;

    private java.lang.String productOfferingEndDateTime;

    private java.lang.Integer salesChannelId;

    private java.lang.String codProductSpecification;

    private java.lang.Integer productSpecificationStatus;

    private java.lang.Integer productSpecificationFamily;

    private java.lang.Integer productSpecificationSubFamily;

    private java.lang.String productSpecificationTechnology;

    private java.lang.Integer productSpecificationUnitType;

    private java.lang.Integer typeDestination;

    private java.lang.String supplementaryService;

    private java.lang.Long priceLowerValue;

    private java.lang.Long priceUpperValue;

    private java.lang.String moneyType;

    private java.lang.Integer marketSegmentId;

    private java.lang.Integer customerValue;

    private java.lang.String idNetwork;

    private java.lang.Integer familiarityType;

    private java.lang.String responsePageUnit;

    private java.lang.String responsePageLowerValue;

    private java.lang.String responsePageAmount;

    public FindProductOfferingRequest() {
    }

    public FindProductOfferingRequest(
           java.lang.String codOffering,
           java.lang.String productOfferingName,
           java.lang.Integer visualizacionType,
           java.lang.Integer productOfferingStatus,
           java.lang.String productOfferingStartDateTime,
           java.lang.String productOfferingEndDateTime,
           java.lang.Integer salesChannelId,
           java.lang.String codProductSpecification,
           java.lang.Integer productSpecificationStatus,
           java.lang.Integer productSpecificationFamily,
           java.lang.Integer productSpecificationSubFamily,
           java.lang.String productSpecificationTechnology,
           java.lang.Integer productSpecificationUnitType,
           java.lang.Integer typeDestination,
           java.lang.String supplementaryService,
           java.lang.Long priceLowerValue,
           java.lang.Long priceUpperValue,
           java.lang.String moneyType,
           java.lang.Integer marketSegmentId,
           java.lang.Integer customerValue,
           java.lang.String idNetwork,
           java.lang.Integer familiarityType,
           java.lang.String responsePageUnit,
           java.lang.String responsePageLowerValue,
           java.lang.String responsePageAmount) {
           this.codOffering = codOffering;
           this.productOfferingName = productOfferingName;
           this.visualizacionType = visualizacionType;
           this.productOfferingStatus = productOfferingStatus;
           this.productOfferingStartDateTime = productOfferingStartDateTime;
           this.productOfferingEndDateTime = productOfferingEndDateTime;
           this.salesChannelId = salesChannelId;
           this.codProductSpecification = codProductSpecification;
           this.productSpecificationStatus = productSpecificationStatus;
           this.productSpecificationFamily = productSpecificationFamily;
           this.productSpecificationSubFamily = productSpecificationSubFamily;
           this.productSpecificationTechnology = productSpecificationTechnology;
           this.productSpecificationUnitType = productSpecificationUnitType;
           this.typeDestination = typeDestination;
           this.supplementaryService = supplementaryService;
           this.priceLowerValue = priceLowerValue;
           this.priceUpperValue = priceUpperValue;
           this.moneyType = moneyType;
           this.marketSegmentId = marketSegmentId;
           this.customerValue = customerValue;
           this.idNetwork = idNetwork;
           this.familiarityType = familiarityType;
           this.responsePageUnit = responsePageUnit;
           this.responsePageLowerValue = responsePageLowerValue;
           this.responsePageAmount = responsePageAmount;
    }


    /**
     * Gets the codOffering value for this FindProductOfferingRequest.
     * 
     * @return codOffering
     */
    public java.lang.String getCodOffering() {
        return codOffering;
    }


    /**
     * Sets the codOffering value for this FindProductOfferingRequest.
     * 
     * @param codOffering
     */
    public void setCodOffering(java.lang.String codOffering) {
        this.codOffering = codOffering;
    }


    /**
     * Gets the productOfferingName value for this FindProductOfferingRequest.
     * 
     * @return productOfferingName
     */
    public java.lang.String getProductOfferingName() {
        return productOfferingName;
    }


    /**
     * Sets the productOfferingName value for this FindProductOfferingRequest.
     * 
     * @param productOfferingName
     */
    public void setProductOfferingName(java.lang.String productOfferingName) {
        this.productOfferingName = productOfferingName;
    }


    /**
     * Gets the visualizacionType value for this FindProductOfferingRequest.
     * 
     * @return visualizacionType
     */
    public java.lang.Integer getVisualizacionType() {
        return visualizacionType;
    }


    /**
     * Sets the visualizacionType value for this FindProductOfferingRequest.
     * 
     * @param visualizacionType
     */
    public void setVisualizacionType(java.lang.Integer visualizacionType) {
        this.visualizacionType = visualizacionType;
    }


    /**
     * Gets the productOfferingStatus value for this FindProductOfferingRequest.
     * 
     * @return productOfferingStatus
     */
    public java.lang.Integer getProductOfferingStatus() {
        return productOfferingStatus;
    }


    /**
     * Sets the productOfferingStatus value for this FindProductOfferingRequest.
     * 
     * @param productOfferingStatus
     */
    public void setProductOfferingStatus(java.lang.Integer productOfferingStatus) {
        this.productOfferingStatus = productOfferingStatus;
    }


    /**
     * Gets the productOfferingStartDateTime value for this FindProductOfferingRequest.
     * 
     * @return productOfferingStartDateTime
     */
    public java.lang.String getProductOfferingStartDateTime() {
        return productOfferingStartDateTime;
    }


    /**
     * Sets the productOfferingStartDateTime value for this FindProductOfferingRequest.
     * 
     * @param productOfferingStartDateTime
     */
    public void setProductOfferingStartDateTime(java.lang.String productOfferingStartDateTime) {
        this.productOfferingStartDateTime = productOfferingStartDateTime;
    }


    /**
     * Gets the productOfferingEndDateTime value for this FindProductOfferingRequest.
     * 
     * @return productOfferingEndDateTime
     */
    public java.lang.String getProductOfferingEndDateTime() {
        return productOfferingEndDateTime;
    }


    /**
     * Sets the productOfferingEndDateTime value for this FindProductOfferingRequest.
     * 
     * @param productOfferingEndDateTime
     */
    public void setProductOfferingEndDateTime(java.lang.String productOfferingEndDateTime) {
        this.productOfferingEndDateTime = productOfferingEndDateTime;
    }


    /**
     * Gets the salesChannelId value for this FindProductOfferingRequest.
     * 
     * @return salesChannelId
     */
    public java.lang.Integer getSalesChannelId() {
        return salesChannelId;
    }


    /**
     * Sets the salesChannelId value for this FindProductOfferingRequest.
     * 
     * @param salesChannelId
     */
    public void setSalesChannelId(java.lang.Integer salesChannelId) {
        this.salesChannelId = salesChannelId;
    }


    /**
     * Gets the codProductSpecification value for this FindProductOfferingRequest.
     * 
     * @return codProductSpecification
     */
    public java.lang.String getCodProductSpecification() {
        return codProductSpecification;
    }


    /**
     * Sets the codProductSpecification value for this FindProductOfferingRequest.
     * 
     * @param codProductSpecification
     */
    public void setCodProductSpecification(java.lang.String codProductSpecification) {
        this.codProductSpecification = codProductSpecification;
    }


    /**
     * Gets the productSpecificationStatus value for this FindProductOfferingRequest.
     * 
     * @return productSpecificationStatus
     */
    public java.lang.Integer getProductSpecificationStatus() {
        return productSpecificationStatus;
    }


    /**
     * Sets the productSpecificationStatus value for this FindProductOfferingRequest.
     * 
     * @param productSpecificationStatus
     */
    public void setProductSpecificationStatus(java.lang.Integer productSpecificationStatus) {
        this.productSpecificationStatus = productSpecificationStatus;
    }


    /**
     * Gets the productSpecificationFamily value for this FindProductOfferingRequest.
     * 
     * @return productSpecificationFamily
     */
    public java.lang.Integer getProductSpecificationFamily() {
        return productSpecificationFamily;
    }


    /**
     * Sets the productSpecificationFamily value for this FindProductOfferingRequest.
     * 
     * @param productSpecificationFamily
     */
    public void setProductSpecificationFamily(java.lang.Integer productSpecificationFamily) {
        this.productSpecificationFamily = productSpecificationFamily;
    }


    /**
     * Gets the productSpecificationSubFamily value for this FindProductOfferingRequest.
     * 
     * @return productSpecificationSubFamily
     */
    public java.lang.Integer getProductSpecificationSubFamily() {
        return productSpecificationSubFamily;
    }


    /**
     * Sets the productSpecificationSubFamily value for this FindProductOfferingRequest.
     * 
     * @param productSpecificationSubFamily
     */
    public void setProductSpecificationSubFamily(java.lang.Integer productSpecificationSubFamily) {
        this.productSpecificationSubFamily = productSpecificationSubFamily;
    }


    /**
     * Gets the productSpecificationTechnology value for this FindProductOfferingRequest.
     * 
     * @return productSpecificationTechnology
     */
    public java.lang.String getProductSpecificationTechnology() {
        return productSpecificationTechnology;
    }


    /**
     * Sets the productSpecificationTechnology value for this FindProductOfferingRequest.
     * 
     * @param productSpecificationTechnology
     */
    public void setProductSpecificationTechnology(java.lang.String productSpecificationTechnology) {
        this.productSpecificationTechnology = productSpecificationTechnology;
    }


    /**
     * Gets the productSpecificationUnitType value for this FindProductOfferingRequest.
     * 
     * @return productSpecificationUnitType
     */
    public java.lang.Integer getProductSpecificationUnitType() {
        return productSpecificationUnitType;
    }


    /**
     * Sets the productSpecificationUnitType value for this FindProductOfferingRequest.
     * 
     * @param productSpecificationUnitType
     */
    public void setProductSpecificationUnitType(java.lang.Integer productSpecificationUnitType) {
        this.productSpecificationUnitType = productSpecificationUnitType;
    }


    /**
     * Gets the typeDestination value for this FindProductOfferingRequest.
     * 
     * @return typeDestination
     */
    public java.lang.Integer getTypeDestination() {
        return typeDestination;
    }


    /**
     * Sets the typeDestination value for this FindProductOfferingRequest.
     * 
     * @param typeDestination
     */
    public void setTypeDestination(java.lang.Integer typeDestination) {
        this.typeDestination = typeDestination;
    }


    /**
     * Gets the supplementaryService value for this FindProductOfferingRequest.
     * 
     * @return supplementaryService
     */
    public java.lang.String getSupplementaryService() {
        return supplementaryService;
    }


    /**
     * Sets the supplementaryService value for this FindProductOfferingRequest.
     * 
     * @param supplementaryService
     */
    public void setSupplementaryService(java.lang.String supplementaryService) {
        this.supplementaryService = supplementaryService;
    }


    /**
     * Gets the priceLowerValue value for this FindProductOfferingRequest.
     * 
     * @return priceLowerValue
     */
    public java.lang.Long getPriceLowerValue() {
        return priceLowerValue;
    }


    /**
     * Sets the priceLowerValue value for this FindProductOfferingRequest.
     * 
     * @param priceLowerValue
     */
    public void setPriceLowerValue(java.lang.Long priceLowerValue) {
        this.priceLowerValue = priceLowerValue;
    }


    /**
     * Gets the priceUpperValue value for this FindProductOfferingRequest.
     * 
     * @return priceUpperValue
     */
    public java.lang.Long getPriceUpperValue() {
        return priceUpperValue;
    }


    /**
     * Sets the priceUpperValue value for this FindProductOfferingRequest.
     * 
     * @param priceUpperValue
     */
    public void setPriceUpperValue(java.lang.Long priceUpperValue) {
        this.priceUpperValue = priceUpperValue;
    }


    /**
     * Gets the moneyType value for this FindProductOfferingRequest.
     * 
     * @return moneyType
     */
    public java.lang.String getMoneyType() {
        return moneyType;
    }


    /**
     * Sets the moneyType value for this FindProductOfferingRequest.
     * 
     * @param moneyType
     */
    public void setMoneyType(java.lang.String moneyType) {
        this.moneyType = moneyType;
    }


    /**
     * Gets the marketSegmentId value for this FindProductOfferingRequest.
     * 
     * @return marketSegmentId
     */
    public java.lang.Integer getMarketSegmentId() {
        return marketSegmentId;
    }


    /**
     * Sets the marketSegmentId value for this FindProductOfferingRequest.
     * 
     * @param marketSegmentId
     */
    public void setMarketSegmentId(java.lang.Integer marketSegmentId) {
        this.marketSegmentId = marketSegmentId;
    }


    /**
     * Gets the customerValue value for this FindProductOfferingRequest.
     * 
     * @return customerValue
     */
    public java.lang.Integer getCustomerValue() {
        return customerValue;
    }


    /**
     * Sets the customerValue value for this FindProductOfferingRequest.
     * 
     * @param customerValue
     */
    public void setCustomerValue(java.lang.Integer customerValue) {
        this.customerValue = customerValue;
    }


    /**
     * Gets the idNetwork value for this FindProductOfferingRequest.
     * 
     * @return idNetwork
     */
    public java.lang.String getIdNetwork() {
        return idNetwork;
    }


    /**
     * Sets the idNetwork value for this FindProductOfferingRequest.
     * 
     * @param idNetwork
     */
    public void setIdNetwork(java.lang.String idNetwork) {
        this.idNetwork = idNetwork;
    }


    /**
     * Gets the familiarityType value for this FindProductOfferingRequest.
     * 
     * @return familiarityType
     */
    public java.lang.Integer getFamiliarityType() {
        return familiarityType;
    }


    /**
     * Sets the familiarityType value for this FindProductOfferingRequest.
     * 
     * @param familiarityType
     */
    public void setFamiliarityType(java.lang.Integer familiarityType) {
        this.familiarityType = familiarityType;
    }


    /**
     * Gets the responsePageUnit value for this FindProductOfferingRequest.
     * 
     * @return responsePageUnit
     */
    public java.lang.String getResponsePageUnit() {
        return responsePageUnit;
    }


    /**
     * Sets the responsePageUnit value for this FindProductOfferingRequest.
     * 
     * @param responsePageUnit
     */
    public void setResponsePageUnit(java.lang.String responsePageUnit) {
        this.responsePageUnit = responsePageUnit;
    }


    /**
     * Gets the responsePageLowerValue value for this FindProductOfferingRequest.
     * 
     * @return responsePageLowerValue
     */
    public java.lang.String getResponsePageLowerValue() {
        return responsePageLowerValue;
    }


    /**
     * Sets the responsePageLowerValue value for this FindProductOfferingRequest.
     * 
     * @param responsePageLowerValue
     */
    public void setResponsePageLowerValue(java.lang.String responsePageLowerValue) {
        this.responsePageLowerValue = responsePageLowerValue;
    }


    /**
     * Gets the responsePageAmount value for this FindProductOfferingRequest.
     * 
     * @return responsePageAmount
     */
    public java.lang.String getResponsePageAmount() {
        return responsePageAmount;
    }


    /**
     * Sets the responsePageAmount value for this FindProductOfferingRequest.
     * 
     * @param responsePageAmount
     */
    public void setResponsePageAmount(java.lang.String responsePageAmount) {
        this.responsePageAmount = responsePageAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindProductOfferingRequest)) return false;
        FindProductOfferingRequest other = (FindProductOfferingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codOffering==null && other.getCodOffering()==null) || 
             (this.codOffering!=null &&
              this.codOffering.equals(other.getCodOffering()))) &&
            ((this.productOfferingName==null && other.getProductOfferingName()==null) || 
             (this.productOfferingName!=null &&
              this.productOfferingName.equals(other.getProductOfferingName()))) &&
            ((this.visualizacionType==null && other.getVisualizacionType()==null) || 
             (this.visualizacionType!=null &&
              this.visualizacionType.equals(other.getVisualizacionType()))) &&
            ((this.productOfferingStatus==null && other.getProductOfferingStatus()==null) || 
             (this.productOfferingStatus!=null &&
              this.productOfferingStatus.equals(other.getProductOfferingStatus()))) &&
            ((this.productOfferingStartDateTime==null && other.getProductOfferingStartDateTime()==null) || 
             (this.productOfferingStartDateTime!=null &&
              this.productOfferingStartDateTime.equals(other.getProductOfferingStartDateTime()))) &&
            ((this.productOfferingEndDateTime==null && other.getProductOfferingEndDateTime()==null) || 
             (this.productOfferingEndDateTime!=null &&
              this.productOfferingEndDateTime.equals(other.getProductOfferingEndDateTime()))) &&
            ((this.salesChannelId==null && other.getSalesChannelId()==null) || 
             (this.salesChannelId!=null &&
              this.salesChannelId.equals(other.getSalesChannelId()))) &&
            ((this.codProductSpecification==null && other.getCodProductSpecification()==null) || 
             (this.codProductSpecification!=null &&
              this.codProductSpecification.equals(other.getCodProductSpecification()))) &&
            ((this.productSpecificationStatus==null && other.getProductSpecificationStatus()==null) || 
             (this.productSpecificationStatus!=null &&
              this.productSpecificationStatus.equals(other.getProductSpecificationStatus()))) &&
            ((this.productSpecificationFamily==null && other.getProductSpecificationFamily()==null) || 
             (this.productSpecificationFamily!=null &&
              this.productSpecificationFamily.equals(other.getProductSpecificationFamily()))) &&
            ((this.productSpecificationSubFamily==null && other.getProductSpecificationSubFamily()==null) || 
             (this.productSpecificationSubFamily!=null &&
              this.productSpecificationSubFamily.equals(other.getProductSpecificationSubFamily()))) &&
            ((this.productSpecificationTechnology==null && other.getProductSpecificationTechnology()==null) || 
             (this.productSpecificationTechnology!=null &&
              this.productSpecificationTechnology.equals(other.getProductSpecificationTechnology()))) &&
            ((this.productSpecificationUnitType==null && other.getProductSpecificationUnitType()==null) || 
             (this.productSpecificationUnitType!=null &&
              this.productSpecificationUnitType.equals(other.getProductSpecificationUnitType()))) &&
            ((this.typeDestination==null && other.getTypeDestination()==null) || 
             (this.typeDestination!=null &&
              this.typeDestination.equals(other.getTypeDestination()))) &&
            ((this.supplementaryService==null && other.getSupplementaryService()==null) || 
             (this.supplementaryService!=null &&
              this.supplementaryService.equals(other.getSupplementaryService()))) &&
            ((this.priceLowerValue==null && other.getPriceLowerValue()==null) || 
             (this.priceLowerValue!=null &&
              this.priceLowerValue.equals(other.getPriceLowerValue()))) &&
            ((this.priceUpperValue==null && other.getPriceUpperValue()==null) || 
             (this.priceUpperValue!=null &&
              this.priceUpperValue.equals(other.getPriceUpperValue()))) &&
            ((this.moneyType==null && other.getMoneyType()==null) || 
             (this.moneyType!=null &&
              this.moneyType.equals(other.getMoneyType()))) &&
            ((this.marketSegmentId==null && other.getMarketSegmentId()==null) || 
             (this.marketSegmentId!=null &&
              this.marketSegmentId.equals(other.getMarketSegmentId()))) &&
            ((this.customerValue==null && other.getCustomerValue()==null) || 
             (this.customerValue!=null &&
              this.customerValue.equals(other.getCustomerValue()))) &&
            ((this.idNetwork==null && other.getIdNetwork()==null) || 
             (this.idNetwork!=null &&
              this.idNetwork.equals(other.getIdNetwork()))) &&
            ((this.familiarityType==null && other.getFamiliarityType()==null) || 
             (this.familiarityType!=null &&
              this.familiarityType.equals(other.getFamiliarityType()))) &&
            ((this.responsePageUnit==null && other.getResponsePageUnit()==null) || 
             (this.responsePageUnit!=null &&
              this.responsePageUnit.equals(other.getResponsePageUnit()))) &&
            ((this.responsePageLowerValue==null && other.getResponsePageLowerValue()==null) || 
             (this.responsePageLowerValue!=null &&
              this.responsePageLowerValue.equals(other.getResponsePageLowerValue()))) &&
            ((this.responsePageAmount==null && other.getResponsePageAmount()==null) || 
             (this.responsePageAmount!=null &&
              this.responsePageAmount.equals(other.getResponsePageAmount())));
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
        if (getCodOffering() != null) {
            _hashCode += getCodOffering().hashCode();
        }
        if (getProductOfferingName() != null) {
            _hashCode += getProductOfferingName().hashCode();
        }
        if (getVisualizacionType() != null) {
            _hashCode += getVisualizacionType().hashCode();
        }
        if (getProductOfferingStatus() != null) {
            _hashCode += getProductOfferingStatus().hashCode();
        }
        if (getProductOfferingStartDateTime() != null) {
            _hashCode += getProductOfferingStartDateTime().hashCode();
        }
        if (getProductOfferingEndDateTime() != null) {
            _hashCode += getProductOfferingEndDateTime().hashCode();
        }
        if (getSalesChannelId() != null) {
            _hashCode += getSalesChannelId().hashCode();
        }
        if (getCodProductSpecification() != null) {
            _hashCode += getCodProductSpecification().hashCode();
        }
        if (getProductSpecificationStatus() != null) {
            _hashCode += getProductSpecificationStatus().hashCode();
        }
        if (getProductSpecificationFamily() != null) {
            _hashCode += getProductSpecificationFamily().hashCode();
        }
        if (getProductSpecificationSubFamily() != null) {
            _hashCode += getProductSpecificationSubFamily().hashCode();
        }
        if (getProductSpecificationTechnology() != null) {
            _hashCode += getProductSpecificationTechnology().hashCode();
        }
        if (getProductSpecificationUnitType() != null) {
            _hashCode += getProductSpecificationUnitType().hashCode();
        }
        if (getTypeDestination() != null) {
            _hashCode += getTypeDestination().hashCode();
        }
        if (getSupplementaryService() != null) {
            _hashCode += getSupplementaryService().hashCode();
        }
        if (getPriceLowerValue() != null) {
            _hashCode += getPriceLowerValue().hashCode();
        }
        if (getPriceUpperValue() != null) {
            _hashCode += getPriceUpperValue().hashCode();
        }
        if (getMoneyType() != null) {
            _hashCode += getMoneyType().hashCode();
        }
        if (getMarketSegmentId() != null) {
            _hashCode += getMarketSegmentId().hashCode();
        }
        if (getCustomerValue() != null) {
            _hashCode += getCustomerValue().hashCode();
        }
        if (getIdNetwork() != null) {
            _hashCode += getIdNetwork().hashCode();
        }
        if (getFamiliarityType() != null) {
            _hashCode += getFamiliarityType().hashCode();
        }
        if (getResponsePageUnit() != null) {
            _hashCode += getResponsePageUnit().hashCode();
        }
        if (getResponsePageLowerValue() != null) {
            _hashCode += getResponsePageLowerValue().hashCode();
        }
        if (getResponsePageAmount() != null) {
            _hashCode += getResponsePageAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindProductOfferingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "findProductOfferingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "codOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productOfferingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizacionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "visualizacionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productOfferingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productOfferingStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productOfferingEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesChannelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "salesChannelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codProductSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "codProductSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productSpecificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productSpecificationFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationSubFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productSpecificationSubFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationTechnology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productSpecificationTechnology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecificationUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "productSpecificationUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "typeDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplementaryService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "supplementaryService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLowerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "priceLowerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUpperValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "priceUpperValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "moneyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketSegmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "marketSegmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "customerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "idNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familiarityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "familiarityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsePageUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "ResponsePageUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsePageLowerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "ResponsePageLowerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsePageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "ResponsePageAmount"));
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
