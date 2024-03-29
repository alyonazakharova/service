//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.03 at 05:02:25 PM MSK 
//


package com.bercut.service.wsdl.rates_management;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список ТП, на которых запрещено использовать квоты
 * 
 * <p>Java class for QuotaTrplBan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaTrplBan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quotaId" type="{http://www.bercut.com/schema/commonInVoiceAPI}QuotaId" minOccurs="0"/&gt;
 *         &lt;element name="trplId" type="{http://www.bercut.com/schema/commonInVoiceAPI}trplId" minOccurs="0"/&gt;
 *         &lt;element name="smstId" type="{http://www.bercut.com/schema/commonInVoiceAPI}smstId" minOccurs="0"/&gt;
 *         &lt;element name="roamTypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaTrplBan", propOrder = {
    "quotaId",
    "trplId",
    "smstId",
    "roamTypeId"
})
public class QuotaTrplBan {

    protected BigDecimal quotaId;
    protected BigDecimal trplId;
    protected BigDecimal smstId;
    protected BigDecimal roamTypeId;

    /**
     * Gets the value of the quotaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaId() {
        return quotaId;
    }

    /**
     * Sets the value of the quotaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaId(BigDecimal value) {
        this.quotaId = value;
    }

    /**
     * Gets the value of the trplId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrplId() {
        return trplId;
    }

    /**
     * Sets the value of the trplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrplId(BigDecimal value) {
        this.trplId = value;
    }

    /**
     * Gets the value of the smstId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSmstId() {
        return smstId;
    }

    /**
     * Sets the value of the smstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSmstId(BigDecimal value) {
        this.smstId = value;
    }

    /**
     * Gets the value of the roamTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoamTypeId() {
        return roamTypeId;
    }

    /**
     * Sets the value of the roamTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoamTypeId(BigDecimal value) {
        this.roamTypeId = value;
    }

}
