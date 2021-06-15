package com.bercut.service.global_steps.gs81;

import com.bercut.service.utils.ResponseParam;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GS81Response {
    private ResponseParam<String> trplName;
    private ResponseParam<String> serviceNameTP;
    private ResponseParam<String> productId;
    private ResponseParam<String> serviceName;
    private ResponseParam<List<String>> incompatibleServIdList;
    private ResponseParam<String> vkljuchenaVtarifnyjPlanFlag;
    private ResponseParam<String> vozmozhnostPokazyvatVpodkljuchennykhFlag;
    private ResponseParam<String> vidimostVdostupnykhFlag;
    private ResponseParam<String> serviceNameCategory;
    private ResponseParam<String> productIdCategory;
    private ResponseParam<String> kategoriiUslugiProduktyFlag;
    private ResponseParam<String> uslugaPersonalizaciiFlag;
    private ResponseParam<String> vozmozhnostPodkljuchenijaFlag;
    private ResponseParam<String> vozmozhnostOtkljuchenijaFlag;
    private ResponseParam<String> nazvanieUslugiText;
}
