package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obtenerdetalleoferta.dto.RespuestaDetalleOferta;
import cl.movistar.obtenerdetalleoferta.impl.ServicioObtenerDetalleOfertaGateway;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;

public class ObtenerDetalleOfertaFacade {

	public RespuestaDetalleOferta obtenerDetalleOferta(String codigoOFerta) throws Exception {
		
		ServicioObtenerDetalleOfertaGateway servicioObtenerDetalleOfertaGateway = new ServicioObtenerDetalleOfertaGateway(config.getObtenerDetalleOfertaEndPoint(),false);
		return servicioObtenerDetalleOfertaGateway.obtenerDetalleOferta(codigoOFerta);
		
		
	}
	
	Configuracion config = new Configuracion();
}
