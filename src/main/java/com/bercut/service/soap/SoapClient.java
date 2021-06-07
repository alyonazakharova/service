//package com.bercut.service.soap;
//
//import com.bercut.service.findservices.ServiceContent;
//import com.bercut.service.rates_management.GetRateProfileRequest;
//import com.bercut.service.wsdl.*;
//import lombok.SneakyThrows;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.server.ResponseStatusException;
//import org.springframework.ws.client.WebServiceFaultException;
//import org.springframework.ws.client.WebServiceTransportException;
//import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
//import org.w3c.dom.Document;
//import org.w3c.dom.Node;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBElement;
//import javax.xml.bind.Marshaller;
//import javax.xml.datatype.DatatypeFactory;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.soap.MessageFactory;
//import javax.xml.soap.SOAPConnection;
//import javax.xml.soap.SOAPConnectionFactory;
//import javax.xml.soap.SOAPMessage;
//import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathConstants;
//import javax.xml.xpath.XPathFactory;
//import java.math.BigDecimal;
//import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class SoapClient extends WebServiceGatewaySupport {
//
//    @Autowired
//    private Environment environment;
//
//    public FindServicesResponseParams findServices(String testContur, long branchId, String xPath,
//                                                   String trplName, Long servId) throws WebServiceFaultException {
//        String uri = environment.getProperty(testContur);
//        if (uri == null) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test environment specified");
//        }
//
//        FindServicesRequestParams request = new FindServicesRequestParams();
//        request.setBranchId(branchId);
//        ConcreteServiceCriteria concreteServiceCriteria = new ConcreteServiceCriteria();
//        concreteServiceCriteria.setXpath(xPath);
//        ServiceContent serviceContent = new ServiceContent();
//        if (trplName != null) {
//            serviceContent.setProductName(trplName);
//        }
//        if (servId != null) {
//            serviceContent.setBillingServiceId(servId);
//        }
//        concreteServiceCriteria.setServiceContent(serviceContent);
//        request.setConcreteServiceCriteria(concreteServiceCriteria);
//
//        try {
//            JAXBElement<FindServicesResponseParams> response = (JAXBElement<FindServicesResponseParams>) getWebServiceTemplate().marshalSendAndReceive(uri, request);
//            return response.getValue();
//        } catch (WebServiceTransportException e) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
//        }
//
//    }
//
//    public ReadServiceResponseParams readService(String testContur, long branchId,
//                                                 String serviceName, String xPath) throws WebServiceFaultException {
//        String uri = environment.getProperty(testContur);
//        if (uri == null) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test environment specified");
//        }
//
//        ReadServiceRequestParams request = new ReadServiceRequestParams();
//        request.setBranchId(branchId);
//        ServiceIds serviceIds = new ServiceIds();
//        serviceIds.setServiceName(serviceName);
//        request.setServiceIds(serviceIds);
//        request.setContractIds(ContractIds.PARAMETERS);
//        ParameterContext parameterContext = new ParameterContext();
//        parameterContext.setXpath(xPath);
//        request.setParameterContext(parameterContext);
//
//        try {
//            JAXBElement<ReadServiceResponseParams> response = (JAXBElement<ReadServiceResponseParams>) getWebServiceTemplate().marshalSendAndReceive(uri, request);
//            return response.getValue();
//        } catch (WebServiceTransportException e) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
//        }
//    }
//
//    @SneakyThrows
//    public String getRateProfile(long branchId, long trplId) {
//        GetRateProfileRequest request = new GetRateProfileRequest();
//        request.setBranchId(BigDecimal.valueOf(branchId));
//        request.setTrplId(BigDecimal.valueOf(trplId));
//        request.setContractName("base");
//        Date now = new Date();
//        SimpleDateFormat fdt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        request.setTargetDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fdt.format(now)));
//
//        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
//        Marshaller marshaller = JAXBContext.newInstance(GetRateProfileRequest.class).createMarshaller();
//        marshaller.marshal(request, document);
//        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
//        soapMessage.getSOAPBody().addDocument(document);
//        soapMessage.writeTo(System.out);
//
//        SOAPConnection connection = SOAPConnectionFactory.newInstance().createConnection();
////        java.net.URL endpoint = new URL("http://10.12.75.114:8003/cc/sa/ratesmanagement/RatesManagement");
//        URL endpoint = new URL("http://10.77.240.227:6113/cc/sa/ratesmanagement/RatesManagement");
//        SOAPMessage response = connection.call(soapMessage, endpoint);
//        System.out.println("\nSOAPMessage:");
//        response.writeTo(System.out);
//
//        XPath xpath = XPathFactory.newInstance().newXPath();
//        Node resultNode = (Node) xpath.evaluate("//*[local-name()='trplName']", response.getSOAPBody(), XPathConstants.NODE);
//        return resultNode == null ? null : resultNode.getTextContent();
//    }
//}
