/**
 * ProductOffering.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice.types;

public class ProductOffering  implements java.io.Serializable {
    private java.lang.String codOffering;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String status;

    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    private int idUser;

    private java.lang.String customerValue;

    private java.lang.String visualizationType;

    private java.lang.String typeOffering;

    private java.lang.String typeOfCharge;

    private int manyPoints;

    private int idValidation;

    private java.lang.String validationNetwork;

    private java.lang.String idNetwork;

    private java.lang.String networkCodeOffer;

    private java.lang.String productOfferingFamily;

    private java.lang.String productOfferingSubFamily;

    private java.lang.String familiarityType;

    private java.lang.String destinationType;

    private java.lang.String scheduleType;

    private java.lang.String lifeType;

    private java.lang.String consumption;

    private java.lang.String restrictions;

    private com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification[] productSpecification;

    private com.telefonica.midrange.queryproductofferingservice.types.Price[] price;

    private com.telefonica.midrange.queryproductofferingservice.types.MarketSegment[] marketSegment;

    public ProductOffering() {
    }

    public ProductOffering(
           java.lang.String codOffering,
           java.lang.String name,
           java.lang.String description,
           java.lang.String status,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           int idUser,
           java.lang.String customerValue,
           java.lang.String visualizationType,
           java.lang.String typeOffering,
           java.lang.String typeOfCharge,
           int manyPoints,
           int idValidation,
           java.lang.String validationNetwork,
           java.lang.String idNetwork,
           java.lang.String networkCodeOffer,
           java.lang.String productOfferingFamily,
           java.lang.String productOfferingSubFamily,
           java.lang.String familiarityType,
           java.lang.String destinationType,
           java.lang.String scheduleType,
           java.lang.String lifeType,
           java.lang.String consumption,
           java.lang.String restrictions,
           com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification[] productSpecification,
           com.telefonica.midrange.queryproductofferingservice.types.Price[] price,
           com.telefonica.midrange.queryproductofferingservice.types.MarketSegment[] marketSegment) {
           this.codOffering = codOffering;
           this.name = name;
           this.description = description;
           this.status = status;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.idUser = idUser;
           this.customerValue = customerValue;
           this.visualizationType = visualizationType;
           this.typeOffering = typeOffering;
           this.typeOfCharge = typeOfCharge;
           this.manyPoints = manyPoints;
           this.idValidation = idValidation;
           this.validationNetwork = validationNetwork;
           this.idNetwork = idNetwork;
           this.networkCodeOffer = networkCodeOffer;
           this.productOfferingFamily = productOfferingFamily;
           this.productOfferingSubFamily = productOfferingSubFamily;
           this.familiarityType = familiarityType;
           this.destinationType = destinationType;
           this.scheduleType = scheduleType;
           this.lifeType = lifeType;
           this.consumption = consumption;
           this.restrictions = restrictions;
           this.productSpecification = productSpecification;
           this.price = price;
           this.marketSegment = marketSegment;
    }


    /**
     * Gets the codOffering value for this ProductOffering.
     * 
     * @return codOffering
     */
    public java.lang.String getCodOffering() {
        return codOffering;
    }


    /**
     * Sets the codOffering value for this ProductOffering.
     * 
     * @param codOffering
     */
    public void setCodOffering(java.lang.String codOffering) {
        this.codOffering = codOffering;
    }


    /**
     * Gets the name value for this ProductOffering.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductOffering.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ProductOffering.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductOffering.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this ProductOffering.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductOffering.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the startDateTime value for this ProductOffering.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProductOffering.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProductOffering.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProductOffering.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the idUser value for this ProductOffering.
     * 
     * @return idUser
     */
    public int getIdUser() {
        return idUser;
    }


    /**
     * Sets the idUser value for this ProductOffering.
     * 
     * @param idUser
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


    /**
     * Gets the customerValue value for this ProductOffering.
     * 
     * @return customerValue
     */
    public java.lang.String getCustomerValue() {
        return customerValue;
    }


    /**
     * Sets the customerValue value for this ProductOffering.
     * 
     * @param customerValue
     */
    public void setCustomerValue(java.lang.String customerValue) {
        this.customerValue = customerValue;
    }


    /**
     * Gets the visualizationType value for this ProductOffering.
     * 
     * @return visualizationType
     */
    public java.lang.String getVisualizationType() {
        return visualizationType;
    }


    /**
     * Sets the visualizationType value for this ProductOffering.
     * 
     * @param visualizationType
     */
    public void setVisualizationType(java.lang.String visualizationType) {
        this.visualizationType = visualizationType;
    }


    /**
     * Gets the typeOffering value for this ProductOffering.
     * 
     * @return typeOffering
     */
    public java.lang.String getTypeOffering() {
        return typeOffering;
    }


    /**
     * Sets the typeOffering value for this ProductOffering.
     * 
     * @param typeOffering
     */
    public void setTypeOffering(java.lang.String typeOffering) {
        this.typeOffering = typeOffering;
    }


    /**
     * Gets the typeOfCharge value for this ProductOffering.
     * 
     * @return typeOfCharge
     */
    public java.lang.String getTypeOfCharge() {
        return typeOfCharge;
    }


    /**
     * Sets the typeOfCharge value for this ProductOffering.
     * 
     * @param typeOfCharge
     */
    public void setTypeOfCharge(java.lang.String typeOfCharge) {
        this.typeOfCharge = typeOfCharge;
    }


    /**
     * Gets the manyPoints value for this ProductOffering.
     * 
     * @return manyPoints
     */
    public int getManyPoints() {
        return manyPoints;
    }


    /**
     * Sets the manyPoints value for this ProductOffering.
     * 
     * @param manyPoints
     */
    public void setManyPoints(int manyPoints) {
        this.manyPoints = manyPoints;
    }


    /**
     * Gets the idValidation value for this ProductOffering.
     * 
     * @return idValidation
     */
    public int getIdValidation() {
        return idValidation;
    }


    /**
     * Sets the idValidation value for this ProductOffering.
     * 
     * @param idValidation
     */
    public void setIdValidation(int idValidation) {
        this.idValidation = idValidation;
    }


    /**
     * Gets the validationNetwork value for this ProductOffering.
     * 
     * @return validationNetwork
     */
    public java.lang.String getValidationNetwork() {
        return validationNetwork;
    }


    /**
     * Sets the validationNetwork value for this ProductOffering.
     * 
     * @param validationNetwork
     */
    public void setValidationNetwork(java.lang.String validationNetwork) {
        this.validationNetwork = validationNetwork;
    }


    /**
     * Gets the idNetwork value for this ProductOffering.
     * 
     * @return idNetwork
     */
    public java.lang.String getIdNetwork() {
        return idNetwork;
    }


    /**
     * Sets the idNetwork value for this ProductOffering.
     * 
     * @param idNetwork
     */
    public void setIdNetwork(java.lang.String idNetwork) {
        this.idNetwork = idNetwork;
    }


    /**
     * Gets the networkCodeOffer value for this ProductOffering.
     * 
     * @return networkCodeOffer
     */
    public java.lang.String getNetworkCodeOffer() {
        return networkCodeOffer;
    }


    /**
     * Sets the networkCodeOffer value for this ProductOffering.
     * 
     * @param networkCodeOffer
     */
    public void setNetworkCodeOffer(java.lang.String networkCodeOffer) {
        this.networkCodeOffer = networkCodeOffer;
    }


    /**
     * Gets the productOfferingFamily value for this ProductOffering.
     * 
     * @return productOfferingFamily
     */
    public java.lang.String getProductOfferingFamily() {
        return productOfferingFamily;
    }


    /**
     * Sets the productOfferingFamily value for this ProductOffering.
     * 
     * @param productOfferingFamily
     */
    public void setProductOfferingFamily(java.lang.String productOfferingFamily) {
        this.productOfferingFamily = productOfferingFamily;
    }


    /**
     * Gets the productOfferingSubFamily value for this ProductOffering.
     * 
     * @return productOfferingSubFamily
     */
    public java.lang.String getProductOfferingSubFamily() {
        return productOfferingSubFamily;
    }


    /**
     * Sets the productOfferingSubFamily value for this ProductOffering.
     * 
     * @param productOfferingSubFamily
     */
    public void setProductOfferingSubFamily(java.lang.String productOfferingSubFamily) {
        this.productOfferingSubFamily = productOfferingSubFamily;
    }


    /**
     * Gets the familiarityType value for this ProductOffering.
     * 
     * @return familiarityType
     */
    public java.lang.String getFamiliarityType() {
        return familiarityType;
    }


    /**
     * Sets the familiarityType value for this ProductOffering.
     * 
     * @param familiarityType
     */
    public void setFamiliarityType(java.lang.String familiarityType) {
        this.familiarityType = familiarityType;
    }


    /**
     * Gets the destinationType value for this ProductOffering.
     * 
     * @return destinationType
     */
    public java.lang.String getDestinationType() {
        return destinationType;
    }


    /**
     * Sets the destinationType value for this ProductOffering.
     * 
     * @param destinationType
     */
    public void setDestinationType(java.lang.String destinationType) {
        this.destinationType = destinationType;
    }


    /**
     * Gets the scheduleType value for this ProductOffering.
     * 
     * @return scheduleType
     */
    public java.lang.String getScheduleType() {
        return scheduleType;
    }


    /**
     * Sets the scheduleType value for this ProductOffering.
     * 
     * @param scheduleType
     */
    public void setScheduleType(java.lang.String scheduleType) {
        this.scheduleType = scheduleType;
    }


    /**
     * Gets the lifeType value for this ProductOffering.
     * 
     * @return lifeType
     */
    public java.lang.String getLifeType() {
        return lifeType;
    }


    /**
     * Sets the lifeType value for this ProductOffering.
     * 
     * @param lifeType
     */
    public void setLifeType(java.lang.String lifeType) {
        this.lifeType = lifeType;
    }


    /**
     * Gets the consumption value for this ProductOffering.
     * 
     * @return consumption
     */
    public java.lang.String getConsumption() {
        return consumption;
    }


    /**
     * Sets the consumption value for this ProductOffering.
     * 
     * @param consumption
     */
    public void setConsumption(java.lang.String consumption) {
        this.consumption = consumption;
    }


    /**
     * Gets the restrictions value for this ProductOffering.
     * 
     * @return restrictions
     */
    public java.lang.String getRestrictions() {
        return restrictions;
    }


    /**
     * Sets the restrictions value for this ProductOffering.
     * 
     * @param restrictions
     */
    public void setRestrictions(java.lang.String restrictions) {
        this.restrictions = restrictions;
    }


    /**
     * Gets the productSpecification value for this ProductOffering.
     * 
     * @return productSpecification
     */
    public com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification[] getProductSpecification() {
        return productSpecification;
    }


    /**
     * Sets the productSpecification value for this ProductOffering.
     * 
     * @param productSpecification
     */
    public void setProductSpecification(com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification[] productSpecification) {
        this.productSpecification = productSpecification;
    }

    public com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification getProductSpecification(int i) {
        return this.productSpecification[i];
    }

    public void setProductSpecification(int i, com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification _value) {
        this.productSpecification[i] = _value;
    }


    /**
     * Gets the price value for this ProductOffering.
     * 
     * @return price
     */
    public com.telefonica.midrange.queryproductofferingservice.types.Price[] getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProductOffering.
     * 
     * @param price
     */
    public void setPrice(com.telefonica.midrange.queryproductofferingservice.types.Price[] price) {
        this.price = price;
    }

    public com.telefonica.midrange.queryproductofferingservice.types.Price getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, com.telefonica.midrange.queryproductofferingservice.types.Price _value) {
        this.price[i] = _value;
    }


    /**
     * Gets the marketSegment value for this ProductOffering.
     * 
     * @return marketSegment
     */
    public com.telefonica.midrange.queryproductofferingservice.types.MarketSegment[] getMarketSegment() {
        return marketSegment;
    }


    /**
     * Sets the marketSegment value for this ProductOffering.
     * 
     * @param marketSegment
     */
    public void setMarketSegment(com.telefonica.midrange.queryproductofferingservice.types.MarketSegment[] marketSegment) {
        this.marketSegment = marketSegment;
    }

    public com.telefonica.midrange.queryproductofferingservice.types.MarketSegment getMarketSegment(int i) {
        return this.marketSegment[i];
    }

    public void setMarketSegment(int i, com.telefonica.midrange.queryproductofferingservice.types.MarketSegment _value) {
        this.marketSegment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductOffering)) return false;
        ProductOffering other = (ProductOffering) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            this.idUser == other.getIdUser() &&
            ((this.customerValue==null && other.getCustomerValue()==null) || 
             (this.customerValue!=null &&
              this.customerValue.equals(other.getCustomerValue()))) &&
            ((this.visualizationType==null && other.getVisualizationType()==null) || 
             (this.visualizationType!=null &&
              this.visualizationType.equals(other.getVisualizationType()))) &&
            ((this.typeOffering==null && other.getTypeOffering()==null) || 
             (this.typeOffering!=null &&
              this.typeOffering.equals(other.getTypeOffering()))) &&
            ((this.typeOfCharge==null && other.getTypeOfCharge()==null) || 
             (this.typeOfCharge!=null &&
              this.typeOfCharge.equals(other.getTypeOfCharge()))) &&
            this.manyPoints == other.getManyPoints() &&
            this.idValidation == other.getIdValidation() &&
            ((this.validationNetwork==null && other.getValidationNetwork()==null) || 
             (this.validationNetwork!=null &&
              this.validationNetwork.equals(other.getValidationNetwork()))) &&
            ((this.idNetwork==null && other.getIdNetwork()==null) || 
             (this.idNetwork!=null &&
              this.idNetwork.equals(other.getIdNetwork()))) &&
            ((this.networkCodeOffer==null && other.getNetworkCodeOffer()==null) || 
             (this.networkCodeOffer!=null &&
              this.networkCodeOffer.equals(other.getNetworkCodeOffer()))) &&
            ((this.productOfferingFamily==null && other.getProductOfferingFamily()==null) || 
             (this.productOfferingFamily!=null &&
              this.productOfferingFamily.equals(other.getProductOfferingFamily()))) &&
            ((this.productOfferingSubFamily==null && other.getProductOfferingSubFamily()==null) || 
             (this.productOfferingSubFamily!=null &&
              this.productOfferingSubFamily.equals(other.getProductOfferingSubFamily()))) &&
            ((this.familiarityType==null && other.getFamiliarityType()==null) || 
             (this.familiarityType!=null &&
              this.familiarityType.equals(other.getFamiliarityType()))) &&
            ((this.destinationType==null && other.getDestinationType()==null) || 
             (this.destinationType!=null &&
              this.destinationType.equals(other.getDestinationType()))) &&
            ((this.scheduleType==null && other.getScheduleType()==null) || 
             (this.scheduleType!=null &&
              this.scheduleType.equals(other.getScheduleType()))) &&
            ((this.lifeType==null && other.getLifeType()==null) || 
             (this.lifeType!=null &&
              this.lifeType.equals(other.getLifeType()))) &&
            ((this.consumption==null && other.getConsumption()==null) || 
             (this.consumption!=null &&
              this.consumption.equals(other.getConsumption()))) &&
            ((this.restrictions==null && other.getRestrictions()==null) || 
             (this.restrictions!=null &&
              this.restrictions.equals(other.getRestrictions()))) &&
            ((this.productSpecification==null && other.getProductSpecification()==null) || 
             (this.productSpecification!=null &&
              java.util.Arrays.equals(this.productSpecification, other.getProductSpecification()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              java.util.Arrays.equals(this.price, other.getPrice()))) &&
            ((this.marketSegment==null && other.getMarketSegment()==null) || 
             (this.marketSegment!=null &&
              java.util.Arrays.equals(this.marketSegment, other.getMarketSegment())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        _hashCode += getIdUser();
        if (getCustomerValue() != null) {
            _hashCode += getCustomerValue().hashCode();
        }
        if (getVisualizationType() != null) {
            _hashCode += getVisualizationType().hashCode();
        }
        if (getTypeOffering() != null) {
            _hashCode += getTypeOffering().hashCode();
        }
        if (getTypeOfCharge() != null) {
            _hashCode += getTypeOfCharge().hashCode();
        }
        _hashCode += getManyPoints();
        _hashCode += getIdValidation();
        if (getValidationNetwork() != null) {
            _hashCode += getValidationNetwork().hashCode();
        }
        if (getIdNetwork() != null) {
            _hashCode += getIdNetwork().hashCode();
        }
        if (getNetworkCodeOffer() != null) {
            _hashCode += getNetworkCodeOffer().hashCode();
        }
        if (getProductOfferingFamily() != null) {
            _hashCode += getProductOfferingFamily().hashCode();
        }
        if (getProductOfferingSubFamily() != null) {
            _hashCode += getProductOfferingSubFamily().hashCode();
        }
        if (getFamiliarityType() != null) {
            _hashCode += getFamiliarityType().hashCode();
        }
        if (getDestinationType() != null) {
            _hashCode += getDestinationType().hashCode();
        }
        if (getScheduleType() != null) {
            _hashCode += getScheduleType().hashCode();
        }
        if (getLifeType() != null) {
            _hashCode += getLifeType().hashCode();
        }
        if (getConsumption() != null) {
            _hashCode += getConsumption().hashCode();
        }
        if (getRestrictions() != null) {
            _hashCode += getRestrictions().hashCode();
        }
        if (getProductSpecification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductSpecification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductSpecification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMarketSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketSegment(), i);
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
        new org.apache.axis.description.TypeDesc(ProductOffering.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductOffering"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "codOffering"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "idUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "customerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "visualizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "typeOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "typeOfCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manyPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "manyPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "idValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "validationNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "idNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkCodeOffer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "networkCodeOffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "productOfferingFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingSubFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "productOfferingSubFamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familiarityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "familiarityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "destinationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "scheduleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "lifeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "consumption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "restrictions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "productSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "ProductSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "marketSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice/types", "MarketSegment"));
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
