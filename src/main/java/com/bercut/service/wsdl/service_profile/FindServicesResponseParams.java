//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 06:01:22 PM MSK 
//


package com.bercut.service.wsdl.service_profile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindServicesResponseParams", propOrder = {
    "serviceDescription",
    "extension"
})
@XmlRootElement
public class FindServicesResponseParams {

    protected List<ServiceDescription> serviceDescription;
    protected FindServicesResponseParams.Extension extension;

    public List<ServiceDescription> getServiceDescription() {
        if (serviceDescription == null) {
            serviceDescription = new ArrayList<ServiceDescription>();
        }
        return this.serviceDescription;
    }

    public FindServicesResponseParams.Extension getExtension() {
        return extension;
    }

    public void setExtension(FindServicesResponseParams.Extension value) {
        this.extension = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}