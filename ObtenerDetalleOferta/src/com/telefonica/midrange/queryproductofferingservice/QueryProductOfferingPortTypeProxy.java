package com.telefonica.midrange.queryproductofferingservice;

public class QueryProductOfferingPortTypeProxy implements com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType {
  private String _endpoint = null;
  private com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType queryProductOfferingPortType = null;
  
  public QueryProductOfferingPortTypeProxy() {
    _initQueryProductOfferingPortTypeProxy();
  }
  
  public QueryProductOfferingPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryProductOfferingPortTypeProxy();
  }
  
  private void _initQueryProductOfferingPortTypeProxy() {
    try {
      queryProductOfferingPortType = (new com.telefonica.midrange.queryproductofferingservice.QueryproductofferingserviceLocator()).getqueryProductOffering();
      if (queryProductOfferingPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryProductOfferingPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryProductOfferingPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryProductOfferingPortType != null)
      ((javax.xml.rpc.Stub)queryProductOfferingPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType getQueryProductOfferingPortType() {
    if (queryProductOfferingPortType == null)
      _initQueryProductOfferingPortTypeProxy();
    return queryProductOfferingPortType;
  }
  
  public com.telefonica.midrange.queryproductofferingservice.types.QueryOfferingResponse queryProductOffering(com.telefonica.midrange.queryproductofferingservice.types.QueryOfferingRequest queryProductOfferingRequestParameter) throws java.rmi.RemoteException{
    if (queryProductOfferingPortType == null)
      _initQueryProductOfferingPortTypeProxy();
    return queryProductOfferingPortType.queryProductOffering(queryProductOfferingRequestParameter);
  }
  
  
}