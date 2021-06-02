package com.bercut.service.response;

import java.util.List;

public class ResponseWithDecription {
    private final ParamWithDescription<String> serviceNameTP;
    private final ParamWithDescription<String> productId;
    private final ParamWithDescription<String> serviceName;

    private final ParamWithDescription<List<String>> incompatibleServIdList;
    private final ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag;
    private final ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag;
    private final ParamWithDescription<Boolean> vidimostVdostupnykhFlag;

    public ResponseWithDecription(ParamWithDescription<String> serviceNameTP,
                                  ParamWithDescription<String> productId,
                                  ParamWithDescription<String> serviceName,
                                  ParamWithDescription<List<String>> incompatibleServIdList,
                                  ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag,
                                  ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag,
                                  ParamWithDescription<Boolean> vidimostVdostupnykhFlag) {
        this.serviceNameTP = serviceNameTP;
        this.productId = productId;
        this.serviceName = serviceName;
        this.incompatibleServIdList = incompatibleServIdList;
        this.vkljuchenaVtarifnyjPlanFlag = vkljuchenaVtarifnyjPlanFlag;
        this.vozmozhnostPokazyvatVpodkljuchennykhFlag = vozmozhnostPokazyvatVpodkljuchennykhFlag;
        this.vidimostVdostupnykhFlag = vidimostVdostupnykhFlag;
    }

    public ParamWithDescription<String> getServiceNameTP() {
        return serviceNameTP;
    }

    public ParamWithDescription<String> getProductId() {
        return productId;
    }

    public ParamWithDescription<String> getServiceName() {
        return serviceName;
    }

    public ParamWithDescription<List<String>> getIncompatibleServIdList() {
        return incompatibleServIdList;
    }

    public ParamWithDescription<Boolean> getVkljuchenaVtarifnyjPlanFlag() {
        return vkljuchenaVtarifnyjPlanFlag;
    }

    public ParamWithDescription<Boolean> getVozmozhnostPokazyvatVpodkljuchennykhFlag() {
        return vozmozhnostPokazyvatVpodkljuchennykhFlag;
    }

    public ParamWithDescription<Boolean> getVidimostVdostupnykhFlag() {
        return vidimostVdostupnykhFlag;
    }
}
