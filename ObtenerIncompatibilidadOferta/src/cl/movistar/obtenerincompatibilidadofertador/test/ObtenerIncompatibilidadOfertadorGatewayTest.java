/**
 * 
 */
package cl.movistar.obtenerincompatibilidadofertador.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cl.movistar.obetenercincompatibilidadofertador.dto.RespuestaIncompatibilidadOferta;
import cl.movistar.obetenercincompatibilidadofertador.gateways.ObtenerIncompatibilidadOfertadorGateway;

/**
 * @author Esteam
 *
 */
public class ObtenerIncompatibilidadOfertadorGatewayTest {

	/**
	 * Test method for {@link cl.movistar.obetenercincompatibilidadofertador.gateways.ObtenerIncompatibilidadOfertadorGateway#obtenerIncompatibilidad(java.util.List)}.
	 * @throws Exception 
	 */
	
	
	@Test
	public final void testObtenerIncompatibilidadListOfString() {
		RespuestaIncompatibilidadOferta respuestaIncompatibilidadOferta = null ;
		ObtenerIncompatibilidadOfertadorGateway obtenerIncompatibilidadOfertadorGateway= null ;
		try {
			obtenerIncompatibilidadOfertadorGateway = new ObtenerIncompatibilidadOfertadorGateway("http://cws2010.ctc.cl:87/QueryCatalogAppRulesWEB/services/queryCatalogAppRules", false);
	
			List<String> familiaridadesOrigen = new ArrayList<String>();
	
			familiaridadesOrigen.add("BOLSA NEM R");
			respuestaIncompatibilidadOferta = obtenerIncompatibilidadOfertadorGateway.obtenerIncompatibilidad(familiaridadesOrigen);
		
			System.out.println(respuestaIncompatibilidadOferta);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(respuestaIncompatibilidadOferta);
		
	}



}
