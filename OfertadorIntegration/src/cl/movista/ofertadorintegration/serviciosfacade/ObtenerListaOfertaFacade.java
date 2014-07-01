package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obtenerlistaoferta.dto.RespuestaListaOferta;
import cl.movistar.obtenerlistaoferta.dto.SolicitudListaOferta;
import cl.movistar.obtenerlistaoferta.impl.ObtenerListaOfertaGateway;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerListaOfertaFacade {

	
	public RespuestaListaOferta obtenerListaOferta(SolicitudListaOferta solicitudListaOferta) throws Exception {
		
		ObtenerListaOfertaGateway obtenerListaOfertaGateway = new ObtenerListaOfertaGateway(config.getObtenerListaOfertaEndPoint(),false);
		
		return obtenerListaOfertaGateway.obtenerListaOferta(solicitudListaOferta);
		
	}
	
	Configuracion config = new Configuracion();
}
