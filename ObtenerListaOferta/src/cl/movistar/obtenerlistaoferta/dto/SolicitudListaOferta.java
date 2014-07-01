package cl.movistar.obtenerlistaoferta.dto;

public class SolicitudListaOferta {

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {

		if (canal != null)
			this.canal = canal;
	}

	public Integer getEstado() {
		return Integer.valueOf(estado);
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		if (familia != null)
			this.familia = familia;
	}

	public String getVisualizacion() {
		return visualizacion;
	}

	public void setVisualizacion(String visualizacion) {
		if (visualizacion != null)
			this.visualizacion = visualizacion;
	}

	public String getIdRed() {
		return idRed;
	}

	public void setIdRed(String idRed) {
		if (idRed != null)
			this.idRed = idRed;
	}

	public String getCodigoOferta() {
		return codigoOferta;
	}

	public void setCodigoOferta(String codigoOferta) {
		if (codigoOferta != null)
			this.codigoOferta = codigoOferta;
	}

	public String getCodigoServicioSuplementario() {
		return codigoServicioSuplementario;
	}

	public void setCodigoServicioSuplementario(
			String codigoServicioSuplementario) {
		if (codigoServicioSuplementario != null)
			this.codigoServicioSuplementario = codigoServicioSuplementario;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	private String codigoServicioSuplementario;
	private String codigoOferta;
	private String canal;
	private int estado = 1;
	// opcional;
	private String familia;
	private String visualizacion;
	private String idRed;
	private String tipoContrato;
}
