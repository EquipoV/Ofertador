package cl.movistar.ofertador.gateway;

import cl.movista.ofertadorintegration.serviciosfacade.ObtenerDetalleOfertaFacade;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import cl.movistar.obtenerdetalleoferta.dto.RespuestaDetalleOferta;
import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.detalleoferta.DetalleOferta;
import cl.movistar.ofertador.helpers.ObtenerDetalleOfertaHelper;
//import cl.movistar.ofertador.recursos.Configuracion;
//import java.util.logging.Level;

public class ObtenerDetalleDeOfertaGateway {

	public ResponseDetalleOferta obtieneDetalleDeOferta(String codigoOferta,
			boolean b) throws Exception {

		ResponseDetalleOferta responseDetalleOferta = new ResponseDetalleOferta();
		// En Duro
		if (b) {
			responseDetalleOferta = Helper.obtenerRespuestaEnDuro();
			return responseDetalleOferta;
		}

		try {

			RespuestaDetalleOferta respuestaDetalleOfertaServicioCatalogo = facade
					.obtenerDetalleOferta(codigoOferta);

			RespuestaServicio respuestaServicio = new RespuestaServicio();

			int codigoRespuesta = Integer
					.valueOf(respuestaDetalleOfertaServicioCatalogo
							.getCodigoRespuesta());

			if (codigoRespuesta == 0) {

				// Asignando Detalle desde Catalogo
				DetalleOferta detalleOferta = Helper
						.obtenerParametros(respuestaDetalleOfertaServicioCatalogo
								.getDetalleOferta());
				responseDetalleOferta.setDetalleOferta(detalleOferta);
				respuestaServicio.setCodigo(codigoRespuesta);
				respuestaServicio
						.setMensaje(respuestaDetalleOfertaServicioCatalogo
								.getMensajeRespuesta());
				responseDetalleOferta.setRespuestaServicio(respuestaServicio);
			} else {
				int codigoOfertador = 960000 + codigoRespuesta;
				respuestaServicio.setCodigo(codigoOfertador);
				respuestaServicio
						.setMensaje(respuestaDetalleOfertaServicioCatalogo
								.getMensajeRespuesta());
				responseDetalleOferta.setRespuestaServicio(respuestaServicio);

			}

		} catch (Exception e) {
		logger.error("Error Al obtener Detalle De Oferta", e);
			throw new Exception("Error Al obtener Detalle De Oferta", e);
		}
		return responseDetalleOferta;
	}

	public static ObtenerDetalleDeOfertaGateway getInstance() {
		return INSTANCE;
	}

	private ObtenerDetalleDeOfertaGateway() {

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

	private ObtenerDetalleOfertaHelper Helper = new ObtenerDetalleOfertaHelper();
	private ObtenerDetalleOfertaFacade facade = new ObtenerDetalleOfertaFacade();
	private static ObtenerDetalleDeOfertaGateway INSTANCE = new ObtenerDetalleDeOfertaGateway();
	private static final Logger logger = LoggerFactory
			.getLogger(ObtenerDetalleDeOfertaGateway.class);
//            private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ObtenerDetalleDeOfertaGateway.class.getName());
}
// Servicio QueryProductOffering:
//
// Los c?digos y mensajes de error pueden adoptar los siguientes valores:
//
// o 000: Proceso Exitoso.
// o 001: No se han ingresado los par?metros requeridos.
// o 002: El tipo de datos no es v?lido, par?metro productOfferingId.
// o 003: Error al ejecutar consulta de Ofertas.
// o 004: No se encontraron registros para la consulta solicitada.
// o 005: La oferta consultada no existe.
// o 006: No existen segmentos de mercado asociados a la oferta.
// o 007: No existen canales asociados a la oferta.
// o 008: No existen productos asociados a la oferta.
// o 009: No existen precios asociados a la oferta.
// o 010: Error al obtener el detalle de la oferta.
// o 012: No existe caracter?stica asociada al producto de la oferta.
// o 013: Error al obtener ?rea geogr?fica de la oferta.
// o 014: Error al obtener operaci?n comercial de la oferta.