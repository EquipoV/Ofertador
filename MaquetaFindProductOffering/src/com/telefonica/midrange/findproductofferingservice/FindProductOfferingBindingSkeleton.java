/**
 * FindProductOfferingBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.findproductofferingservice;

public class FindProductOfferingBindingSkeleton implements com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType, org.apache.axis.wsdl.Skeleton {
    private com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "findProductOfferingMsgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "findProductOfferingRequest"), com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("findProductOffering", _params, new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "findProductOfferingMsgResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://midrange.telefonica.com/findproductofferingservice/types", "findProductOfferingResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "findProductOffering"));
        _oper.setSoapAction("http://midrange.telefonica.com/findproductofferingservice/findProductOffering");
        _myOperationsList.add(_oper);
        if (_myOperations.get("findProductOffering") == null) {
            _myOperations.put("findProductOffering", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("findProductOffering")).add(_oper);
    }

    public FindProductOfferingBindingSkeleton() {
        this.impl = new com.telefonica.midrange.findproductofferingservice.FindProductOfferingBindingImpl();
    }

    public FindProductOfferingBindingSkeleton(com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType impl) {
        this.impl = impl;
    }
    public com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse findProductOffering(com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingRequest findProductOfferingRequestParameter) throws java.rmi.RemoteException
    {
        com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse ret = impl.findProductOffering(findProductOfferingRequestParameter);
        return ret;
    }

}
