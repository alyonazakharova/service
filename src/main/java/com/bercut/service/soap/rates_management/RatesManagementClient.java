package com.bercut.service.soap.rates_management;

import com.bercut.service.wsdl.rates_management.GetRateProfileRequest;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RatesManagementClient extends WebServiceGatewaySupport {

    @Autowired
    private Environment environment;

    private static final JAXBContext jaxbContext;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(GetRateProfileRequest.class);
        } catch (JAXBException e) {
            throw new IllegalStateException(e);
        }
    }

    @SneakyThrows
    public String getRateProfile(String testContur, long branchId, long trplId) {
        GetRateProfileRequest request = new GetRateProfileRequest();
        request.setBranchId(BigDecimal.valueOf(branchId));
        request.setTrplId(BigDecimal.valueOf(trplId));
        request.setContractName("base");
        Date now = new Date();
        SimpleDateFormat fdt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        request.setTargetDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fdt.format(now)));

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
//        Marshaller marshaller = JAXBContext.newInstance(GetRateProfileRequest.class).createMarshaller();
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(request, document);
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
        soapMessage.getSOAPBody().addDocument(document);

        SOAPConnection connection = SOAPConnectionFactory.newInstance().createConnection();
        String ratesManagementURL = environment.getProperty("ratesmanagement." + testContur);
        if (ratesManagementURL == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid test environment: " + testContur);
        }
        SOAPMessage response = connection.call(soapMessage, new URL(ratesManagementURL));

        XPath xpath = XPathFactory.newInstance().newXPath();
        Node resultNode = (Node) xpath.evaluate("//*[local-name()='trplName']", response.getSOAPBody(), XPathConstants.NODE);

        return resultNode == null ? null : resultNode.getTextContent(); //сообщение об ошибке ?
    }
}
