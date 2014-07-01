package cl.telefonica.servicioobtenerofertasbi;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author mwn70571
 */
public class ServicioObtenerOfertasBIHandler implements SOAPHandler<SOAPMessageContext>{

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean salida = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        SOAPMessage message = context.getMessage();
        try {
            if (salida.booleanValue()) {
                System.out.println("SALIDA: ");
                message.writeTo(System.out);
                System.out.println("");
                return salida.booleanValue();
            }
            System.out.println("ENTRADA: ");
            message.writeTo(System.out);
            System.out.println("");
            context.setMessage(message);
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return salida.booleanValue();
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {        
    }
    
    private static final Logger logger = LoggerFactory.getLogger(ServicioObtenerOfertasBIHandler.class);
}
