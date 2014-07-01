/**
 * ConsultarDetalleAbonadoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.movistar.osb;

public class ConsultarDetalleAbonadoServiceLocator extends org.apache.axis.client.Service implements cl.movistar.osb.ConsultarDetalleAbonadoService {

    public ConsultarDetalleAbonadoServiceLocator() {
    }


    public ConsultarDetalleAbonadoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultarDetalleAbonadoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultarDetalleAbonadoPort
    private java.lang.String ConsultarDetalleAbonadoPort_address = "http://osbpro:80/Abonado/ConsultaDetalleAbonado";

    public java.lang.String getConsultarDetalleAbonadoPortAddress() {
        return ConsultarDetalleAbonadoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultarDetalleAbonadoPortWSDDServiceName = "ConsultarDetalleAbonadoPort";

    public java.lang.String getConsultarDetalleAbonadoPortWSDDServiceName() {
        return ConsultarDetalleAbonadoPortWSDDServiceName;
    }

    public void setConsultarDetalleAbonadoPortWSDDServiceName(java.lang.String name) {
        ConsultarDetalleAbonadoPortWSDDServiceName = name;
    }

    public cl.movistar.osb.ConsultarDetalleAbonado getConsultarDetalleAbonadoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultarDetalleAbonadoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultarDetalleAbonadoPort(endpoint);
    }

    public cl.movistar.osb.ConsultarDetalleAbonado getConsultarDetalleAbonadoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.movistar.osb.ConsultarDetalleAbonadoPortBindingStub _stub = new cl.movistar.osb.ConsultarDetalleAbonadoPortBindingStub(portAddress, this);
            _stub.setPortName(getConsultarDetalleAbonadoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultarDetalleAbonadoPortEndpointAddress(java.lang.String address) {
        ConsultarDetalleAbonadoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.movistar.osb.ConsultarDetalleAbonado.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.movistar.osb.ConsultarDetalleAbonadoPortBindingStub _stub = new cl.movistar.osb.ConsultarDetalleAbonadoPortBindingStub(new java.net.URL(ConsultarDetalleAbonadoPort_address), this);
                _stub.setPortName(getConsultarDetalleAbonadoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConsultarDetalleAbonadoPort".equals(inputPortName)) {
            return getConsultarDetalleAbonadoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://osb.movistar.cl/", "ConsultarDetalleAbonadoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://osb.movistar.cl/", "ConsultarDetalleAbonadoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultarDetalleAbonadoPort".equals(portName)) {
            setConsultarDetalleAbonadoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
