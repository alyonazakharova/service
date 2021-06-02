package com.bercut.service.readservice;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceContentReadService", propOrder = {
        "productID",
        "nesovmestimye_uslugi_serviceId",
        "vkljuchena_v_tarifnyj_plan_yesNo"
})
public class ServiceContentReadService {
    protected long productID;

    protected List<NesovmestimyeUslugiServiceId> nesovmestimye_uslugi_serviceId;

    protected List<VkluchenaVTarifniyPlanYesNo> vkljuchena_v_tarifnyj_plan_yesNo;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public List<NesovmestimyeUslugiServiceId> getNesovmestimye_uslugi_serviceId() {
        return nesovmestimye_uslugi_serviceId;
    }

    public void setNesovmestimye_uslugi_serviceId(List<NesovmestimyeUslugiServiceId> nesovmestimye_uslugi_serviceId) {
        this.nesovmestimye_uslugi_serviceId = nesovmestimye_uslugi_serviceId;
    }

    public List<VkluchenaVTarifniyPlanYesNo> getVkljuchena_v_tarifnyj_plan_yesNo() {
        return vkljuchena_v_tarifnyj_plan_yesNo;
    }

    public void setVkljuchena_v_tarifnyj_plan_yesNo(List<VkluchenaVTarifniyPlanYesNo> vkljuchena_v_tarifnyj_plan_yesNo) {
        this.vkljuchena_v_tarifnyj_plan_yesNo = vkljuchena_v_tarifnyj_plan_yesNo;
    }
}
