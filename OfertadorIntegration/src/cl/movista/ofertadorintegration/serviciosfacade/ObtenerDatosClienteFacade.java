package cl.movista.ofertadorintegration.serviciosfacade;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import cl.movistar.obtenerdatoscliente.dto.RespuestaDatosCliente;
import cl.movistar.obtenerdatoscliente.impl.ObtenerDatosClienteGateway;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerDatosClienteFacade {

	
	
	public RespuestaDatosCliente obtenerDatosCliente(int numCelular) throws AxisFault, MalformedURLException,RemoteException {
		ObtenerDatosClienteGateway obtenerDatosClienteGateway = new ObtenerDatosClienteGateway(config.getObtenerDatosClienteEndPoint(),false);
		
		return obtenerDatosClienteGateway.obtenerDatosCliente(numCelular);	
	}
	
	Configuracion config = new Configuracion();
	
}
