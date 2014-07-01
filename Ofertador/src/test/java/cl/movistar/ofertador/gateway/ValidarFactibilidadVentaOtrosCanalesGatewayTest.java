package test.java.cl.movistar.ofertador.gateway;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.SolicitudFactibilidadVentaOtrosCanales;
import cl.movistar.ofertador.gateway.ValidarFactibilidadVentaOtrosCanalesGateway;

public class ValidarFactibilidadVentaOtrosCanalesGatewayTest {

	@Test
	public void testValidaFactibilidadVentaOtrosCanales() {
		SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales = new SolicitudFactibilidadVentaOtrosCanales();
		try {
			solicitudFactibilidadVentaOtrosCanales.setIdRed("test_PC_prep");
//			solicitudFactibilidadVentaOtrosCanales.setNumeroCelular(97590320);
			solicitudFactibilidadVentaOtrosCanales.setNumeroCelular(90338819);
			Response response = ValidarFactibilidadVentaOtrosCanalesGateway.getInstance().validaFactibilidadVentaOtrosCanales(solicitudFactibilidadVentaOtrosCanales, false);
		System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
