package cl.movistar.obetenercincompatibilidadofertador.gateways;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import cl.movistar.obetenercincompatibilidadofertador.dto.FamiliaridadIncompatible;
import cl.movistar.obetenercincompatibilidadofertador.dto.RespuestaIncompatibilidadOferta;

import com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesBindingStub;
import com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesPortType;
import com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesService;
import com.telefonica.midrange.queryCatalogAppRulesService.QueryCatalogAppRulesServiceLocator;
import com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsDestiny;
import com.telefonica.midrange.queryCatalogAppRulesService.types.IncompatibleProductsOrigin;
import com.telefonica.midrange.queryCatalogAppRulesService.types.QueryCatalogAppRulesResponse;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

public class ObtenerIncompatibilidadOfertadorGateway {

	private String urlServicio;
	private QueryCatalogAppRulesPortType servicio;
	private boolean desconectado;

	public ObtenerIncompatibilidadOfertadorGateway(String urlServicio,
			boolean desconectado) throws Exception {
		this.urlServicio = urlServicio;
		this.desconectado = desconectado;
		this.servicio = obtenerServicio();
	}

	private QueryCatalogAppRulesPortType obtenerServicio() throws AxisFault,
			MalformedURLException {

		QueryCatalogAppRulesPortType webService = null;
		try {

			QueryCatalogAppRulesServiceLocator wL = new QueryCatalogAppRulesServiceLocator();

			wL.setqueryCatalogAppRulesEndpointAddress(this.urlServicio);

			QueryCatalogAppRulesService w = wL;

			webService = new QueryCatalogAppRulesBindingStub(new URL(
					w.getqueryCatalogAppRulesAddress()), w);
		} catch (AxisFault e) {
			throw new AxisFault(
					"Error al obtener el Servicio de matriz de incompatibilidad de Catálogo",
					e);
		} catch (MalformedURLException e) {
			throw new MalformedURLException(
					"Error en EndPoint Servicio de matriz de incompatibilidad de Catálogo");
		}

		// throw new
		// Exception("Error al conectarse con Servicio de matriz de incompatibilidad de Catálogo",e);

		return webService;
	}

	public RespuestaIncompatibilidadOferta obtenerIncompatibilidad(
			List<String> familiaridadesOrigen) throws RemoteException  {

		RespuestaIncompatibilidadOferta resultado = null;
			

				IncompatibleProductsOrigin[] parametros = obtenerParametros(familiaridadesOrigen);

				try {
					resultado = invocaServicioParqueService(parametros);
				} catch (RemoteException e) {
					throw new RemoteException("Error en Obtener Incomtibilidad de familiaridades", e);

				}

		return resultado;
	}

	private RespuestaIncompatibilidadOferta invocaServicioParqueService(
			IncompatibleProductsOrigin[] parametros) throws RemoteException {

		RespuestaIncompatibilidadOferta respuestaIncompatibilidadOferta = new RespuestaIncompatibilidadOferta();

		QueryCatalogAppRulesResponse queryCatalogAppRulesResponse = null;
		try {
			queryCatalogAppRulesResponse = servicio
					.queryCatalogAppRules(parametros);
			int codigoErro = Integer.valueOf(queryCatalogAppRulesResponse
					.getReturnCode());
			if (codigoErro == 0) {

				IncompatibleProductsDestiny[] incompatibleProductsDestiny = queryCatalogAppRulesResponse
						.getIncompatibleProductsDestiny();

				FamiliaridadIncompatible[] familiaridadesIncompatible = new FamiliaridadIncompatible[incompatibleProductsDestiny.length];

				for (int i = 0; i < incompatibleProductsDestiny.length; i++) {

					IncompatibleProductsDestiny inComProd = incompatibleProductsDestiny[i];
					FamiliaridadIncompatible familiaridadIncompatible = new FamiliaridadIncompatible();
					familiaridadIncompatible.setFamiliaridad(inComProd
							.getNameIncompatibleProducts());
					familiaridadIncompatible.setId(inComProd
							.getIdIncompatibleProducts());
					familiaridadesIncompatible[i] = familiaridadIncompatible;
				}

				respuestaIncompatibilidadOferta
						.setFamiliaridadIncompatible(familiaridadesIncompatible);
			}

		} catch (RemoteException e) {
			throw new RemoteException(
					"Error al intentar invocaServicioParqueService", e);
		} finally {
			respuestaIncompatibilidadOferta
					.setCodigoRetorno(queryCatalogAppRulesResponse
							.getReturnCode());
			respuestaIncompatibilidadOferta
					.setMensaje(queryCatalogAppRulesResponse
							.getReturnDescription());

		}

		return respuestaIncompatibilidadOferta;
	}

	private IncompatibleProductsOrigin[] obtenerParametros(
			List<String> familiaridadesOrigen) {

		IncompatibleProductsOrigin[] incompatibleProductsOrigin = null;
		if (familiaridadesOrigen != null) {
		incompatibleProductsOrigin = new IncompatibleProductsOrigin[familiaridadesOrigen
					.size()];

			for (int i = 0; i < familiaridadesOrigen.size(); i++) {
				IncompatibleProductsOrigin IncompatibleProductsOrigin = new IncompatibleProductsOrigin();
				String dato = familiaridadesOrigen.get(i);
				IncompatibleProductsOrigin.setNameIncompatibleProducts(dato);
				incompatibleProductsOrigin[i] = IncompatibleProductsOrigin;

			}
		}
		return incompatibleProductsOrigin;
	}


	public RespuestaIncompatibilidadOferta obtenerIncompatibilidad(
			String familiaridadOferta1) throws Exception {

		RespuestaIncompatibilidadOferta resultado = null;
		try {
		

				List<String> familiaridadesOrigen = new ArrayList<String>();
				familiaridadesOrigen.add(familiaridadOferta1);
				IncompatibleProductsOrigin[] parametros = obtenerParametros(familiaridadesOrigen);

				resultado = invocaServicioParqueService(parametros);

		
		} catch (Exception ex) {

			throw ex;

		}
		return resultado;

	}
}
