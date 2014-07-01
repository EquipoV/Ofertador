package cl.movistar.obtenerdatoscliente.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.movistar.obtenerdatoscliente.dto.RespuestaDatosCliente;
import cl.movistar.obtenerdatoscliente.impl.ObtenerDatosClienteGateway;

public class ObtenerDatosClienteGatewayTest {

	private RespuestaDatosCliente result;

	@Test
	public final void testObtenerDatosCliente() {
		int numCelular = 97590320;
		ObtenerDatosClienteGateway instance;
		try {
			instance = new ObtenerDatosClienteGateway(
			"http://osbpro:80/Abonado/ConsultaDetalleAbonado", false);
			result = instance
					.obtenerDatosCliente(numCelular);
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(result);

	}

}
