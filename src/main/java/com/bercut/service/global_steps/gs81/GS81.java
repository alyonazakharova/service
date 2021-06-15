package com.bercut.service.global_steps.gs81;

import com.bercut.service.exception.NoneOrMultipleTagsFoundException;
import com.bercut.service.soap.rates_management.RatesManagementClient;
import com.bercut.service.soap.service_profile.ServiceProfileClient;
import com.bercut.service.utils.ResponseParam;
import com.bercut.service.utils.XmlHelper;
import com.bercut.service.wsdl.service_profile.FindServicesResponseParams;
import com.bercut.service.wsdl.service_profile.ReadServiceResponseParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.ws.client.WebServiceFaultException;

import java.util.List;
import java.util.concurrent.*;

public class GS81 {

    private final Logger log = LoggerFactory.getLogger(GS81.class);

    private final ServiceProfileClient serviceProfileClient;
    private final RatesManagementClient ratesManagementClient;

    private final GS81Inputs inputs;

    private boolean runNextStep;
    private boolean runStep10Step11;

    private ResponseParam<String> trplName;
    private ResponseParam<String> serviceNameTP;
    private ResponseParam<String> productIdTP;
    private ResponseParam<String> serviceName;

    private ResponseParam<String> serviceNameCategory;
    private ResponseParam<String> productIdCategory;

    private final GS81Response gs81Response;

    public GS81(ServiceProfileClient serviceProfileClient, RatesManagementClient ratesManagementClient, GS81Inputs inputs) {
        this.serviceProfileClient = serviceProfileClient;
        this.ratesManagementClient = ratesManagementClient;
        this.inputs = inputs;
        this.runNextStep = true;
        this.runStep10Step11 = true;
        this.gs81Response = new GS81Response();
    }

    private final Runnable steps = new Thread() {
        @Override
        public void run() {
            gs81Response.setTrplName(getTrplName()); //step 1
            if (runNextStep) {
                gs81Response.setServiceNameTP(getServiceNameTP()); //step 2
            }
            if (runNextStep) {
                gs81Response.setProductId(getProductIdTP()); //step 3
            }
            if (runNextStep) {
                gs81Response.setServiceName(getServiceName()); //step 4
            }
            if (!runNextStep) {
                return;
            }
            if (optionalParameterCheck(inputs.getNesovmestimyeUslugiGet())) {
                gs81Response.setIncompatibleServIdList(getIncompatibleServIdList()); //step 5
            }
            if (optionalParameterCheck(inputs.getVkljuchenaVtarifnyjPlanGet())) {
                gs81Response.setVkljuchenaVtarifnyjPlanFlag(getVkljuchenaVtarifnyjPlanFlag()); //step 6
            }
            if (optionalParameterCheck(inputs.getVozmozhnostPokazyvatVpodkljuchennykhGet())) {
                gs81Response.setVozmozhnostPokazyvatVpodkljuchennykhFlag(getVozmozhnostPokazyvatVpodkljuchennykhFlag()); //step 7
            }
            if (optionalParameterCheck(inputs.getVidimostVdostupnykhGet())) {
                gs81Response.setVidimostVdostupnykhFlag(getVidimostVdostupnykhFlag()); //step 8
            }
            String kategoriiUslugiProduktyGet = inputs.getKategoriiUslugiProduktyGet();
            if (kategoriiUslugiProduktyGet != null) {
                if (!kategoriiUslugiProduktyGet.equals("n/a")) {
                    gs81Response.setServiceNameCategory(getServiceNameCategory()); //step 9
                    if (runStep10Step11) {
                        gs81Response.setProductIdCategory(getProductIdCategory()); //step10
                        if (runStep10Step11) {
                            gs81Response.setKategoriiUslugiProduktyFlag(getKategoriiUslugiProduktyFlag()); //step11
                        }
                    }
                }
            }
            if (optionalParameterCheck(inputs.getUslugaPersolanlizaciiGet())) {
                gs81Response.setUslugaPersonalizaciiFlag(getUslugaPersonalizaciiFlag()); //step 12
            }
            if (optionalParameterCheck(inputs.getVozmozhnostPodkljuchenijaGet())) {
                gs81Response.setVozmozhnostPodkljuchenijaFlag(getVozmozhnostPodkljuchenijaFlag()); //step 13
            }
            if (optionalParameterCheck(inputs.getVozmozhnostOtkljuchenijaGet())) {
                gs81Response.setVozmozhnostOtkljuchenijaFlag(getVozmozhnostOtkljuchenijaFlag()); //step 14
            }
            if (optionalParameterCheck(inputs.getNazvanieUslugiGet())) {
                gs81Response.setNazvanieUslugiText(getNazvanieUslugiText()); //step 15
            }
        }
    };

    private boolean optionalParameterCheck(Boolean param) {
        return param == null || param; //param is true by default
    }

    public GS81Response execute() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(steps);
        try {
            future.get(150, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            if (!executor.isTerminated()) {
                executor.shutdownNow();
            }
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        } catch (TimeoutException e) {
            if (!executor.isTerminated()) {
                executor.shutdownNow();
            }
            throw new ResponseStatusException(HttpStatus.REQUEST_TIMEOUT, "Timeout exceeded");
        }
        return gs81Response;
    }


    //step 1
    private ResponseParam<String> getTrplName() {
        log.info("Executing step 1");
        String tpName = ratesManagementClient.getRateProfile(inputs.getTestContur(), inputs.getBranchId(), inputs.getTrplId());
        if (tpName == null) {
            runNextStep = false;
            trplName = new ResponseParam<>(null, "Не удалось получить название тарифного плана в биллинге");
        } else {
            trplName = new ResponseParam<>(tpName);
        }
        return trplName;
    }

    //step 2
    private ResponseParam<String> getServiceNameTP() {
        log.info("Executing step 2");
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, trplName.getValue(), null);
            String name = response.getServiceDescription().get(0).getServiceName(); // minOccurs="0" maxOccurs="unbounded"
            serviceNameTP = new ResponseParam<>(name);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определись название сервиса в ПК для ТП '%s': %s", trplName.getValue(), e.getMessage());
            serviceNameTP = new ResponseParam<>(null, description);
            runNextStep = false;
        }
        return serviceNameTP;
    }

    //step 3
    private ResponseParam<String> getProductIdTP() {
        log.info("Executing step 3");
        try {
            String xPath = "/serviceParams/productID";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceNameTP.getValue(), xPath);
            String expression = "//serviceContent/productID";
            productIdTP = new ResponseParam<>(XmlHelper.getSingleValue(response, expression));
        } catch (WebServiceFaultException | NoneOrMultipleTagsFoundException e) {
            String description = String.format("Не удалось определить productId для ТП '%s': %s", serviceNameTP.getValue(), e.getMessage());
            productIdTP = new ResponseParam<>(null, description);
            runNextStep = false;
        }
        return productIdTP;
    }

    //step 4
    private ResponseParam<String> getServiceName() {
        log.info("Executing step 4");
        try {
            String xPath = "/serviceParams/id_uslugi_serviceId[1]/id_uslugi_serviceId_value";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, null, inputs.getServId());
            String name = response.getServiceDescription().get(0).getServiceName();
            serviceName = new ResponseParam<>(name);
        } catch (WebServiceFaultException e) {
            String description = String.format("Для услуги %s не удалось определить название сервиса в ПК: %s",
                    inputs.getServId(), e.getMessage());
            serviceName = new ResponseParam<>(null, description);
            runNextStep = false;
        }
        return serviceName;
    }

    //step 5
    private ResponseParam<List<String>> getIncompatibleServIdList() {
        log.info("Executing step 5");
        try {
            String xPath = "/serviceParams/nesovmestimye_uslugi_serviceId";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
//            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), "dobavit_skorost_na_3_gb", xPath);
            String expression = String.format("//*[local-name()='nesovmestimye_uslugi_serviceId_value'][following-sibling::rule[link_systemName_nesovmestimye_uslugi_serviceId_in='%s' and link_productTariffId_nesovmestimye_uslugi_serviceId_in=%s]]",
                    inputs.getSystemName(), productIdTP.getValue());
//                    "MSDCRM", 35765);
            List<String> incompatibleServIds = XmlHelper.getListByXPath(response, expression);
            return new ResponseParam<>(incompatibleServIds);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить список несовместимых услуг для услуги %s: %s",
                    inputs.getServId(), e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }

    //step 6
    private ResponseParam<String> getVkljuchenaVtarifnyjPlanFlag() {
        log.info("Executing step 6");
        String systemName = inputs.getSystemName();
        String productId = productIdTP.getValue();
        try {
            String xPath = "/serviceParams/vkljuchena_v_tarifnyj_plan_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            String expression = String.format("//*[local-name()='vkljuchena_v_tarifnyj_plan_yesNo']//vkljuchena_v_tarifnyj_plan_yesNo_value[following-sibling::rule[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo_in='%s' and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo_in=%s]]",
                    systemName, productId);
            String reserveExpression = String.format("//*[local-name()='vkljuchena_v_tarifnyj_plan_yesNo']//vkljuchena_v_tarifnyj_plan_yesNo_value[following-sibling::rule[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo='%s' and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo=%s]]",
                    systemName, productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ResponseParam<>(result);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить включение в тарифный план для услуги %s: %s",
                    serviceName.getValue(),
                    e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }

    //step 7
    private ResponseParam<String> getVozmozhnostPokazyvatVpodkljuchennykhFlag() {
        log.info("Executing step 7");
        String systemName = inputs.getSystemName();
        String productId = productIdTP.getValue();
        try {
            String xPath = "/serviceParams/vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            String expression = String.format("//*[local-name()='vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo']//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in='%s' and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in=%s]]",
                    systemName, productId);
            String reserveExpression = String.format("//*[local-name()='vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo']//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo='%s' and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo=%s]]",
                    systemName, productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ResponseParam<>(result);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить возможность показывать в подключенных для услуги %s: %s",
                    serviceName.getValue(), e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }

    //step 8
    private ResponseParam<String> getVidimostVdostupnykhFlag() {
        log.info("Executing step 8");
        String productId = productIdTP.getValue();
        try {
            String xPath = " /serviceParams/vidimost_v_dostupnykh_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            String expression = String.format("//*[local-name()='vidimost_v_dostupnykh_yesNo']//vidimost_v_dostupnykh_yesNo_value[following-sibling::rule[link_systemName_vidimost_v_dostupnykh_yesNo_in='%s' and link_productTariffId_vidimost_v_dostupnykh_yesNo_in=%s]]",
                    inputs.getSystemName(), productId);
            String reserveExpression = String.format("//*[local-name()='vidimost_v_dostupnykh_yesNo']//vidimost_v_dostupnykh_yesNo_value[following-sibling::rule[link_systemName_vidimost_v_dostupnykh_yesNo='%s' and link_productTariffId_vidimost_v_dostupnykh_yesNo=%s]]",
                    inputs.getSystemName(), productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ResponseParam<>(result);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить видимость услуги %s в доступных для абонента: %s",
                    serviceName.getValue() ,e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }

    //step 9
    private ResponseParam<String> getServiceNameCategory() {
        log.info("Executing step 9");
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, inputs.getKategoriiUslugiProduktyGet(), null);
            String serviceName = response.getServiceDescription().get(0).getServiceName();
            serviceNameCategory = new ResponseParam<>(serviceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определись название сервиса в ПК для категории услуги '%s': %s",
                    inputs.getKategoriiUslugiProduktyGet(), e.getMessage());
            serviceNameCategory = new ResponseParam<>(null, description);
            runStep10Step11 = false;
        }
        return serviceNameCategory;
    }

    //step 10
    private ResponseParam<String> getProductIdCategory() {
        log.info("Executing step 10");
        try {
            String xPath = "/serviceParams/productID";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceNameCategory.getValue(), xPath);
            String expression = "//*[local-name()='serviceContent']/productID";
            productIdCategory = new ResponseParam<>(XmlHelper.getSingleValue(response, expression));
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить productId для категории услуги '%s': %s",
                    serviceNameCategory.getValue(), e.getMessage());
            productIdCategory = new ResponseParam<>(null, description);
            runStep10Step11 = false;
        }
        return productIdCategory;
    }

    //step 11
    private ResponseParam<String> getKategoriiUslugiProduktyFlag() {
        log.info("Executing step 11");
        try {
            String xPath = "/serviceParams/kategorii_uslugi_produkty_productServCatId";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceName.getValue(), xPath);
            String expression = String.format("//*[local-name()='kategorii_uslugi_produkty_productServCatId'][kategorii_uslugi_produkty_productServCatId_value=%s and rule/link_systemName_kategorii_uslugi_produkty_productServCatId='%s']",
                    productIdCategory.getValue(), inputs.getSystemName());
            if (XmlHelper.isPresent(response, expression)) {
                return new ResponseParam<>("true");
            }
            return new ResponseParam<>("false");
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ResponseParam<>("false", description);
        }
    }

    //step 12
    private ResponseParam<String> getUslugaPersonalizaciiFlag() {
        log.info("Executing step 12");
        try {
            String xPath = "/serviceParams/usluga_personalizacii_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            String expression = String.format("//*[local-name()='usluga_personalizacii_yesNo'][rule/link_systemName_usluga_personalizacii_yesNo_in='%s' and rule/link_productTariffId_usluga_personalizacii_yesNo_in=%s]",
                    inputs.getSystemName(), productIdTP.getValue());
            String singleTagFound = String.valueOf(XmlHelper.isPresent(response, expression));
            return new ResponseParam<>(singleTagFound);
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }

    //step 13
    private ResponseParam<String> getVozmozhnostPodkljuchenijaFlag() {
        log.info("Executing step 13");
        String xPath = "/serviceParams/vozmozhnost_podkljuchenija_yesNo";
        String expression = String.format("//*[local-name()='vozmozhnost_podkljuchenija_yesNo']/vozmozhnost_podkljuchenija_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_podkljuchenija_yesNo_in='%s' and link_productTariffId_vozmozhnost_podkljuchenija_yesNo_in=%s]]",
                inputs.getSystemName(), productIdTP.getValue());
        return getSingleValueInReadServiceResponse(xPath, expression);
    }

    //step 14
    private ResponseParam<String> getVozmozhnostOtkljuchenijaFlag() {
        log.info("Executing step 14");
        String xPath = "/serviceParams/vozmozhnost_otkljuchenija_yesNo";
        String expression = String.format("//*[local-name()='vozmozhnost_otkljuchenija_yesNo']/vozmozhnost_otkljuchenija_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_otkljuchenija_yesNo_in='%s' and link_productTariffId_vozmozhnost_otkljuchenija_yesNo_in=%s]]",
                inputs.getSystemName(), productIdTP.getValue());
        return getSingleValueInReadServiceResponse(xPath, expression);
    }

    //step 15
    private ResponseParam<String> getNazvanieUslugiText() {
        log.info("Executing step 15");
        String xPath = "/serviceParams/nazvanie_uslugi_text";
        String expression = String.format("//*[local-name()='nazvanie_uslugi_text']/nazvanie_uslugi_text_value[following-sibling::rule[link_systemName_nazvanie_uslugi_text_in='%s' and link_branchId_nazvanie_uslugi_text_in=%s]]",
                inputs.getSystemName(), inputs.getBranchId());
        return getSingleValueInReadServiceResponse(xPath, expression);
    }

    //auxiliary method for steps 13-15
    private ResponseParam<String> getSingleValueInReadServiceResponse(String xPath, String expression) {
        try {
            ReadServiceResponseParams response = serviceProfileClient.readService(
                    inputs.getTestContur(),
                    inputs.getBranchId(),
                    serviceName.getValue(),
                    xPath);
            String flag = XmlHelper.getSingleValue(response, expression);
            return new ResponseParam<>(flag);
        } catch (NoneOrMultipleTagsFoundException e) {
            return new ResponseParam<>("false", e.getMessage());
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ResponseParam<>(null, description);
        }
    }
}
