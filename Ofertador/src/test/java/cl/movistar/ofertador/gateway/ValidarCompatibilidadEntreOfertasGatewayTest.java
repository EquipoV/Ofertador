package test.java.cl.movistar.ofertador.gateway;

import static org.junit.Assert.*;

import org.junit.Test;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.SolicitudCompatibilidadOferta;
import cl.movistar.ofertador.gateway.ValidarCompatibilidadEntreOfertasGateway;

public class ValidarCompatibilidadEntreOfertasGatewayTest {

	@Test
	public void testValidarCompatibilidadEntreOfertas() {
		SolicitudCompatibilidadOferta solicitudCompatibilidadOferta = new SolicitudCompatibilidadOferta();
		try {
			
			solicitudCompatibilidadOferta.setFamiliaridadOferta1("BOLSA NEM R");
			solicitudCompatibilidadOferta.setFamiliaridadOferta2("BOLSA NEM R");
			Response validarCompatibilidadEntreOfertasGateway = ValidarCompatibilidadEntreOfertasGateway.getInstance().validarCompatibilidadEntreOfertas(solicitudCompatibilidadOferta, false);
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
