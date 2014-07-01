package cl.movistar.ofertador.services;

import javax.xml.ws.Endpoint;

public class OfertadorPublisher {
	
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:8080/Ofertador", new OfertadorImpl());
	    }

}
