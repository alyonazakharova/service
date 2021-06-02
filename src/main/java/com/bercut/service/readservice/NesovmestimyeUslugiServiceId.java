package com.bercut.service.readservice;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NesovmestimyeUslugiServiceId", propOrder = {
        "nesovmestimye_uslugi_serviceId_value",
        "rule"
})
public class NesovmestimyeUslugiServiceId {
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected long nesovmestimye_uslugi_serviceId_value;
    protected Rule rule;
}
