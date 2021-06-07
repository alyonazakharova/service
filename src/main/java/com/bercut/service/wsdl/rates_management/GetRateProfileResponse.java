package com.bercut.service.wsdl.rates_management;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRateProfileResponse", namespace = "http://www.bercut.com/cc/sa/ratesmanagement", propOrder = {
        "trplPlan",
        "tarifHistory"
})
@XmlRootElement
public class GetRateProfileResponse {
    protected TarifPlan trplPlan;
    protected TarifHistory tarifHistory;

    public TarifPlan getTrplPlan() {
        return trplPlan;
    }

    public void setTrplPlan(TarifPlan trplPlan) {
        this.trplPlan = trplPlan;
    }

    public TarifHistory getTarifHistory() {
        return tarifHistory;
    }

    public void setTarifHistory(TarifHistory tarifHistory) {
        this.tarifHistory = tarifHistory;
    }
}


