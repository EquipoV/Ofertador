package com.telefonica.midrange.findproductofferingservice;

public class FindProductOfferingPortTypeProxy implements com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType {
  private String _endpoint = null;
  private com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType findProductOfferingPortType = null;
  
  public FindProductOfferingPortTypeProxy() {
    _initFindProductOfferingPortTypeProxy();
  }
  
  public FindProductOfferingPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initFindProductOfferingPortTypeProxy();
  }
  
  private void _initFindProductOfferingPortTypeProxy() {
    try {
      findProductOfferingPortType = (new com.telefonica.midrange.findproductofferingservice.FindProductOfferingServiceLocator()).getfindProductOffering();
      if (findProductOfferingPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)findProductOfferingPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)findProductOfferingPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (findProductOfferingPortType != null)
      ((javax.xml.rpc.Stub)findProductOfferingPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType getFindProductOfferingPortType() {
    if (findProductOfferingPortType == null)
      _initFindProductOfferingPortTypeProxy();
    return findProductOfferingPortType;
  }
  
  public com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse findProductOffering(com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingRequest findProductOfferingRequestParameter) throws java.rmi.RemoteException{
    if (findProductOfferingPortType == null)
      _initFindProductOfferingPortTypeProxy();
    return findProductOfferingPortType.findProductOffering(findProductOfferingRequestParameter);
  }
  
  
}