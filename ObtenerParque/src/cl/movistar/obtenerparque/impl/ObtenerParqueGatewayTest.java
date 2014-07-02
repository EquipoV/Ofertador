package cl.movistar.obtenerparque.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObtenerParqueGatewayTest {

	@Test
	public final void testObtenerParque() {

		System.out.println("obtenerParque");
        String numCelular = "97084472";
        ObtenerParqueGateway instance;
		try {
			instance = new ObtenerParqueGateway("http://cap2011.ctc.cl:9144/CambioDePlanWS/services/WSConsultaSSAbonado",false);
			  RespuestaParque result = instance.obtenerParque(numCelular);
			  System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}

      
	}

}
