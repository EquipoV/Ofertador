package cl.movistar.ofertador.dto;

import cl.movistar.ofertador.dto.detalleoferta.DetalleOferta;

public class ResponseDetalleOferta {
	
	private RespuestaServicio respuestaServicio;
	private DetalleOferta detalleOferta;
	
	public DetalleOferta getDetalleOferta() {
		return detalleOferta;
	}
	public void setDetalleOferta(DetalleOferta detalleOferta) {
		this.detalleOferta = detalleOferta;
	}
	public RespuestaServicio getRespuestaServicio() {
		return respuestaServicio;
	}
	public void setRespuestaServicio(RespuestaServicio respuestaServicio) {
		this.respuestaServicio = respuestaServicio;
	}


	
	
	
}
