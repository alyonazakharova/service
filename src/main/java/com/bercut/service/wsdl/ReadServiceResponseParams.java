//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 06:01:22 PM MSK 
//


package com.bercut.service.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

import com.bercut.service.readservice.ServiceContentReadService;
import org.w3c.dom.Element;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadServiceResponseParams", propOrder = {
    "serviceDescription",
    "serviceContent",
    "extension"
})
@XmlRootElement
public class ReadServiceResponseParams {

    protected ServiceDescription serviceDescription;
//    @XmlElement(type = ServiceContentReadService.class)
    protected Object serviceContent;
    protected ReadServiceResponseParams.Extension extension;

    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(ServiceDescription value) {
        this.serviceDescription = value;
    }

    public Object getServiceContent() {
        return serviceContent;
    }

    public void setServiceContent(Object value) {
        this.serviceContent = value;
    }

    public ReadServiceResponseParams.Extension getExtension() {
        return extension;
    }

    public void setExtension(ReadServiceResponseParams.Extension value) {
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
