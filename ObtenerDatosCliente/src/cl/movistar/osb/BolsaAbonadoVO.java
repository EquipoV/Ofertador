/**
 * BolsaAbonadoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.movistar.osb;

public class BolsaAbonadoVO  implements java.io.Serializable {
    private java.lang.String codServicio;

    private java.lang.String descUnidad;

    private java.lang.String fechaAltaServicio;

    private java.lang.Float impTarifa;

    private java.lang.String indPlan;

    private int numUnidades;

    private java.lang.String unidadesConsumidas;

    public BolsaAbonadoVO() {
    }

    public BolsaAbonadoVO(
           java.lang.String codServicio,
           java.lang.String descUnidad,
           java.lang.String fechaAltaServicio,
           java.lang.Float impTarifa,
           java.lang.String indPlan,
           int numUnidades,
           java.lang.String unidadesConsumidas) {
           this.codServicio = codServicio;
           this.descUnidad = descUnidad;
           this.fechaAltaServicio = fechaAltaServicio;
           this.impTarifa = impTarifa;
           this.indPlan = indPlan;
           this.numUnidades = numUnidades;
           this.unidadesConsumidas = unidadesConsumidas;
    }


    /**
     * Gets the codServicio value for this BolsaAbonadoVO.
     * 
     * @return codServicio
     */
    public java.lang.String getCodServicio() {
        return codServicio;
    }


    /**
     * Sets the codServicio value for this BolsaAbonadoVO.
     * 
     * @param codServicio
     */
    public void setCodServicio(java.lang.String codServicio) {
        this.codServicio = codServicio;
    }


    /**
     * Gets the descUnidad value for this BolsaAbonadoVO.
     * 
     * @return descUnidad
     */
    public java.lang.String getDescUnidad() {
        return descUnidad;
    }


    /**
     * Sets the descUnidad value for this BolsaAbonadoVO.
     * 
     * @param descUnidad
     */
    public void setDescUnidad(java.lang.String descUnidad) {
        this.descUnidad = descUnidad;
    }


    /**
     * Gets the fechaAltaServicio value for this BolsaAbonadoVO.
     * 
     * @return fechaAltaServicio
     */
    public java.lang.String getFechaAltaServicio() {
        return fechaAltaServicio;
    }


    /**
     * Sets the fechaAltaServicio value for this BolsaAbonadoVO.
     * 
     * @param fechaAltaServicio
     */
    public void setFechaAltaServicio(java.lang.String fechaAltaServicio) {
        this.fechaAltaServicio = fechaAltaServicio;
    }


    /**
     * Gets the impTarifa value for this BolsaAbonadoVO.
     * 
     * @return impTarifa
     */
    public java.lang.Float getImpTarifa() {
        return impTarifa;
    }


    /**
     * Sets the impTarifa value for this BolsaAbonadoVO.
     * 
     * @param impTarifa
     */
    public void setImpTarifa(java.lang.Float impTarifa) {
        this.impTarifa = impTarifa;
    }


    /**
     * Gets the indPlan value for this BolsaAbonadoVO.
     * 
     * @return indPlan
     */
    public java.lang.String getIndPlan() {
        return indPlan;
    }


    /**
     * Sets the indPlan value for this BolsaAbonadoVO.
     * 
     * @param indPlan
     */
    public void setIndPlan(java.lang.String indPlan) {
        this.indPlan = indPlan;
    }


    /**
     * Gets the numUnidades value for this BolsaAbonadoVO.
     * 
     * @return numUnidades
     */
    public int getNumUnidades() {
        return numUnidades;
    }


    /**
     * Sets the numUnidades value for this BolsaAbonadoVO.
     * 
     * @param numUnidades
     */
    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }


    /**
     * Gets the unidadesConsumidas value for this BolsaAbonadoVO.
     * 
     * @return unidadesConsumidas
     */
    public java.lang.String getUnidadesConsumidas() {
        return unidadesConsumidas;
    }


    /**
     * Sets the unidadesConsumidas value for this BolsaAbonadoVO.
     * 
     * @param unidadesConsumidas
     */
    public void setUnidadesConsumidas(java.lang.String unidadesConsumidas) {
        this.unidadesConsumidas = unidadesConsumidas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BolsaAbonadoVO)) return false;
        BolsaAbonadoVO other = (BolsaAbonadoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codServicio==null && other.getCodServicio()==null) || 
             (this.codServicio!=null &&
              this.codServicio.equals(other.getCodServicio()))) &&
            ((this.descUnidad==null && other.getDescUnidad()==null) || 
             (this.descUnidad!=null &&
              this.descUnidad.equals(other.getDescUnidad()))) &&
            ((this.fechaAltaServicio==null && other.getFechaAltaServicio()==null) || 
             (this.fechaAltaServicio!=null &&
              this.fechaAltaServicio.equals(other.getFechaAltaServicio()))) &&
            ((this.impTarifa==null && other.getImpTarifa()==null) || 
             (this.impTarifa!=null &&
              this.impTarifa.equals(other.getImpTarifa()))) &&
            ((this.indPlan==null && other.getIndPlan()==null) || 
             (this.indPlan!=null &&
              this.indPlan.equals(other.getIndPlan()))) &&
            this.numUnidades == other.getNumUnidades() &&
            ((this.unidadesConsumidas==null && other.getUnidadesConsumidas()==null) || 
             (this.unidadesConsumidas!=null &&
              this.unidadesConsumidas.equals(other.getUnidadesConsumidas())));
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
        if (getCodServicio() != null) {
            _hashCode += getCodServicio().hashCode();
        }
        if (getDescUnidad() != null) {
            _hashCode += getDescUnidad().hashCode();
        }
        if (getFechaAltaServicio() != null) {
            _hashCode += getFechaAltaServicio().hashCode();
        }
        if (getImpTarifa() != null) {
            _hashCode += getImpTarifa().hashCode();
        }
        if (getIndPlan() != null) {
            _hashCode += getIndPlan().hashCode();
        }
        _hashCode += getNumUnidades();
        if (getUnidadesConsumidas() != null) {
            _hashCode += getUnidadesConsumidas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BolsaAbonadoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://osb.movistar.cl/", "bolsaAbonadoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descUnidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descUnidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAltaServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAltaServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impTarifa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "impTarifa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numUnidades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numUnidades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadesConsumidas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadesConsumidas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
