package cl.movistar.obtenermatrizq.impl;

import java.util.List;

import cl.movistar.obtenermatrizq.dto.ReglaQ;
import cl.movistar.obtenermatrizq.recursos.ConfiguracionReglasQ;

public class ObtenerMatrizGateway {

	public static void main(String[] args) {
		
		List<ReglaQ> reglasQ =  ConfiguracionReglasQ.getInstance().getReglasQ();
//		System.out.println("");
		  
	}
	
	
	

}
