import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cl.movistar.hibernate.dto.MovimientosTracking;
import cl.movistar.hibernate.dto.MovimientosTracking2;
import cl.movistar.hibernate.gateways.BitacoraHibernateGateway;


public class BitacoraHibernateGatewayTest {

	@Test
	public void testObtieneMovimientos() {
		BitacoraHibernateGateway bitacoraHibernateGateway = new BitacoraHibernateGateway();
		try {
//			List<MovimientosTracking2> lista = bitacoraHibernateGateway.obtieneMovimientos(92315914);
//			List<MovimientosTracking> lista = bitacoraHibernateGateway.obtieneMovimientos(90338819);
//			List<MovimientosTracking> lista = bitacoraHibernateGateway.obtieneMovimientos(97084472);
			List<MovimientosTracking> lista = bitacoraHibernateGateway.obtieneMovimientos(97084472);
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
