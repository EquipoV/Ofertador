package cl.movistar.ofertador.matrizq;

import java.util.List;

public class ReglaQ {

	
	
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public List<String> getFamilia() {
		return familia;
	}
	public void setFamilia(List<String> familia) {
		this.familia = familia;
	}
	public String getTipoVigencia() {
		return tipoVigencia;
	}
	public void setTipoVigencia(String tipoVigencia) {
		this.tipoVigencia = tipoVigencia;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	private String plan;
	private List<String> familia;
	private String tipoVigencia;
	private int cantidad;
	
	
}
