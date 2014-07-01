package cl.movistar.ofertador.services;

import javax.jws.WebService;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.SolicitudCompatibilidadOferta;
import cl.movistar.ofertador.dto.SolicitudFactibilidadVentaOtrosCanales;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.facade.OfertadorFacade;
import cl.movistar.ofertador.gateway.ObtenerOfertaGateway;
import cl.movistar.ofertador.gateway.ValidarFactibilidadVentaOtrosCanalesGateway;

@WebService(endpointInterface = "cl.movistar.services.HistoricoRequerimientos")
public class OfertadorImpl implements Ofertador {

    public ResponseOfertas obtenerOfertas(SolicitudOferta solicitudOferta) throws Exception {

        ResponseOfertas responseOfertas;

        responseOfertas = facade.obtenerOfertas(solicitudOferta, false);

        return responseOfertas;
    }

    public ResponseDetalleOferta obtenerDetalleOferta(String codigoOferta) throws Exception {

        ResponseDetalleOferta responseDetalleOferta = null;

        responseDetalleOferta = facade.obtieneDetalleDeOferta(codigoOferta, false);

        return responseDetalleOferta;
    }

    public Response validarCompatibilidadEntreOfertas(
            SolicitudCompatibilidadOferta solicitudCompatibilidadOferta) throws Exception {

        Response response = null;

        response = facade.validaCompatibilidadEntreOfertas(solicitudCompatibilidadOferta, false);

        return response;
    }

    public Response validarFactibilidadVentaOtrosCanales(SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales) throws Exception {

        Response response;

        response = facade.validaFactibilidadVentaOtrosCanales(solicitudFactibilidadVentaOtrosCanales, false);

        return response;
    }
    
    
    private  OfertadorFacade facade = new OfertadorFacade();
}