package com.bercut.service.global_steps;

import com.bercut.service.exception.NoneOrMultipleTagsFoundException;
import com.bercut.service.response.ParamWithDescription;
import com.bercut.service.response.ResponseWithDescription;
import com.bercut.service.soap.rates_management.RatesManagementClient;
import com.bercut.service.soap.service_profile.ServiceProfileClient;
import com.bercut.service.utils.Utils;
import com.bercut.service.utils.XmlHelper;
import com.bercut.service.wsdl.FindServicesResponseParams;
import com.bercut.service.wsdl.ReadServiceResponseParams;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.WebServiceFaultException;
import org.w3c.dom.Node;

import java.util.List;

public class GS81 {

    private final Logger log = LoggerFactory.getLogger(GS81.class);

    private final ServiceProfileClient serviceProfileClient;
    private final RatesManagementClient ratesManagementClient;

    private final GS81Inputs inputs;

    private boolean runNextStep;
    private boolean runStep10Step11;

    private ParamWithDescription<String> trplName;
    private ParamWithDescription<String> serviceNameTP;
    private ParamWithDescription<String> productID;
    private ParamWithDescription<String> serviceName;

    private ParamWithDescription<String> serviceNameCategory;
    private ParamWithDescription<String> productIdCategory;

//    public GS81(SoapClient soapClient, GS81Inputs inputs) {
//        this.soapClient = soapClient;
//        this.inputs = inputs;
//        this.runNextStep = true;
//    }


    public GS81(ServiceProfileClient serviceProfileClient, RatesManagementClient ratesManagementClient, GS81Inputs inputs) {
        this.serviceProfileClient = serviceProfileClient;
        this.ratesManagementClient = ratesManagementClient;
        this.inputs = inputs;
        this.runNextStep = true;
        this.runStep10Step11 = true;
    }

    public ResponseWithDescription execute() {
        ResponseWithDescription response = new ResponseWithDescription();

        //step 1
        response.setTrplName(getTrplName());

        //step 2
        if (runNextStep) {
            response.setServiceNameTP(getServiceNameTP());
        }

        //step 3
        if (runNextStep) {
            response.setProductId(getProductID());
        }

        //step 4
        if (runNextStep) {
            response.setServiceName(getServiceName());
        }

        if (runNextStep) {
            //step 5
            if (Utils.optionalParameterCheck(inputs.getNesovmestimyeUslugiGet())) {
                response.setIncompatibleServIdList(getIncompatibleServIdList());
            }

            //step 6
            if (Utils.optionalParameterCheck(inputs.getVkljuchenaVtarifnyjPlanGet())) {
                response.setVkljuchenaVtarifnyjPlanFlag(getVkljuchenaVtarifnyjPlanFlag());
            }

            //step 7
            if (Utils.optionalParameterCheck(inputs.getVozmozhnostPokazyvatVpodkljuchennykhGet())) {
                response.setVozmozhnostPokazyvatVpodkljuchennykhFlag(getVozmozhnostPokazyvatVpodkljuchennykhFlag());
            }

            //step 8
            if (Utils.optionalParameterCheck(inputs.getVidimostVdostupnykhGet())) {
                response.setVidimostVdostupnykhFlag(getVidimostVdostupnykhFlag());
            }

            //steps 9-11
            String kategoriiUslugiProduktyGet = inputs.getKategoriiUslugiProduktyGet();
            log.info("runNextStep = " + runNextStep);
            log.info("kategoriiUslugiProduktyGet = " + kategoriiUslugiProduktyGet);
            if (kategoriiUslugiProduktyGet != null) {
                if (!kategoriiUslugiProduktyGet.equals("n/a")) {
                    //step 9
                    response.setServiceNameCategory(getServiceNameCategory());
                    if (runStep10Step11) {
                        //step10
                        response.setProductIdCategory(getProductIdCategory());
                        if (runStep10Step11) {
                            //step11
                            response.setKategoriiUslugiProduktyFlag(getKategoriiUslugiProduktyFlag());
                        }
                    }
                }
            }

            //step 12
            if (Utils.optionalParameterCheck(inputs.getUslugaPersolanlizaciiGet())) {
                response.setUslugaPersonalizaciiFlag(getUslugaPersonalizaciiFlag());
            }

            //step 13
            if (Utils.optionalParameterCheck(inputs.getVozmozhnostPodkljuchenijaGet())) {
                response.setVozmozhnostPodkljuchenijaFlag(getVozmozhnostPodkljuchenijaFlag());
            }

            //step 14
            if (Utils.optionalParameterCheck(inputs.getVozmozhnostOtkljuchenijaGet())) {
                response.setVozmozhnostOtkljuchenijaFlag(getVozmozhnostOtkljuchenijaFlag());
            }

            //step 15
            if (Utils.optionalParameterCheck(inputs.getNazvanieUslugiGet())) {
                response.setNazvanieUslugiText(getNazvanieUslugiText());
            }
        }

        return response;
    }


    //step 1
    private ParamWithDescription<String> getTrplName() {
        log.info("Executing step 1");
        String tpName = ratesManagementClient.getRateProfile(inputs.getTestContur(), inputs.getBranchId(), inputs.getTrplId());
        if (tpName == null) {
            runNextStep = false;
            trplName = new ParamWithDescription<>(null, "Не удалось получить название тарифного плана в биллинге");
        } else {
            trplName = new ParamWithDescription<>(tpName);
        }
        return trplName;
    }

    //step 2
    private ParamWithDescription<String> getServiceNameTP() {
        log.info("Executing step 2");
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, trplName.getValue(), null);
            //через xPath?
            String step2ServiceName = response.getServiceDescription().get(0).getServiceName(); // minOccurs="0" maxOccurs="unbounded"
            serviceNameTP = new ParamWithDescription<>(step2ServiceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определись название сервиса в ПК для ТП '%s' (%s)", trplName.getValue(), e.getMessage());
            serviceNameTP = new ParamWithDescription<>(null, description);
            runNextStep = false;
        }
        return serviceNameTP;
    }

    //step 3
    private ParamWithDescription<String> getProductID() {
        log.info("Executing step 3");
        try {
            String xPath = "/serviceParams/productID";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceNameTP.getValue(), xPath);
            ElementNSImpl serviceContent = (ElementNSImpl) response.getServiceContent();
            Node productIDNode = serviceContent.getFirstChild().getFirstChild();
            productID = new ParamWithDescription<>(productIDNode.getTextContent());
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить productId для ТП '%s' (%s)", serviceNameTP.getValue(), e.getMessage());
            productID = new ParamWithDescription<>(null, description);
            runNextStep = false;
        }
        return productID;
    }

    //step 4
    private ParamWithDescription<String> getServiceName() {
        log.info("Executing step 4");
        try {
            String xPath = "/serviceParams/id_uslugi_serviceId[1]/id_uslugi_serviceId_value";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, null, inputs.getServId());
            String step4ServiceName = response.getServiceDescription().get(0).getServiceName();
            serviceName = new ParamWithDescription<>(step4ServiceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Для услуги %s не удалось определить название сервиса в ПК", inputs.getServId());
            serviceName = new ParamWithDescription<>(null, description);
        }
        return serviceName;
    }

    //step 5
    private ParamWithDescription<List<String>> getIncompatibleServIdList() {
        log.info("Executing step 5");
        String productId = productID.getValue();
        try {
            String xPath = "/serviceParams/nesovmestimye_uslugi_serviceId";
//            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), "dobavit_skorost_na_3_gb", xPath);
            String expression = String.format("//ber-ns0:nesovmestimye_uslugi_serviceId_value[following-sibling::ber-ns0:rule[ber-ns0:link_systemName_nesovmestimye_uslugi_serviceId_in='%s' and ber-ns0:link_productTariffId_nesovmestimye_uslugi_serviceId_in=%s]]",
//                    inputs.getSystemName(), inputs.getServId()); //73107
                    inputs.getSystemName(), 73107); //73107
            List<String> incompatibleServIds = XmlHelper.getListByXPath(response, expression);
            return new ParamWithDescription<>(incompatibleServIds);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить список несовместимых услуг для услуги %s: %s", inputs.getServId(), e.getMessage());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 6
    private ParamWithDescription<Boolean> getVkljuchenaVtarifnyjPlanFlag() {
        log.info("Executing step 6");
        String systemName = inputs.getSystemName();
        String productId = productID.getValue();
        try {
            String xPath = "/serviceParams/vkljuchena_v_tarifnyj_plan_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
//                ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
            String expression = String.format("//vkljuchena_v_tarifnyj_plan_yesNo" +
                    "//vkljuchena_v_tarifnyj_plan_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo_in='%s'" +
                    "and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo_in=%s]]", systemName, productId); //73107
            String reserveExpression = String.format("//vkljuchena_v_tarifnyj_plan_yesNo" +
                    "//vkljuchena_v_tarifnyj_plan_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo='%s'" +
                    "and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo=%s]]", systemName, productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ParamWithDescription<>(Boolean.parseBoolean(result));
        } catch (WebServiceFaultException e) {
            String description = "Не удалось определить включение в тарифный план для услуги";
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 7
    private ParamWithDescription<Boolean> getVozmozhnostPokazyvatVpodkljuchennykhFlag() {
        log.info("Executing step 7");
        String systemName = inputs.getSystemName();
        String productId = productID.getValue();
        try {
            String xPath = "/serviceParams/vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
//            ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
            String expression = String.format("//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                    "//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in='%s' " +
                    "and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in=%s]]", systemName, productId); //73107
            String reserveExpression = String.format("//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                    "//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo='%s' " +
                    "and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo=%s]]", systemName, productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ParamWithDescription<>(Boolean.parseBoolean(result));
        } catch (WebServiceFaultException e) {
            String description = "Не удалось определить показывать в подключенных для услуги: " + e.getMessage();
            return new ParamWithDescription<>(null, description);
        }

    }

    //step 8
    private ParamWithDescription<Boolean> getVidimostVdostupnykhFlag() {
        log.info("Executing step 8");
        String step4ServiceName = serviceName.getValue();
        String productId = productID.getValue();
        try {
            String xPath = " /serviceParams/vidimost_v_dostupnykh_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), step4ServiceName, xPath);
//                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
            String expression = String.format("//vidimost_v_dostupnykh_yesNo" +
                    "//vidimost_v_dostupnykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vidimost_v_dostupnykh_yesNo_in='%s' " +
                    "and link_productTariffId_vidimost_v_dostupnykh_yesNo_in=%s]]", inputs.getSystemName(), productId); //productId 99450
            String reserveExpression = String.format("//vidimost_v_dostupnykh_yesNo" +
                    "//vidimost_v_dostupnykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vidimost_v_dostupnykh_yesNo='%s' " +
                    "and link_productTariffId_vidimost_v_dostupnykh_yesNo=%s]]", inputs.getSystemName(), productId);
//                    log.info("XPATH: " + expression);
//                    log.info("reserve XPATH: " + reserveExpression);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ParamWithDescription<>(Boolean.parseBoolean(result));
        } catch (WebServiceFaultException e) {
            String description = "Не удалось определить видимость услуги в доступных для абонента: " + e.getMessage();
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 9
    private ParamWithDescription<String> getServiceNameCategory() {
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams response = serviceProfileClient.findServices(inputs.getTestContur(), 0, xPath, inputs.getKategoriiUslugiProduktyGet(), null);
            //через xPath?
            String serviceName = response.getServiceDescription().get(0).getServiceName(); // minOccurs="0" maxOccurs="unbounded"
            serviceNameCategory = new ParamWithDescription<>(serviceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определись название сервиса в ПК для категории услуги '%s' (%s)", inputs.getKategoriiUslugiProduktyGet(), e.getMessage());
            serviceNameCategory = new ParamWithDescription<>(null, description);
//            runNextStep = false;
            runStep10Step11 = false;
        }
        return serviceNameCategory;
    }

    //step 10
    private ParamWithDescription<String> getProductIdCategory() {
        log.info("Executing step 10");
        try {
            String xPath = "/serviceParams/productID";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceNameCategory.getValue(), xPath);
            ElementNSImpl serviceContent = (ElementNSImpl) response.getServiceContent();
            Node productIDNode = serviceContent.getFirstChild().getFirstChild();
            productIdCategory = new ParamWithDescription<>(productIDNode.getTextContent());
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определить productId для категории услуги '%s' (%s)", serviceNameCategory.getValue(), e.getMessage());
            productIdCategory = new ParamWithDescription<>(null, description);
            runStep10Step11 = false;
        }
        return productIdCategory;
    }

    //step 11
    private ParamWithDescription<String> getKategoriiUslugiProduktyFlag() {
        log.info("Executing step 11");
        try {
            String xPath = "/serviceParams/kategorii_uslugi_produkty_productServCatId";
            //???
//            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, serviceName.getValue(), xPath);
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), 0, "test____skidka__40__na__ap__ftp__minusplus____5____89159", xPath);
            String expression = "//kategorii_uslugi_produkty_productServCatId";
            if (XmlHelper.isPresent(response, expression)) {
                expression = String.format("//kategorii_uslugi_produkty_productServCatId[kategorii_uslugi_produkty_productServCatId_value=%s and rule/link_systemName_kategorii_uslugi_produkty_productServCatId='%s']",
                        productIdCategory.getValue(), inputs.getSystemName());
                if (XmlHelper.isPresent(response, expression)) {
                    return new ParamWithDescription<>("true");
                }
            }
            return new ParamWithDescription<>("false");
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ParamWithDescription<>("false", description);
        }
    }

    //step 12
    private ParamWithDescription<String> getUslugaPersonalizaciiFlag() {
        log.info("Executing step 12");
        try {
            String xPath = "/serviceParams/usluga_personalizacii_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(inputs.getTestContur(), inputs.getBranchId(), serviceName.getValue(), xPath);
            String expression = String.format("//usluga_personalizacii_yesNo[rule/link_systemName_usluga_personalizacii_yesNo_in='%s' and rule/link_productTariffId_usluga_personalizacii_yesNo_in=%s]",
                    inputs.getSystemName(), productID.getValue());
            boolean singleTagFound = XmlHelper.isPresent(response, expression);
            return new ParamWithDescription<>(String.valueOf(singleTagFound));
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 13
    private ParamWithDescription<String> getVozmozhnostPodkljuchenijaFlag() {
        log.info("Executing step 13");
        try {
            String xPath = "/serviceParams/vozmozhnost_podkljuchenija_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(
                    inputs.getTestContur(),
                    inputs.getBranchId(),
                    serviceName.getValue(),
                    xPath);
            String expression = String.format("//vozmozhnost_podkljuchenija_yesNo/vozmozhnost_podkljuchenija_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_podkljuchenija_yesNo_in='%s' and link_productTariffId_vozmozhnost_podkljuchenija_yesNo_in=%s]]",
                    inputs.getSystemName(), productID.getValue());
            String vozmozhnostPodkljuchenijaFlag = XmlHelper.getSingleValue(response, expression);
            return new ParamWithDescription<>(vozmozhnostPodkljuchenijaFlag);
        } catch (NoneOrMultipleTagsFoundException e) {
            return new ParamWithDescription<>("false", e.getMessage());
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 14
    private ParamWithDescription<String> getVozmozhnostOtkljuchenijaFlag() {
        log.info("Executing step 14");
        try {
            String xPath = "/serviceParams/vozmozhnost_otkljuchenija_yesNo";
            ReadServiceResponseParams response = serviceProfileClient.readService(
                    inputs.getTestContur(),
                    inputs.getBranchId(),
                    serviceName.getValue(),
                    xPath);
            String expression = String.format("//vozmozhnost_otkljuchenija_yesNo/vozmozhnost_otkljuchenija_yesNo_value[following-sibling::rule[link_systemName_vozmozhnost_otkljuchenija_yesNo_in='%s' and link_productTariffId_vozmozhnost_otkljuchenija_yesNo_in=%s]]",
                    inputs.getSystemName(), productID.getValue());
            String vozmozhnostOtkljuchenijaFlag = XmlHelper.getSingleValue(response, expression);
            return new ParamWithDescription<>(vozmozhnostOtkljuchenijaFlag);
        } catch (NoneOrMultipleTagsFoundException e) {
            return new ParamWithDescription<>("false", e.getMessage());
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 15
    private ParamWithDescription<String> getNazvanieUslugiText() {
        log.info("Executing step 15");
        try {
            String xPath = "/serviceParams/nazvanie_uslugi_text";
            ReadServiceResponseParams response = serviceProfileClient.readService(
                    inputs.getTestContur(),
                    inputs.getBranchId(),
                    serviceName.getValue(),
                    xPath);
            String expression = String.format("//nazvanie_uslugi_text/nazvanie_uslugi_text_value[following-sibling::rule[link_systemName_nazvanie_uslugi_text_in='%s' and link_branchId_nazvanie_uslugi_text_in=%s]]",
                    inputs.getSystemName(), inputs.getBranchId());
            String nazvanieUslugiText = XmlHelper.getSingleValue(response, expression);
            return new ParamWithDescription<>(nazvanieUslugiText);
        } catch (NoneOrMultipleTagsFoundException e) {
            return new ParamWithDescription<>("", e.getMessage());
        } catch (WebServiceFaultException e) {
            String description = String.format("Ошибка: %s", e.getMessage());
            return new ParamWithDescription<>(null, description);
        }
    }
}
