/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.obtenerparque.impl;

import java.util.List;

/**
 *
 * @author Esteban
 */
public class RespuestaParque {
    
    itemParque[] listaSSAbonado;
    public itemParque[] getListaSSAbonado() {
		return listaSSAbonado;
	}

	public void setListaSSAbonado(itemParque[] listaItemParque) {
		this.listaSSAbonado = listaItemParque;
	}

	private String codigoError;
    private String mensajeError;
    private String NumeroEvento;

    /**
     * @return the codigoError
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * @param codigoError the codigoError to set
     */
    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * @param mensajeError the mensajeError to set
     */
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    /**
     * @return the umeroEvento
     */
    public String getNumeroEvento() {
        return NumeroEvento;
    }

    /**
     * @param umeroEvento the umeroEvento to set
     */
    public void setNumeroEvento(String umeroEvento) {
        this.NumeroEvento = umeroEvento;
    }
    
}
