package cl.movistar.ofertador.dto.detalleoferta;

public class DetalleOferta {



	public String getCodigoOferta() {
		return codigoOferta;
	}

	public void setCodigoOferta(String codigoOferta) {
		this.codigoOferta = codigoOferta;
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

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getValorCliente() {
		return valorCliente;
	}

	public void setValorCliente(String valorCliente) {
		this.valorCliente = valorCliente;
	}

	public String getTipoVisualizacion() {
		return tipoVisualizacion;
	}

	public void setTipoVisualizacion(String tipoVisualizacion) {
		this.tipoVisualizacion = tipoVisualizacion;
	}

	public String getTipoOferta() {
		return tipoOferta;
	}

	public void setTipoOferta(String tipoOferta) {
		this.tipoOferta = tipoOferta;
	}

	public String getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(String tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public int getCantidadPuntos() {
		return cantidadPuntos;
	}

	public void setCantidadPuntos(int cantidadPuntos) {
		this.cantidadPuntos = cantidadPuntos;
	}

	public int getIdValidacion() {
		return idValidacion;
	}

	public void setIdValidacion(int idValidacion) {
		this.idValidacion = idValidacion;
	}

	public String getValidacionRed() {
		return validacionRed;
	}

	public void setValidacionRed(String validacionRed) {
		this.validacionRed = validacionRed;
	}

	public String getIdRed() {
		return idRed;
	}

	public void setIdRed(String idRed) {
		this.idRed = idRed;
	}

	public String getCodigoOfertaRed() {
		return codigoOfertaRed;
	}

	public void setCodigoOfertaRed(String codigoOfertaRed) {
		this.codigoOfertaRed = codigoOfertaRed;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getSubFamilia() {
		return subFamilia;
	}

	public void setSubFamilia(String subFamilia) {
		this.subFamilia = subFamilia;
	}

	public String getFamiliaridad() {
		return familiaridad;
	}

	public void setFamiliaridad(String familiaridad) {
		this.familiaridad = familiaridad;
	}

	public String getTipoDestino() {
		return tipoDestino;
	}

	public void setTipoDestino(String tipoDestino) {
		this.tipoDestino = tipoDestino;
	}

	public String getHorarioVenta() {
		return horarioVenta;
	}

	public void setHorarioVenta(String horarioVenta) {
		this.horarioVenta = horarioVenta;
	}

	public String getTipoVigencia() {
		return tipoVigencia;
	}

	public void setTipoVigencia(String tipoVigencia) {
		this.tipoVigencia = tipoVigencia;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getRestricciones() {
		return restricciones;
	}

	public void setRestricciones(String restricciones) {
		this.restricciones = restricciones;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public Precio[] getPrecios() {
		return precios;
	}

	public void setPrecios(Precio[] precios) {
		this.precios = precios;
	}

	public SegmentoMercado[] getSegmentosMercado() {
		return segmentosMercado;
	}

	public void setSegmentosMercado(SegmentoMercado[] segmentosMercado) {
		this.segmentosMercado = segmentosMercado;
	}

	private String codigoOferta;

	    private String nombre;

	    private String descripcion;

	    private String estado;

	    private String fechaInicio;

	    private String fechaTermino;

	    private int idUsuario;

	    private String valorCliente;

	    private String tipoVisualizacion;

	    private String tipoOferta;

	    private String tipoCargo;

	    private int cantidadPuntos;

	    private int idValidacion;

	    private String validacionRed;

	    private String idRed;

	    private String codigoOfertaRed;

	    private String familia;

	    private String subFamilia;

	    private String familiaridad;

	    private String tipoDestino;

	    private String horarioVenta;

	    private String tipoVigencia;

	    private String consumo;

	    private String restricciones;

	    private Producto[] productos;

	    private Precio[] precios;

	    private SegmentoMercado[] segmentosMercado;
}
