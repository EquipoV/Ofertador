package cl.movistar.obtenerdetalleoferta.tests;

import cl.movistar.obtenerdetalleoferta.dto.RespuestaDetalleOferta;
import cl.movistar.obtenerdetalleoferta.impl.ServicioObtenerDetalleOfertaGateway;
import junit.framework.TestCase;

public class ServicioObtenerDetalleOfertaGatewayTest extends TestCase {

	protected static void tearDownAfterClass() throws Exception {
	}

	public void testObtenerDetalleOferta() {
		RespuestaDetalleOferta respuestaDetalleOferta = null;
		try {
			ServicioObtenerDetalleOfertaGateway servicioObtenerDetalleOfertaGateway = new ServicioObtenerDetalleOfertaGateway("http://cws2010.ctc.cl:87/QueryProductOfferingWEB/services/queryProductOffering",false);
			respuestaDetalleOferta = servicioObtenerDetalleOfertaGateway.obtenerDetalleOferta("OFE001");
			System.out.println(respuestaDetalleOferta.getCodigoRespuesta());
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(respuestaDetalleOferta);
	
	}

}
