package cl.movistar.obtenerdatoscliente.dto;

public class RespuestaDatosCliente {

	
	
	public String getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	private String codigoRetorno;
	private String mensaje;
	private Cliente cliente;
}
