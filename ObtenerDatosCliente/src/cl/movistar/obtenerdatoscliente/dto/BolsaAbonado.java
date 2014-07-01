package cl.movistar.obtenerdatoscliente.dto;

public class BolsaAbonado {

	
	
	 public String getCodServicio() {
		return codServicio;
	}

	public void setCodServicio(String codServicio) {
		this.codServicio = codServicio;
	}

	public String getDescUnidad() {
		return descUnidad;
	}

	public void setDescUnidad(String descUnidad) {
		this.descUnidad = descUnidad;
	}

	public String getFechaAltaServicio() {
		return fechaAltaServicio;
	}

	public void setFechaAltaServicio(String fechaAltaServicio) {
		this.fechaAltaServicio = fechaAltaServicio;
	}

	public Float getImpTarifa() {
		return impTarifa;
	}

	public void setImpTarifa(Float impTarifa) {
		this.impTarifa = impTarifa;
	}

	public String getIndPlan() {
		return indPlan;
	}

	public void setIndPlan(String indPlan) {
		this.indPlan = indPlan;
	}

	public int getNumUnidades() {
		return numUnidades;
	}

	public void setNumUnidades(int numUnidades) {
		this.numUnidades = numUnidades;
	}

	public String getUnidadesConsumidas() {
		return unidadesConsumidas;
	}

	public void setUnidadesConsumidas(String unidadesConsumidas) {
		this.unidadesConsumidas = unidadesConsumidas;
	}

	private String codServicio;

	    private String descUnidad;

	    private String fechaAltaServicio;

	    private Float impTarifa;

	    private String indPlan;

	    private int numUnidades;

	    private String unidadesConsumidas;
	
	
}
