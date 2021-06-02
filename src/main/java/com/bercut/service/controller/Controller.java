package com.bercut.service.controller;

import com.bercut.service.GS81;
import com.bercut.service.response.ResponseWithDecription;
import com.bercut.service.soap.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/")
    public ResponseWithDecription getParams(@RequestParam(value = "testContur") String testContur,
                                            @RequestParam(value = "trplName") String trplName,
                                            @RequestParam(value = "branchId") long branchId,
                                            @RequestParam(value = "servId") long servId,
                                            @RequestParam(value = "systemName") String systemName,

                                            @RequestParam(value = "nesovmestimyeUslugiGet", required = false) Boolean nesovmestimyeUslugiGet,
                                            @RequestParam(value = "vkljuchenaVtarifnyjPlanGet", required = false) Boolean vkljuchenaVtarifnyjPlanGet,
                                            @RequestParam(value = "vozmozhnostPokazyvatVpodkljuchennykhGet", required = false) Boolean vozmozhnostPokazyvatVpodkljuchennykhGet,
                                            @RequestParam(value = "vidimostVdostupnykhGet", required = false) Boolean vidimostVdostupnykhGet) throws TransformerException, XPathExpressionException, JAXBException, IOException, SAXException, ParserConfigurationException {

        GS81 gs81 = new GS81(soapClient, testContur, trplName, branchId, servId, systemName,
                nesovmestimyeUslugiGet, vkljuchenaVtarifnyjPlanGet,
                vozmozhnostPokazyvatVpodkljuchennykhGet, vidimostVdostupnykhGet);
        return gs81.execute();
    }
}
