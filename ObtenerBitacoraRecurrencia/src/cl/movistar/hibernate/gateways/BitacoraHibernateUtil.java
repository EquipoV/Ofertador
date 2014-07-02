/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.movistar.hibernate.gateways;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Jony
 */
public class BitacoraHibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		 SessionFactory sessionFactoryAUX;
			try {
				
		            // Create the SessionFactory from standard (hibernate.cfg.xml)
		            // config file.
		           
		                sessionFactoryAUX = new Configuration().configure(
		                        "hibernateJNDI.cfg.xml").buildSessionFactory();
	                        if(sessionFactoryAUX.openSession().beginTransaction().isActive())sessionFactoryAUX.openSession().close();
			} catch (Throwable ex) {
	                  sessionFactoryAUX = new Configuration().configure(
	                          "hibernateDesarrollo.cfg.xml").buildSessionFactory();
	                  if(sessionFactoryAUX.openSession().beginTransaction().isActive())sessionFactoryAUX.openSession().close();
			}
			  sessionFactory = sessionFactoryAUX;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
