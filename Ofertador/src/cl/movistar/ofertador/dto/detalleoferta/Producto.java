package cl.movistar.ofertador.dto.detalleoferta;

public class Producto {

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public CaracteristicaProducto[] getCaracteristicasProducto() {
		return caracteristicasProducto;
	}

	public void setCaracteristicasProducto(
			CaracteristicaProducto[] caracteristicasProducto) {
		this.caracteristicasProducto = caracteristicasProducto;
	}

	private String codigoProducto;

	private String nombre;

	private String estado;

	private CaracteristicaProducto[] caracteristicasProducto;
	
}
