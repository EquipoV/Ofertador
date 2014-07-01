package cl.movistar.ofertadorIntegration.recursos;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configuracion {

	public Configuracion() {
		Properties props = new Properties();

		try {
//			props.load(getClass().getResourceAsStream("configVPN.properties"));
			props.load(getClass().getResourceAsStream("configDesarrollo.properties"));
			// props.load(getClass().getResourceAsStream("configProduccion.properties"));
			
			setObtenerParqueEndPoint(props.getProperty("servicio.obtenerparque.endpoint"));
			setObtenerDetalleOfertaEndPoint(props.getProperty("servicio.obtenerdetalleoferta.endpoint"));
			setObtenerIncompatibilidadOfertaEndPoint(props.getProperty("servicio.obtenerincompatibilidadoferta.endpoint"));
			setObtenerDatosClienteEndPoint(props.getProperty("servicio.obtenerdatoscliente.endpoint"));
			setObtenerListaOfertaEndPoint(props.getProperty("servicio.obtenerlistaoferta.endpoint"));
			setObtenerOfertasBiEndPoint(props.getProperty("servicio.obtenerofertasbi.endpoint"));
		} catch (Exception ex) {
			logger.log(Level.SEVERE, "No se pudo cargar la configuración.", ex);
		}

	}
	


	public String getObtenerParqueEndPoint() {
		return obtenerParqueEndPoint;
	}

	public void setObtenerParqueEndPoint(String obtenerParqueEndPoint) {
		this.obtenerParqueEndPoint = obtenerParqueEndPoint;
	}

	public String getObtenerDetalleOfertaEndPoint() {
		return obtenerDetalleOfertaEndPoint;
	}

	public void setObtenerDetalleOfertaEndPoint(String obtenerDetalleOfertaEndPoint) {
		this.obtenerDetalleOfertaEndPoint = obtenerDetalleOfertaEndPoint;
	}

	public String getObtenerIncompatibilidadOfertaEndPoint() {
		return obtenerIncompatibilidadOfertaEndPoint;
	}

	public void setObtenerIncompatibilidadOfertaEndPoint(
			String obtenerIncompatibilidadOfertaEndPoint) {
		this.obtenerIncompatibilidadOfertaEndPoint = obtenerIncompatibilidadOfertaEndPoint;
	}

	public String getObtenerDatosClienteEndPoint() {
		return obtenerDatosClienteEndPoint;
	}

	public void setObtenerDatosClienteEndPoint(String obtenerDatosClienteEndPoint) {
		this.obtenerDatosClienteEndPoint = obtenerDatosClienteEndPoint;
	}


	public String getObtenerListaOfertaEndPoint() {
		return obtenerListaOfertaEndPoint;
	}

	public void setObtenerListaOfertaEndPoint(String obtenerListaOfertaEndPoint) {
		this.obtenerListaOfertaEndPoint = obtenerListaOfertaEndPoint;
	}

	public String getObtenerOfertasBiEndPoint() {
		return obtenerOfertasBiEndPoint;
	}



	public void setObtenerOfertasBiEndPoint(String obtenerOfertasBiEndPoint) {
		this.obtenerOfertasBiEndPoint = obtenerOfertasBiEndPoint;
	}
	
	private String obtenerOfertasBiEndPoint;
	private String obtenerListaOfertaEndPoint;
	private String obtenerParqueEndPoint;
	private String obtenerDetalleOfertaEndPoint;
	private String obtenerIncompatibilidadOfertaEndPoint;
	private String obtenerDatosClienteEndPoint;

	private static final Logger logger = Logger.getLogger(Configuracion.class
			.getName());
}
