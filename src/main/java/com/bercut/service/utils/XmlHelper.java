package com.bercut.service.utils;

import com.bercut.service.wsdl.ReadServiceResponseParams;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlHelper {
    public static String getValueByXPath(ReadServiceResponseParams response, String expression, String reserveExpression) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReadServiceResponseParams.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String responseFileName = "response.xml";
        File file = new File(responseFileName);
        jaxbMarshaller.marshal(response, file);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(responseFileName);

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();
        xpath.setNamespaceContext(new NamespaceResolver(doc));

        XPathExpression expr = xpath.compile(expression);
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        if (nodes.getLength() == 1) {
            return nodes.item(0).getTextContent();
        } else {
            expr = xpath.compile(reserveExpression);
            nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            if (nodes.getLength() == 1) {
                return nodes.item(0).getTextContent();
            } else {
                return "false";
            }
        }
    }

    public static List<String> getListByXPath(ReadServiceResponseParams response, String expression) throws JAXBException, ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReadServiceResponseParams.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String responseFileName = "response.xml";
        File file = new File(responseFileName);
        jaxbMarshaller.marshal(response, file);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(responseFileName);

        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();
        xpath.setNamespaceContext(new NamespaceResolver(doc));

        XPathExpression expr = xpath.compile(expression);
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nodes.getLength(); i++) {
            list.add(nodes.item(i).getTextContent());
        }
        return list;
    }
}
