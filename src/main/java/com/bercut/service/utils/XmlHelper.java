package com.bercut.service.utils;

import com.bercut.service.exception.NoneOrMultipleTagsFoundException;
import com.bercut.service.wsdl.service_profile.ReadServiceResponseParams;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class XmlHelper {

    private static final Logger log = LoggerFactory.getLogger(XmlHelper.class);

    @SneakyThrows
    public static String getValueByXPath(ReadServiceResponseParams response, String expression, String reserveExpression) {
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
    }

    public static List<String> getListByXPath(ReadServiceResponseParams response, String expression) {
        List<String> list = new ArrayList<>();
        NodeList nodes = getNodes(response, expression, true);
//        log.info("NODES: " + nodes.getLength());
        for (int i = 0; i < nodes.getLength(); i++) {
            list.add(nodes.item(i).getTextContent());
        }
        return list;
    }

    public static boolean isPresent(ReadServiceResponseParams response, String expression) {
        NodeList nodes = getNodes(response, expression, false);
        return nodes.getLength() == 1;
    }

    @SneakyThrows
    public static String getSingleValue(ReadServiceResponseParams response, String expression) throws NoneOrMultipleTagsFoundException {
        NodeList nodes = getNodes(response, expression, true);
        if (nodes.getLength() == 1) {
//            log.info("Value = " + nodes.item(0).getTextContent());
            return nodes.item(0).getTextContent();
        }
        throw new NoneOrMultipleTagsFoundException("Found 0 or more than 1 tags");
    }

    @SneakyThrows
    private static NodeList getNodes(ReadServiceResponseParams response, String expression, boolean namespaseAware) {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReadServiceResponseParams.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter stringWriter = new StringWriter();
        jaxbMarshaller.marshal(response, stringWriter);
        String xml = stringWriter.toString();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        if (namespaseAware) {
            factory.setNamespaceAware(true);
        }
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource inputSource = new InputSource(new StringReader(xml));
        Document doc = builder.parse(inputSource);

        XPath xpath = XPathFactory.newInstance().newXPath();
        if (namespaseAware) {
            xpath.setNamespaceContext(new NamespaceResolver(doc));
        }
        XPathExpression expr = xpath.compile(expression);
        return (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
    }
}
