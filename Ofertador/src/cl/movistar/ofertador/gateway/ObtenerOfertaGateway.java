package cl.movistar.ofertador.gateway;

import java.util.ArrayList;
import java.util.List;

import cl.movistar.obtenerdatoscliente.dto.Cliente;
import cl.movistar.ofertador.dto.Oferta;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.helpers.ObtenerOfertaHelper;
import cl.movistar.ofertador.recursos.OfertadorException;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ObtenerOfertaGateway {

	public static ObtenerOfertaGateway getInstance() {
		return INSTANCE;
	}

	public ResponseOfertas obtenerOfertas(SolicitudOferta solicitudOferta,
			boolean dummy) throws Exception {

		ResponseOfertas responseOfertas;
		if (dummy) {

			responseOfertas = Helper.datosEnduro();

		} else {

			responseOfertas = obtenerOfertas(solicitudOferta);

		}

		return responseOfertas;
	}



	private ResponseOfertas obtenerOfertas(SolicitudOferta solicitudOferta)
			throws Exception {
		responseOfertas = new ResponseOfertas();
		respuestaServicio = new RespuestaServicio();
		ofertasFinales = new ArrayList<Oferta>();
		


		try {

			try {
				if (validarEntrada(solicitudOferta))
					;

			} catch (Exception e) {
				
				throw new OfertadorException(950001,"No se han ingresado los parametros requeridos, Error en parametro de entrada, "
						+ e.getMessage(),e);
			}

			try {
				cliente = Helper.obtenerCliente(solicitudOferta
						.getNumeroCelular());
			} catch (Exception e) {

				throw new OfertadorException(950016,"Cliente no encontrado con Número Celular: "+solicitudOferta.getNumeroCelular(),e);
			}
			String tipoPlan = cliente.getTipoPlan();

			if (!tipoPlan.equalsIgnoreCase("I")) {

				throw new OfertadorException(950014,"Plan de Cliente erróneo, debe Individual y no grupal",new Exception("Cliente grupal no individual"));
			}

			if (cliente.getSituacionAbonado().equals("BAA")
					&& cliente.getTipoAbonado().equalsIgnoreCase("Contrato")) {

				throw new OfertadorException(950015,"Cliente contrato MOROSO, no es posible vender Bolsas",new Exception("Cliente con contrato y Moroso"));
			}

			// Empieza flujo segun caso de visualización
			int intVisualizacion;
			try {
				intVisualizacion = obtenerVisualizacion(solicitudOferta
						.getVisualizacion());
			} catch (Exception e) {
				intVisualizacion = 0;
			}

			switch (intVisualizacion) {
			case 1: {
				ofertasFinales = flujoGeneralObtenerOferta(solicitudOferta);
			}
				break;
			case 2: {
				ofertasFinales = flujoSugeridaObtenerOferta(solicitudOferta);
			}
				break;
			case 3: {
				ofertasFinales = flujoContencionObtenerOferta(solicitudOferta);
			}
				break;

			case 0:
				ofertasFinales = flujoNormalObtenerOferta(solicitudOferta);
				break;
			}
			
		

		} catch (OfertadorException ex) {

			logger.error("Error Controlado en ObtenerOfertas", ex);
			respuestaServicio.setCodigo(ex.getCodigoError());
			respuestaServicio.setMensaje(ex.getDescripcionError());
			responseOfertas.setRespuestaServicio(respuestaServicio);
			try{
			logger.info("Proceso Insatisfactorio para el CLiente: " +cliente.getNombreCliente() +" "+cliente.getApellido1Usuario()+" "+cliente.getApellido2Usuario()+", Número Celular: "+ cliente.getNumCelular());
			}catch (Exception e){logger.info("Proceso Insatisfactorio, no se alcanzó a recuperar datos Cliente");}
		} finally {
					Oferta[] ofertasFinalesAUX = ofertasFinales
							.toArray(new Oferta[ofertasFinales.size()]);
					if (ofertasFinalesAUX.length != 0){
					
					// Retornar ofertas
					responseOfertas.setOfertas(ofertasFinalesAUX);
					// Exito
					respuestaServicio.setCodigo(0);
					respuestaServicio.setMensaje("Proceso Exitoso");
					responseOfertas.setRespuestaServicio(respuestaServicio);
					logger.info("Proceso Exitoso con Ofertas Entregadas al CLiente: " +cliente.getNombreCliente() +" "+cliente.getApellido1Usuario()+" "+cliente.getApellido2Usuario()+", Número Celular: "+ cliente.getNumCelular());
					}
		}
		
		return responseOfertas;
	}

	private List<Oferta> flujoContencionObtenerOferta(
			SolicitudOferta solicitudOferta) throws Exception,OfertadorException {

		// Obtener ofertas sugeridas y contención (WS Bi)
		List<Oferta> ofertasOfertasContencion = Helper
				.getOfertaContencion(solicitudOferta);

		// Obtener las ofertas desde Parque y Bitacora de Recurrencia
		List<Oferta> OfertasParqueYEnVuelo = Helper
						.obtenerOfertasParqueBitacora(solicitudOferta
								.getNumeroCelular());
				
		//Si no encuentra nada en Parque O En vuelo, devuelve las ofertas de Catálogo inmediatamente.
		if(OfertasParqueYEnVuelo.size()==0){return ofertasOfertasContencion;}
					
		// Eliminar del listado de ofertas, todas las ofertas que el
		// cliente tenga contratadas
		List<Oferta> ofertasEliminadasContradasContencion = Helper
				.eliminarOfertasContratadas(ofertasOfertasContencion,
						OfertasParqueYEnVuelo);
						
	return ofertasEliminadasContradasContencion;
	}

	private List<Oferta> flujoSugeridaObtenerOferta(
			SolicitudOferta solicitudOferta) throws Exception,OfertadorException {
		
		// Obtener ofertas sugeridas (WS BI)
		List<Oferta> ofertasOfertasSugeridas = Helper
				.getOfertaSugerida(solicitudOferta);

		// Obtener las ofertas desde Parque y Bitacora de Recurrencia
		List<Oferta> OfertasParqueYEnVuelo = Helper
						.obtenerOfertasParqueBitacora(solicitudOferta
								.getNumeroCelular());
				
		//Si no encuentra nada en Parque O En vuelo, devuelve las ofertas de Catálogo inmediatamente.
		if(OfertasParqueYEnVuelo.size()==0){return ofertasOfertasSugeridas;}
					
		// Eliminar del listado de ofertas, todas las ofertas que el
		// cliente tenga contratadas
		List<Oferta> ofertasEliminadasContradasSugeridas = Helper
				.eliminarOfertasContratadas(ofertasOfertasSugeridas,
						OfertasParqueYEnVuelo);
				
		return ofertasEliminadasContradasSugeridas;
	}

	private List<Oferta> flujoGeneralObtenerOferta(
			SolicitudOferta solicitudOferta) throws Exception,OfertadorException {

		// Obtener las ofertas Generales desde catálogo(WS Catálogo).
		List<Oferta> ofertasGeneralesCatalogo = Helper
				.getOfertaGeneral(solicitudOferta,cliente.getTipoAbonado());

		// Verificar que la situacion del cliente es Moroso o No Moroso y es
		// Hibrido o Prepago.
		
			if (cliente.getSituacionAbonado().equals("BAA")
					&& !cliente.getTipoAbonado().equalsIgnoreCase("Contrato")) {

			// Dejar sólo las ofertas que sean de tipo contrasaldo
			ofertasGeneralesCatalogo = Helper
					.dejarSoloOfertasNoRecurrentes(ofertasGeneralesCatalogo);
		}
		// Obtener las ofertas desde Parque y Bitacora de Recurrencia
		List<Oferta> OfertasParqueYEnVuelo = Helper
				.obtenerOfertasParqueBitacora(solicitudOferta
						.getNumeroCelular());
		//Si no encuentra nada en Parque O En vuelo, devuelve las ofertas de Catálogo inmediatamente.
		if(OfertasParqueYEnVuelo.size()==0){return ofertasGeneralesCatalogo;}
		
			
		// Eliminar del listado de ofertas, todas las ofertas que el
		// cliente tenga contratadas
		List<Oferta> ofertasEliminadasContradasGenerales = Helper
				.eliminarOfertasContratadas(ofertasGeneralesCatalogo,
						OfertasParqueYEnVuelo);

		// Aplicar Matriz Q a las Ofertas Generales
		List<Oferta> ofertasMatrizQAplicadaGenerales = null;
		
			ofertasMatrizQAplicadaGenerales = Helper.aplicarMatrizQ(
					OfertasParqueYEnVuelo, ofertasEliminadasContradasGenerales,
					cliente.getTipoAbonado());
	

		// Aplicar matriz de incompatibilidad al listado de ofertas
		// Generales
		List<Oferta> ofertasMatrizIncompAplicadaGenerales = null;
		if (ofertasMatrizQAplicadaGenerales != null) {
			ofertasMatrizIncompAplicadaGenerales = Helper
					.aplicarMatrizDeIncompatibilidad(OfertasParqueYEnVuelo,
							ofertasMatrizQAplicadaGenerales);
		}

		return ofertasMatrizIncompAplicadaGenerales;
	}

	private List<Oferta> flujoNormalObtenerOferta(
			SolicitudOferta solicitudOferta) throws OfertadorException {

			List<Oferta> ofertasTotales = new ArrayList<Oferta>();
			List<Oferta> ofertasGenerales = null;
			String mensajeSugerida = "";
			String mensajeGeneral = "";
			String mensajeContencion = "";
			
			try {
				ofertasGenerales = flujoGeneralObtenerOferta(solicitudOferta);
			} catch (OfertadorException e) {
				 mensajeGeneral = e.getDescripcionError();
				logger.info(e.getMessage());
			} catch (Exception e) {
				logger.info(e.getMessage());
			}
			
			if (ofertasGenerales != null)
				ofertasTotales.addAll(ofertasGenerales);
			List<Oferta> ofertasSugeridas = null;
			try {
				ofertasSugeridas = flujoSugeridaObtenerOferta(solicitudOferta);
			} catch (OfertadorException e) {
				 mensajeSugerida = e.getDescripcionError();
				logger.info(e.getMessage());
			} catch (Exception e) {
				logger.info(e.getMessage());
			}
			
			if (ofertasSugeridas != null)
				ofertasTotales.addAll(ofertasSugeridas);
			List<Oferta> ofertasContencion = null;
			
			try {
				ofertasContencion = flujoContencionObtenerOferta(solicitudOferta);
			} catch (OfertadorException e) {
				 mensajeContencion = e.getDescripcionError();
				 logger.info(e.getMessage());
			} catch (Exception e) {
				logger.info(e.getMessage());
			}
			
			if (ofertasContencion != null)
				ofertasTotales.addAll(ofertasContencion);

			if(ofertasTotales.size()==0)throw new OfertadorException(950004,"No se encontraron Ofertas, posibles motivos: "+mensajeGeneral+", "+mensajeSugerida+", "+mensajeContencion,new Exception("No se encontraron Ofertas, Generales, Sugeridas o de Contención"));
			
			return ofertasTotales;
	}

	private int obtenerVisualizacion(String visualizacion) {

		if(visualizacion.equals(""))
			return 0;
		if (visualizacion.equalsIgnoreCase("general"))
			return 1;
		if (visualizacion.equalsIgnoreCase("generales"))
			return 1;
		if (visualizacion.equalsIgnoreCase("sugerida"))
			return 2;
		if (visualizacion.equalsIgnoreCase("sugeridas"))
			return 2;
		if (visualizacion.equalsIgnoreCase("contencion"))
			return 3;
		if (visualizacion.equalsIgnoreCase("contenciones"))
			return 3;
		if (visualizacion.equalsIgnoreCase("contención"))
			return 3;
		

		return -1;
	}

	private boolean validarEntrada(SolicitudOferta solicitudOferta)
			throws Exception {
		try {

			Integer.parseInt(solicitudOferta.getCanal());

		} catch (Exception ex) {
			throw new Exception("canal: " + solicitudOferta.getCanal());
		}
		try {

			String numCel = String.valueOf(solicitudOferta.getNumeroCelular());

			if (numCel.length() != 8) {
				throw new Exception(
						String.valueOf(" el largo no corresponde, numeroCelular: "
								+ solicitudOferta.getNumeroCelular()));
			}
			Integer.parseInt(numCel);

		} catch (Exception ex) {
			throw new Exception("numeroCelular: "
					+ String.valueOf(solicitudOferta.getNumeroCelular()));
		}
		try {
			if ((solicitudOferta.getVisualizacion() == null
					|| (solicitudOferta.getVisualizacion().equalsIgnoreCase(""))
					|| (solicitudOferta.getVisualizacion()
							.equalsIgnoreCase("contención"))
					|| (solicitudOferta.getVisualizacion()
							.equalsIgnoreCase("contencion"))
					|| (solicitudOferta.getVisualizacion()
							.equalsIgnoreCase("general"))
					|| (solicitudOferta.getVisualizacion()
							.equalsIgnoreCase("generales"))
					|| (solicitudOferta.getVisualizacion()
							.equalsIgnoreCase("sugerida")) || (solicitudOferta
						.getVisualizacion().equalsIgnoreCase("sugeridas")))) {
			} else {
				throw new Exception("visualizacion: "
						+ String.valueOf(solicitudOferta.getVisualizacion()));
			}

		} catch (Exception ex) {

			throw new Exception("visualizacion: "
					+ String.valueOf(solicitudOferta.getVisualizacion()));
		}

		return true;
	}

	public ObtenerOfertaGateway() {
		String resourceLog = "cl/movistar/ofertador/recursos/OfertadorLog4j.properties";
		InputStream isLog = this.getClass().getClassLoader()
				.getResourceAsStream(resourceLog);
		Properties props = new Properties();
		try {
			props.load(isLog);
			PropertyConfigurator.configure(props);
			isLog.close();
		} catch (Exception ex) {
			logger.error("No se pudo cargar la configuración del Log4J.", ex);
		}

	}

	private ResponseOfertas responseOfertas;
	private RespuestaServicio respuestaServicio;
	private Cliente cliente;
	private List<Oferta> ofertasFinales;
	private static final Logger logger = LoggerFactory
			.getLogger(ObtenerOfertaGateway.class);
	private ObtenerOfertaHelper Helper = new ObtenerOfertaHelper();
	private static ObtenerOfertaGateway INSTANCE = new ObtenerOfertaGateway();
}
