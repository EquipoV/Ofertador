package cl.movistar.obtenermatrizq.recursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import cl.movistar.obtenermatrizq.dto.ReglaQ;

public class ConfiguracionReglasQ {

	
	public ConfiguracionReglasQ() {
		Properties props = new Properties();
		this.reglasQ = new ArrayList<ReglaQ>();
		try {

			props.load(getClass().getResourceAsStream("reglasQ.properties"));

			 String totalReglas = "";
			for (int j = 0; j < props.size(); j++) {
				
			
				totalReglas = props.getProperty("reglaQ" + String.valueOf(j+1));
				
				String[] auxReglaQ = totalReglas.split(";");

				ReglaQ reglaQ = new ReglaQ();
				reglaQ.setPlan(auxReglaQ[0]);
				reglaQ.setFamilia(obtenerFamiliaReglaQ(auxReglaQ[1]));
				reglaQ.setTipoVigencia(auxReglaQ[2]);
				reglaQ.setCantidad(Integer.parseInt(auxReglaQ[3]));
				reglasQ.add(reglaQ);
			
			}

		} catch (Exception ex) {
			logger.log(Level.SEVERE, "No se pudo cargar la configuración.", ex);
		}

	}

	private List<String> obtenerFamiliaReglaQ(String familiaReglaQ) {
		List<String> familias = new ArrayList<String>();

		String[] auxFamilia = familiaReglaQ.split(",");

		if (auxFamilia.length > 0) {
			for (int i = 0; i < auxFamilia.length; i++) {
				String familia = auxFamilia[i];
				familias.add(familia);
			}
		}

		return familias;
	}

	
	
	
	public List<ReglaQ> getReglasQ() {
		return reglasQ;
	}

	public static ConfiguracionReglasQ getInstance() {
        return INSTANCE;
    }
	private static ConfiguracionReglasQ INSTANCE = new ConfiguracionReglasQ();
	private static final Logger logger = Logger.getLogger(ConfiguracionReglasQ.class.getName());
	private List<ReglaQ> reglasQ;
	
}
