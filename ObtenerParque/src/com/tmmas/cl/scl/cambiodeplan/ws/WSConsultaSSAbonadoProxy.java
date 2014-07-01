package com.tmmas.cl.scl.cambiodeplan.ws;

public class WSConsultaSSAbonadoProxy implements com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonado {
  private String _endpoint = null;
  private com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonado wSConsultaSSAbonado = null;
  
  public WSConsultaSSAbonadoProxy() {
    _initWSConsultaSSAbonadoProxy();
  }
  
  public WSConsultaSSAbonadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSConsultaSSAbonadoProxy();
  }
  
  private void _initWSConsultaSSAbonadoProxy() {
    try {
      wSConsultaSSAbonado = (new com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonadoServiceLocator()).getWSConsultaSSAbonado();
      if (wSConsultaSSAbonado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSConsultaSSAbonado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSConsultaSSAbonado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSConsultaSSAbonado != null)
      ((javax.xml.rpc.Stub)wSConsultaSSAbonado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonado getWSConsultaSSAbonado() {
    if (wSConsultaSSAbonado == null)
      _initWSConsultaSSAbonadoProxy();
    return wSConsultaSSAbonado;
  }
  
  public com.telefonica.services.WS4.RespuestaConsultaSSDTO obtenerSSAbonado(com.telefonica.services.WS4.ConsultaSSDTO entrada) throws java.rmi.RemoteException{
    if (wSConsultaSSAbonado == null)
      _initWSConsultaSSAbonadoProxy();
    return wSConsultaSSAbonado.obtenerSSAbonado(entrada);
  }
  
  
}