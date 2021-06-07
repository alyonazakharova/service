package com.bercut.service.soap.rates_management;

import com.bercut.service.soap.SoapClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

@Configuration
public class RatesManagementConfig {
    @Bean
    public Jaxb2Marshaller ratesManagementMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bercut.service.rates_management");
        return marshaller;
    }

    @Bean
    public RatesManagementClient ratesManagementClient(Jaxb2Marshaller ratesManagementMarshaller) {
        RatesManagementClient client = new RatesManagementClient();

        SaajSoapMessageFactory messageFactory = null;
        try {
            messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        client.setMessageFactory(messageFactory);
        client.setMarshaller(ratesManagementMarshaller);
        client.setUnmarshaller(ratesManagementMarshaller);

        ClientInterceptor[] interceptors = new ClientInterceptor[] {ratesManagementInterceptor()};
        client.setInterceptors(interceptors);
        return client;
    }

    @Bean
    public SoapClientInterceptor ratesManagementInterceptor() {
        return new SoapClientInterceptor();
    }
}
