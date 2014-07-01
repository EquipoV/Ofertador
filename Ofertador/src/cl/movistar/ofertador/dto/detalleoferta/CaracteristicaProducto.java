package cl.movistar.ofertador.dto.detalleoferta;

public class CaracteristicaProducto {

	public String getCodigoCaracteristicaProducto() {
		return codigoCaracteristicaProducto;
	}

	public void setCodigoCaracteristicaProducto(String codigoCaracteristicaProducto) {
		this.codigoCaracteristicaProducto = codigoCaracteristicaProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getValocidadMaxima() {
		return velocidadMaxima;
	}

	public void setValocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getVelocidadReducida() {
		return velocidadReducida;
	}

	public void setVelocidadReducida(String velocidadReducida) {
		this.velocidadReducida = velocidadReducida;
	}

	private String codigoCaracteristicaProducto;

	private String nombre;

	private String descripcion;

	private String tecnologia;

	private String tipoUnidad;

	private String unidad;

	private String velocidadMaxima;

	private String velocidadReducida;
}
