/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.telefonica.servicioobtenerofertasbi;



import cl.telefonica.servicioobtenerofertasbi.dto.SolicitudOfertasBI;
import cl.telefonica.servicioobtenerofertasbi.dto.OfertaBI;
import cl.telefonica.servicioobtenerofertasbi.dto.RespuestaOfertasBI;
import com.ofcewszi.ofcewsco.OFCEWSCOPort;
import com.ofcewszi.ofcewsco.OFCEWSCOService;
import com.request.ofcewszi.ofcewsco.ProgramInterface;
import com.response.ofcewszi.ofcewsco.ProgramInterface.MsoSalida;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 *
 * @author Esteban
 */
public class ServicioObtenerOfertasBIGateway {
    
    private String urlServicio;
    private OFCEWSCOPort servicio;
    private boolean desconectado;
    private static final ServicioObtenerOfertasBIHandler SERVICIO_OFERTASBI_HANDLER = new ServicioObtenerOfertasBIHandler();

    public ServicioObtenerOfertasBIGateway(String urlServicio, boolean desconectado) throws Exception {
        this.urlServicio = urlServicio;
        this.desconectado = desconectado;
        this.servicio = obtenerServicio();
    }
    private OFCEWSCOPort obtenerServicio() throws Exception{
        OFCEWSCOPort port = null;
        try{
        if (this.desconectado) {
            return null;
        }
        OFCEWSCOService service = new OFCEWSCOService();
        service.setHandlerResolver(new HandlerResolver() {
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List handlers = new ArrayList();
                handlers.add(ServicioObtenerOfertasBIGateway.SERVICIO_OFERTASBI_HANDLER);
                return handlers;
            }
        });
        port = service.getOFCEWSCOPort();//Ver bien
        BindingProvider bp = (BindingProvider) port;
        bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", this.urlServicio);
        }catch(Exception ex){
            System.out.println("Error en ObtenerServicio");
         throw ex;   
        }
        return port;
        }
    
       public RespuestaOfertasBI obtenerDeudaClienteScoring(SolicitudOfertasBI solicitudOfertasBI) throws RemoteException, Exception {
        RespuestaOfertasBI resultado = null;
        try{
        if (desconectado) {
            resultado = OfertasBIEnDuro();
        } else {
            ProgramInterface.MsiEntrada parametros = obtenerParametros(solicitudOfertasBI);
            
            resultado = invocaServicioOfertasBIService(parametros);
        
        }
        }catch (Exception ex){
           
                throw ex;
            
        }
        return resultado;
   }

    private RespuestaOfertasBI OfertasBIEnDuro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ProgramInterface.MsiEntrada obtenerParametros(SolicitudOfertasBI solicitudOfertasBI) {
        
        ProgramInterface.MsiEntrada msiEntrada = new ProgramInterface.MsiEntrada();
        msiEntrada.setFiller1(solicitudOfertasBI.getFiller1());
        msiEntrada.setMsiArea(solicitudOfertasBI.getArea_linea());
        msiEntrada.setMsiCanal(solicitudOfertasBI.getCanal());
        msiEntrada.setMsiFamiliaId(solicitudOfertasBI.getFamilia_id());
        msiEntrada.setMsiNumCom(solicitudOfertasBI.getNumero_linea());
        msiEntrada.setMsiOfertaId(solicitudOfertasBI.getOferta_id());
        msiEntrada.setMsiPagina(solicitudOfertasBI.getPagina());
        msiEntrada.setMsiPerfilUsuario(solicitudOfertasBI.getPerfil_usuario());
        msiEntrada.setMsiSubmotivoId(solicitudOfertasBI.getSubmotivo_id());
        msiEntrada.setMsiTipoCliente(solicitudOfertasBI.getTipo_cliente());
        msiEntrada.setMsiUso(solicitudOfertasBI.getUso());
        
        
        return msiEntrada;
    }

    private RespuestaOfertasBI invocaServicioOfertasBIService(ProgramInterface.MsiEntrada parametros) {

        MsoSalida miResponse = servicio.ofcewscoOperation(parametros);
        RespuestaOfertasBI respuestaOfertasBI = new RespuestaOfertasBI();
        
        respuestaOfertasBI.setCodigoRetorno(miResponse.getMsoCodRetorno());
        respuestaOfertasBI.setDescripcionCodigoRetorno(miResponse.getMsoDesCodRetorno());
        respuestaOfertasBI.setListaOfertasBI(obtenerObertasBI(miResponse.getMsoDatos()));
        respuestaOfertasBI.setCodigoBD(miResponse.getMsoCodBd());
        
        
       
        
        return respuestaOfertasBI;
    }

    private List<OfertaBI> obtenerObertasBI(List<MsoSalida.MsoDatos> msoDatos) {
         List<OfertaBI> ofertasBI = new ArrayList<OfertaBI>();
         
         for(MsoSalida.MsoDatos msoDato :msoDatos){
             OfertaBI oferta = new OfertaBI();
             oferta.setFamiliaId(msoDato.getMsoFamiliaId());
             oferta.setGlosaCorOfer(msoDato.getMsoGlosaCorOfer());
             oferta.setGlosaOfer(msoDato.getMsoGlosaOfer());
             oferta.setOfertaId(msoDato.getMsoOfertaId());
             oferta.setOfertaMoneda(msoDato.getMsoOfertaMoneda());
             oferta.setPerfilUsuario(msoDato.getMsoPerfilUsuario());
             oferta.setPrecio(msoDato.getMsoPrecio());
             oferta.setPrecioActual(msoDato.getMsoPrecioActual());
             oferta.setPrioridad(msoDato.getMsoPrioridad());
             oferta.setProductoActual(msoDato.getMsoProductoActual());
             oferta.setProductoOferta(msoDato.getMsoProductoOferta());
             oferta.setRiesgo(msoDato.getMsoRiesgo());
             oferta.setSubmotivoId(msoDato.getMsoSubmotivoId());
             oferta.setTipoCliente(msoDato.getMsoTipoCodigoOferta());
             oferta.setTipoCodigoOferta(msoDato.getMsoTipoCodigoOferta());
             oferta.setTipoOfertaId(msoDato.getMsoTipoOfertaId());
             oferta.setVelocidadAdsl(msoDato.getMsoVelocidadAdsl());
             oferta.setTipoOfertaId(msoDato.getMsoTipoOfertaId());
             
             ofertasBI.add(oferta);
         
         }
         
         
         return ofertasBI;
    }
       
       
    
    
    
}
