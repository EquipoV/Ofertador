/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.telefonica.servicioobtenerofertasbi.dto;

import java.util.List;

/**
 *
 * @author Esteban
 */
public class RespuestaOfertasBI {

    private String codigoRetorno;
    private String descripcionCodigoRetorno;
    private List<OfertaBI> listaOfertasBI;
    private String codigoBD;

    /**
     * @return the codigoRetorno
     */
    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * @param codigoRetorno the codigoRetorno to set
     */
    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    /**
     * @return the descripcionCodigoRetorno
     */
    public String getDescripcionCodigoRetorno() {
        return descripcionCodigoRetorno;
    }

    /**
     * @param descripcionCodigoRetorno the descripcionCodigoRetorno to set
     */
    public void setDescripcionCodigoRetorno(String descripcionCodigoRetorno) {
        this.descripcionCodigoRetorno = descripcionCodigoRetorno;
    }

    /**
     * @return the listaOfertasBI
     */
    public List<OfertaBI> getListaOfertasBI() {
        return listaOfertasBI;
    }

    /**
     * @param listaOfertasBI the listaOfertasBI to set
     */
    public void setListaOfertasBI(List<OfertaBI> listaOfertasBI) {
        this.listaOfertasBI = listaOfertasBI;
    }

    /**
     * @return the codigoBD
     */
    public String getCodigoBD() {
        return codigoBD;
    }

    /**
     * @param codigoBD the codigoBD to set
     */
    public void setCodigoBD(String codigoBD) {
        this.codigoBD = codigoBD;
    }

}