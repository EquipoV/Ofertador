package cl.movistar.ofertador.gateway;


import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;






import cl.movistar.obtenerdatoscliente.dto.Cliente;
import cl.movistar.ofertador.dto.Oferta;
import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.SolicitudFactibilidadVentaOtrosCanales;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.facade.OfertadorFacade;
import cl.movistar.ofertador.helpers.ObtenerOfertaHelper;


public class ValidarFactibilidadVentaOtrosCanalesGateway {

    public static ValidarFactibilidadVentaOtrosCanalesGateway getInstance() {
        return INSTANCE;
    }
	
	private Cliente cliente;

	public Response validaFactibilidadVentaOtrosCanales(SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales, boolean b) throws Exception {
		try{
		response = new Response();
		respuestaServicio = new RespuestaServicio();
		if(b){
			
			response = obtenerResponseEnDuro();
			
		}
		
		try {
			if (validarEntrada(solicitudFactibilidadVentaOtrosCanales));

		} catch (Exception e) {
			respuestaServicio.setCodigo(940001);
			respuestaServicio
					.setMensaje("No se han ingresado los parametros requeridos, Error en parametro de entrada, "
							+ e.getMessage());
			response.setRespuestaServicio(respuestaServicio);
			return response;
		}
//               if( solicitudFactibilidadVentaOtrosCanales == null){
//                     respuestaServicio.setCodigo(940001);
//                     respuestaServicio.setMensaje("Error en parametros de entrada a Ofertador");
//                 response.setRespuestaServicio(respuestaServicio);
//                 return response;
//        }
		//Validaciones de Cliente
		cliente = Helper.obtenerCliente(solicitudFactibilidadVentaOtrosCanales.getNumeroCelular());
		
		String tipoPlan = cliente.getTipoPlan();
		String situacionCliente = cliente.getCodSituacion();
		
		if(!tipoPlan.equalsIgnoreCase("I")){
			
			
			respuestaServicio.setCodigo(940006);
			respuestaServicio.setMensaje("Oferta No Factible de Venta");
			response.setRespuestaServicio(respuestaServicio);
			return response;
		}
		if(!situacionCliente.equalsIgnoreCase("AAA")){
			RespuestaServicio respuestaServicio = new RespuestaServicio();
			respuestaServicio.setCodigo(940006);
			respuestaServicio.setMensaje("Oferta No Factible de Venta");
			response.setRespuestaServicio(respuestaServicio);
			return response;
			
		}
		///////////////////////////
		
		//Buscar a catalogo con Id Red
		
		String respuesta = obtenerRespuestaCatalogoPorIdred(solicitudFactibilidadVentaOtrosCanales);
		response.setRespuesta(respuesta);
                respuestaServicio.setCodigo(0);
                respuestaServicio.setMensaje("Proceso Existoso");
                response.setRespuestaServicio(respuestaServicio);
		return response;
                }catch(Exception e){
                    logger.error("Error en validaFactibilidadVentaOtrosCanales", e);
                    throw new Exception("Error en validaFactibilidadVentaOtrosCanales",e);
                }
	}
	



	private String obtenerRespuestaCatalogoPorIdred(SolicitudFactibilidadVentaOtrosCanales solicitudFOCanales) throws Exception {
		
		
		try {
			OfertadorFacade OfertadorFacade = new OfertadorFacade();
			SolicitudOferta solicitudOferta = new SolicitudOferta();
			solicitudOferta.setCanal("0");
                        solicitudOferta.setNumeroCelular(solicitudFOCanales.getNumeroCelular());
			//Ver si se necesita ingresar mas datos
			ResponseOfertas respuestaListaOferta = OfertadorFacade.obtenerOfertas(solicitudOferta,false);
		
                        if(respuestaListaOferta.getRespuestaServicio().getCodigo()==0||respuestaListaOferta.getOfertas().length>0){
                        Oferta[] ofertas = respuestaListaOferta.getOfertas();
                            for (int i = 0; i < ofertas.length; i++) {
                                Oferta oferta = ofertas[i];
                                if(oferta.getIdRed().equalsIgnoreCase(solicitudFOCanales.getIdRed()))
                                    return "true";
                            }
                            
                        }
                        
	
			
		} catch (Exception e) {
			logger.error("Error en obtenerRespuestaCatalogoPorIdred", e);
			throw new Exception("Error en obtenerRespuestaCatalogoPorIdred",e);
		} 
		
		return "false";
	}

	 private ValidarFactibilidadVentaOtrosCanalesGateway() {

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

	 
	 private boolean validarEntrada(SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales)
				throws Exception {
			try {

				if(solicitudFactibilidadVentaOtrosCanales.getIdRed().equalsIgnoreCase("")|| solicitudFactibilidadVentaOtrosCanales.getIdRed() == null){
					throw new Exception();
				}
			} catch (Exception ex) {
				throw new Exception("canal:" + solicitudFactibilidadVentaOtrosCanales.getIdRed());
			}
			try {

				String numCel = String.valueOf(solicitudFactibilidadVentaOtrosCanales.getNumeroCelular());

				if (numCel.length() != 8) {
					throw new Exception(
							String.valueOf(" el largo no corresponde, numeroCelular: "
									+ solicitudFactibilidadVentaOtrosCanales.getNumeroCelular()));
				}
				Integer.parseInt(numCel);

			} catch (Exception ex) {
				throw new Exception("numeroCelular: "
						+ String.valueOf(solicitudFactibilidadVentaOtrosCanales.getNumeroCelular()));
			}
	
			return true;
		}


private ObtenerOfertaHelper Helper = new ObtenerOfertaHelper();
private static final Logger logger = LoggerFactory.getLogger(ValidarFactibilidadVentaOtrosCanalesGateway.class);
private static ValidarFactibilidadVentaOtrosCanalesGateway INSTANCE = new ValidarFactibilidadVentaOtrosCanalesGateway();
private RespuestaServicio respuestaServicio;
private Response response;
private Response obtenerResponseEnDuro() {
		Response response = new Response();
		response.setRespuesta("Respuesta Respuesta Factibilidad");
		RespuestaServicio respuestaServicio = new  RespuestaServicio();
		respuestaServicio.setCodigo(123);
	
		respuestaServicio.setMensaje("Mensaje Mensaje Factibilidad");
		response.setRespuestaServicio(respuestaServicio );
		return response;
	}

}
