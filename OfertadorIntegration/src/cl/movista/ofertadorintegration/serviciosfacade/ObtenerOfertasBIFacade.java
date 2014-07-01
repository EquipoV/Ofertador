package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obtenerofertasbi.ObtenerOfertasBIGateway;
import cl.movistar.obtenerofertasbi.dto.RespuestaOfertasBI;
import cl.movistar.obtenerofertasbi.dto.SolicitudOfertasBI;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerOfertasBIFacade {

	
	 public RespuestaOfertasBI obtenerOfertaBI(SolicitudOfertasBI solicitudOfertasBI) throws Exception {
		
		  ObtenerOfertasBIGateway obtenerOfertasBIGateway = new ObtenerOfertasBIGateway(config.getObtenerOfertasBiEndPoint());
		  
		  return obtenerOfertasBIGateway.obtenerOfertaBI(solicitudOfertasBI);
		  
	  }

	  Configuracion config = new Configuracion();
}
