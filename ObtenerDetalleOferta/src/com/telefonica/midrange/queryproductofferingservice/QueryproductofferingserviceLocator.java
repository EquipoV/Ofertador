/**
 * QueryproductofferingserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductofferingservice;

public class QueryproductofferingserviceLocator extends org.apache.axis.client.Service implements com.telefonica.midrange.queryproductofferingservice.Queryproductofferingservice {

    public QueryproductofferingserviceLocator() {
    }


    public QueryproductofferingserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryproductofferingserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for queryProductOffering
    private java.lang.String queryProductOffering_address = "http://localhost:9080/QueryProductOfferingWEB/services/queryProductOffering";

    public java.lang.String getqueryProductOfferingAddress() {
        return queryProductOffering_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryProductOfferingWSDDServiceName = "queryProductOffering";

    public java.lang.String getqueryProductOfferingWSDDServiceName() {
        return queryProductOfferingWSDDServiceName;
    }

    public void setqueryProductOfferingWSDDServiceName(java.lang.String name) {
        queryProductOfferingWSDDServiceName = name;
    }

    public com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType getqueryProductOffering() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryProductOffering_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryProductOffering(endpoint);
    }

    public com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType getqueryProductOffering(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingBindingStub _stub = new com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingBindingStub(portAddress, this);
            _stub.setPortName(getqueryProductOfferingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryProductOfferingEndpointAddress(java.lang.String address) {
        queryProductOffering_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingBindingStub _stub = new com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingBindingStub(new java.net.URL(queryProductOffering_address), this);
                _stub.setPortName(getqueryProductOfferingWSDDServiceName());
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
        if ("queryProductOffering".equals(inputPortName)) {
            return getqueryProductOffering();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice", "queryproductofferingservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductofferingservice", "queryProductOffering"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("queryProductOffering".equals(portName)) {
            setqueryProductOfferingEndpointAddress(address);
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
