package com.bercut.service.utils;

import com.bercut.service.wsdl.ReadServiceResponseParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class XmlHelper {

    private static final Logger log = LoggerFactory.getLogger(XmlHelper.class);

    public static String getValueByXPath(ReadServiceResponseParams response, String expression, String reserveExpression) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReadServiceResponseParams.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter stringWriter = new StringWriter();
            jaxbMarshaller.marshal(response, stringWriter);
            String xml = stringWriter.toString();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xml));
            Document doc = builder.parse(inputSource);

            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xpath.compile(expression);
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            if (nodes.getLength() == 1) {
                log.info("Single element was found ");
                return nodes.item(0).getTextContent();
            } else {
                expr = xpath.compile(reserveExpression);
                nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
                if (nodes.getLength() == 1) {
                    log.info("Single element was found ");
                    return nodes.item(0).getTextContent();
                }
                log.info("Single element was not found both times");
                return "false";
            }
        } catch (JAXBException | ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
            log.error(e.getMessage());
            return "";
        }
    }

    public static List<String> getListByXPath(ReadServiceResponseParams response, String expression) {
        List<String> list = new ArrayList<>();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ReadServiceResponseParams.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter stringWriter = new StringWriter();
            jaxbMarshaller.marshal(response, stringWriter);
            String xml = stringWriter.toString();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource inputSource = new InputSource(new StringReader(xml));
            Document doc = builder.parse(inputSource);

            XPath xpath = XPathFactory.newInstance().newXPath();
            xpath.setNamespaceContext(new NamespaceResolver(doc));
            XPathExpression expr = xpath.compile(expression);
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            log.info("NODES: " + nodes.getLength());
            for (int i = 0; i < nodes.getLength(); i++) {
                list.add(nodes.item(i).getTextContent());
            }
        } catch (JAXBException | ParserConfigurationException | IOException | SAXException | XPathExpressionException e) {
            log.error(e.getMessage());
        }
        return list;
    }
}
