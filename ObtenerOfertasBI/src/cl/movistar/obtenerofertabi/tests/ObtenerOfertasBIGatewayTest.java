package cl.movistar.obtenerofertabi.tests;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import cl.movistar.obtenerofertasbi.ObtenerOfertasBIGateway;
import cl.movistar.obtenerofertasbi.dto.RespuestaOfertasBI;
import cl.movistar.obtenerofertasbi.dto.SolicitudOfertasBI;
import junit.framework.TestCase;

public class ObtenerOfertasBIGatewayTest extends TestCase {

	public final void testObtenerOfertaBI() {

		
		SolicitudOfertasBI solicitudOfertasBI = new SolicitudOfertasBI();
//		ObtenerOfertasBIGateway obtenerOfertasBIGateway = new ObtenerOfertasBIGateway("http://10.232.3.45:8080/services/ConsultaOfertasClteAntig",false);
		ObtenerOfertasBIGateway obtenerOfertasBIGateway;
		try {
			obtenerOfertasBIGateway = new ObtenerOfertasBIGateway("http://10.232.3.45:8080/services/ConsultaOfertasClteAntig");
//			obtenerOfertasBIGateway = new ObtenerOfertasBIGateway("http://MacBook-Pro-de-Esteban.local:8080/");
//			10 Contencion 11 sugerida
			solicitudOfertasBI.setCanal("contencion");
			solicitudOfertasBI.setNumero_linea("71323313");
			
			RespuestaOfertasBI respuestaOfertasBI = obtenerOfertasBIGateway.obtenerOfertaBI(solicitudOfertasBI);
			System.out.println("");
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
