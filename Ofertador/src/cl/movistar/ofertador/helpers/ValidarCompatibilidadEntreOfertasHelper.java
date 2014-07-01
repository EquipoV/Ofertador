package cl.movistar.ofertador.helpers;

import cl.movistar.ofertador.dto.Response;
import cl.movistar.ofertador.dto.RespuestaServicio;

public class ValidarCompatibilidadEntreOfertasHelper {

	
	public Response obtenerRespuestaEnDuro() {
		RespuestaServicio respuestaServicio = new RespuestaServicio();
		respuestaServicio.setCodigo(123);
		respuestaServicio.setMensaje("Mensaje Mensaje Compatibilidad");
		Response response = new Response();
		response.setRespuesta("true");
		response.setRespuestaServicio(respuestaServicio);
		return response;
}
}
