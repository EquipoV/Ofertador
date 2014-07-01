/**
 * QueryCatalogAppRulesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryCatalogAppRulesService;

public class QueryCatalogAppRulesServiceLocator extends org.apache.axis.client.Service implements com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesService {

    public QueryCatalogAppRulesServiceLocator() {
    }


    public QueryCatalogAppRulesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryCatalogAppRulesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for queryCatalogAppRules
    private java.lang.String queryCatalogAppRules_address = "http://localhost:8080/QueryCatalogAppRulesWEB/services/queryCatalogAppRules";

    public java.lang.String getqueryCatalogAppRulesAddress() {
        return queryCatalogAppRules_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryCatalogAppRulesWSDDServiceName = "queryCatalogAppRules";

    public java.lang.String getqueryCatalogAppRulesWSDDServiceName() {
        return queryCatalogAppRulesWSDDServiceName;
    }

    public void setqueryCatalogAppRulesWSDDServiceName(java.lang.String name) {
        queryCatalogAppRulesWSDDServiceName = name;
    }

    public com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType getqueryCatalogAppRules() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryCatalogAppRules_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryCatalogAppRules(endpoint);
    }

    public com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType getqueryCatalogAppRules(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesBindingStub _stub = new com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesBindingStub(portAddress, this);
            _stub.setPortName(getqueryCatalogAppRulesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryCatalogAppRulesEndpointAddress(java.lang.String address) {
        queryCatalogAppRules_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesBindingStub _stub = new com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesBindingStub(new java.net.URL(queryCatalogAppRules_address), this);
                _stub.setPortName(getqueryCatalogAppRulesWSDDServiceName());
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
        if ("queryCatalogAppRules".equals(inputPortName)) {
            return getqueryCatalogAppRules();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService", "queryCatalogAppRulesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryCatalogAppRulesService", "queryCatalogAppRules"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("queryCatalogAppRules".equals(portName)) {
            setqueryCatalogAppRulesEndpointAddress(address);
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
