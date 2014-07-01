package cl.movistar.ofertador.dto.detalleoferta;

public class SegmentoMercado {

	public int getIdSegmentoMercado() {
		return idSegmentoMercado;
	}

	public void setIdSegmentoMercado(int idSegmentoMercado) {
		this.idSegmentoMercado = idSegmentoMercado;
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

	private int idSegmentoMercado;

	private String nombre;

	private String descripcion;

}
