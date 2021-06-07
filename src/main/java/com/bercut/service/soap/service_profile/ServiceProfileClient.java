package com.bercut.service.soap.service_profile;

import com.bercut.service.findservices.ServiceContent;
import com.bercut.service.wsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.ws.client.WebServiceFaultException;
import org.springframework.ws.client.WebServiceTransportException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class ServiceProfileClient extends WebServiceGatewaySupport {

    @Autowired
    private Environment environment;

    public FindServicesResponseParams findServices(String testContur, long branchId, String xPath,
                                                   String trplName, Long servId) throws WebServiceFaultException {
        String uri = environment.getProperty(testContur);
        if (uri == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test environment specified");
        }

        FindServicesRequestParams request = new FindServicesRequestParams();
        request.setBranchId(branchId);
        ConcreteServiceCriteria concreteServiceCriteria = new ConcreteServiceCriteria();
        concreteServiceCriteria.setXpath(xPath);
        ServiceContent serviceContent = new ServiceContent();
        if (trplName != null) {
            serviceContent.setProductName(trplName);
        }
        if (servId != null) {
            serviceContent.setBillingServiceId(servId);
        }
        concreteServiceCriteria.setServiceContent(serviceContent);
        request.setConcreteServiceCriteria(concreteServiceCriteria);

        try {
            JAXBElement<FindServicesResponseParams> response = (JAXBElement<FindServicesResponseParams>) getWebServiceTemplate().marshalSendAndReceive(uri, request);
            return response.getValue();
        } catch (WebServiceTransportException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }

    public ReadServiceResponseParams readService(String testContur, long branchId,
                                                 String serviceName, String xPath) throws WebServiceFaultException {
        String uri = environment.getProperty(testContur);
        if (uri == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test environment specified");
        }

        ReadServiceRequestParams request = new ReadServiceRequestParams();
        request.setBranchId(branchId);
        ServiceIds serviceIds = new ServiceIds();
        serviceIds.setServiceName(serviceName);
        request.setServiceIds(serviceIds);
        request.setContractIds(ContractIds.PARAMETERS);
        ParameterContext parameterContext = new ParameterContext();
        parameterContext.setXpath(xPath);
        request.setParameterContext(parameterContext);

        try {
            JAXBElement<ReadServiceResponseParams> response = (JAXBElement<ReadServiceResponseParams>) getWebServiceTemplate().marshalSendAndReceive(uri, request);
            return response.getValue();
        } catch (WebServiceTransportException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
