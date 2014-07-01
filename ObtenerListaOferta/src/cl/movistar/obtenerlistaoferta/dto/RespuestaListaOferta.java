package cl.movistar.obtenerlistaoferta.dto;

import java.util.List;

public class RespuestaListaOferta {
	
	
	public List<Oferta> getOfertas() {
		return Ofertas;
	}
	public void setOfertas(List<Oferta> ofertas) {
		Ofertas = ofertas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return Mensaje;
	}
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	private List<Oferta> Ofertas;
	private String codigo;
	private String Mensaje;
}
