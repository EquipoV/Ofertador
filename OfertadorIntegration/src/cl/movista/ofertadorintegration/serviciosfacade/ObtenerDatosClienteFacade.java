package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obtenerdatoscliente.dto.RespuestaDatosCliente;
import cl.movistar.obtenerdatoscliente.impl.ObtenerDatosClienteGateway;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerDatosClienteFacade {

	
	
	public RespuestaDatosCliente obtenerDatosCliente(int numCelular) throws Exception {
		ObtenerDatosClienteGateway obtenerDatosClienteGateway = new ObtenerDatosClienteGateway(config.getObtenerDatosClienteEndPoint(),false);
		
		return obtenerDatosClienteGateway.obtenerDatosCliente(numCelular);	
	}
	
	Configuracion config = new Configuracion();
	
}
