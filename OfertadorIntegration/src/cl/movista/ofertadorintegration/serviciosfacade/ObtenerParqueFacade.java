package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obtenerparque.impl.ObtenerParqueGateway;
import cl.movistar.obtenerparque.impl.RespuestaParque;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerParqueFacade {

	
	
	public RespuestaParque obtenerParque(String numCelular) throws Exception {
		
		ObtenerParqueGateway obtenerParqueGateway = new ObtenerParqueGateway(config.getObtenerParqueEndPoint(),false);
		
		return obtenerParqueGateway.obtenerParque(numCelular);
		
	}
	
	Configuracion config = new Configuracion();
}
