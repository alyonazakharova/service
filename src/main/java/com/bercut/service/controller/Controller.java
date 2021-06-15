package com.bercut.service.controller;

import com.bercut.service.global_steps.gs81.GS81;
import com.bercut.service.global_steps.gs81.GS81Inputs;
import com.bercut.service.global_steps.gs81.GS81Response;
import com.bercut.service.soap.rates_management.RatesManagementClient;
import com.bercut.service.soap.service_profile.ServiceProfileClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@EnableAsync
public class Controller {

    private final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private ServiceProfileClient serviceProfileClient;

    @Autowired
    private RatesManagementClient ratesManagementClient;

    @RequestMapping(value = "/gs81", method = RequestMethod.GET)
    public GS81Response getParams(@RequestParam(value = "testContur") String testContur,
                                  @RequestParam(value = "trplId") long trplId,
                                  @RequestParam(value = "branchId") long branchId,
                                  @RequestParam(value = "servId") long servId,
                                  @RequestParam(value = "systemName") String systemName,

                                  @RequestParam(value = "nesovmestimyeUslugiGet", required = false) Boolean nesovmestimyeUslugiGet,
                                  @RequestParam(value = "vkljuchenaVtarifnyjPlanGet", required = false) Boolean vkljuchenaVtarifnyjPlanGet,
                                  @RequestParam(value = "vozmozhnostPokazyvatVpodkljuchennykhGet", required = false) Boolean vozmozhnostPokazyvatVpodkljuchennykhGet,
                                  @RequestParam(value = "vidimostVdostupnykhGet", required = false) Boolean vidimostVdostupnykhGet,

                                  @RequestParam(value = "kategoriiUslugiProduktyGet", required = false) String kategoriiUslugiProduktyGet,
                                  @RequestParam(value = "uslugaPersolanlizaciiGet", required = false) Boolean uslugaPersolanlizaciiGet,
                                  @RequestParam(value = "vozmozhnostPodkljuchenijaGet", required = false) Boolean vozmozhnostPodkljuchenijaGet,
                                  @RequestParam(value = "vozmozhnostOtkljuchenijaGet", required = false) Boolean vozmozhnostOtkljuchenijaGet,
                                  @RequestParam(value = "nazvanieUslugiGet", required = false) Boolean nazvanieUslugiGet) {

        log.info(String.format("Received request with the following params: testContur=%s, trplId=%s, branchId=%s, " +
                        "servId=%s, systemName=%s, nesovmestimyeUslugiGet=%s, vkljuchenaVtarifnyjPlanGet=%s, " +
                        "vozmozhnostPokazyvatVpodkljuchennykhGet=%s, vidimostVdostupnykhGet=%s",
                testContur, trplId, branchId, servId, systemName, nesovmestimyeUslugiGet,
                vkljuchenaVtarifnyjPlanGet, vozmozhnostPokazyvatVpodkljuchennykhGet, vidimostVdostupnykhGet));

        GS81Inputs gs81Inputs = new GS81Inputs();

        gs81Inputs.setTestContur(testContur);
        gs81Inputs.setTrplId(trplId);
        gs81Inputs.setBranchId(branchId);
        gs81Inputs.setServId(servId);
        gs81Inputs.setSystemName(systemName);

        gs81Inputs.setNesovmestimyeUslugiGet(nesovmestimyeUslugiGet);
        gs81Inputs.setVkljuchenaVtarifnyjPlanGet(vkljuchenaVtarifnyjPlanGet);
        gs81Inputs.setVozmozhnostPokazyvatVpodkljuchennykhGet(vozmozhnostPokazyvatVpodkljuchennykhGet);
        gs81Inputs.setVidimostVdostupnykhGet(vidimostVdostupnykhGet);

        gs81Inputs.setKategoriiUslugiProduktyGet(kategoriiUslugiProduktyGet);
        gs81Inputs.setUslugaPersolanlizaciiGet(uslugaPersolanlizaciiGet);

        gs81Inputs.setVozmozhnostPodkljuchenijaGet(vozmozhnostPodkljuchenijaGet);
        gs81Inputs.setVozmozhnostOtkljuchenijaGet(vozmozhnostOtkljuchenijaGet);
        gs81Inputs.setNazvanieUslugiGet(nazvanieUslugiGet);

        GS81 gs81 = new GS81(serviceProfileClient, ratesManagementClient, gs81Inputs);

        return gs81.execute();
    }
}
