package com.bercut.service.readservice;

import javax.xml.bind.annotation.XmlType;
import java.util.List;


@XmlType(name = "Rule", propOrder = {
        "link_systemName_nesovmestimye_uslugi_serviceId_in",
        "link_productTariffId_nesovmestimye_uslugi_serviceId_in"
})
public class Rule {
    protected String link_systemName_nesovmestimye_uslugi_serviceId_in;
    protected List<Long> link_productTariffId_nesovmestimye_uslugi_serviceId_in;

    public String getLink_systemName_nesovmestimye_uslugi_serviceId_in() {
        return link_systemName_nesovmestimye_uslugi_serviceId_in;
    }

    public void setLink_systemName_nesovmestimye_uslugi_serviceId_in(String link_systemName_nesovmestimye_uslugi_serviceId_in) {
        this.link_systemName_nesovmestimye_uslugi_serviceId_in = link_systemName_nesovmestimye_uslugi_serviceId_in;
    }

    public List<Long> getLink_productTariffId_nesovmestimye_uslugi_serviceId_in() {
        return link_productTariffId_nesovmestimye_uslugi_serviceId_in;
    }

    public void setLink_productTariffId_nesovmestimye_uslugi_serviceId_in(List<Long> link_productTariffId_nesovmestimye_uslugi_serviceId_in) {
        this.link_productTariffId_nesovmestimye_uslugi_serviceId_in = link_productTariffId_nesovmestimye_uslugi_serviceId_in;
    }
}
