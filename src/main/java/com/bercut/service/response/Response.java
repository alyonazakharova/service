package com.bercut.service.response;

import java.util.List;

public class Response {
    private final String serviceNameTP;
    private final String productId;
    private final String serviceName;
    private List<String> inCompatibleServIdList;

    public Response(String serviceNameTP, String productId, String serviceName) {
        this.serviceNameTP = serviceNameTP;
        this.productId = productId;
        this.serviceName = serviceName;
    }

    public Response(String serviceNameTP, String productId, String serviceName, List<String> inCompatibleServIdList) {
        this.serviceNameTP = serviceNameTP;
        this.productId = productId;
        this.serviceName = serviceName;
        this.inCompatibleServIdList = inCompatibleServIdList;
    }

    public String getServiceNameTP() {
        return serviceNameTP;
    }

    public String getProductId() {
        return productId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public List<String> getInCompatibleServIdList() {
        return inCompatibleServIdList;
    }
}
