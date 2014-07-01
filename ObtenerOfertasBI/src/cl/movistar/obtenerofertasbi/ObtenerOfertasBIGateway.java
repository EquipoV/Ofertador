/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.movistar.obtenerofertasbi;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import cl.movistar.obtenerofertasbi.dto.OfertaBI;
import cl.movistar.obtenerofertasbi.dto.RespuestaOfertasBI;
import cl.movistar.obtenerofertasbi.dto.SolicitudOfertasBI;

import com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOHTTPSoapBindingStub;
import com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOPort;
import com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOService;
import com.OFCEWSZI.OFCEWSCO.www.OFCEWSCOServiceLocator;
import com.Request.OFCEWSZI.OFCEWSCO.www.ProgramInterfaceMsi_entrada;
import com.Response.OFCEWSZI.OFCEWSCO.www.ProgramInterfaceMso_salida;
import com.Response.OFCEWSZI.OFCEWSCO.www.ProgramInterfaceMso_salidaMso_datos;

/**
 *
 * @author Esteban
 */
public class ObtenerOfertasBIGateway {

	private String urlServicio;
	private OFCEWSCOPort servicio;

	public ObtenerOfertasBIGateway(String urlServicio) throws AxisFault,
			MalformedURLException {
		this.urlServicio = urlServicio;

		this.servicio = obtenerServicio();
	}

	private OFCEWSCOPort obtenerServicio() throws AxisFault,
			MalformedURLException {
		OFCEWSCOPort webService = null;

		try {
			OFCEWSCOServiceLocator wL = new OFCEWSCOServiceLocator();

			wL.setOFCEWSCOPortEndpointAddress(this.urlServicio);

			OFCEWSCOService w = wL;

			webService = new OFCEWSCOHTTPSoapBindingStub(new URL(
					w.getOFCEWSCOPortAddress()), w);
		} catch (AxisFault e) {
			throw new AxisFault(
					"Error al conectarse con servicio de ofertas DWH-BI", e);
		} catch (MalformedURLException e) {
			throw new MalformedURLException(
					"Error Endpoint servicio ofertas DWH-BI");
		}

		return webService;
	}

	public RespuestaOfertasBI obtenerOfertaBI(
			SolicitudOfertasBI solicitudOfertasBI) throws RemoteException {

		RespuestaOfertasBI resultado = null;
		ProgramInterfaceMsi_entrada parametros = obtenerParametros(solicitudOfertasBI);

		resultado = invocaServicioOfertasBIService(parametros);

		return resultado;
	}

	private ProgramInterfaceMsi_entrada obtenerParametros(
			SolicitudOfertasBI solicitudOfertasBI) {
		ProgramInterfaceMsi_entrada msiEntrada = null;
		try {
			msiEntrada = new ProgramInterfaceMsi_entrada();
			msiEntrada.setFiller1(solicitudOfertasBI.getFiller1());
			msiEntrada.setMsi_area(solicitudOfertasBI.getArea_linea());
			msiEntrada.setMsi_canal(solicitudOfertasBI.getCanal());
			msiEntrada.setMsi_familia_id(solicitudOfertasBI.getFamilia_id());
			msiEntrada.setMsi_num_com(solicitudOfertasBI.getNumero_linea());
			msiEntrada.setMsi_oferta_id(solicitudOfertasBI.getOferta_id());
			msiEntrada.setMsi_pagina(solicitudOfertasBI.getPagina());
			msiEntrada.setMsi_perfil_usuario(solicitudOfertasBI
					.getPerfil_usuario());
			msiEntrada
					.setMsi_submotivo_id(solicitudOfertasBI.getSubmotivo_id());
			msiEntrada
					.setMsi_tipo_cliente(solicitudOfertasBI.getTipo_cliente());
			msiEntrada.setMsi_uso(solicitudOfertasBI.getUso());
		} catch (NullPointerException e) {
		}

		return msiEntrada;
	}

	private RespuestaOfertasBI invocaServicioOfertasBIService(
			ProgramInterfaceMsi_entrada parametros) throws RemoteException {

		RespuestaOfertasBI respuestaOfertasBI = new RespuestaOfertasBI();

		try {
			respuestaOfertasBI.setListaOfertasBI(obtenerListaOfertasBI(parametros));
			
		} catch (RemoteException ex) {

			throw new RemoteException(
					"Error en invocaServicioOfertasBIService", ex);
		} finally {
			try{
				if (respuestaOfertasBI.getListaOfertasBI().size() > 0) {
					respuestaOfertasBI.setCodigoRetorno("0");
					respuestaOfertasBI.setDescripcionCodigoRetorno("Proceso Exitoso");
				
			}else {
				
				respuestaOfertasBI.setCodigoRetorno("1");
				respuestaOfertasBI.setDescripcionCodigoRetorno("No se encontraron Ofertas en DWH-BI");
			}}catch(Exception e){
				
				respuestaOfertasBI.setCodigoRetorno("1");
				respuestaOfertasBI.setDescripcionCodigoRetorno("No se encontraron Ofertas en DWH-BI");
			}
		}
		return respuestaOfertasBI;
	}

	private List<OfertaBI> obtenerListaOfertasBI(
			ProgramInterfaceMsi_entrada parametros) throws RemoteException {
		
		ProgramInterfaceMso_salida miResponse = null;
		List<OfertaBI> ofertasBI = new ArrayList<OfertaBI>();
		for (int pagina = 0; pagina < 26; pagina++) {

			parametros.setMsi_pagina(obtenerpagina2Digitos(pagina));
			miResponse = servicio.OFCEWSCOOperation(parametros);
			String codigoRetorno = miResponse.getMso_cod_retorno().trim();
			if (!codigoRetorno.equals("000")&&(miResponse.getMso_datos(0).getMso_oferta_id().equals(""))
					) {
				
				break;
				
				
			} else if ((codigoRetorno.equals("000"))&&(!miResponse.getMso_datos(0).getMso_oferta_id().equals(""))
					) {
				ofertasBI.addAll(obtenerObertasBI(miResponse.getMso_datos()));
			}
		}
		
		

		return ofertasBI;
	}

	private String obtenerpagina2Digitos(int pagina) {
		if (pagina < 10) {
			return "0" + pagina;
		}
		return String.valueOf(pagina);
	}

	private List<OfertaBI> obtenerObertasBI(
			ProgramInterfaceMso_salidaMso_datos[] msoDatos) {
		List<OfertaBI> ofertasBI = new ArrayList<OfertaBI>();

		for (int i = 0; i < msoDatos.length; i++) {

			ProgramInterfaceMso_salidaMso_datos msoDato = msoDatos[i];
			if(msoDato.getMso_oferta_id().equals("")){break;}
			OfertaBI oferta = new OfertaBI();
			oferta.setFamiliaId(msoDato.getMso_familia_id());
			oferta.setGlosaCorOfer(msoDato.getMso_glosa_cor_ofer());
			oferta.setGlosaOfer(msoDato.getMso_glosa_ofer());
			oferta.setOfertaId(borrarEspaciosBlanco(msoDato.getMso_oferta_id()));
			oferta.setOfertaMoneda(msoDato.getMso_oferta_moneda());
			oferta.setPerfilUsuario(msoDato.getMso_perfil_usuario());
			oferta.setPrecio(msoDato.getMso_precio());
			oferta.setPrecioActual(msoDato.getMso_precio_actual());
			oferta.setPrioridad(msoDato.getMso_prioridad());
			oferta.setProductoActual(msoDato.getMso_producto_actual());
			oferta.setProductoOferta(msoDato.getMso_producto_oferta());
			oferta.setRiesgo(msoDato.getMso_riesgo());
			oferta.setSubmotivoId(msoDato.getMso_submotivo_id());
			oferta.setTipoCliente(msoDato.getMso_tipo_cliente());
			oferta.setTipoCodigoOferta(msoDato.getMso_tipo_codigo_oferta());
			oferta.setTipoOfertaId(msoDato.getMso_oferta_id());
			oferta.setVelocidadAdsl(msoDato.getMso_velocidad_adsl());
			oferta.setTipoOfertaId(msoDato.getMso_tipo_oferta_id());
			

			ofertasBI.add(oferta);
		}

		return ofertasBI;
	}

	private String borrarEspaciosBlanco(String mso_oferta_id) {

		
	 
		
		return mso_oferta_id.trim();
	}

}
