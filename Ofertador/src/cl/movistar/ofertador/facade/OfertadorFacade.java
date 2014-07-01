/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.ofertador.facade;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.SolicitudCompatibilidadOferta;
import cl.movistar.ofertador.dto.SolicitudFactibilidadVentaOtrosCanales;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.gateway.ObtenerDetalleDeOfertaGateway;
import cl.movistar.ofertador.gateway.ObtenerOfertaGateway;
import cl.movistar.ofertador.gateway.ValidarCompatibilidadEntreOfertasGateway;
import cl.movistar.ofertador.gateway.ValidarFactibilidadVentaOtrosCanalesGateway;

/**
 *
 * @author Esteban
 */
public class OfertadorFacade {
    
    public ResponseOfertas obtenerOfertas(SolicitudOferta solicitudOferta,boolean b) throws Exception {
        
        return ObtenerOfertaGateway.getInstance().obtenerOfertas(solicitudOferta, b);
    }

    public Response validaFactibilidadVentaOtrosCanales(SolicitudFactibilidadVentaOtrosCanales solicitudFactibilidadVentaOtrosCanales, boolean b) throws Exception {
        
        return ValidarFactibilidadVentaOtrosCanalesGateway.getInstance().validaFactibilidadVentaOtrosCanales(solicitudFactibilidadVentaOtrosCanales, b);
    }
    
    public ResponseDetalleOferta obtieneDetalleDeOferta(String codigoOferta, boolean b) throws Exception {
        
        return ObtenerDetalleDeOfertaGateway.getInstance().obtieneDetalleDeOferta(codigoOferta, b);
        
    }

    public Response validaCompatibilidadEntreOfertas(SolicitudCompatibilidadOferta solicitudCompatibilidadOferta,
            boolean b) throws Exception {
        
        return ValidarCompatibilidadEntreOfertasGateway.getInstance().validarCompatibilidadEntreOfertas(solicitudCompatibilidadOferta, b);
        
    }

  
    
}
