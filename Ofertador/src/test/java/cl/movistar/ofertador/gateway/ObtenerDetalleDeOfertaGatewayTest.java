package test.java.cl.movistar.ofertador.gateway;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import cl.movistar.ofertador.dto.ResponseDetalleOferta;
import cl.movistar.ofertador.gateway.ObtenerDetalleDeOfertaGateway;

public class ObtenerDetalleDeOfertaGatewayTest {

	@Test
	public void testObtieneDetalleDeOferta() {
		try {
//			ResponseDetalleOferta obtenerDetalleDeOfertaGateway = ObtenerDetalleDeOfertaGateway.getInstance().obtieneDetalleDeOferta("OFE004", false);
//			System.out.println("");
			System.out.println(diaActual().getTime());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
	
	private Calendar diaActual() throws ParseException {
//		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//	  String cal = format1.format(new Date()
	  Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	    cal.setTime(sdf.parse("Mon Mar 14 16:02:37 GMT 2011"));
//		return cal.;
		return cal;
	}

}
