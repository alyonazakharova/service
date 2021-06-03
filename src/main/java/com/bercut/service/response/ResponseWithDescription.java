package com.bercut.service.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class ResponseWithDescription {
    private ParamWithDescription<String> serviceNameTP;
    private ParamWithDescription<String> productId;
    private ParamWithDescription<String> serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<List<String>> incompatibleServIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vidimostVdostupnykhFlag;

//    public ResponseWithDecription(ParamWithDescription<String> serviceNameTP,
//                                  ParamWithDescription<String> productId,
//                                  ParamWithDescription<String> serviceName,
//                                  ParamWithDescription<List<String>> incompatibleServIdList,
//                                  ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag,
//                                  ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag,
//                                  ParamWithDescription<Boolean> vidimostVdostupnykhFlag) {
//        this.serviceNameTP = serviceNameTP;
//        this.productId = productId;
//        this.serviceName = serviceName;
//        this.incompatibleServIdList = incompatibleServIdList;
//        this.vkljuchenaVtarifnyjPlanFlag = vkljuchenaVtarifnyjPlanFlag;
//        this.vozmozhnostPokazyvatVpodkljuchennykhFlag = vozmozhnostPokazyvatVpodkljuchennykhFlag;
//        this.vidimostVdostupnykhFlag = vidimostVdostupnykhFlag;
//    }

//    public ParamWithDescription<String> getServiceNameTP() {
//        return serviceNameTP;
//    }
//
//    public ParamWithDescription<String> getProductId() {
//        return productId;
//    }
//
//    public ParamWithDescription<String> getServiceName() {
//        return serviceName;
//    }
//
//    public ParamWithDescription<List<String>> getIncompatibleServIdList() {
//        return incompatibleServIdList;
//    }
//
//    public ParamWithDescription<Boolean> getVkljuchenaVtarifnyjPlanFlag() {
//        return vkljuchenaVtarifnyjPlanFlag;
//    }
//
//    public ParamWithDescription<Boolean> getVozmozhnostPokazyvatVpodkljuchennykhFlag() {
//        return vozmozhnostPokazyvatVpodkljuchennykhFlag;
//    }
//
//    public ParamWithDescription<Boolean> getVidimostVdostupnykhFlag() {
//        return vidimostVdostupnykhFlag;
//    }
}
