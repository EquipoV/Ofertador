package cl.movistar.obtenerparque.impl;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.telefonica.services.WS4.ConsultaSSDTO;
import com.telefonica.services.WS4.ListaSSAbonadoDTO;
import com.telefonica.services.WS4.RespuestaConsultaSSDTO;
import com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonado;
import com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonadoService;
import com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonadoServiceLocator;
import com.tmmas.cl.scl.cambiodeplan.ws.WSConsultaSSAbonadoSoapBindingStub;

public class ObtenerParqueGateway {

	
	/**
	 * 
	 * @author Esteban
	 */
	
	private String urlServicio;
	private WSConsultaSSAbonado servicio;
	private boolean desconectado;

	public ObtenerParqueGateway(String urlServicio, boolean desconectado)
			throws Exception {
		this.urlServicio = urlServicio;
		this.desconectado = desconectado;
		this.servicio = obtenerServicio();
	}

	private WSConsultaSSAbonado obtenerServicio() throws Exception {

		if (this.desconectado) {
			return null;
		}
		WSConsultaSSAbonado webService = null;
		try{
		WSConsultaSSAbonadoServiceLocator wL = new WSConsultaSSAbonadoServiceLocator();

		wL.setWSConsultaSSAbonadoEndpointAddress(this.urlServicio);

		WSConsultaSSAbonadoService w = wL;

		webService = new WSConsultaSSAbonadoSoapBindingStub(
				new URL(w.getWSConsultaSSAbonadoAddress()), w);

		}catch(Exception e){
			
			throw new Exception("Error al conectarse con servicio de Obtencion de Parque Cliente",e);
		}
		return webService;
	}

	public RespuestaParque obtenerParque(String numCelular) throws Exception {

		RespuestaParque resultado = null;
		try {
			if (desconectado) {
				resultado = obtenerParqueEnDuro();
			} else {

				ConsultaSSDTO parametros = obtenerParametros(numCelular);

				resultado = invocaServicioParqueService(parametros);

			}
		} catch (Exception ex) {

			throw new Exception("Error en Obtener Parque", ex);

		}
		return resultado;
	}

	private RespuestaParque obtenerParqueEnDuro() {
		return null;
		
	}

	private ConsultaSSDTO obtenerParametros(String numCelular) {

		ConsultaSSDTO respuesta = new ConsultaSSDTO();
		respuesta.setNumeroCelular(numCelular);
		return respuesta;
	}

	private RespuestaParque invocaServicioParqueService(ConsultaSSDTO parametros) throws RemoteException {
		
		RespuestaParque respuestaParque = new RespuestaParque();
		
		try {
			
			RespuestaConsultaSSDTO miResponse;

			miResponse = servicio.obtenerSSAbonado(parametros);

			

			respuestaParque.setCodigoError(miResponse.getRetornoDto()
					.getCodigoError());
			respuestaParque.setMensajeError(miResponse.getRetornoDto()
					.getMensajeError());
			respuestaParque.setNumeroEvento(miResponse.getRetornoDto()
					.getNumeroEvento());

			ListaSSAbonadoDTO[] data = miResponse.getListaSSAbonado();
			ListaSSAbonadoDTO parque;
			
			itemParque[] listaItemParque = new itemParque[data.length];
			
			for (int i = 0; i < data.length; i++) {

				parque = data[i];

				itemParque item = new itemParque();
				item.setCodigoConceptoCargo(parque.getCodigoConceptoCargo());
				item.setCodigoSS(parque.getCodigoSS());
				item.setCodigoServicio(parque.getCodigoServicio());
				item.setDescripcionMoneda(parque.getDescripcionMoneda());
				item.setDescripcionServicio(parque.getDescripcionServicio());
				item.setImporteCargo(parque.getImporteCargo());
				item.setIndicadorObligatoriedad(parque
						.getIndicadorObligatoriedad());
				item.setNivel(parque.getNivel());

				listaItemParque[i] = item;

			}

			respuestaParque.setListaSSAbonado(listaItemParque);

		} catch (RemoteException e) {
			throw new RemoteException("Error en invocaServicioParqueService",e);
		}

		return respuestaParque;

	}
}
