package cl.movistar.ofertador.matrizq;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import cl.movistar.ofertador.dto.Oferta;





public class MatrizQHelper {
	
	


	public List<Oferta> AplicarMatrizQ(List<Oferta> parqueBitacora,
			List<Oferta> ofertasCatalogo, String plan) {
		List<Oferta> ofertasMatrizQAplicada = null;
		try{
		//Esta bueno
		List<ReglaQ> reglasQ = ConfiguracionReglasQ.getInstance().getReglasQ();
		
		//Esta Bueno
		List<ReglaQ> reglasQPlan = obtenerReglasQPlan(reglasQ,plan);

		//Esta bueno Caso 1 Plan Híbrido; Prueba Caso 2 Plan Contrato 
		List<ReglaQ> reglasQCumplidas = obtenerReglasCumplidas(parqueBitacora,
				reglasQPlan);
		
		//Funciona
		ofertasMatrizQAplicada = eliminarOfertasPorReglas(ofertasCatalogo, reglasQCumplidas);

		}catch(Exception e){
			
			
		}
		
		return ofertasMatrizQAplicada;
	}

	//Obtener Reglas que sean de tal plan del cliente. Esta Bueno
	private List<ReglaQ> obtenerReglasQPlan(List<ReglaQ> reglasQ, String plan) {
		
		List<ReglaQ> auxReglasQ = new ArrayList<ReglaQ>(reglasQ);
		
		for (ReglaQ reglaQ : auxReglasQ) {
			
		
			//Si encuentra una regla de plan diferente al del cliente, entonces la borra.
			if(!reglaQ.getPlan().equalsIgnoreCase(plan)){
//				System.out.println("reglaQ removida por tipo plan " + reglaQ.getPlan() );
				reglasQ.remove(reglaQ);
				
				
			}
		}
		return reglasQ;
	}

	//Eliminar Ofertas que sobrepasen las reglas.
	private List<Oferta> eliminarOfertasPorReglas(List<Oferta> ofertasCatalogo,
			List<ReglaQ> reglasQCumplidas) {
		List<Oferta> ofertasVerificadasPorMatrizQ = ofertasCatalogo;
		
		for (int i = 0; i < reglasQCumplidas.size(); i++) {
			
			ReglaQ reglaCumplida = reglasQCumplidas.get(i);
			
			ofertasVerificadasPorMatrizQ = verificarReglaConOferta(reglaCumplida,ofertasVerificadasPorMatrizQ);
				
		}
		
		
		return ofertasVerificadasPorMatrizQ;
	}

	private List<Oferta> verificarReglaConOferta(ReglaQ reglaCumplida,
			List<Oferta> ofertasVerificadasPorMatrizQ2){
			
		
		List<String> familiaCumplida = reglaCumplida.getFamilia();
		String vigenciaCumplida = reglaCumplida.getTipoVigencia();
		
		
		for (int i = 0; i < ofertasVerificadasPorMatrizQ2.size(); i++) {
			
			if (vigenciaCumplida.equalsIgnoreCase(ofertasVerificadasPorMatrizQ2.get(i).getTipoVigencia())) {
				if(cumpleFamilia(familiaCumplida,ofertasVerificadasPorMatrizQ2.get(i).getFamilia())){
					logger.info("Oferta Eliminada Por MatrizQ, Oferta: "+ofertasVerificadasPorMatrizQ2.get(i).getCodigoOferta());
					ofertasVerificadasPorMatrizQ2.remove(ofertasVerificadasPorMatrizQ2.get(i));
					return verificarReglaConOferta(reglaCumplida,ofertasVerificadasPorMatrizQ2);
					
				}
			}
			
		}
		
		return ofertasVerificadasPorMatrizQ2;
	}
	private boolean cumpleFamilia(List<String> familiaCumplida, String familia) {
		for (int i = 0; i < familiaCumplida.size(); i++) {
			if(familia.equalsIgnoreCase(familiaCumplida.get(i))){
				return true;
			}
			
		}
		return false;
	}


	//Obtener Reglas que se cumplen conrespecto al parque y bitacora.
	private List<ReglaQ> obtenerReglasCumplidas(List<Oferta> parqueBitacora,
			List<ReglaQ> reglasQ) {

		List<ReglaQ> reglasQCumplidas = new ArrayList<ReglaQ>();

		for (int i = 0; i < reglasQ.size(); i++) {
	
			boolean aplica = aplicarReglaQ(reglasQ.get(i), parqueBitacora);
//			System.out.println("Aplica ReglaQ"+ aux + "?: " + aplica);
			if (aplica) {
				
				reglasQCumplidas.add(reglasQ.get(i));
			}

		}

		return reglasQCumplidas;

	}
	
	
	private boolean aplicarReglaQ(ReglaQ reglaQ, List<Oferta> parqueBitacora) {

		String vigencia = reglaQ.getTipoVigencia();
		List<String> familias = reglaQ.getFamilia();
		int cantidad = reglaQ.getCantidad();
		int contador = 0;
		
		if(cantidad == 0){
//			System.out.println("No aplica por cantidad 0: "+cantidad);
			return false;
		}
		for (int i = 0; i < parqueBitacora.size(); i++) {
			try{
			Oferta parqBit = parqueBitacora.get(i);
			if (vigencia.equalsIgnoreCase(parqBit.getTipoVigencia())) {
				// Comparando familias con la del parque
				for (int j = 0; j < familias.size(); j++) {
					//Compara la familia de la oferta con todas las de la regla.
					if (parqBit.getFamilia().equalsIgnoreCase(familias.get(j))) {
						// Significa que encontro un parqueBitacora que cumple
						// la regla
						contador++;
					}
				}
			}
			}catch(Exception e){
				
				//NUll
			}
		}

		if (contador == cantidad || contador > cantidad) {

			return true;

		}
		return false;
	}
	
	public MatrizQHelper(){
		String resourceLog = "cl/movistar/ofertador/recursos/OfertadorLog4j.properties";
		InputStream isLog = this.getClass().getClassLoader()
				.getResourceAsStream(resourceLog);
		Properties props = new Properties();
		try {
			props.load(isLog);
			PropertyConfigurator.configure(props);
			isLog.close();
		} catch (Exception ex) {
			logger.error("No se pudo cargar la configuración del Log4J.", ex);
		}
	}
	private static final Logger logger = LoggerFactory.getLogger(MatrizQHelper.class);
}


//			Plan	 Familia		   Vigencia	     Cantidad
//reglaQ1 = HIBRIDO; SMS,MMS,MIN;      recurrente;   5
//reglaQ2 = HIBRIDO; SMS,MMS,MIN;      no recurrente;0  //Sin límite
//reglaQ3 = HIBRIDO; NEM;              recurrente;   1
//reglaQ4 = HIBRIDO; NEM;              no recurrente;0 //Sin límite
//reglaQ5 = CONTRATO;SMS,MMS,MIN;      recurrente;   1
//reglaQ6 = CONTRATO;SMS,MMS,MIN;      no recurrente;0  //Sin límite
//reglaQ7 = CONTRATO;NEM;              recurrente;   1
//reglaQ8 = CONTRATO;NEM;              no recurrente;2
//reglaQ9 = PREPAGO; SMS,MMS,MIN,MIXTA;no recurrente;0  //Sin límite


