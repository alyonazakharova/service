package com.bercut.service.findservices;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceContent", propOrder = {
        "productName",
        "billingServiceId"
})
public class ServiceContent {
    protected String productName;
    protected long billingServiceId;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getBillingServiceId() {
        return billingServiceId;
    }

    public void setBillingServiceId(long billingServiceId) {
        this.billingServiceId = billingServiceId;
    }
}
