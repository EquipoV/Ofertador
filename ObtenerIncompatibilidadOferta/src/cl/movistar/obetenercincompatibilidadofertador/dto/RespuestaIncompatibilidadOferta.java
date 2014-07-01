package cl.movistar.obetenercincompatibilidadofertador.dto;

import java.util.ArrayList;
import java.util.List;

public class RespuestaIncompatibilidadOferta {

	
	
	public String getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public FamiliaridadIncompatible[] getFamiliaridadIncompatible() {
		return FamiliaridadIncompatible;
	}
	public void setFamiliaridadIncompatible(
			FamiliaridadIncompatible[] familiaridadIncompatible) {
		FamiliaridadIncompatible = familiaridadIncompatible;
	}
	String codigoRetorno;
	String mensaje;
	FamiliaridadIncompatible[] FamiliaridadIncompatible;
	
        public List<String> toList(){
            
            List<String> listaAux = new ArrayList<String>();
            if(getFamiliaridadIncompatible()!= null)
            for (int i = 0; i < this.getFamiliaridadIncompatible().length; i++) {
                FamiliaridadIncompatible familiaridadIncompatible = FamiliaridadIncompatible[i];
                listaAux.add(familiaridadIncompatible.getFamiliaridad());
            }
            
            return listaAux;
        }
}
