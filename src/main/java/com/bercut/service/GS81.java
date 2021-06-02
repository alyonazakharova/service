package com.bercut.service;

import com.bercut.service.response.ParamWithDescription;
import com.bercut.service.response.ResponseWithDecription;
import com.bercut.service.soap.SoapClient;
import com.bercut.service.utils.XmlHelper;
import com.bercut.service.wsdl.FindServicesResponseParams;
import com.bercut.service.wsdl.ReadServiceResponseParams;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import com.sun.org.apache.xerces.internal.dom.TextImpl;
import org.springframework.ws.client.WebServiceFaultException;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.List;

public class GS81 {

    private final SoapClient soapClient;

    private final String testContur;
    private final String trplName;
    private final long branchId;
    private final long servId;
    private final String systemName;

    private final Boolean nesovmestimyeUslugiGet;
    private final Boolean vkljuchenaVtarifnyjPlanGet;
    private final Boolean vozmozhnostPokazyvatVpodkljuchennykhGet;
    private final Boolean vidimostVdostupnykhGet;

    private ParamWithDescription<String> serviceNameTP;
    private ParamWithDescription<String> productID;
    private ParamWithDescription<String> serviceName;

    public GS81(SoapClient soapClient, String testContur, String trplName,
                long branchId, long servId, String systemName,
                Boolean nesovmestimyeUslugiGet, Boolean vkljuchenaVtarifnyjPlanGet,
                Boolean vozmozhnostPokazyvatVpodkljuchennykhGet, Boolean vidimostVdostupnykhGet) {
        this.soapClient = soapClient;
        this.testContur = testContur;
        this.trplName = trplName;
        this.branchId = branchId;
        this.servId = servId;
        this.systemName = systemName;
        this.nesovmestimyeUslugiGet = nesovmestimyeUslugiGet;
        this.vkljuchenaVtarifnyjPlanGet = vkljuchenaVtarifnyjPlanGet;
        this.vozmozhnostPokazyvatVpodkljuchennykhGet = vozmozhnostPokazyvatVpodkljuchennykhGet;
        this.vidimostVdostupnykhGet = vidimostVdostupnykhGet;
    }

    public ResponseWithDecription execute() throws TransformerException, XPathExpressionException, JAXBException, ParserConfigurationException, SAXException, IOException {
        return new ResponseWithDecription(getServiceNameTP(), getProductID(), getServiceName(),
                getIncompatibleServIdList(),getVkljuchenaVtarifnyjPlanFlag(), getVozmozhnostPokazyvatVpodkljuchennykhFlag(), getVidimostVdostupnykhFlag());
    }

    //step 2
    private ParamWithDescription<String> getServiceNameTP() {
        try {
            String xPath = "/serviceParams/productName";
            FindServicesResponseParams step2Response = soapClient.findServices(testContur, 0, xPath, trplName, null);
            String step2ServiceName = step2Response.getServiceDescription().get(0).getServiceName(); // minOccurs="0" maxOccurs="unbounded"
            serviceNameTP = new ParamWithDescription<>(step2ServiceName);
        } catch (WebServiceFaultException e) {
            serviceNameTP = new ParamWithDescription<>(null, e.getMessage());
        }
        return serviceNameTP;
    }

    //step 3
    public ParamWithDescription<String> getProductID() {
        String step2ServiceName = serviceNameTP.getValue();
        if (step2ServiceName != null) {
            try {
                String xPath = "/serviceParams/productID";
                ReadServiceResponseParams step3Response = soapClient.readService(testContur, 0, step2ServiceName, xPath);
//                ReadServiceResponseParams step3Response = soapClient.step3(env, step2ServiceName);
                ElementNSImpl serviceContent = (ElementNSImpl) step3Response.getServiceContent();
                Node productIDNode = serviceContent.getFirstChild().getFirstChild();
                String productIDValue = ((TextImpl) productIDNode).getWholeText();
                productID = new ParamWithDescription<>(productIDValue);
            } catch (WebServiceFaultException e) {
                productID = new ParamWithDescription<>(null, e.getMessage());
            }
        } else {
            String description = String.format("Не удалось определить название сервиса в ПК для ТП '%s'", trplName);
            productID = new ParamWithDescription<>(null, description);
        }
        return productID;
    }

    //step 4
    public ParamWithDescription<String> getServiceName() {
        try {
            String xPath = "/serviceParams/id_uslugi_serviceId[1]/id_uslugi_serviceId_value";
            FindServicesResponseParams step4Response = soapClient.findServices(testContur, 0, xPath, null, servId);
            String step4ServiceName = step4Response.getServiceDescription().get(0).getServiceName();
            serviceName = new ParamWithDescription<>(step4ServiceName);
        } catch (WebServiceFaultException e) {
            String description = String.format("Для услуги %s не удалось определить название сервиса в ПК", servId);
            serviceName = new ParamWithDescription<>(null, description);
        }
        return serviceName;
    }

    //step 5
    public ParamWithDescription<List<String>> getIncompatibleServIdList() {
        ParamWithDescription<List<String>> incompatibleServIdList =
                new ParamWithDescription<>(null, "nesovmestimyeUslugiGet = false");
        if (nesovmestimyeUslugiGet != null) {
            if (nesovmestimyeUslugiGet) {
                String step4ServiceName = serviceName.getValue();
                if (step4ServiceName != null) {
                    try {
                        String xPath = "/serviceParams/nesovmestimye_uslugi_serviceId";
//                        ReadServiceResponseParams step5Response = soapClient.readService(env, branchId, step4ServiceName, xPath);
                        ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "dobavit_skorost_na_3_gb", xPath);

                        String expression = String.format("//ber-ns0:nesovmestimye_uslugi_serviceId_value" +
                                "[following-sibling::ber-ns0:rule" +
                                "[ber-ns0:link_systemName_nesovmestimye_uslugi_serviceId_in='%s' " +
                                "and ber-ns0:link_productTariffId_nesovmestimye_uslugi_serviceId_in=%s]]", "MSDCRM", 56438);

                        List<String> incompatibleServIds = XmlHelper.getListByXPath(response, expression);
                        incompatibleServIdList = new ParamWithDescription<>(incompatibleServIds);
                    } catch (IllegalArgumentException e) {
                        incompatibleServIdList = new ParamWithDescription<>(null, e.getMessage());
                    } catch (IOException | ParserConfigurationException | SAXException | JAXBException | XPathExpressionException e) {
                        e.printStackTrace();
                    }
                } else {
                    String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", servId);
                    incompatibleServIdList = new ParamWithDescription<>(null, description);
                }
            }
        }
        return incompatibleServIdList;
    }

    //step 6
    public ParamWithDescription<Boolean> getVkljuchenaVtarifnyjPlanFlag() throws TransformerException, XPathExpressionException, JAXBException, IOException, SAXException, ParserConfigurationException {
        ParamWithDescription<Boolean> vkljuchenaVtarifnyjPlanFlag =
                new ParamWithDescription<>(null, "vkljuchenaVtarifnyjPlanGet = false");
        if (vkljuchenaVtarifnyjPlanGet != null) {
            if (vkljuchenaVtarifnyjPlanGet) {
                String step4ServiceName = serviceName.getValue();
                String productId = productID.getValue();
                if (step4ServiceName != null && productId != null) {
                    String xPath = "/serviceParams/vkljuchena_v_tarifnyj_plan_yesNo";
//                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, step4ServiceName, xPath);
                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);

                    String expression = String.format(
                            "//ber-ns0:vkljuchena_v_tarifnyj_plan_yesNo" +
                                    "//ber-ns0:vkljuchena_v_tarifnyj_plan_yesNo_value" +
                                    "[following-sibling::ber-ns0:rule" +
                                    "[ber-ns0:link_systemName_vkljuchena_v_tarifnyj_plan_yesNo_in='%s'" +
                                    "and ber-ns0:link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo_in=%s]]", systemName, 73107); //73107
                    String reserveExpression = String.format(
                            "//ber-ns0:vkljuchena_v_tarifnyj_plan_yesNo" +
                                    "//ber-ns0:vkljuchena_v_tarifnyj_plan_yesNo_value" +
                                    "[following-sibling::ber-ns0:rule" +
                                    "[ber-ns0:link_systemName_vkljuchena_v_tarifnyj_plan_yesNo='%s'" +
                                    "and ber-ns0:link_productTariffId_vkljuchena_v_tarifnyj_plan_yesNo=%s]]", systemName, productId);

                    String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
                    Boolean boolRes = Boolean.parseBoolean(result);
                    vkljuchenaVtarifnyjPlanFlag = new ParamWithDescription<>(boolRes, "OK");

                } else {
                    String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", servId);
                    vkljuchenaVtarifnyjPlanFlag = new ParamWithDescription<>(null, description);
                }
            }
        }
        return vkljuchenaVtarifnyjPlanFlag;
    }

    //step 7
    public ParamWithDescription<Boolean> getVozmozhnostPokazyvatVpodkljuchennykhFlag() throws ParserConfigurationException, JAXBException, SAXException, XPathExpressionException, IOException {
        ParamWithDescription<Boolean> vozmozhnostPokazyvatVpodkljuchennykhFlag =
                new ParamWithDescription<>(null, "vozmozhnostPokazyvatVpodkljuchennykhGet = false");
        if (vozmozhnostPokazyvatVpodkljuchennykhGet != null) {
            if (vozmozhnostPokazyvatVpodkljuchennykhGet) {
                String step4ServiceName = serviceName.getValue();
                String productId = productID.getValue();
                if (step4ServiceName != null && productId != null) {
                    String xPath = "/serviceParams/vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo";
//                    ReadServiceResponseParams response = soapClient.readService(env, branchId, step4ServiceName, xPath);
                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
                    String expression = String.format("//ber-ns0:vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                            "//ber-ns0:vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                            "[following-sibling::ber-ns0:rule" +
                            "[ber-ns0:link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in='%s' " +
                            "and ber-ns0:link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_in=%s]]", systemName, productId); //73107
                    String reserveExpression = String.format("//ber-ns0:vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo" +
                            "//ber-ns0:vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo_value" +
                            "[following-sibling::ber-ns0:rule" +
                            "[ber-ns0:link_systemName_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo='%s' " +
                            "and ber-ns0:link_productTariffId_vozmozhnost_pokazyvat_v_podkljuchennykh_yesNo=%s]]", systemName, productId);
                    String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
                    Boolean boolRes = Boolean.parseBoolean(result);
                    vozmozhnostPokazyvatVpodkljuchennykhFlag = new ParamWithDescription<>(boolRes, "OK");
                } else {
                    String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", servId);
                    vozmozhnostPokazyvatVpodkljuchennykhFlag = new ParamWithDescription<>(null, description);
                }
            }
        }
        return vozmozhnostPokazyvatVpodkljuchennykhFlag;
    }

    //step 8
    public ParamWithDescription<Boolean> getVidimostVdostupnykhFlag() throws ParserConfigurationException, JAXBException, SAXException, XPathExpressionException, IOException {
        ParamWithDescription<Boolean> vidimostVdostupnykhFlag =
                new ParamWithDescription<>(null, "vidimostVdostupnykhGetk = false");
        if (vidimostVdostupnykhGet != null) {
            if (vidimostVdostupnykhGet) {
                String step4ServiceName = serviceName.getValue();
                String productId = productID.getValue();
                if (step4ServiceName != null && productId != null) {
                    String xPath = " /serviceParams/vidimost_v_dostupnykh_yesNo";
//                    ReadServiceResponseParams response = soapClient.readService(env, branchId, step4ServiceName, xPath);
                    ReadServiceResponseParams response = soapClient.readService(testContur, branchId, "20__sms__dlja__tarifov__moj__tele2____5____76861", xPath);
                    String expression = String.format("//ber-ns0:vidimost_v_dostupnykh_yesNo" +
                                    "//ber-ns0:vidimost_v_dostupnykh_yesNo_value" +
                                    "[following-sibling::ber-ns0:rule" +
                                    "[ber-ns0:link_systemName_vidimost_v_dostupnykh_yesNo_in='%s' " +
                                    "and ber-ns0:link_productTariffId_vidimost_v_dostupnykh_yesNo_in=%s]]", systemName, 73107); //73107
                    String reserveExpression = String.format("//ber-ns0:vidimost_v_dostupnykh_yesNo" +
                            "//ber-ns0:vidimost_v_dostupnykh_yesNo_value" +
                            "[following-sibling::ber-ns0:rule" +
                            "[ber-ns0:link_systemName_vidimost_v_dostupnykh_yesNo='%s' " +
                            "and ber-ns0:link_productTariffId_vidimost_v_dostupnykh_yesNo=%s]]", systemName, productId);
//                    String result = findByXPath(response, expression, reserveExpression);
                    String result = XmlHelper.getValueByXPath(response, expression, reserveExpression);
                    Boolean boolRes = Boolean.parseBoolean(result);
                    vidimostVdostupnykhFlag = new ParamWithDescription<>(boolRes, "OK");

                } else {
                    String description = String.format("Не удалось определить productID для ТП (шаг 3) или название сервиса в ПК для услуги %s (шаг4)", servId);
                    vidimostVdostupnykhFlag = new ParamWithDescription<>(null, description);
                }
            }
        }
        return vidimostVdostupnykhFlag;
    }
}
