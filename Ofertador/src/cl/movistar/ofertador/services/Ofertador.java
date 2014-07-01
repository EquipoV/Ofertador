package cl.movistar.ofertador.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.SolicitudCompatibilidadOferta;
import cl.movistar.ofertador.dto.SolicitudFactibilidadVentaOtrosCanales;
import cl.movistar.ofertador.dto.SolicitudOferta;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional

public interface Ofertador {

	@WebMethod ResponseOfertas obtenerOfertas(SolicitudOferta solicitudOferta)throws Exception;
	
	@WebMethod ResponseDetalleOferta obtenerDetalleOferta(String codigoOferta) throws Exception;
	
	@WebMethod Response validarCompatibilidadEntreOfertas(SolicitudCompatibilidadOferta solicitudCompatibilidadOferta) throws Exception;
	
	@WebMethod Response validarFactibilidadVentaOtrosCanales(SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales)throws Exception;
	
}
