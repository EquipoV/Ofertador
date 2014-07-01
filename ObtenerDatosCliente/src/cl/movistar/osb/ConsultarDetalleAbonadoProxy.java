package cl.movistar.osb;

public class ConsultarDetalleAbonadoProxy implements cl.movistar.osb.ConsultarDetalleAbonado {
  private String _endpoint = null;
  private cl.movistar.osb.ConsultarDetalleAbonado consultarDetalleAbonado = null;
  
  public ConsultarDetalleAbonadoProxy() {
    _initConsultarDetalleAbonadoProxy();
  }
  
  public ConsultarDetalleAbonadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultarDetalleAbonadoProxy();
  }
  
  private void _initConsultarDetalleAbonadoProxy() {
    try {
      consultarDetalleAbonado = (new cl.movistar.osb.ConsultarDetalleAbonadoServiceLocator()).getConsultarDetalleAbonadoPort();
      if (consultarDetalleAbonado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultarDetalleAbonado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultarDetalleAbonado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultarDetalleAbonado != null)
      ((javax.xml.rpc.Stub)consultarDetalleAbonado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.movistar.osb.ConsultarDetalleAbonado getConsultarDetalleAbonado() {
    if (consultarDetalleAbonado == null)
      _initConsultarDetalleAbonadoProxy();
    return consultarDetalleAbonado;
  }
  
  public cl.movistar.osb.GetDetalleVO getDetalleAbonado(int numCelular) throws java.rmi.RemoteException{
    if (consultarDetalleAbonado == null)
      _initConsultarDetalleAbonadoProxy();
    return consultarDetalleAbonado.getDetalleAbonado(numCelular);
  }
  
  
}