package com.bercut.service.controller;

import com.bercut.service.global_steps.GS81;
import com.bercut.service.global_steps.GS81Inputs;
import com.bercut.service.response.ResponseWithDescription;
import com.bercut.service.soap.SoapClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private SoapClient soapClient;

//    @GetMapping("/gs81")
    @RequestMapping(value = "/gs81", method = RequestMethod.GET)
    public ResponseWithDescription getParams(@RequestParam(value = "testContur") String testContur,
                                             @RequestParam(value = "trplName") String trplName,
                                             @RequestParam(value = "branchId") long branchId,
                                             @RequestParam(value = "servId") long servId,
                                             @RequestParam(value = "systemName") String systemName,

                                             @RequestParam(value = "nesovmestimyeUslugiGet", required = false) Boolean nesovmestimyeUslugiGet,
                                             @RequestParam(value = "vkljuchenaVtarifnyjPlanGet", required = false) Boolean vkljuchenaVtarifnyjPlanGet,
                                             @RequestParam(value = "vozmozhnostPokazyvatVpodkljuchennykhGet", required = false) Boolean vozmozhnostPokazyvatVpodkljuchennykhGet,
                                             @RequestParam(value = "vidimostVdostupnykhGet", required = false) Boolean vidimostVdostupnykhGet) {

        log.info(String.format("Received request with the following params: testContur=%s, trplName=%s, branchId=%s, " +
                        "servId=%s, systemName=%s, nesovmestimyeUslugiGet=%s, vkljuchenaVtarifnyjPlanGet=%s, " +
                        "vozmozhnostPokazyvatVpodkljuchennykhGet=%s, vidimostVdostupnykhGet=%s",
                testContur, trplName, branchId, servId, systemName, nesovmestimyeUslugiGet,
                vkljuchenaVtarifnyjPlanGet, vozmozhnostPokazyvatVpodkljuchennykhGet, vidimostVdostupnykhGet));

        GS81Inputs gs81Inputs = new GS81Inputs();
        gs81Inputs.setTestContur(testContur);
        gs81Inputs.setTrplName(trplName);
        gs81Inputs.setBranchId(branchId);
        gs81Inputs.setServId(servId);
        gs81Inputs.setSystemName(systemName);
        gs81Inputs.setNesovmestimyeUslugiGet(nesovmestimyeUslugiGet);
        gs81Inputs.setVkljuchenaVtarifnyjPlanGet(vkljuchenaVtarifnyjPlanGet);
        gs81Inputs.setVozmozhnostPokazyvatVpodkljuchennykhGet(vozmozhnostPokazyvatVpodkljuchennykhGet);
        gs81Inputs.setVidimostVdostupnykhGet(vidimostVdostupnykhGet);

        GS81 gs81 = new GS81(soapClient, gs81Inputs);

//        GS81 gs81 = new GS81(soapClient, testContur, trplName, branchId, servId, systemName,
//                nesovmestimyeUslugiGet, vkljuchenaVtarifnyjPlanGet,
//                vozmozhnostPokazyvatVpodkljuchennykhGet, vidimostVdostupnykhGet);

        return gs81.execute();
    }
}
