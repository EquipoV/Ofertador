/**
 * RespuestaConsultaSSDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.services.WS4;

public class RespuestaConsultaSSDTO  implements java.io.Serializable {
    private com.telefonica.services.WS4.ListaSSAbonadoDTO[] listaSSAbonado;

    private com.tmmas.cl.scl.cambiodeplan.common.dto.RetornoDTO retornoDto;

    public RespuestaConsultaSSDTO() {
    }

    public RespuestaConsultaSSDTO(
           com.telefonica.services.WS4.ListaSSAbonadoDTO[] listaSSAbonado,
           com.tmmas.cl.scl.cambiodeplan.common.dto.RetornoDTO retornoDto) {
           this.listaSSAbonado = listaSSAbonado;
           this.retornoDto = retornoDto;
    }


    /**
     * Gets the listaSSAbonado value for this RespuestaConsultaSSDTO.
     * 
     * @return listaSSAbonado
     */
    public com.telefonica.services.WS4.ListaSSAbonadoDTO[] getListaSSAbonado() {
        return listaSSAbonado;
    }


    /**
     * Sets the listaSSAbonado value for this RespuestaConsultaSSDTO.
     * 
     * @param listaSSAbonado
     */
    public void setListaSSAbonado(com.telefonica.services.WS4.ListaSSAbonadoDTO[] listaSSAbonado) {
        this.listaSSAbonado = listaSSAbonado;
    }


    /**
     * Gets the retornoDto value for this RespuestaConsultaSSDTO.
     * 
     * @return retornoDto
     */
    public com.tmmas.cl.scl.cambiodeplan.common.dto.RetornoDTO getRetornoDto() {
        return retornoDto;
    }


    /**
     * Sets the retornoDto value for this RespuestaConsultaSSDTO.
     * 
     * @param retornoDto
     */
    public void setRetornoDto(com.tmmas.cl.scl.cambiodeplan.common.dto.RetornoDTO retornoDto) {
        this.retornoDto = retornoDto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaConsultaSSDTO)) return false;
        RespuestaConsultaSSDTO other = (RespuestaConsultaSSDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaSSAbonado==null && other.getListaSSAbonado()==null) || 
             (this.listaSSAbonado!=null &&
              java.util.Arrays.equals(this.listaSSAbonado, other.getListaSSAbonado()))) &&
            ((this.retornoDto==null && other.getRetornoDto()==null) || 
             (this.retornoDto!=null &&
              this.retornoDto.equals(other.getRetornoDto())));
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
        if (getListaSSAbonado() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaSSAbonado());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaSSAbonado(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetornoDto() != null) {
            _hashCode += getRetornoDto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaConsultaSSDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "RespuestaConsultaSSDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaSSAbonado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "listaSSAbonado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "ListaSSAbonadoDTO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.cambiodeplan.scl.cl.tmmas.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoDto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WS4.services.telefonica.com", "retornoDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.common.cambiodeplan.scl.cl.tmmas.com", "RetornoDTO"));
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
