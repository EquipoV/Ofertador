/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.hibernate.gateways;

import cl.movistar.hibernate.dto.BitacoraRecurrencia;
import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.hibernate.dto.MovimientosTracking2;
import cl.movistar.hibernate.dto.VentaBolsa;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.db2.jcc.am.SqlException;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Jony
 */
public class BitacoraHibernateGateway {

	public static void main(String[] args) throws Exception {
		System.out.println("obtieneMovimientos");
		int numeroCelular = 0;
		BitacoraHibernateGateway instance = new BitacoraHibernateGateway();
		List<MovimientosTracking> result = instance
				.obtieneMovimientos(numeroCelular);
	}

	public static BitacoraHibernateGateway getInstance() {
		return INSTANCE;
	}

	public List<MovimientosTracking> obtieneMovimientos(int numeroCelular) throws Exception {
		List<MovimientosTracking> movimientos = null;
		try {
			session = BitacoraHibernateUtil.getSessionFactory().openSession();
			
			session.beginTransaction();
		} catch (Exception e) {

			throw new Exception("Error en crear session a BBDD", e);
		}
		try {
			movimientos = obtieneMovimientosSegunCelular(numeroCelular);
		} catch (Exception e) {
			throw new Exception("Error en Obtener Movimientos Según Celular",e);
		}
		return movimientos;
	}

	public List<VentaBolsa> obtieneRegistroVentas(int numeroCelular) {
		session = BitacoraHibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<VentaBolsa> ventas = obtenerRegistroVentas(numeroCelular);
		session.close();
		return ventas;
	}

	public List<BitacoraRecurrencia> obtieneBitacora(int numeroCelular)
			throws Exception {
		session = BitacoraHibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String query = "FROM cl.movistar.hibernate.dto.BitacoraRecurrencia";
		List<MovimientosTracking> movimientos = obtieneMovimientosSegunCelular(numeroCelular);
		List<BitacoraRecurrencia> bitacorasRecurrencia = new ArrayList<BitacoraRecurrencia>();
		List<BitacoraRecurrencia> bitacorasRecurrenciaAux = new ArrayList<BitacoraRecurrencia>();
		for (MovimientosTracking movimientosTracking : movimientos) {
			int idTracking = movimientosTracking.getIdTracking();
			Query query2 = session
					.createQuery("FROM cl.movistar.hibernate.dto.BitacoraRecurrencia where id_tracking = '"
							+ idTracking + "' ");
			bitacorasRecurrenciaAux = query2.list();
			if (!bitacorasRecurrenciaAux.isEmpty()) {
				BitacoraRecurrencia bitacoraRecurrencia = bitacorasRecurrenciaAux
						.get(0);
				bitacorasRecurrencia.add(bitacoraRecurrencia);
			}
		}

		session.close();
		return bitacorasRecurrencia;
	}

	private List<MovimientosTracking> obtieneMovimientosSegunCelular(
			int numeroCelular) throws Exception {// Aquiii
		List<MovimientosTracking> movimientosTrackingAux;
		try {
			Query query = session
					.createQuery("FROM cl.movistar.hibernate.dto.MovimientosTracking where numero_celular = '"
							+ numeroCelular
							+ "' AND ( estado= '1000' OR estado = '1001')");
			// Query query =
			// session.createQuery("FROM cl.movistar.hibernate.dto.MovimientosTracking where numero_celular  = '"+
			// numeroCelular+"' ");
			movimientosTrackingAux = query.list();
		} catch (Exception e) {

			throw new Exception(
					"Error al consultar BBDD Tracking para obtención de movimientos de 'Ofertas en Vuelo' ",
					e);
		}finally{
			session.close();
		}

		return movimientosTrackingAux;
	}

	private List<VentaBolsa> obtenerRegistroVentas(int numeroCelular) {
		Query query = session
				.createQuery("FROM cl.movistar.hibernate.dto.VentaBolsa where numero_celular = '"
						+ numeroCelular + "' ");
		List<VentaBolsa> ventaBolsa = query.list();
		return ventaBolsa;
	}

	private Session session;
	private static final BitacoraHibernateGateway INSTANCE = new BitacoraHibernateGateway();

}
