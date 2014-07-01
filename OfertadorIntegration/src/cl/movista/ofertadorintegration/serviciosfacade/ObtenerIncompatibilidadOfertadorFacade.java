package cl.movista.ofertadorintegration.serviciosfacade;

import cl.movistar.obetenercincompatibilidadofertador.dto.RespuestaIncompatibilidadOferta;
import cl.movistar.obetenercincompatibilidadofertador.gateways.ObtenerIncompatibilidadOfertadorGateway;
import cl.movistar.ofertadorIntegration.recursos.Configuracion;
import java.util.List;

public class ObtenerIncompatibilidadOfertadorFacade {

	
	public RespuestaIncompatibilidadOferta obtenerIncompatibilidad(List<String> familiaridadesOrigen) throws Exception{
		
		ObtenerIncompatibilidadOfertadorGateway obtenerIncompatibilidadOfertadorGateway = new ObtenerIncompatibilidadOfertadorGateway(config.getObtenerIncompatibilidadOfertaEndPoint(),false);
		return obtenerIncompatibilidadOfertadorGateway.obtenerIncompatibilidad(familiaridadesOrigen);
		
	}
	
	public RespuestaIncompatibilidadOferta obtenerIncompatibilidad(String familiaridadOferta1) throws Exception {
		
		ObtenerIncompatibilidadOfertadorGateway obtenerIncompatibilidadOfertadorGateway = new ObtenerIncompatibilidadOfertadorGateway(config.getObtenerIncompatibilidadOfertaEndPoint(),false);
		return obtenerIncompatibilidadOfertadorGateway.obtenerIncompatibilidad(familiaridadOferta1);
	}
	
	
	Configuracion config = new Configuracion();
}
