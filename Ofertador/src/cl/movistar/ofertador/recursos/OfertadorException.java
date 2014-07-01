package cl.movistar.ofertador.recursos;

public class OfertadorException extends Exception {

	int codigoError;
	String descripcionError;
	
	public OfertadorException(int codigoError, String descripcionError,Exception e) {
		super(e);
		this.codigoError = codigoError;
		this.descripcionError = descripcionError;
	}

	public int getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(int codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionError() {
		return descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}
	
}
