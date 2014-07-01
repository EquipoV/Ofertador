package com.OFCEWSZI.OFCEWSCO.www;

public class OFCEWSCOPortProxy implements com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort {
  private String _endpoint = null;
  private com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort oFCEWSCOPort = null;
  
  public OFCEWSCOPortProxy() {
    _initOFCEWSCOPortProxy();
  }
  
  public OFCEWSCOPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initOFCEWSCOPortProxy();
  }
  
  private void _initOFCEWSCOPortProxy() {
    try {
      oFCEWSCOPort = (new com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOServiceLocator()).getOFCEWSCOPort();
      if (oFCEWSCOPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oFCEWSCOPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oFCEWSCOPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oFCEWSCOPort != null)
      ((javax.xml.rpc.Stub)oFCEWSCOPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort getOFCEWSCOPort() {
    if (oFCEWSCOPort == null)
      _initOFCEWSCOPortProxy();
    return oFCEWSCOPort;
  }
  
  public com.Response.OFCEWSZI.OFCEWSCO.www.ProgramInterfaceMso_salida OFCEWSCOOperation(com.Request.OFCEWSZI.OFCEWSCO.www.ProgramInterfaceMsi_entrada msi_entrada) throws java.rmi.RemoteException{
    if (oFCEWSCOPort == null)
      _initOFCEWSCOPortProxy();
    return oFCEWSCOPort.OFCEWSCOOperation(msi_entrada);
  }
  
  
}