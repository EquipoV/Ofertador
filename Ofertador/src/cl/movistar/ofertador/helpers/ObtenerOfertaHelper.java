package cl.movistar.ofertador.helpers;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import org.apache.axis.AxisFault;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.movista.ofertadorintegration.serviciosfacade.BitacoraHibernateFacade;
import cl.movista.ofertadorintegration.serviciosfacade.ObtenerDatosClienteFacade;
import cl.movista.ofertadorintegration.serviciosfacade.ObtenerIncompatibilidadOfertadorFacade;
import cl.movista.ofertadorintegration.serviciosfacade.ObtenerListaOfertaFacade;
import cl.movista.ofertadorintegration.serviciosfacade.ObtenerOfertasBIFacade;
import cl.movista.ofertadorintegration.serviciosfacade.ObtenerParqueFacade;
import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.hibernate.dto.MovimientosTracking2;
import cl.movistar.obetenercincompatibilidadofertador.dto.RespuestaIncompatibilidadOferta;
import cl.movistar.obtenerdatoscliente.dto.Cliente;
import cl.movistar.obtenerdatoscliente.dto.RespuestaDatosCliente;
import cl.movistar.obtenerlistaoferta.dto.RespuestaListaOferta;
import cl.movistar.obtenerlistaoferta.dto.SolicitudListaOferta;
import cl.movistar.obtenerofertasbi.dto.OfertaBI;
import cl.movistar.obtenerofertasbi.dto.RespuestaOfertasBI;
import cl.movistar.obtenerofertasbi.dto.SolicitudOfertasBI;
import cl.movistar.obtenerparque.impl.RespuestaParque;
import cl.movistar.obtenerparque.impl.itemParque;
import cl.movistar.ofertador.dto.Oferta;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.RespuestaServicio;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.gateway.ObtenerOfertaGateway;
import cl.movistar.ofertador.matrizq.MatrizQHelper;
import cl.movistar.ofertador.recursos.OfertadorException;

import java.util.logging.Level;

public class ObtenerOfertaHelper {

	public ResponseOfertas datosEnduro() {

		ResponseOfertas responseOfertas = new ResponseOfertas();
		RespuestaServicio respuestaServicio = new RespuestaServicio();

		respuestaServicio.setCodigo(1);

		respuestaServicio.setMensaje("Mensaje Mensaje");

		responseOfertas.setRespuestaServicio(respuestaServicio);

		Oferta oferta1 = new Oferta();
		oferta1.setCanal("Canal");
		oferta1.setCodigoOferta("Código Oferta");
		oferta1.setCodigoServicioSuplementario("Código Servicio Suplementario");
		oferta1.setDescripcion("Descripcion");
		oferta1.setEstado("Estado");
		oferta1.setFamilia("Familia");
		oferta1.setFamiliaridad("Familiaridad");
		oferta1.setFechaInicio("11/12/1985");
		oferta1.setFechaTermino("11/12/2014");
		oferta1.setId(1);
		oferta1.setIdRed("123");
		oferta1.setNombre("Nombre");

		oferta1.setTipoContrato("Tipo de Contrato");
		oferta1.setTipoVigencia("Tipo de Vigencia");

		Oferta[] listaOfretas = new Oferta[] { oferta1, oferta1, oferta1,
				oferta1, oferta1 };

		responseOfertas.setOfertas(listaOfretas);
		return responseOfertas;
	}

	private List<Oferta> obternerOfertasCatalogo(
			SolicitudOferta solicitudOferta, String tipoContrato)
			throws OfertadorException {

		List<Oferta> ofertas = new ArrayList<Oferta>();
		RespuestaListaOferta respuestaListaOferta;

		SolicitudListaOferta solicitudListaOferta = new SolicitudListaOferta();
		solicitudListaOferta.setCanal(solicitudOferta.getCanal());
		solicitudListaOferta.setFamilia(solicitudOferta.getFamilia());
		solicitudListaOferta.setVisualizacion(solicitudOferta
				.getVisualizacion());
		solicitudListaOferta.setTipoContrato(tipoContrato);

		try {

			respuestaListaOferta = obtenerListaOfertaFacade
					.obtenerListaOferta(solicitudListaOferta);

		} catch (Exception e) {
			throw new OfertadorException(
					950017,
					"No se encontraron Ofertas Generales en el catálogo de bolsas",
					e);
		}

		if (respuestaListaOferta.getCodigo().equalsIgnoreCase("000")) {
			List<cl.movistar.obtenerlistaoferta.dto.Oferta> ofertasCatalogo = respuestaListaOferta
					.getOfertas();

			for (int i = 0; i < ofertasCatalogo.size(); i++) {

				Oferta oferta = new Oferta();

				oferta.setCanal(ofertasCatalogo.get(i).getCanal());
				oferta.setCodigoOferta(ofertasCatalogo.get(i).getCodigoOferta());
				oferta.setCodigoServicioSuplementario(ofertasCatalogo.get(i)
						.getCodigoServicioSuplementario());
				oferta.setDescripcion(ofertasCatalogo.get(i).getDescripcion());
				oferta.setEstado(ofertasCatalogo.get(i).getEstado());
				oferta.setFamilia(ofertasCatalogo.get(i).getFamilia());
				oferta.setFamiliaridad(ofertasCatalogo.get(i).getFamiliaridad());
				oferta.setFechaInicio(ofertasCatalogo.get(i).getFechaInicio());
				oferta.setFechaTermino(ofertasCatalogo.get(i).getFechaTermino());
				oferta.setIdRed(ofertasCatalogo.get(i).getIdRed());
				oferta.setNombre(ofertasCatalogo.get(i).getNombre());
				oferta.setTipoContrato(ofertasCatalogo.get(i).getTipoContrato());
				oferta.setTipoVigencia(ofertasCatalogo.get(i).getTipoVigencia());

				ofertas.add(oferta);

			}
		}
		return ofertas;
	}

	private Oferta obternerOfertasCatalogoPorCodOferta(String codigoOferta)
			throws Exception {

		List<Oferta> ofertas = new ArrayList<Oferta>();
		RespuestaListaOferta respuestaListaOferta;

		SolicitudListaOferta solicitudListaOferta = new SolicitudListaOferta();
		solicitudListaOferta.setCodigoOferta(codigoOferta);

		respuestaListaOferta = obtenerListaOfertaFacade
				.obtenerListaOferta(solicitudListaOferta);

		if (respuestaListaOferta.getCodigo().equalsIgnoreCase("000")) {
			List<cl.movistar.obtenerlistaoferta.dto.Oferta> ofertasCatalogo = respuestaListaOferta
					.getOfertas();

			for (int i = 0; i < ofertasCatalogo.size(); i++) {

				Oferta oferta = new Oferta();

				oferta.setCanal(ofertasCatalogo.get(i).getCanal());
				oferta.setCodigoOferta(ofertasCatalogo.get(i).getCodigoOferta());
				oferta.setCodigoServicioSuplementario(ofertasCatalogo.get(i)
						.getCodigoServicioSuplementario());
				oferta.setDescripcion(ofertasCatalogo.get(i).getDescripcion());
				oferta.setEstado(ofertasCatalogo.get(i).getEstado());
				oferta.setFamilia(ofertasCatalogo.get(i).getFamilia());
				oferta.setFamiliaridad(ofertasCatalogo.get(i).getFamiliaridad());
				oferta.setFechaInicio(ofertasCatalogo.get(i).getFechaInicio());
				oferta.setFechaTermino(ofertasCatalogo.get(i).getFechaTermino());
				oferta.setIdRed(ofertasCatalogo.get(i).getIdRed());
				oferta.setNombre(ofertasCatalogo.get(i).getNombre());
				oferta.setTipoContrato(ofertasCatalogo.get(i).getTipoContrato());
				oferta.setTipoVigencia(ofertasCatalogo.get(i).getTipoVigencia());

				ofertas.add(oferta);

			}
			return ofertas.get(0);
		}
		return null;
	}

	private List<Oferta> obternerOfertasCatalogoPorSS(
			String codigoServicioSuplementario) throws Exception {

		List<Oferta> ofertas = new ArrayList<Oferta>();
		RespuestaListaOferta respuestaListaOferta;

		SolicitudListaOferta solicitudListaOferta = new SolicitudListaOferta();

		solicitudListaOferta
				.setCodigoServicioSuplementario(codigoServicioSuplementario);

		respuestaListaOferta = obtenerListaOfertaFacade
				.obtenerListaOferta(solicitudListaOferta);

		if (respuestaListaOferta.getCodigo().equalsIgnoreCase("000")) {
			List<cl.movistar.obtenerlistaoferta.dto.Oferta> ofertasCatalogo = respuestaListaOferta
					.getOfertas();

			for (int i = 0; i < ofertasCatalogo.size(); i++) {

				Oferta oferta = new Oferta();

				oferta.setCanal(ofertasCatalogo.get(i).getCanal());
				oferta.setCodigoOferta(ofertasCatalogo.get(i).getCodigoOferta());
				oferta.setCodigoServicioSuplementario(ofertasCatalogo.get(i)
						.getCodigoServicioSuplementario());
				oferta.setDescripcion(ofertasCatalogo.get(i).getDescripcion());
				oferta.setEstado(ofertasCatalogo.get(i).getEstado());
				oferta.setFamilia(ofertasCatalogo.get(i).getFamilia());
				oferta.setFamiliaridad(ofertasCatalogo.get(i).getFamiliaridad());
				oferta.setFechaInicio(ofertasCatalogo.get(i).getFechaInicio());
				oferta.setFechaTermino(ofertasCatalogo.get(i).getFechaTermino());
				oferta.setIdRed(ofertasCatalogo.get(i).getIdRed());
				oferta.setNombre(ofertasCatalogo.get(i).getNombre());
				oferta.setTipoContrato(ofertasCatalogo.get(i).getTipoContrato());
				oferta.setTipoVigencia(ofertasCatalogo.get(i).getTipoVigencia());

				ofertas.add(oferta);

			}
		}
		return ofertas;
	}

	public Cliente obtenerCliente(int numeroCelular) throws AxisFault, MalformedURLException, RemoteException, Exception {

		RespuestaDatosCliente respuestaDatosCliente = obtenerDatosClienteFacade
				.obtenerDatosCliente(numeroCelular);
		Cliente cliente = null;

		if (respuestaDatosCliente.getCodigoRetorno().equals("0")
				&& !respuestaDatosCliente.getMensaje().equals(
						"Número Celular Inválido")) {

			cliente = respuestaDatosCliente.getCliente();
		} else if (respuestaDatosCliente.getMensaje().equals(
				"Número Celular Inválido")) {

			throw new Exception("Cliente no encontrado con Número Celular: "
					+ numeroCelular);
		}

		return cliente;
	}

	public List<Oferta> obtenerOfertasParqueBitacora(int numeroCelular)
			throws Exception {
		List<Oferta> ofertas = new ArrayList<Oferta>();
		List<Oferta> ofertasBitacora = null;
		List<Oferta> ofertasParque = null;
		try {

			ofertasParque = obtenerOfertasParque(String.valueOf(numeroCelular));

			ofertasBitacora = obtenerOfertasBitacora(numeroCelular);

			if (ofertasParque.size() == 0) {
				logger.info("No se encontraron Ofertas de Parque");
			} else {

				ofertas.addAll(ofertasParque);
			}

			if (ofertasBitacora.size() == 0) {
				logger.info("No se encontraron Ofertas de Bitacora");
			} else {

				ofertas.addAll(ofertasBitacora);
			}

		} catch (Exception e) {
			throw new Exception(
					"Error al obtener la Bitacorra de Movimientos o Parque", e);
		}

		return ofertas;
	}

	private List<Oferta> obtenerOfertasParque(String numCelular)
			throws Exception {
		List<Oferta> ofertas = new ArrayList<Oferta>();

		RespuestaParque respuestaParque = obtenerParqueFacade
				.obtenerParque(numCelular);

		String codigo = respuestaParque.getCodigoError();

		if (codigo.equalsIgnoreCase("0")) {

			itemParque[] itemsParque = respuestaParque.getListaSSAbonado();

			for (int i = 0; i < itemsParque.length; i++) {

				try {
					List<Oferta> ofertasParqueCatalogo = obternerOfertasCatalogoPorSS(itemsParque[i]
							.getCodigoSS());

					ofertas.add(ofertasParqueCatalogo.get(0));

				} catch (Exception e) {
					logger.info("No se encontro oferta en catálogo código SS: "
							+ itemsParque[i].getCodigoSS());
				}
			}
		}

		return ofertas;
	}

	private List<Oferta> obtenerOfertasBitacora(int numeroCelular)
			throws Exception {

		List<MovimientosTracking> movimientosTracking = bitacoraHibernateFacade
				.obtieneMovimientos(numeroCelular);

		List<Oferta> ofertas = new ArrayList<Oferta>();
		if (movimientosTracking != null) {
			for (MovimientosTracking movimiento : movimientosTracking) {

				try {
					Oferta ofertaBitacoraCatalogo = obternerOfertasCatalogoPorCodOferta(movimiento
							.getCodigoOferta());
					if (ofertaBitacoraCatalogo != null)
						ofertas.add(ofertaBitacoraCatalogo);

				} catch (Exception e) {
					logger.info("No se encontro oferta de Bitacora en Catálogo código: "
							+ movimiento.getCodigoOferta());
				}
			}
		}
		return ofertas;
	}

	public List<Oferta> eliminarOfertasContratadas(
			List<Oferta> ofertasCatalogo, List<Oferta> ofertasParqueYEnVuelo)
			throws OfertadorException {

		List<Oferta> listaAux = new ArrayList<Oferta>(ofertasCatalogo);

		for (int j = 0; j < ofertasParqueYEnVuelo.size(); j++) {
			// Si el Codigo de Oferta de las ofertas de Parque se encuentra en
			// las Ofertas De Catalogo, entonces e elimina la oferta en la lista
			// de catalogo.

			listaAux = eliminarOfertasContratadasComparando(
					ofertasParqueYEnVuelo.get(j), listaAux);

		}

		if (listaAux == null || listaAux.size() == 0)
			throw new OfertadorException(
					950018,
					"No tiene ofertas disponibles porque se encuentran contratadas o en proceso de contratación",
					new Exception(
							"Se eliminaron todas las Ofertas porque ya estaban en Parque o En vuelo"));

		return listaAux;
	}

	private List<Oferta> eliminarOfertasContratadasComparando(
			Oferta ofertaAEliminar, List<Oferta> ofertasCatalogo) {

		for (Oferta ofertaCatalogo : ofertasCatalogo) {

			if (ofertaAEliminar.getCodigoOferta().equalsIgnoreCase(
					ofertaCatalogo.getCodigoOferta())) {

				ofertasCatalogo.remove(ofertaCatalogo);

				logger.info("Oferta Eliminada ya que se encuentra En Vuelo o en el Parque, Codigo Oferta: "
						+ ofertaCatalogo.getCodigoOferta());
				break;
			}
		}
		return ofertasCatalogo;

	}

	public List<Oferta> aplicarMatrizQ(List<Oferta> OfertasParqueYEnVuelo,
			List<Oferta> ofertasEliminadasContradas, String planCliente)
			throws Exception {
		List<Oferta> ofertasMatrizQAplicada = null;
		ofertasMatrizQAplicada = matrizQhelper.AplicarMatrizQ(
				OfertasParqueYEnVuelo, ofertasEliminadasContradas, planCliente);

		if (ofertasMatrizQAplicada == null
				|| !(ofertasMatrizQAplicada.size() > 0)) {

			throw new OfertadorException(
					950019,
					"No tiene ofertas disponibles debido a que alcanzó el máximo de ofertas por familia",
					new Exception(
							"Se eliminaron todas las ofertas por no cumplir con alguna regla de la matriz Q"));
		}

		return ofertasMatrizQAplicada;
	}

	private List<Oferta> obternerOfertasBI(SolicitudOferta solicitudOferta,
			String visualizacion) throws Exception {
		List<OfertaBI> listaContencion = null;
		SolicitudOfertasBI solicitudOfertasBI = new SolicitudOfertasBI();
		// en BI la visualización es el canal
		solicitudOfertasBI.setCanal(visualizacion);
		solicitudOfertasBI.setNumero_linea(String.valueOf(solicitudOferta
				.getNumeroCelular()));

		RespuestaOfertasBI respuestaOfertasBI = obtenerOfertasBIFacade
				.obtenerOfertaBI(solicitudOfertasBI);
		List<Oferta> ofertas = null;
		if (respuestaOfertasBI.getCodigoRetorno().equals("0")) {
			listaContencion = respuestaOfertasBI.getListaOfertasBI();
			ofertas = new ArrayList<Oferta>();

			for (OfertaBI ofertaBI : listaContencion) {
				Oferta obternerOfertasCatalogoPorCodOferta = obternerOfertasCatalogoPorCodOferta(ofertaBI
						.getOfertaId());
				if (obternerOfertasCatalogoPorCodOferta != null) {
					ofertas.add(obternerOfertasCatalogoPorCodOferta);
				} else if (obternerOfertasCatalogoPorCodOferta == null) {
					logger.info("No se encontro Oferta BI en Catalogo, CODIGO OFERTA: "
							+ ofertaBI.getOfertaId());
				}
			}
		}

		if (ofertas == null || ofertas.size() == 0)
			throw new Exception(
					"No se encontraró ninguna oferta de Bi en Catálogo");

		return ofertas;
	}

	public List<Oferta> aplicarMatrizDeIncompatibilidad(
			List<Oferta> ofertasParqueYEnVuelo, List<Oferta> OfertasTotales)
			throws OfertadorException, Exception {

		List<String> ofertaFamiliaridadOrigen = new ArrayList<String>();
		// Tomamos las familiaridades de origen
		for (Oferta oferta : ofertasParqueYEnVuelo) {
			String familiaridad = oferta.getFamiliaridad();
			ofertaFamiliaridadOrigen.add(familiaridad);
		}

		RespuestaIncompatibilidadOferta respuestaIncompatibilidadOferta = obtenerIncompatibilidadOfertadorFacade
				.obtenerIncompatibilidad(ofertaFamiliaridadOrigen);

		int codigoRetornoMatriz = Integer
				.valueOf(respuestaIncompatibilidadOferta.getCodigoRetorno());
		// Si existem familiaridades de retorno, elimina las ofertas
		// incompatibles.
		if (codigoRetornoMatriz == 0) {
			List<String> ofertaFamiliaridadDestino = respuestaIncompatibilidadOferta
					.toList();

			for (int i = 0; i < ofertaFamiliaridadDestino.size(); i++) {

				OfertasTotales = eliminarPorfamiliaridad(OfertasTotales,
						ofertaFamiliaridadDestino.get(i));

			}
		}

		if (OfertasTotales == null || OfertasTotales.size() == 0)
			throw new OfertadorException(
					950020,
					"No tiene ofertas diponibles debido a incompatibilidades entre ofertas y sus bolsas/plan contratado",
					new Exception(
							"Las Ofertas no son compatibles con la Matriz de Incompatibilidad"));

		return OfertasTotales;
	}

	private List<Oferta> eliminarPorfamiliaridad(List<Oferta> ofertasTotales,
			String string) {

		try {

			for (Oferta oferta : ofertasTotales) {
				if (oferta.getFamiliaridad().equalsIgnoreCase(string)) {
					ofertasTotales.remove(oferta);
					return eliminarPorfamiliaridad(ofertasTotales, string);
				}
			}
			

		} catch (Exception e) {
			logger.debug("Error en eliminarPorfamiliaridad", e);
		}
		
		return ofertasTotales;
	}

	/**
	 * @param tipoContrato
	 * @return the ofertaGeneralControl
	 */
	public List<Oferta> getOfertaGeneral(SolicitudOferta solicitudOferta,
			String tipoContrato) throws OfertadorException {
		setOfertaGeneralControl(solicitudOferta, tipoContrato);
		return ofertaGeneralControl;
	}

	/**
	 * @param ofertaGeneralControl
	 *            the ofertaGeneralControl to set
	 */
	private void setOfertaGeneralControl(SolicitudOferta solicitudOferta,
			String tipoContrato) throws OfertadorException {

		SolicitudOferta solicitudOfertaAUX = new SolicitudOferta();
		solicitudOfertaAUX.setCanal(solicitudOferta.getCanal());
		solicitudOfertaAUX.setFamilia(solicitudOferta.getFamilia());
		solicitudOfertaAUX.setNumeroCelular(solicitudOferta.getNumeroCelular());
		solicitudOfertaAUX.setVisualizacion("general");

		this.ofertaGeneralControl = obternerOfertasCatalogo(solicitudOfertaAUX,
				tipoContrato);
	}

	/**
	 * @return the ofertaSugeridaControl
	 */
	public List<Oferta> getOfertaSugerida(SolicitudOferta solicitudOferta)
			throws OfertadorException {

		try {
			setOfertaSugeridaControl(solicitudOferta);
		} catch (Exception e) {
			throw new OfertadorException(950021,
					"No se encontraron Ofertas Sugeridas para el Cliente", e);
		}

		return this.ofertaSugeridaControl;
	}

	/**
	 * @param ofertaSugeridaControl
	 *            the ofertaSugeridaControl to set
	 */
	private void setOfertaSugeridaControl(SolicitudOferta solicitudOferta)
			throws Exception {

		this.ofertaSugeridaControl = obternerOfertasBI(solicitudOferta,
				"sugerida");
	}

	/**
	 * @return the ofertaContencionControl
	 */
	public List<Oferta> getOfertaContencion(SolicitudOferta solicitudOferta)
			throws OfertadorException, Exception {
		try {
			setOfertaContencionControl(solicitudOferta);
		} catch (Exception e) {
			throw new OfertadorException(950022,
					"No se encontraron Ofertas de Contención para el Cliente",
					e);
		}
		return ofertaContencionControl;
	}

	/**
	 * @param ofertaContencionControl
	 *            the ofertaContencionControl to set
	 */
	private void setOfertaContencionControl(SolicitudOferta solicitudOferta)
			throws Exception {

		this.ofertaContencionControl = obternerOfertasBI(solicitudOferta,
				"contencion");
	}

	public List<Oferta> dejarSoloOfertasNoRecurrentes(
			List<Oferta> ofertasGeneralesCatalogo) throws OfertadorException {
	
		if (ofertasGeneralesCatalogo.size()>0) {
			for (Oferta oferta : ofertasGeneralesCatalogo) {
				if (oferta.getTipoVigencia().equalsIgnoreCase("RECURRENTE")
						|| oferta.getTipoVigencia().equalsIgnoreCase("1")) {
					ofertasGeneralesCatalogo.remove(oferta);
					dejarSoloOfertasNoRecurrentes(ofertasGeneralesCatalogo);
				}else{
					
					return ofertasGeneralesCatalogo;
				}
			}
	}else{
		
	  throw new OfertadorException(950023,"No se encontraron Ofertas No Recurrentes",new Exception("Se eliminaron todas las ofertas por ser todas Recurrentes"));
	}
		return ofertasGeneralesCatalogo;
	}

	public ObtenerOfertaHelper() {

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

	private List<Oferta> ofertaGeneralControl = new ArrayList<Oferta>();
	private List<Oferta> ofertaSugeridaControl = new ArrayList<Oferta>();
	private List<Oferta> ofertaContencionControl = new ArrayList<Oferta>();
	private ObtenerListaOfertaFacade obtenerListaOfertaFacade = new ObtenerListaOfertaFacade();
	private ObtenerIncompatibilidadOfertadorFacade obtenerIncompatibilidadOfertadorFacade = new ObtenerIncompatibilidadOfertadorFacade();
	private ObtenerDatosClienteFacade obtenerDatosClienteFacade = new ObtenerDatosClienteFacade();
	private BitacoraHibernateFacade bitacoraHibernateFacade = new BitacoraHibernateFacade();
	private ObtenerParqueFacade obtenerParqueFacade = new ObtenerParqueFacade();
	private ObtenerOfertasBIFacade obtenerOfertasBIFacade = new ObtenerOfertasBIFacade();
	private MatrizQHelper matrizQhelper = new MatrizQHelper();
	private static final Logger logger = LoggerFactory
			.getLogger(ObtenerOfertaHelper.class);
	// private static final java.util.logging.Logger logger =
	// java.util.logging.Logger
	// .getLogger(ObtenerOfertaHelper.class.getName());

}
