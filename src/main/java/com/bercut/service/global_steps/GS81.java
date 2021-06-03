package com.bercut.service.global_steps;

import com.bercut.service.response.ParamWithDescription;
import com.bercut.service.response.ResponseWithDescription;
import com.bercut.service.soap.SoapClient;
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

    private final SoapClient soapClient;
    private final GS81Inputs inputs;

    private ParamWithDescription<String> serviceNameTP;
    private ParamWithDescription<String> productID;
    private ParamWithDescription<String> serviceName;

    public GS81(SoapClient soapClient, GS81Inputs inputs) {
        this.soapClient = soapClient;
        this.inputs = inputs;
    }

    public ResponseWithDescription execute() {
        ResponseWithDescription response = new ResponseWithDescription();

        response.setServiceNameTP(getServiceNameTP());
        response.setProductId(getProductID());
        response.setServiceName(getServiceName());

        if (inputs.getNesovmestimyeUslugiGet() != null) {
            if (inputs.getNesovmestimyeUslugiGet()) {
                response.setIncompatibleServIdList(getIncompatibleServIdList());
            }
        }
        if (inputs.getVkljuchenaVtarifnyjPlanGet() != null) {
            if (inputs.getVkljuchenaVtarifnyjPlanGet()) {
                response.setVkljuchenaVtarifnyjPlanFlag(getVkljuchenaVtarifnyjPlanFlag());
            }
        }
        if (inputs.getVozmozhnostPokazyvatVpodkljuchennykhGet() != null) {
            if (inputs.getVozmozhnostPokazyvatVpodkljuchennykhGet()) {
                response.setVozmozhnostPokazyvatVpodkljuchennykhFlag(getVozmozhnostPokazyvatVpodkljuchennykhFlag());
            }
        }
        if (inputs.getVidimostVdostupnykhGet() != null) {
            if (inputs.getVidimostVdostupnykhGet()) {
                response.setVidimostVdostupnykhFlag(getVidimostVdostupnykhFlag());
            }
        }


        return response;
    }

    //step 2
    private ParamWithDescription<String> getServiceNameTP() {
        log.info("Executing step 2");
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams response = soapClient.findServices(inputs.getTestContur(), 0, xPath, inputs.getTrplName(), null);
            String step2ServiceName = response.getServiceDescription().get(0).getServiceName(); // minOccurs="0" maxOccurs="unbounded"
            serviceNameTP = new ParamWithDescription<>(step2ServiceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Не удалось определись название сервиса в ПК для ТП '%s' (%s)", inputs.getTrplName(), e.getMessage());
            serviceNameTP = new ParamWithDescription<>(null, description);
        }
        return serviceNameTP;
    }

    //step 3
    public ParamWithDescription<String> getProductID() {
        log.info("Executing step 3");
        String step2ServiceName = serviceNameTP.getValue();
        if (step2ServiceName != null) {
            try {
                String xPath = "/serviceParams/productID";
                ReadServiceResponseParams response = soapClient.readService(inputs.getTestContur(), 0, step2ServiceName, xPath);
                ElementNSImpl serviceContent = (ElementNSImpl) response.getServiceContent();
                Node productIDNode = serviceContent.getFirstChild().getFirstChild();
                productID = new ParamWithDescription<>(productIDNode.getTextContent());
            } catch (WebServiceFaultException e) {
                String description = String.format("Не удалось определить productId для ТП '%s' (%s)", step2ServiceName, e.getMessage());
                productID = new ParamWithDescription<>(null, description);
            }
        } else {
            String description = String.format("Не удалось определить название сервиса в ПК для ТП '%s' (шаг 2)", inputs.getTrplName());
            productID = new ParamWithDescription<>(null, description);
        }
        return productID;
    }

    //step 4
    public ParamWithDescription<String> getServiceName() {
        log.info("Executing step 4");
        try {
            String xPath = "/serviceParams/id_uslugi_serviceId[1]/id_uslugi_serviceId_value";
            FindServicesResponseParams response = soapClient.findServices(inputs.getTestContur(), 0, xPath, null, inputs.getServId());
            String step4ServiceName = response.getServiceDescription().get(0).getServiceName();
            serviceName = new ParamWithDescription<>(step4ServiceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Для услуги %s не удалось определить название сервиса в ПК", inputs.getServId());
            serviceName = new ParamWithDescription<>(null, description);
        }
        return serviceName;
    }

    //step 5
    public ParamWithDescription<List<String>> getIncompatibleServIdList() {
        log.info("Executing step 5");
        String step4ServiceName = serviceName.getValue();
        String productId = productID.getValue();
        if (step4ServiceName != null && productId != null) {
            String xPath = "/serviceParams/nesovmestimye_uslugi_serviceId";
//                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, step4ServiceName, xPath);
            ReadServiceResponseParams response = soapClient.readService(inputs.getTestContur(), inputs.getBranchId(), "dobavit_skorost_na_3_gb", xPath);

            String expression = String.format("//ber-ns0:nesovmestimye_uslugi_serviceId_value[following-sibling::ber-ns0:rule[ber-ns0:link_systemName_nesovmestimye_uslugi_serviceId_in='%s' and ber-ns0:link_productTariffId_nesovmestimye_uslugi_serviceId_in=%s]]",
                    inputs.getSystemName(), 73107);
            log.info("XPATH: " + expression);

            List<String> incompatibleServIds = XmlHelper.getListByXPath(response, expression);
            return new ParamWithDescription<>(incompatibleServIds);
        } else {
            String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", inputs.getServId());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 6
    public ParamWithDescription<Boolean> getVkljuchenaVtarifnyjPlanFlag() {
        log.info("Executing step 6");
        String step4ServiceName = serviceName.getValue();
        String productId = productID.getValue();
        if (step4ServiceName != null && productId != null) {
            String xPath = "/serviceParams/vkljuchena_v_tarifnyj_plan_yesNo";
            ReadServiceResponseParams response = soapClient.readService(inputs.getTestContur(), inputs.getBranchId(), step4ServiceName, xPath);
//                ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
            String expression = String.format("//vkljuchena_v_tarifnyj_plan_yesNo" +
                    "//vkljuchena_v_tarifnyj_plan_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo_in='%s'" +
                    "and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo_in=%s]]", inputs.getSystemName(), productId); //73107
            String reserveExpression = String.format("//vkljuchena_v_tarifnyj_plan_yesNo" +
                    "//vkljuchena_v_tarifnyj_plan_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vkljuchena_v_tarifnyj_plan_yesNo='%s'" +
                    "and link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo=%s]]", inputs.getSystemName(), productId);

            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ParamWithDescription<>(Boolean.parseBoolean(result));
        } else {
            String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", inputs.getServId());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 7
    public ParamWithDescription<Boolean> getVozmozhnostPokazyvatVpodkljuchennykhFlag() {
        log.info("Executing step 7");
        String step4ServiceName = serviceName.getValue();
        String productId = productID.getValue();
        if (step4ServiceName != null && productId != null) {
            String xPath = "/serviceParams/vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo";
            ReadServiceResponseParams response = soapClient.readService(inputs.getTestContur(), inputs.getBranchId(), step4ServiceName, xPath);
//                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
            String expression = String.format("//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                    "//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in='%s' " +
                    "and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in=%s]]", inputs.getSystemName(), productId); //73107
            String reserveExpression = String.format("//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                    "//vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                    "[following-sibling::rule" +
                    "[link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo='%s' " +
                    "and link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo=%s]]", inputs.getSystemName(), productId);
            String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
            return new ParamWithDescription<>(Boolean.parseBoolean(result));
        } else {
            String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", inputs.getServId());
            return new ParamWithDescription<>(null, description);
        }
    }

    //step 8
    public ParamWithDescription<Boolean> getVidimostVdostupnykhFlag() {
        log.info("Executing step 8");
        String step4ServiceName = serviceName.getValue();
        String productId = productID.getValue();
        if (step4ServiceName != null && productId != null) {
            String xPath = " /serviceParams/vidimost_v_dostupnykh_yesNo";
            ReadServiceResponseParams response = soapClient.readService(inputs.getTestContur(), inputs.getBranchId(), step4ServiceName, xPath);
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
        } else {
            String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", inputs.getServId());
            return new ParamWithDescription<>(null, description);
        }
    }
}
