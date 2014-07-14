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
			solicitudFactibilidadVentaOtrosCanales.setIdRed("100SMS30ON_U");
//			solicitudFactibilidadVentaOtrosCanales.setNumeroCelular(97590320);
			solicitudFactibilidadVentaOtrosCanales.setNumeroCelular(71374524);
			Response response = ValidarFactibilidadVentaOtrosCanalesGateway.getInstance().validaFactibilidadVentaOtrosCanales(solicitudFactibilidadVentaOtrosCanales, false);
		System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
