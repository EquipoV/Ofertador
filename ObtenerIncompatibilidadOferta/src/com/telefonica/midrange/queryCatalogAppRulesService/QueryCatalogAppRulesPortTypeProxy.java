package com.telefonica.midrange.queryCatalogAppRulesService;

public class QueryCatalogAppRulesPortTypeProxy implements com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType {
  private String _endpoint = null;
  private com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType queryCatalogAppRulesPortType = null;
  
  public QueryCatalogAppRulesPortTypeProxy() {
    _initQueryCatalogAppRulesPortTypeProxy();
  }
  
  public QueryCatalogAppRulesPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryCatalogAppRulesPortTypeProxy();
  }
  
  private void _initQueryCatalogAppRulesPortTypeProxy() {
    try {
      queryCatalogAppRulesPortType = (new com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesServiceLocator()).getqueryCatalogAppRules();
      if (queryCatalogAppRulesPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryCatalogAppRulesPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryCatalogAppRulesPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryCatalogAppRulesPortType != null)
      ((javax.xml.rpc.Stub)queryCatalogAppRulesPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType getQueryCatalogAppRulesPortType() {
    if (queryCatalogAppRulesPortType == null)
      _initQueryCatalogAppRulesPortTypeProxy();
    return queryCatalogAppRulesPortType;
  }
  
  public com.telefonica.midrange.queryCatalogAppRulesService.types.QueryCatalogAppRulesResponse queryCatalogAppRules(com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsOrigin[] queryCatalogAppRulesRequestParameter) throws java.rmi.RemoteException{
    if (queryCatalogAppRulesPortType == null)
      _initQueryCatalogAppRulesPortTypeProxy();
    return queryCatalogAppRulesPortType.queryCatalogAppRules(queryCatalogAppRulesRequestParameter);
  }
  
  
}