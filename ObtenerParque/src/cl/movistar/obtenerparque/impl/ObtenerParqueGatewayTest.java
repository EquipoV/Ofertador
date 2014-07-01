package cl.movistar.obtenerparque.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObtenerParqueGatewayTest {

	@Test
	public final void testObtenerParque() {

		System.out.println("obtenerParque");
        String numCelular = "71323313";
        ObtenerParqueGateway instance;
		try {
			instance = new ObtenerParqueGateway("http://ws.tchile.local/CambioDePlanWS/services/WSConsultaSSAbonado",false);
			  RespuestaParque result = instance.obtenerParque(numCelular);
			  System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}

      
	}

}
