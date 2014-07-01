/**
 * FindProductOfferingBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.findproductofferingservice;

import com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse;
import com.telefonica.midrange.findproductofferingservice.types.ProductOfferingAttributes;

public class FindProductOfferingBindingImpl implements com.telefonica.midrange.findproductofferingservice.FindProductOfferingPortType{
    public com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingResponse findProductOffering(com.telefonica.midrange.findproductofferingservice.types.FindProductOfferingRequest findProductOfferingRequestParameter) throws java.rmi.RemoteException {
        
    	FindProductOfferingResponse FindProductOfferingResponse = new FindProductOfferingResponse();
		
    	FindProductOfferingResponse.setReturnCode("123");
    	FindProductOfferingResponse.setReturnDescription("Description Description");

		ProductOfferingAttributes productOfferingAttributes1 = new ProductOfferingAttributes();
		ProductOfferingAttributes productOfferingAttributes2 = new ProductOfferingAttributes();
		ProductOfferingAttributes productOfferingAttributes3 = new ProductOfferingAttributes();
		
		productOfferingAttributes1.setChannelName("Canal Canal");
		productOfferingAttributes1.setCodOffering("123");
		productOfferingAttributes1.setContractType("Hibrido");
		productOfferingAttributes1.setDescription("Oferta Oferta");
		productOfferingAttributes1.setEndDateTime("11/12/2014");
		productOfferingAttributes1.setFamiliarityType("DEF");
		productOfferingAttributes1.setIdNetwork("123");
		productOfferingAttributes1.setLifeType("Recurrente"); 
		productOfferingAttributes1.setName("Oferta123");
		productOfferingAttributes1.setProductOfferingFamily("SMS");
		productOfferingAttributes1.setStartDateTime("11/12/1985");
		productOfferingAttributes1.setStatus("Vigente");
		productOfferingAttributes1.setSupplementaryService("ABC");
		
		productOfferingAttributes2.setChannelName("Canal2 Canal2");
		productOfferingAttributes2.setCodOffering("345");
		productOfferingAttributes2.setContractType("Contrato");
		productOfferingAttributes2.setDescription("Oferta2 Oferta2");
		productOfferingAttributes2.setEndDateTime("11/12/2014");
		productOfferingAttributes2.setFamiliarityType("DEF");
		productOfferingAttributes2.setIdNetwork("123");
		productOfferingAttributes2.setLifeType("No Recurrente"); 
		productOfferingAttributes2.setName("Oferta123");
		productOfferingAttributes2.setProductOfferingFamily("NEM");
		productOfferingAttributes2.setStartDateTime("11/12/1985");
		productOfferingAttributes2.setStatus("Vigente");
		productOfferingAttributes2.setSupplementaryService("CHF");
		
		
		productOfferingAttributes3.setChannelName("Canal3 Canal3");
		productOfferingAttributes3.setCodOffering("456");
		productOfferingAttributes3.setContractType("Prepago");
		productOfferingAttributes3.setDescription("Oferta3 Oferta3");
		productOfferingAttributes3.setEndDateTime("11/12/2014");
		productOfferingAttributes3.setFamiliarityType("DEF");
		productOfferingAttributes3.setIdNetwork("677");
		productOfferingAttributes3.setLifeType("Recurrente"); 
		productOfferingAttributes3.setName("Oferta123");
		productOfferingAttributes3.setProductOfferingFamily("VPN");
		productOfferingAttributes3.setStartDateTime("11/12/1985");
		productOfferingAttributes3.setStatus("Vigente");
		productOfferingAttributes3.setSupplementaryService("KJH");
		
		ProductOfferingAttributes[] productOffering = new ProductOfferingAttributes[]{productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1,productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1,productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1,productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1,productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1,productOfferingAttributes1 ,productOfferingAttributes3,productOfferingAttributes1};
		FindProductOfferingResponse.setProductOffering(productOffering);
        
        
        return FindProductOfferingResponse;
    }

}
