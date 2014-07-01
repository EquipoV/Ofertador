package cl.movistar.obtenerdetalleoferta.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import cl.movistar.obtenerdetalleoferta.dto.Canal;
import cl.movistar.obtenerdetalleoferta.dto.CaracteristicaProducto;
import cl.movistar.obtenerdetalleoferta.dto.DetalleOferta;
import cl.movistar.obtenerdetalleoferta.dto.Precio;
import cl.movistar.obtenerdetalleoferta.dto.Producto;
import cl.movistar.obtenerdetalleoferta.dto.RespuestaDetalleOferta;
import cl.movistar.obtenerdetalleoferta.dto.SegmentoMercado;

import com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingBindingStub;
import com.telefonica.midrange.queryproductofferingservice.QueryProductOfferingPortType;
import com.telefonica.midrange.queryproductofferingservice.Queryproductofferingservice;
import com.telefonica.midrange.queryproductofferingservice.QueryproductofferingserviceLocator;
import com.telefonica.midrange.queryproductofferingservice.types.Channel;
import com.telefonica.midrange.queryproductofferingservice.types.MarketSegment;
import com.telefonica.midrange.queryproductofferingservice.types.Price;
import com.telefonica.midrange.queryproductofferingservice.types.ProductOffering;
import com.telefonica.midrange.queryproductofferingservice.types.ProductSpecification;
import com.telefonica.midrange.queryproductofferingservice.types.ProductSpecificationCharacteristic;
import com.telefonica.midrange.queryproductofferingservice.types.QueryOfferingRequest;
import com.telefonica.midrange.queryproductofferingservice.types.QueryOfferingResponse;




public class ServicioObtenerDetalleOfertaGateway {

	private String urlServicio;
	private QueryProductOfferingPortType servicio;
	private boolean desconectado;
	
	
	public ServicioObtenerDetalleOfertaGateway(String urlServicio, boolean desconectado)
			throws Exception {
		this.urlServicio = urlServicio;
		this.desconectado = desconectado;
		this.servicio = obtenerServicio();
	}
	
	private QueryProductOfferingPortType obtenerServicio() throws AxisFault, MalformedURLException {

		QueryProductOfferingPortType webService = null;
		try {

		QueryproductofferingserviceLocator wL = new QueryproductofferingserviceLocator();

		wL.setqueryProductOfferingEndpointAddress(this.urlServicio);

		Queryproductofferingservice w = wL;

		
			webService = new QueryProductOfferingBindingStub(
					new URL(w.getqueryProductOfferingAddress()), w);
		} catch (AxisFault e) {
			throw new AxisFault("Error al intenetar conectarse con WebService QueryProductOffering de Catalogo",e);
		} catch (MalformedURLException e) {
			throw new MalformedURLException("Error en la formación del EndPoint");
		}
	
		
		return webService;
	}
	
	public RespuestaDetalleOferta obtenerDetalleOferta(String codigoOFerta) throws RemoteException  {

		RespuestaDetalleOferta resultado = null;
		

				QueryOfferingRequest parametros = obtenerParametros(codigoOFerta);

				try {
					resultado = invocaServicioParqueService(parametros);
				} catch (RemoteException e) {

					throw new RemoteException("Error en Obtener Detalle Oferta",e);
				}

			
	
		return resultado;
	}

	private RespuestaDetalleOferta invocaServicioParqueService(
			QueryOfferingRequest parametros) throws RemoteException {
		RespuestaDetalleOferta respuestaDetalleOferta = new RespuestaDetalleOferta();
		
		QueryOfferingResponse queryOfferingResponse = null;
		try {
			queryOfferingResponse = servicio.queryProductOffering(parametros);
			int codigoError = Integer.valueOf(queryOfferingResponse.getReturnCode());
			if(codigoError == 0){
			ProductOffering productOffering	= queryOfferingResponse.getProductOffering();
		
			DetalleOferta detalleOferta =  new DetalleOferta();
			
			detalleOferta.setCantidadPuntos(productOffering.getManyPoints());
			detalleOferta.setCodigoOferta(productOffering.getCodOffering());
			detalleOferta.setCodigoOfertaRed(productOffering.getNetworkCodeOffer());
			detalleOferta.setConsumo(productOffering.getConsumption());
			detalleOferta.setDescripcion(productOffering.getDescription());
			detalleOferta.setEstado(productOffering.getStatus()); 
			detalleOferta.setFamilia(productOffering.getProductOfferingFamily());
			detalleOferta.setFamiliaridad(productOffering.getFamiliarityType());
			detalleOferta.setFechaInicio(productOffering.getStartDateTime());
			detalleOferta.setFechaTermino(productOffering.getEndDateTime());
			detalleOferta.setHorarioVenta(productOffering.getScheduleType()); 
			detalleOferta.setIdRed(productOffering.getIdNetwork());
			detalleOferta.setIdUsuario(productOffering.getIdUser());
			detalleOferta.setIdValidacion(productOffering.getIdValidation());
			detalleOferta.setNombre(productOffering.getName());
			detalleOferta.setRestricciones(productOffering.getRestrictions());
			detalleOferta.setSubFamilia(productOffering.getProductOfferingSubFamily()); 
			detalleOferta.setTipoCargo(productOffering.getTypeOfCharge());
			detalleOferta.setTipoDestino(productOffering.getDestinationType());
			detalleOferta.setTipoOferta(productOffering.getTypeOffering());
			detalleOferta.setTipoVigencia(productOffering.getLifeType());
			detalleOferta.setTipoVisualizacion(productOffering.getVisualizationType());
			detalleOferta.setValidacionRed(productOffering.getValidationNetwork()); 
			detalleOferta.setValorCliente(productOffering.getCustomerValue());  
			
			try{
			Precio[] precios = obtenerPrecios(productOffering);
			detalleOferta.setPrecios(precios);
			}catch (NullPointerException e){}
 			try{
			Producto[] productos = obtenerProductos(productOffering);
			detalleOferta.setProductos(productos);
			}catch (NullPointerException e){}
			try{
			SegmentoMercado[] segmentosMercado = obtenerSegmentosMercado(productOffering);
			detalleOferta.setSegmentosMercado(segmentosMercado);
			}catch (NullPointerException e){}
			respuestaDetalleOferta.setDetalleOferta(detalleOferta);
			}
			
		} catch (RemoteException e) {
			throw new RemoteException("Error en la obtención de datos en invocaServicioParqueService",e);
		}catch (NullPointerException e){
			throw new RemoteException("Error en la obtención de datos en invocaServicioParqueService",e);
		}finally{
			if(queryOfferingResponse!=null){
			respuestaDetalleOferta.setCodigoRespuesta(queryOfferingResponse.getReturnCode());
			respuestaDetalleOferta.setMensajeRespuesta(queryOfferingResponse.getReturnDescription());
			}
		}
		return respuestaDetalleOferta;
	}

	private SegmentoMercado[] obtenerSegmentosMercado(
			ProductOffering productOffering) {
		
		MarketSegment[] marketSegment = productOffering.getMarketSegment();
		SegmentoMercado[] segmentosMercado = new SegmentoMercado[marketSegment.length];
		
		for (int i = 0; i < marketSegment.length; i++) {
			
			SegmentoMercado segmentoMercado = new SegmentoMercado();
			
			segmentoMercado.setDescripcion(marketSegment[i].getDescription());
			segmentoMercado.setIdSegmentoMercado(marketSegment[i].getId());
			segmentoMercado.setNombre(marketSegment[i].getName());
		
			segmentosMercado[i] = segmentoMercado;
		}
		
		
		return segmentosMercado;
	}

	private Producto[] obtenerProductos(ProductOffering productOffering) {
		
		ProductSpecification[] productSpecification = productOffering.getProductSpecification();
		Producto[] productos = new Producto[productSpecification.length];
		
		
		
		for (int i = 0; i < productSpecification.length; i++) {
			
			Producto producto = new Producto();
			producto.setCodigoProducto(productSpecification[i].getCodProduct());
			producto.setEstado(productSpecification[i].getStatus());
			producto.setNombre(productSpecification[i].getName());
			
			CaracteristicaProducto[] caracteristicasProducto = obtenerCaracteristicaProducto(productSpecification[i]);
			producto.setCaracteristicasProducto(caracteristicasProducto);
			
			productos[i] = producto;
			
		}
		
		return productos;
	}

	private CaracteristicaProducto[] obtenerCaracteristicaProducto(
			ProductSpecification productSpecification) {
		
		ProductSpecificationCharacteristic[] productSpecificationCharacteristic = productSpecification.getProductSpecificationCharacteristic();
		CaracteristicaProducto[] caracteristicasProducto = new CaracteristicaProducto[productSpecificationCharacteristic.length];
		
		
		for (int i = 0; i < productSpecificationCharacteristic.length; i++) {
			
			CaracteristicaProducto caracteristicaProducto = new CaracteristicaProducto();
			caracteristicaProducto.setCodigoCaracteristicaProducto(productSpecificationCharacteristic[i].getCodCharacteristic());
			caracteristicaProducto.setDescripcion(productSpecificationCharacteristic[i].getDescription());
			caracteristicaProducto.setNombre(productSpecificationCharacteristic[i].getName());
			caracteristicaProducto.setTecnologia(productSpecificationCharacteristic[i].getTechnology());
			caracteristicaProducto.setTipoUnidad(productSpecificationCharacteristic[i].getTypeUnit());
			caracteristicaProducto.setUnidad(productSpecificationCharacteristic[i].getUnit());
			caracteristicaProducto.setVelocidadMaxima(productSpecificationCharacteristic[i].getMaximumSpeed());
			caracteristicaProducto.setVelocidadReducida(productSpecificationCharacteristic[i].getReducedSpeed());
			
			caracteristicasProducto[i] = caracteristicaProducto;
			
		}
		
		
		return caracteristicasProducto;
	}

	private Precio[] obtenerPrecios(ProductOffering productOffering) {
		
		Price[] price =  productOffering.getPrice();
		Precio[] precios = new Precio[price.length];
		
		
		for (int i = 0; i < price.length; i++) {
			Precio precioItem = new Precio();
			
			precioItem.setCodigoServicioSuplementario(price[i].getSupplementaryService());
			precioItem.setCodigoTasacion(price[i].getAppraisalCode());
			precioItem.setConceptoFacturacion(price[i].getBillableConcept());
			precioItem.setDescuentoOferta(price[i].getOfferDiscount());
			precioItem.setNombreFacturacion(price[i].getBillingName());
			precioItem.setPrecioOferta(price[i].getPrice());
			precioItem.setTipoMoneda(price[i].getMoneyType());
			
			Canal[] canales = obtenerCanales(price[i]) ;
			precioItem.setCanales(canales);
		
			precios[i] = precioItem;
		}
		
		return precios;
	}

	private Canal[] obtenerCanales(Price price) {

		Channel[] channels = price.getChannel();
		Canal[] canales = new Canal[channels.length];
		
		
		
		for (int i = 0; i < channels.length; i++) {
			
			Canal canal = new Canal();
			
			canal.setDescripcion(channels[i].getDescription());
			canal.setIdCanal(channels[i].getId());
			canal.setNombre(channels[i].getName());
			canal.setNombreOferta(channels[i].getNameOffering()); 
			
			canales[i] = canal;
		}
		
		return canales;
	}

	private QueryOfferingRequest obtenerParametros(String codigoOFerta) {
		QueryOfferingRequest queryOfferingRequest = new QueryOfferingRequest();
		queryOfferingRequest.setCodOffering(codigoOFerta);
		return queryOfferingRequest;
	}

	
	
}
