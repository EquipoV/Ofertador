package cl.movistar.ofertador.dto;

public class ResponseOfertas {

	private RespuestaServicio respuestaServicio;
	//private List<Oferta> ofertas; no cuando es webservices
	private Oferta[] ofertas;
	
	
	
	public RespuestaServicio getRespuestaServicio() {
		return respuestaServicio;
	}
	public void setRespuestaServicio(RespuestaServicio respuestaServicio) {
		this.respuestaServicio = respuestaServicio;
	}
	public Oferta[] getOfertas() {
		return ofertas;
	}
	public void setOfertas(Oferta[] ofertas) {
		this.ofertas = ofertas;
	}
	
	
	
}
