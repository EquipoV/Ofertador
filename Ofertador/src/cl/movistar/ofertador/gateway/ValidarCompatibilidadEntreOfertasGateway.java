package cl.movistar.ofertador.gateway;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.movista.ofertadorintegration.serviciosfacade.ObtenerIncompatibilidadOfertadorFacade;
import cl.movistar.obetenercincompatibilidadofertador.dto.FamiliaridadIncompatible;
import cl.movistar.obetenercincompatibilidadofertador.dto.RespuestaIncompatibilidadOferta;
import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.SolicitudCompatibilidadOferta;
import cl.movistar.ofertador.helpers.ValidarCompatibilidadEntreOfertasHelper;

public class ValidarCompatibilidadEntreOfertasGateway {

	public Response validarCompatibilidadEntreOfertas(
			SolicitudCompatibilidadOferta solicitudCompatibilidadOferta,
			boolean b) throws Exception {

		Response response = new Response();

		if (b) {
			response = Helper.obtenerRespuestaEnDuro();
			return response;
		}

		try {
			
			RespuestaIncompatibilidadOferta respuestaIncompatibilidadOferta = facade.obtenerIncompatibilidad(solicitudCompatibilidadOferta
							.getFamiliaridadOferta1());

			RespuestaServicio respuestaServicio = new RespuestaServicio();
			
			
			// Si catálogo devolvio 003 o 000
			String codigoRespuestaCatalogo = respuestaIncompatibilidadOferta.getCodigoRetorno();
			
			if (codigoRespuestaCatalogo.equals("000") || codigoRespuestaCatalogo.equals("003")) {

				response.setRespuesta("false");
				respuestaServicio.setMensaje("Proceso Exitoso");
				
				if (codigoRespuestaCatalogo.equals("000")) {
					
					FamiliaridadIncompatible[] familiaridadIncompatible = respuestaIncompatibilidadOferta.getFamiliaridadIncompatible();

					for (int i = 0; i < familiaridadIncompatible.length; i++) {
						if (solicitudCompatibilidadOferta.getFamiliaridadOferta2().equals(familiaridadIncompatible[i].getFamiliaridad())) {
							
							response.setRespuesta("true");
							
							respuestaServicio.setCodigo(Integer.valueOf(codigoRespuestaCatalogo));
							
							//El mensaje esta arriba seteado 
							//respuestaServicio.setMensaje("Proceso Exitoso");
							
							response.setRespuestaServicio(respuestaServicio);
							
							return response;
						}
					}
				}
			}
			
			
				respuestaServicio.setCodigo(970000 + Integer.valueOf(codigoRespuestaCatalogo));
				if(codigoRespuestaCatalogo.equals("002")){
					
					respuestaServicio.setMensaje("Formato de parametro incorrecto");	
					
				}else{
					respuestaServicio.setMensaje(respuestaIncompatibilidadOferta.getMensaje());
				}
				response.setRespuestaServicio(respuestaServicio);
				return response;
				
			
		} catch (Exception e) {
			logger.error("Error en validarCompatibilidadEntreOfertas",e);
			throw new Exception("Error en validarCompatibilidadEntreOfertas",e);
		}
	
	}


	public static ValidarCompatibilidadEntreOfertasGateway getInstance() {
		return INSTANCE;
	}
	
	 private ValidarCompatibilidadEntreOfertasGateway() {

	        String resourceLog = "cl/movistar/ofertador/recursos/OfertadorLog4j.properties";
	        InputStream isLog = this.getClass().getClassLoader().getResourceAsStream(resourceLog);
	        Properties props = new Properties();
	        try {
	            props.load(isLog);
	            PropertyConfigurator.configure(props);
	            isLog.close();
	        } catch (Exception ex) {
	        logger.error("No se pudo cargar la configuración del Log4J.", ex);
	        }

	    }
	    private ValidarCompatibilidadEntreOfertasHelper Helper = new ValidarCompatibilidadEntreOfertasHelper();
	    private ObtenerIncompatibilidadOfertadorFacade facade = new ObtenerIncompatibilidadOfertadorFacade();
	    private static ValidarCompatibilidadEntreOfertasGateway INSTANCE = new ValidarCompatibilidadEntreOfertasGateway();
	    private static final Logger logger = LoggerFactory.getLogger(ObtenerDetalleDeOfertaGateway.class);
//             private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ValidarCompatibilidadEntreOfertasGateway.class.getName());
}



// Servicio de incompatibilidad: QueryCatalogAppRules
// Los códigos y mensajes de error pueden adoptar los siguientes
// valores:
// o 000: Proceso Exitoso. 
// o 001: No se han ingresado los parámetros requeridos.
// o 002: El formato del parámetro <parámetro> es incorrecto. 
// o 003: No existen incompatibilidades asociadas a la familiaridad(es).
// o 004: Error al obtener incompatibilidades de familiaridad(es).





