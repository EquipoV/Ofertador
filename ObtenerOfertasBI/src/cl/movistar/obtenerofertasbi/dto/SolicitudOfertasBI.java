/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.obtenerofertasbi.dto;

/**
 *
 * @author Esteban
 */
public class SolicitudOfertasBI {

    //Algunos valores por defecto
    private String area_linea = "009";
    private String numero_linea = "000000";
    private String perfil_usuario ="01";
    private String submotivo_id = "0000000" ;
    private String familia_id = "000";
    private String canal = "";
    private String tipo_cliente = "M";
    private String uso = "0003";
    private String oferta_id = "";
    private String pagina = "";
	private String filler1 = "";

	
    public void setPagina(String pagina) {
		this.pagina = pagina;
	}
    /**
     * @return the area_linea
     */
    public String getArea_linea() {
        return area_linea;
    }



    /**
     * @return the numero_linea
     */
    public String getNumero_linea() {
        return numero_linea;
    }

    /**
     * @param numero_linea the numero_linea to set
     */
    public void setNumero_linea(String numero_linea) {
        //Especificado por BI
    	if(numero_linea!=null) this.numero_linea = this.numero_linea + numero_linea;
    }

    /**
     * @return the perfil_usuario
     */
    public String getPerfil_usuario() {
        return perfil_usuario;
    }



    /**
     * @return the submotivo_id
     */
    public String getSubmotivo_id() {
        return submotivo_id;
    }


    /**
     * @return the familia_id
     */
    public String getFamilia_id() {
        return familia_id;
    }


    /**
     * @return the canal
     */
    public String getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(String canal) {
        
        if(canal.equalsIgnoreCase("contencion")){
        this.canal = "10";
        }
        if(canal.equalsIgnoreCase("contención")){
        this.canal = "10";
        }
        if(canal.equalsIgnoreCase("contenciones")){
        this.canal = "10";
        }
        if(canal.equalsIgnoreCase("sugerida")){
        this.canal = "15";
        }
        if(canal.equalsIgnoreCase("sugeridas")){
        this.canal = "15";
        }
        
    }

    /**
     * @return the tipo_cliente
     */
    public String getTipo_cliente() {
        return tipo_cliente;
    }


    /**
     * @return the uso
     */
    public String getUso() {
        return uso;
    }


    /**
     * @return the oferta_id
     */
    public String getOferta_id() {
        return oferta_id;
    }


    /**
     * @return the pagina
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * @return the filler1
     */
    public String getFiller1() {
        return filler1;
    }

                                    
            

    
}
