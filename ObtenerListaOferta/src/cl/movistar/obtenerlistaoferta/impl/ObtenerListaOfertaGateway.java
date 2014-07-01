package cl.movistar.obtenerlistaoferta.impl;

import java.net.URL;
import java.rmi.RemoteException;

import cl.movistar.obtenerlistaoferta.dto.Oferta;
import cl.movistar.obtenerlistaoferta.dto.RespuestaListaOferta;
import cl.movistar.obtenerlistaoferta.dto.SolicitudListaOferta;

import com.telefonica.midrange.findproductofferingservice.FindProductOfferingBindingStub;
import com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType;
import com.telefonica.midrange.findproductofferingservice.FindProductOfferingService;
import com.telefonica.midrange.findproductofferingservice.FindProductOfferingServiceLocator;
import com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingRequest;
import com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse;
import com.telefonica.midrange.findproductofferingservice.types.ProductOfferingAttributes;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.axis.AxisFault;

public class ObtenerListaOfertaGateway {

	private String urlServicio;
	private FindProductOfferingPortType servicio;
	private boolean desconectado;
	private SolicitudListaOferta SolicitudGlobal;

	public ObtenerListaOfertaGateway(String urlServicio, boolean desconectado)
			throws AxisFault, MalformedURLException {
		this.urlServicio = urlServicio;
		this.desconectado = desconectado;
		this.servicio = obtenerServicio();
	}

	private FindProductOfferingPortType obtenerServicio()
			throws MalformedURLException, AxisFault {

		if (this.desconectado) {
			return null;
		}
		FindProductOfferingPortType webService = null;
		try {
			FindProductOfferingServiceLocator wL = new FindProductOfferingServiceLocator();

			wL.setfindProductOfferingEndpointAddress(this.urlServicio);

			FindProductOfferingService w = wL;

			webService = new FindProductOfferingBindingStub(new URL(
					w.getfindProductOfferingAddress()), w);
		} catch (MalformedURLException e) {

			throw new MalformedURLException(
					"Error en el Endpoint de findProductOffering Catálogo");
		} catch (AxisFault e) {
			throw new AxisFault(
					"Error al conectarse con servicio findProductOffering de Catálogo",
					e);
		}
		return webService;
	}

	public RespuestaListaOferta obtenerListaOferta(
			SolicitudListaOferta solicitudListaOferta) throws Exception {
		SolicitudGlobal = solicitudListaOferta;

		RespuestaListaOferta resultado = null;

		FindProductOfferingRequest parametros = obtenerParametros(SolicitudGlobal);

		try {

			resultado = invocaServicioParqueService(parametros);
			
		} catch (RemoteException e) {
			throw new RemoteException("Error en obtenerListaOferta", e);
		} catch (ParseException e) {
			throw new ParseException("Error en obtenerListaOferta", 0);
		}

		if(resultado.getCodigo().equals("002"))throw new Exception("No se encontraron Ofertas Desde Catálogo, obtenerListaOferta");
		
		return resultado;
	}

	private RespuestaListaOferta invocaServicioParqueService(
			FindProductOfferingRequest parametros) throws ParseException,
			RemoteException {
		RespuestaListaOferta respuestaListaOferta = new RespuestaListaOferta();

		//
		// Servicio FindProductOffering:
		//
		// Los c?digos y mensajes de error pueden adoptar los siguientes
		// valores:
		//
		// o 000: Proceso Exitoso.
		// o 001: No se han ingresado los par?metros requeridos.
		// o 002: El tipo de datos no es v?lido, par?metro <par?metro>.
		// o 003: Error al ejecutar consulta de Ofertas mediante Dominio
		// Producto.
		// o 004: Error al ejecutar consulta de Ofertas mediante Dominio Oferta.
		// o 005: Error al ejecutar consulta de Ofertas mediante Dominio Precio.
		// o 006: No se encontraron registros para la consulta solicitada.
		// ,

		FindProductOfferingResponse findPResponse = null;
		try {

			if (parametros != null) {
				findPResponse = servicio.findProductOffering(parametros);

				String codigoRetornoCatalogo = findPResponse.getReturnCode();
				respuestaListaOferta.setCodigo(findPResponse.getReturnCode());

				respuestaListaOferta.setMensaje(findPResponse
						.getReturnDescription());

				if (codigoRetornoCatalogo.equals("000")) {

					respuestaListaOferta
							.setOfertas(obtenerOfertaDeServicio(findPResponse
									.getProductOffering()));
				}
			}
		} catch (NullPointerException e) {
			throw new NullPointerException(
					"Error en dato nulo en invocaServicioParqueService");
		} catch (RemoteException e) {
			throw new RemoteException("Error en invocaServicioParqueService", e);
		} finally {

		  if(findPResponse != null) {

				respuestaListaOferta.setCodigo(findPResponse.getReturnCode());

				respuestaListaOferta.setMensaje(findPResponse
						.getReturnDescription());
			} else if (parametros == null) {
				respuestaListaOferta.setCodigo("001");
				respuestaListaOferta
						.setMensaje("No se han ingresado los parámetros requeridos");

			}
		  
		  
		  if(respuestaListaOferta.getCodigo().equals("006")||(respuestaListaOferta.getCodigo().equals("000")&&respuestaListaOferta.getOfertas().size()==0)){
				respuestaListaOferta.setCodigo("002");
				respuestaListaOferta
						.setMensaje("No se recuperaron ofertas");
		  }

		}

		return respuestaListaOferta;

	}

	private List<Oferta> obtenerOfertaDeServicio(
			ProductOfferingAttributes[] productOffering) throws ParseException {

		List<Oferta> ofertas = new ArrayList<Oferta>();

		for (int i = 0; i < productOffering.length; i++) {

			Oferta oferta = new Oferta();
			if (obtenerFechaInicioCorrespondiente(productOffering[i])
					&& obtenerFechaTerminoCorrespondiente(productOffering[i]) && verificarTipoContrato(productOffering[i])) {
				oferta.setCanal(productOffering[i].getChannelName());
				oferta.setCodigoOferta(productOffering[i].getCodOffering());
				oferta.setCodigoServicioSuplementario(productOffering[i]
						.getSupplementaryService());
				oferta.setDescripcion(productOffering[i].getDescription());
				oferta.setEstado(productOffering[i].getStatus());
				oferta.setFamilia(productOffering[i].getProductOfferingFamily());
				oferta.setFamiliaridad(productOffering[i].getFamiliarityType());
				oferta.setFechaInicio(productOffering[i].getStartDateTime());
				oferta.setFechaTermino(productOffering[i].getEndDateTime());
				oferta.setIdRed(productOffering[i].getIdNetwork());
				oferta.setNombre(productOffering[i].getName());
				oferta.setTipoContrato(productOffering[i].getContractType());
				oferta.setTipoVigencia(productOffering[i].getLifeType());

				ofertas.add(oferta);
			}
		}
		return ofertas;
	}

	
	private boolean verificarTipoContrato(
			ProductOfferingAttributes productOfferingAttributes) {
		if(SolicitudGlobal.getTipoContrato()!=null || SolicitudGlobal.getTipoContrato() != null){
			if(!productOfferingAttributes.getContractType().equalsIgnoreCase(SolicitudGlobal.getTipoContrato())){
				return false;
			}
		}
		return true;
	}

	private FindProductOfferingRequest obtenerParametros(
			SolicitudListaOferta solicitudListaOferta) {

		FindProductOfferingRequest findProductOfferingRequest = null;

		if (solicitudListaOferta != null) {

			findProductOfferingRequest = new FindProductOfferingRequest();
			findProductOfferingRequest.setCodOffering("");
			findProductOfferingRequest.setProductOfferingName("");
			findProductOfferingRequest.setProductSpecificationTechnology("");
			findProductOfferingRequest.setCodProductSpecification("");
			findProductOfferingRequest.setResponsePageAmount("100");
			findProductOfferingRequest.setResponsePageLowerValue("");
			findProductOfferingRequest.setResponsePageUnit("");

			findProductOfferingRequest
					.setProductOfferingStartDateTime("");
			findProductOfferingRequest
					.setProductOfferingEndDateTime("01-01-9999");
			findProductOfferingRequest.setSalesChannelId(0);
			findProductOfferingRequest.setProductSpecificationStatus(0);
			findProductOfferingRequest.setProductSpecificationSubFamily(0);
			findProductOfferingRequest.setProductSpecificationUnitType(0);
			findProductOfferingRequest.setTypeDestination(0);
			findProductOfferingRequest.setPriceLowerValue(Long.valueOf(0));
			findProductOfferingRequest.setPriceUpperValue(Long.valueOf(0));
			findProductOfferingRequest.setMoneyType("");
			findProductOfferingRequest.setMarketSegmentId(0);
			findProductOfferingRequest.setCustomerValue(0);
			findProductOfferingRequest.setFamiliarityType(0);
		}

		try {
					
			if (solicitudListaOferta.getCodigoServicioSuplementario() != null) {
				try {
					findProductOfferingRequest
							.setSupplementaryService(solicitudListaOferta
									.getCodigoServicioSuplementario());
				} catch (Exception e) {

					findProductOfferingRequest.setSupplementaryService("");
				}
			} else {
				findProductOfferingRequest.setSupplementaryService("");
			}

			if (solicitudListaOferta.getCodigoOferta() != null) {

				String codigoOferta = solicitudListaOferta.getCodigoOferta();
				findProductOfferingRequest.setCodOffering(codigoOferta);
			}
			
			 if (solicitudListaOferta.getCanal() != null) {
			 Integer canal = Integer
			 .valueOf(solicitudListaOferta.getCanal());
			
			 findProductOfferingRequest.setSalesChannelId(canal);
			 }
			if (solicitudListaOferta.getFamilia() != null) {
				try {
					Integer familia = Integer.valueOf(solicitudListaOferta
							.getFamilia());
					findProductOfferingRequest
							.setProductSpecificationFamily(familia);
				} catch (Exception e) {
					findProductOfferingRequest.setProductSpecificationFamily(0);
				}
			} else {
				findProductOfferingRequest.setProductSpecificationFamily(0);

			}

			Integer estado = solicitudListaOferta.getEstado();
			// 1 es Activo Comercializable
			if (estado != null) {
				findProductOfferingRequest.setProductOfferingStatus(estado);
			} else {
				findProductOfferingRequest.setProductOfferingStatus(0);
			}
			if (solicitudListaOferta.getVisualizacion() != null) {
				String visualizacion = solicitudListaOferta.getVisualizacion();
				findProductOfferingRequest
						.setVisualizacionType(traducirVisualizacion(visualizacion));
			} else {
				findProductOfferingRequest.setVisualizacionType(0);
			}
			try {

				if (solicitudListaOferta.getIdRed() != null) {
					findProductOfferingRequest
							.setIdNetwork(solicitudListaOferta.getIdRed());
				} else {
					findProductOfferingRequest.setIdNetwork("");
				}
			} catch (Exception e) {
				findProductOfferingRequest.setIdNetwork("");
			}

		} catch (NullPointerException e) {
		}
		return findProductOfferingRequest;
	}

	private Integer traducirVisualizacion(String visualizacion) {

		Integer integer = Integer.valueOf(1);

		if ("general".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(1);
		}

		if ("generales".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(1);
		}

		if ("sugeridas".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(2);
		}

		if ("sugerida".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(2);
		}

		if ("contenciones".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(3);
		}

		if ("contención".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(3);
		}

		if ("contencion".equalsIgnoreCase(visualizacion)) {
			return Integer.valueOf(3);
		}

		return integer;
	}

	private boolean obtenerFechaInicioCorrespondiente(
			ProductOfferingAttributes oferta) throws ParseException {
		String startDateTime = oferta.getStartDateTime();
		try {
			if (startDateTime != null) {
				SimpleDateFormat formateador = new SimpleDateFormat(
						"dd-MM-yyyy");
				Date fechaDateCatalogo = formateador.parse(oferta
						.getStartDateTime());
				if (fechaDateCatalogo.compareTo(diaActual())<=0) {
					return true;
				}
			}
		} catch (ParseException ex) {

			throw new ParseException(
					"Error al parsear fecha String a fecha Date en obtenerFechaInicioCorrespondiente, Fecha entrada: "
							+ startDateTime, 0);
		}
		return false;
	}

	private boolean obtenerFechaTerminoCorrespondiente(
			ProductOfferingAttributes oferta) throws ParseException {
		String endDateTime = oferta.getEndDateTime();
		try {
			if (endDateTime != null) {
				SimpleDateFormat formateador = new SimpleDateFormat(
						"dd-MM-yyyy");
				Date fechaDateCatalogo = formateador.parse(oferta
						.getEndDateTime());
//				if (fechaDateCatalogo.after(diaActual()) == true) {
					if (fechaDateCatalogo.compareTo(diaActual())>=0) {
					return true;
				}
			}
		} catch (ParseException ex) {

			throw new ParseException(
					"Error al parsear fecha String a fecha Date en obtenerFechaTerminoCorrespondiente, fecha entrada= "
							+ endDateTime, 0);
		}
		return false;
	}

	private Date diaActual() throws ParseException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		String formatted = format1.format(cal.getTime());
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		Date fechaDateCatalogo = formateador.parse(formatted);
		return fechaDateCatalogo;
	}
}
