package cl.movistar.obtenerlistaoferta.test;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.ParseException;

import org.apache.axis.AxisFault;

import junit.framework.TestCase;
import cl.movistar.obtenerlistaoferta.dto.RespuestaListaOferta;
import cl.movistar.obtenerlistaoferta.dto.SolicitudListaOferta;
import cl.movistar.obtenerlistaoferta.impl.ObtenerListaOfertaGateway;

public class ObtenerListaOfertaGatewayTest extends TestCase {

	public final void testObtenerListaOferta() throws Exception {
	
			ObtenerListaOfertaGateway obtener;
			RespuestaListaOferta respuestaListaOferta = null;
			try {
				obtener = new ObtenerListaOfertaGateway("http://cws2010.ctc.cl:87/FindProductOfferingWEB/services/findProductOffering",false);
				SolicitudListaOferta solicitudListaOferta = new  SolicitudListaOferta();
				solicitudListaOferta.setVisualizacion("general");
				solicitudListaOferta.setTipoContrato("Contrato");
				solicitudListaOferta.setCanal("11");
				respuestaListaOferta = obtener.obtenerListaOferta(solicitudListaOferta);
			System.out.println("");
			} catch (AxisFault e) {
			
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}catch (InvocationTargetException e){
				e.printStackTrace();
			}
			
		
		assertNotNull(respuestaListaOferta);
		
		
		
	}
	
public final void testObtenerListaOfertaPorCodigoOferta(){
	
//	
//	SolicitudListaOferta solicitudListaOferta = new SolicitudListaOferta();
//	solicitudListaOferta.setCodigoOferta("OFE001");
//	
//
//	ObtenerListaOfertaGateway obtener;
//	RespuestaListaOferta respuestaListaOferta = null;
//	try {
//		obtener = new ObtenerListaOfertaGateway("http://cws2010.ctc.cl:87/FindProductOfferingWEB/services/findProductOffering",false);
//		respuestaListaOferta = obtener.obtenerListaOferta(solicitudListaOferta);
//	System.out.println("");
//	} catch (AxisFault e) {
//	
//		e.printStackTrace();
//	} catch (MalformedURLException e) {
//		e.printStackTrace();
//	} catch (RemoteException e) {
//		e.printStackTrace();
//	} catch (ParseException e) {
//		e.printStackTrace();
//	}
//	
//
//assertNotNull(respuestaListaOferta);

	
}

}
