package com.bercut.service.soap.service_profile;

import com.bercut.service.soap.SoapClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

@Configuration
public class ServiceProfileConfig {
    @Bean
    public Jaxb2Marshaller serviceProfileMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bercut.service.wsdl.service_profile");
//        String[] packagesToScan = {"com.bercut.service.wsdl.service_profile"};
//        marshaller.setPackagesToScan(packagesToScan);
//        marshaller.setClassesToBeBound(
//                com.bercut.service.wsdl.service_profile.FindServicesRequestParams.class,
//                com.bercut.service.wsdl.service_profile.ServiceIds.class,
//                com.bercut.service.wsdl.service_profile.ServiceCriteria.class,
//                com.bercut.service.wsdl.service_profile.ServiceStatus.class,
//                com.bercut.service.wsdl.service_profile.ConcreteServiceCriteria.class,
//                com.bercut.service.wsdl.service_profile.TimeAndTagCriteria.class,
//                com.bercut.service.wsdl.service_profile.Pagination.class,
//                com.bercut.service.wsdl.service_profile.ServiceDescription.class
//        );
        return marshaller;
    }

    @Bean
    public ServiceProfileClient serviceProfileClient(Jaxb2Marshaller serviceProfileMarshaller) {
        ServiceProfileClient client = new ServiceProfileClient();

        SaajSoapMessageFactory messageFactory = null;
        try {
            messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        client.setMessageFactory(messageFactory);
        client.setMarshaller(serviceProfileMarshaller);
        client.setUnmarshaller(serviceProfileMarshaller);

        ClientInterceptor[] interceptors = new ClientInterceptor[] {serviceProfileInterceptor()};
        client.setInterceptors(interceptors);
        return client;
    }

    @Bean
    public SoapClientInterceptor serviceProfileInterceptor() {
        return new SoapClientInterceptor();
    }
}
