package com.bercut.service.global_steps.gs81;

import com.bercut.service.utils.ParamWithDescription;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class GS81Response {
    private ParamWithDescription<String> trplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> serviceNameTP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<List<String>> incompatibleServIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<Boolean> vidimostVdostupnykhFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> serviceNameCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> productIdCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> kategoriiUslugiProduktyFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> uslugaPersonalizaciiFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> vozmozhnostPodkljuchenijaFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> vozmozhnostOtkljuchenijaFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ParamWithDescription<String> nazvanieUslugiText;
}
