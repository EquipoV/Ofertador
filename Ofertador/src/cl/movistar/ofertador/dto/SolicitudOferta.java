package cl.movistar.ofertador.dto;

public class SolicitudOferta {
	
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	
	
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getVisualizacion() {
		return visualizacion;
	}
	public void setVisualizacion(String visualizacion) {
		this.visualizacion = visualizacion;
	}
	
	public int getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	private String canal;
	
	private int numeroCelular;
	private String familia;
	private String visualizacion;
	

}
