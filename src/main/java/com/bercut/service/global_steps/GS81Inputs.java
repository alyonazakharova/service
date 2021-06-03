package com.bercut.service.global_steps;

import lombok.Data;

@Data
public class GS81Inputs {
    private String testContur;
    private String trplName;
    private long branchId;
    private long servId;
    private String systemName;
    private Boolean nesovmestimyeUslugiGet;
    private Boolean vkljuchenaVtarifnyjPlanGet;
    private Boolean vozmozhnostPokazyvatVpodkljuchennykhGet;
    private Boolean vidimostVdostupnykhGet;
}
