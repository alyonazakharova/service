//package com.bercut.service.soap;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//import org.springframework.ws.client.support.interceptor.ClientInterceptor;
//import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
//
//import javax.xml.soap.MessageFactory;
//import javax.xml.soap.SOAPException;
//
//@Configuration
//public class SoapConfig {
//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        // this package must match the package in the <generatePackage> specified in pom.xml
//        marshaller.setContextPath("com.bercut.service.wsdl");
////        marshaller.setContextPath("com.bercut.service.wsdl.rates_management");
//        return marshaller;
//    }
//
//    @Bean
//    public SoapClient soapClient(Jaxb2Marshaller marshaller) {
//        SoapClient client = new SoapClient();
//
//        SaajSoapMessageFactory messageFactory = null;
//        try {
//            messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());
//        } catch (SOAPException e) {
//            e.printStackTrace();
//        }
//        client.setMessageFactory(messageFactory);
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//
//        ClientInterceptor[] interceptors = new ClientInterceptor[] {interceptor()};
//        client.setInterceptors(interceptors);
//        return client;
//    }
//
//    @Bean
//    public SoapClientInterceptor interceptor() {
//        return new SoapClientInterceptor();
//    }
//}
