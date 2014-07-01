/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.movista.ofertadorintegration.serviciosfacade;

import java.util.List;

import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.hibernate.gateways.BitacoraHibernateGateway;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Jony
 */
public class BitacoraHibernateFacade {

    public List<MovimientosTracking> obtieneMovimientos(int numeroCelular) throws Exception {
        return BitacoraHibernateGateway.getInstance().obtieneMovimientos(numeroCelular);
    }

}
