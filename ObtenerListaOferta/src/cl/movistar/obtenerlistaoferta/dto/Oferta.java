package cl.movistar.obtenerlistaoferta.dto;

public class Oferta {

	public String getCodigoOferta() {
		return codigoOferta;
	}

	public void setCodigoOferta(String codigoOferta) {
		this.codigoOferta = codigoOferta;
	}

	public String getIdRed() {
		return idRed;
	}

	public void setIdRed(String idRed) {
		this.idRed = idRed;
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

	public String getFamiliaridad() {
		return familiaridad;
	}

	public void setFamiliaridad(String familiaridad) {
		this.familiaridad = familiaridad;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getTipoVigencia() {
		return tipoVigencia;
	}

	public void setTipoVigencia(String tipoVigencia) {
		this.tipoVigencia = tipoVigencia;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getCodigoServicioSuplementario() {
		return codigoServicioSuplementario;
	}

	public void setCodigoServicioSuplementario(
			String codigoServicioSuplementario) {
		this.codigoServicioSuplementario = codigoServicioSuplementario;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	private String codigoOferta;
	private String idRed;
	private String nombre;
	private String descripcion;
	private String familiaridad;
	private String familia;
	private String tipoVigencia;
	private String tipoContrato; // (Prepago, Hibrido, Contrato)
	private String codigoServicioSuplementario;
	private String canal;
	private int id;
	private String estado;
	private String fechaInicio;
	private String fechaTermino;

}
