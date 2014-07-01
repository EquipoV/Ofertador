/**
 * OFCEWSCOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.OFCEWSZI.OFCEWSCO.www;

public class OFCEWSCOServiceLocator extends org.apache.axis.client.Service implements com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOService {

    public OFCEWSCOServiceLocator() {
    }


    public OFCEWSCOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OFCEWSCOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OFCEWSCOPort
    private java.lang.String OFCEWSCOPort_address = "http://10.232.3.45:8080/services/ConsultaOfertasClteAntig";

    public java.lang.String getOFCEWSCOPortAddress() {
        return OFCEWSCOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OFCEWSCOPortWSDDServiceName = "OFCEWSCOPort";

    public java.lang.String getOFCEWSCOPortWSDDServiceName() {
        return OFCEWSCOPortWSDDServiceName;
    }

    public void setOFCEWSCOPortWSDDServiceName(java.lang.String name) {
        OFCEWSCOPortWSDDServiceName = name;
    }

    public com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort getOFCEWSCOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OFCEWSCOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOFCEWSCOPort(endpoint);
    }

    public com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort getOFCEWSCOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOHTTPSoapBindingStub _stub = new com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getOFCEWSCOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOFCEWSCOPortEndpointAddress(java.lang.String address) {
        OFCEWSCOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOHTTPSoapBindingStub _stub = new com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOHTTPSoapBindingStub(new java.net.URL(OFCEWSCOPort_address), this);
                _stub.setPortName(getOFCEWSCOPortWSDDServiceName());
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
        if ("OFCEWSCOPort".equals(inputPortName)) {
            return getOFCEWSCOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.OFCEWSCO.OFCEWSZI.com", "OFCEWSCOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.OFCEWSCO.OFCEWSZI.com", "OFCEWSCOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OFCEWSCOPort".equals(portName)) {
            setOFCEWSCOPortEndpointAddress(address);
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
