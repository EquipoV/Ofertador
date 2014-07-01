package cl.movistar.obtenerdatoscliente.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import cl.movistar.obtenerdatoscliente.dto.BolsaAbonado;
import cl.movistar.obtenerdatoscliente.dto.Cliente;
import cl.movistar.obtenerdatoscliente.dto.RespuestaDatosCliente;
import cl.movistar.osb.ConsultarDetalleAbonado;
import cl.movistar.osb.ConsultarDetalleAbonadoPortBindingStub;
import cl.movistar.osb.ConsultarDetalleAbonadoService;
import cl.movistar.osb.ConsultarDetalleAbonadoServiceLocator;
import cl.movistar.osb.GetDetalleVO;

public class ObtenerDatosClienteGateway {

	private String urlServicio;
	private ConsultarDetalleAbonado servicio;
	private boolean desconectado;

	public ObtenerDatosClienteGateway(String urlServicio, boolean desconectado)
			throws AxisFault, MalformedURLException {
		this.urlServicio = urlServicio;
		this.desconectado = desconectado;
		this.servicio = obtenerServicio();
	}

	private ConsultarDetalleAbonado obtenerServicio()
			throws MalformedURLException, AxisFault {

		if (this.desconectado) {
			return null;
		}
		ConsultarDetalleAbonado webService = null;
		try {
			ConsultarDetalleAbonadoServiceLocator wL = new ConsultarDetalleAbonadoServiceLocator();

			wL.setConsultarDetalleAbonadoPortEndpointAddress(this.urlServicio);
			

			ConsultarDetalleAbonadoService w = wL;

			webService = new ConsultarDetalleAbonadoPortBindingStub(new URL(
					w.getConsultarDetalleAbonadoPortAddress()), w);
		} catch (MalformedURLException e) {
			throw new MalformedURLException(
					"Error en el EndPoint obtenerServicio");
		} catch (AxisFault e) {
			throw new AxisFault(
					"Error al intentar conectarse con Webservice ConsultarDetalleAbonado",
					e);
		}

		return webService;
	}

	public RespuestaDatosCliente obtenerDatosCliente(int numCelular)
			throws Exception {

		RespuestaDatosCliente resultado = null;
		try {
			resultado = invocaServicioParqueService(numCelular);

		} catch (RemoteException ex) {

			throw new RemoteException("Error al obtener Datos de Cliente", ex);

		}
		return resultado;
	}

	private RespuestaDatosCliente invocaServicioParqueService(int parametros)
			throws RemoteException {
		RespuestaDatosCliente respuestaDatosCliente = new RespuestaDatosCliente();
		GetDetalleVO getDetalleVO = null;
		try {
			getDetalleVO = servicio.getDetalleAbonado(parametros);
			if (getDetalleVO.getCodigoRetorno() == 0) {

				respuestaDatosCliente.setCliente(obtenerCliente(getDetalleVO));
			}
		} catch (RemoteException e) {
			throw new RemoteException("Error en invocaServicioParqueService",e);
		} finally {
			if (getDetalleVO != null) {
				respuestaDatosCliente.setCodigoRetorno(String
						.valueOf(getDetalleVO.getCodigoRetorno()));
				respuestaDatosCliente.setMensaje(getDetalleVO
						.getMensajeRetorno());
			}
		}
		return respuestaDatosCliente;
	}

	private Cliente obtenerCliente(GetDetalleVO getDetalleVO) {

		Cliente cliente = new Cliente();

		cliente.setApellido1Usuario(getDetalleVO.getApellido1Usuario());
		cliente.setApellido2Usuario(getDetalleVO.getApellido2Usuario());
		cliente.setCargoBasico(getDetalleVO.getCargoBasico());
		cliente.setCodCausaBaja(getDetalleVO.getCodCausaBaja());
		cliente.setCodciclo(getDetalleVO.getCodciclo());
		cliente.setCodCliente(getDetalleVO.getCodCliente());
		cliente.setCodClienteDistribuidor(getDetalleVO
				.getCodClienteDistribuidor());
		cliente.setCodCuenta(getDetalleVO.getCodCuenta());
		cliente.setCodigoPlan(getDetalleVO.getCodigoPlan());
		cliente.setCodModelo(getDetalleVO.getCodModelo());
		cliente.setCodSituacion(getDetalleVO.getCodSituacion());
		cliente.setCodTecnologia(getDetalleVO.getCodTecnologia());
		cliente.setCodVendedor(getDetalleVO.getCodVendedor());
		cliente.setDescCausaBaja(getDetalleVO.getDescCausaBaja());
		cliente.setDescFabricante(getDetalleVO.getDescFabricante());
		cliente.setDescModVenta(getDetalleVO.getDescModVenta());
		cliente.setDescPlan(getDetalleVO.getDescPlan());
		cliente.setDescTipoContrato(getDetalleVO.getDescTipoContrato());
		cliente.setDiaFacturacion(getDetalleVO.getDiaFacturacion());
		cliente.setFechaAlta(getDetalleVO.getFechaAlta());
		cliente.setFechaAltaCentral(getDetalleVO.getFechaAltaCentral());
		cliente.setFechaBaja(getDetalleVO.getFechaBaja());
		cliente.setFechaBajaCentral(getDetalleVO.getFechaBajaCentral());
		cliente.setFechaFinContrato(getDetalleVO.getFechaFinContrato());
		cliente.setFechaProrroga(getDetalleVO.getFechaProrroga());

		if (getDetalleVO.getListaBolsaAbonado() != null) {
			BolsaAbonado[] listaBolsaAbonado = obtenerListaBolsaAbonado(getDetalleVO);
			cliente.setListaBolsaAbonado(listaBolsaAbonado);

		}
		cliente.setMesesContrato(getDetalleVO.getMesesContrato());
		cliente.setNombreCliente(getDetalleVO.getNombreCliente());
		cliente.setNombreUsuario(getDetalleVO.getNombreUsuario());
		cliente.setNumAbonado(getDetalleVO.getNumAbonado());
		cliente.setNumCelular(getDetalleVO.getNumCelular());
		cliente.setNumIdentidad(getDetalleVO.getNumIdentidad());
		cliente.setNumOrden(getDetalleVO.getNumOrden());
		cliente.setNumSerieInt(getDetalleVO.getNumSerieInt());
		cliente.setNumSerieStr(getDetalleVO.getNumSerieStr());
		cliente.setPrimerApellido(getDetalleVO.getPrimerApellido());
		cliente.setSegundoApellido(getDetalleVO.getSegundoApellido());
		cliente.setSexo(getDetalleVO.getSexo());
		cliente.setSituacionAbonado(getDetalleVO.getSituacionAbonado());
		cliente.setTipoAbonado(getDetalleVO.getTipoAbonado());
		cliente.setTipoIdentidad(getDetalleVO.getTipoIdentidad());
		cliente.setTipoPlan(getDetalleVO.getTipoPlan());
		cliente.setValorCliente(getDetalleVO.getValorCliente());

		return cliente;
	}

	private BolsaAbonado[] obtenerListaBolsaAbonado(GetDetalleVO getDetalleVO) {

		BolsaAbonado[] bolsasAbonado = new BolsaAbonado[getDetalleVO
				.getListaBolsaAbonado().length];

		for (int i = 0; i < bolsasAbonado.length; i++) {

			BolsaAbonado bolsaAbonado = new BolsaAbonado();

			bolsaAbonado.setCodServicio(getDetalleVO.getListaBolsaAbonado(i)
					.getCodServicio());
			bolsaAbonado.setDescUnidad(getDetalleVO.getListaBolsaAbonado(i)
					.getDescUnidad());
			bolsaAbonado.setFechaAltaServicio(getDetalleVO
					.getListaBolsaAbonado(i).getFechaAltaServicio());
			bolsaAbonado.setImpTarifa(getDetalleVO.getListaBolsaAbonado(i)
					.getImpTarifa());
			bolsaAbonado.setIndPlan(getDetalleVO.getListaBolsaAbonado(i)
					.getIndPlan());
			bolsaAbonado.setNumUnidades(getDetalleVO.getListaBolsaAbonado(i)
					.getNumUnidades());
			bolsaAbonado.setUnidadesConsumidas(getDetalleVO
					.getListaBolsaAbonado(i).getUnidadesConsumidas());

			bolsasAbonado[i] = bolsaAbonado;
		}

		return bolsasAbonado;
	}

}
