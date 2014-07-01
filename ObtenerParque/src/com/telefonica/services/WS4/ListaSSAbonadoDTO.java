/**
 * ListaSSAbonadoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.services.WS4;

public class ListaSSAbonadoDTO  implements java.io.Serializable {
    private java.lang.String codigoConceptoCargo;

    private java.lang.String codigoSS;

    private java.lang.String codigoServicio;

    private java.lang.String descripcionMoneda;

    private java.lang.String descripcionServicio;

    private java.lang.String importeCargo;

    private java.lang.String indicadorObligatoriedad;

    private java.lang.String nivel;

    public ListaSSAbonadoDTO() {
    }

    public ListaSSAbonadoDTO(
           java.lang.String codigoConceptoCargo,
           java.lang.String codigoSS,
           java.lang.String codigoServicio,
           java.lang.String descripcionMoneda,
           java.lang.String descripcionServicio,
           java.lang.String importeCargo,
           java.lang.String indicadorObligatoriedad,
           java.lang.String nivel) {
           this.codigoConceptoCargo = codigoConceptoCargo;
           this.codigoSS = codigoSS;
           this.codigoServicio = codigoServicio;
           this.descripcionMoneda = descripcionMoneda;
           this.descripcionServicio = descripcionServicio;
           this.importeCargo = importeCargo;
           this.indicadorObligatoriedad = indicadorObligatoriedad;
           this.nivel = nivel;
    }


    /**
     * Gets the codigoConceptoCargo value for this ListaSSAbonadoDTO.
     * 
     * @return codigoConceptoCargo
     */
    public java.lang.String getCodigoConceptoCargo() {
        return codigoConceptoCargo;
    }


    /**
     * Sets the codigoConceptoCargo value for this ListaSSAbonadoDTO.
     * 
     * @param codigoConceptoCargo
     */
    public void setCodigoConceptoCargo(java.lang.String codigoConceptoCargo) {
        this.codigoConceptoCargo = codigoConceptoCargo;
    }


    /**
     * Gets the codigoSS value for this ListaSSAbonadoDTO.
     * 
     * @return codigoSS
     */
    public java.lang.String getCodigoSS() {
        return codigoSS;
    }


    /**
     * Sets the codigoSS value for this ListaSSAbonadoDTO.
     * 
     * @param codigoSS
     */
    public void setCodigoSS(java.lang.String codigoSS) {
        this.codigoSS = codigoSS;
    }


    /**
     * Gets the codigoServicio value for this ListaSSAbonadoDTO.
     * 
     * @return codigoServicio
     */
    public java.lang.String getCodigoServicio() {
        return codigoServicio;
    }


    /**
     * Sets the codigoServicio value for this ListaSSAbonadoDTO.
     * 
     * @param codigoServicio
     */
    public void setCodigoServicio(java.lang.String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }


    /**
     * Gets the descripcionMoneda value for this ListaSSAbonadoDTO.
     * 
     * @return descripcionMoneda
     */
    public java.lang.String getDescripcionMoneda() {
        return descripcionMoneda;
    }


    /**
     * Sets the descripcionMoneda value for this ListaSSAbonadoDTO.
     * 
     * @param descripcionMoneda
     */
    public void setDescripcionMoneda(java.lang.String descripcionMoneda) {
        this.descripcionMoneda = descripcionMoneda;
    }


    /**
     * Gets the descripcionServicio value for this ListaSSAbonadoDTO.
     * 
     * @return descripcionServicio
     */
    public java.lang.String getDescripcionServicio() {
        return descripcionServicio;
    }


    /**
     * Sets the descripcionServicio value for this ListaSSAbonadoDTO.
     * 
     * @param descripcionServicio
     */
    public void setDescripcionServicio(java.lang.String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }


    /**
     * Gets the importeCargo value for this ListaSSAbonadoDTO.
     * 
     * @return importeCargo
     */
    public java.lang.String getImporteCargo() {
        return importeCargo;
    }


    /**
     * Sets the importeCargo value for this ListaSSAbonadoDTO.
     * 
     * @param importeCargo
     */
    public void setImporteCargo(java.lang.String importeCargo) {
        this.importeCargo = importeCargo;
    }


    /**
     * Gets the indicadorObligatoriedad value for this ListaSSAbonadoDTO.
     * 
     * @return indicadorObligatoriedad
     */
    public java.lang.String getIndicadorObligatoriedad() {
        return indicadorObligatoriedad;
    }


    /**
     * Sets the indicadorObligatoriedad value for this ListaSSAbonadoDTO.
     * 
     * @param indicadorObligatoriedad
     */
    public void setIndicadorObligatoriedad(java.lang.String indicadorObligatoriedad) {
        this.indicadorObligatoriedad = indicadorObligatoriedad;
    }


    /**
     * Gets the nivel value for this ListaSSAbonadoDTO.
     * 
     * @return nivel
     */
    public java.lang.String getNivel() {
        return nivel;
    }


    /**
     * Sets the nivel value for this ListaSSAbonadoDTO.
     * 
     * @param nivel
     */
    public void setNivel(java.lang.String nivel) {
        this.nivel = nivel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaSSAbonadoDTO)) return false;
        ListaSSAbonadoDTO other = (ListaSSAbonadoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoConceptoCargo==null && other.getCodigoConceptoCargo()==null) || 
             (this.codigoConceptoCargo!=null &&
              this.codigoConceptoCargo.equals(other.getCodigoConceptoCargo()))) &&
            ((this.codigoSS==null && other.getCodigoSS()==null) || 
             (this.codigoSS!=null &&
              this.codigoSS.equals(other.getCodigoSS()))) &&
            ((this.codigoServicio==null && other.getCodigoServicio()==null) || 
             (this.codigoServicio!=null &&
              this.codigoServicio.equals(other.getCodigoServicio()))) &&
            ((this.descripcionMoneda==null && other.getDescripcionMoneda()==null) || 
             (this.descripcionMoneda!=null &&
              this.descripcionMoneda.equals(other.getDescripcionMoneda()))) &&
            ((this.descripcionServicio==null && other.getDescripcionServicio()==null) || 
             (this.descripcionServicio!=null &&
              this.descripcionServicio.equals(other.getDescripcionServicio()))) &&
            ((this.importeCargo==null && other.getImporteCargo()==null) || 
             (this.importeCargo!=null &&
              this.importeCargo.equals(other.getImporteCargo()))) &&
            ((this.indicadorObligatoriedad==null && other.getIndicadorObligatoriedad()==null) || 
             (this.indicadorObligatoriedad!=null &&
              this.indicadorObligatoriedad.equals(other.getIndicadorObligatoriedad()))) &&
            ((this.nivel==null && other.getNivel()==null) || 
             (this.nivel!=null &&
              this.nivel.equals(other.getNivel())));
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
        if (getCodigoConceptoCargo() != null) {
            _hashCode += getCodigoConceptoCargo().hashCode();
        }
        if (getCodigoSS() != null) {
            _hashCode += getCodigoSS().hashCode();
        }
        if (getCodigoServicio() != null) {
            _hashCode += getCodigoServicio().hashCode();
        }
        if (getDescripcionMoneda() != null) {
            _hashCode += getDescripcionMoneda().hashCode();
        }
        if (getDescripcionServicio() != null) {
            _hashCode += getDescripcionServicio().hashCode();
        }
        if (getImporteCargo() != null) {
            _hashCode += getImporteCargo().hashCode();
        }
        if (getIndicadorObligatoriedad() != null) {
            _hashCode += getIndicadorObligatoriedad().hashCode();
        }
        if (getNivel() != null) {
            _hashCode += getNivel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaSSAbonadoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "ListaSSAbonadoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConceptoCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "codigoConceptoCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "codigoSS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "codigoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "descripcionMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "descripcionServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "importeCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorObligatoriedad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "indicadorObligatoriedad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "nivel"));
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
