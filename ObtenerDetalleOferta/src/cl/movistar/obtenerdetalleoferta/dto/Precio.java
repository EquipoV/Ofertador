package cl.movistar.obtenerdetalleoferta.dto;

public class Precio {

	private String codigoServicioSuplementario;

	public String getCodigoServicioSuplementario() {
		return codigoServicioSuplementario;
	}

	public void setCodigoServicioSuplementario(String codigoServicioSuplementario) {
		this.codigoServicioSuplementario = codigoServicioSuplementario;
	}

	public int getPrecioOferta() {
		return precioOferta;
	}

	public void setPrecioOferta(int precioOferta) {
		this.precioOferta = precioOferta;
	}

	public String getNombreFacturacion() {
		return nombreFacturacion;
	}

	public void setNombreFacturacion(String nombreFacturacion) {
		this.nombreFacturacion = nombreFacturacion;
	}

	public int getConceptoFacturacion() {
		return conceptoFacturacion;
	}

	public void setConceptoFacturacion(int conceptoFacturacion) {
		this.conceptoFacturacion = conceptoFacturacion;
	}

	public String getCodigoTasacion() {
		return codigoTasacion;
	}

	public void setCodigoTasacion(String codigoTasacion) {
		this.codigoTasacion = codigoTasacion;
	}

	public String getDescuentoOferta() {
		return descuentoOferta;
	}

	public void setDescuentoOferta(String descuentoOferta) {
		this.descuentoOferta = descuentoOferta;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public Canal[] getCanales() {
		return canales;
	}

	public void setCanales(Canal[] canales) {
		this.canales = canales;
	}

	private int precioOferta;

	private String nombreFacturacion;

	private int conceptoFacturacion;

	private String codigoTasacion;

	private String descuentoOferta;

	private String tipoMoneda;

	private Canal[] canales;

}
