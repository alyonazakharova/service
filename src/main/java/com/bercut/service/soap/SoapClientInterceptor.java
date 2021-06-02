package com.bercut.service.soap;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.WebServiceFaultException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.soap.Node;
import javax.xml.transform.dom.DOMResult;

public class SoapClientInterceptor implements ClientInterceptor {

    private Logger log = LoggerFactory.getLogger(SoapClientInterceptor.class);

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        log.info("handling the request...");
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        log.info("handling the response...");

        WebServiceMessage message = messageContext.getResponse();
//        message.writeTo(System.out);
        SoapMessage soapMessage = (SoapMessage) message;
        if (soapMessage.getSoapBody().hasFault()) {
            log.info("fault occurred");
            SoapFaultDetail detail = soapMessage.getSoapBody().getFault().getFaultDetail();
            DOMResult dom = (DOMResult)detail.getDetailEntries().next().getResult();
            Node description = (Node) dom.getNode().getFirstChild().getNextSibling().getNextSibling();
            throw new WebServiceFaultException(description.getValue());
        } else{
            log.info("no fault");
        }
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        log.info("handling fault...");
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {
        log.info("after completion...");
    }
}
