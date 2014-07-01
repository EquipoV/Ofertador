package cl.movistar.obtenerdetalleoferta.dto;

public class RespuestaDetalleOferta {
	
	private DetalleOferta detalleOferta;
	
	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	public DetalleOferta getDetalleOferta() {
		return detalleOferta;
	}
	public void setDetalleOferta(DetalleOferta detalleOferta) {
		this.detalleOferta = detalleOferta;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	

}
