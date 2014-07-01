/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.java.cl.movistar.ofertador.gateway;

import cl.movistar.ofertador.dto.ResponseOfertas;
import cl.movistar.ofertador.dto.SolicitudOferta;
import cl.movistar.ofertador.gateway.ObtenerOfertaGateway;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esteam
 */
public class ObtenerOfertaGatewayTest {
    
    public ObtenerOfertaGatewayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerOfertas method, of class ObtenerOfertaGateway.
     */
    @Test
    public void testObtenerOfertas() throws Exception {
        SolicitudOferta solicitudOferta = new SolicitudOferta();
        solicitudOferta.setCanal("9");
//        solicitudOferta.setNumeroCelular(99642950);
//        solicitudOferta.setNumeroCelular(95296146);
//        solicitudOferta.setNumeroCelular(99642950);
//        solicitudOferta.setNumeroCelular(90338819);//Prepago 
//        solicitudOferta.setNumeroCelular(97590320);//Contrato No Moroso
//        solicitudOferta.setNumeroCelular(71323313);//Contrato El Rafa
        solicitudOferta.setNumeroCelular(97084472);//hIBRIDO hermano de mauricio
        
//        solicitudOferta.setNumeroCelular(89145500);
        solicitudOferta.setVisualizacion("general");
        boolean dummy = false;
        try{
        ObtenerOfertaGateway instance = new ObtenerOfertaGateway();
        ResponseOfertas result = instance.obtenerOfertas(solicitudOferta, dummy);
        System.out.println(result.getRespuestaServicio().getCodigo());
        }catch(Exception e){
        	e.printStackTrace();
        	
        }
    }
    
}
