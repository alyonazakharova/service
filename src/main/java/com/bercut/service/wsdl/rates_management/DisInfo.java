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
 * Набор информационных параметров скидки
 * 
 * <p>Java class for DisInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountId" type="{http://www.bercut.com/schema/commonInVoiceAPI}discountId" minOccurs="0"/&gt;
 *         &lt;element name="discountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceId" type="{http://www.bercut.com/schema/commonInVoiceAPI}serviceId" minOccurs="0"/&gt;
 *         &lt;element name="dsstId" type="{http://www.bercut.com/schema/commonInVoiceAPI}dsstId" minOccurs="0"/&gt;
 *         &lt;element name="disPriority" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="invDictId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="renewQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sppmId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="toNextPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="distId" type="{http://www.bercut.com/schema/commonInVoiceAPI}distId" minOccurs="0"/&gt;
 *         &lt;element name="dvtpId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="linkDisId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dtrftId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isShared" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="profId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="useCalcPayPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}dflId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}dflUsageType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}dfrId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisInfo", propOrder = {
    "discountId",
    "discountName",
    "serviceId",
    "dsstId",
    "disPriority",
    "invDictId",
    "renewQuantity",
    "sppmId",
    "toNextPeriod",
    "distId",
    "dvtpId",
    "linkDisId",
    "dtrftId",
    "isShared",
    "profId",
    "useCalcPayPeriod",
    "dflId",
    "dflUsageType",
    "dfrId"
})
public class DisInfo {

    protected BigDecimal discountId;
    protected String discountName;
    protected BigDecimal serviceId;
    protected BigDecimal dsstId;
    protected BigDecimal disPriority;
    protected BigDecimal invDictId;
    protected BigDecimal renewQuantity;
    protected BigDecimal sppmId;
    protected BigDecimal toNextPeriod;
    protected BigDecimal distId;
    protected BigDecimal dvtpId;
    protected BigDecimal linkDisId;
    protected BigDecimal dtrftId;
    protected BigDecimal isShared;
    protected BigDecimal profId;
    protected BigDecimal useCalcPayPeriod;
    protected BigDecimal dflId;
    protected BigDecimal dflUsageType;
    protected BigDecimal dfrId;

    /**
     * Gets the value of the discountId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountId() {
        return discountId;
    }

    /**
     * Sets the value of the discountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountId(BigDecimal value) {
        this.discountId = value;
    }

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountName(String value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceId(BigDecimal value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the dsstId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsstId() {
        return dsstId;
    }

    /**
     * Sets the value of the dsstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsstId(BigDecimal value) {
        this.dsstId = value;
    }

    /**
     * Gets the value of the disPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisPriority() {
        return disPriority;
    }

    /**
     * Sets the value of the disPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisPriority(BigDecimal value) {
        this.disPriority = value;
    }

    /**
     * Gets the value of the invDictId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvDictId() {
        return invDictId;
    }

    /**
     * Sets the value of the invDictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvDictId(BigDecimal value) {
        this.invDictId = value;
    }

    /**
     * Gets the value of the renewQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenewQuantity() {
        return renewQuantity;
    }

    /**
     * Sets the value of the renewQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenewQuantity(BigDecimal value) {
        this.renewQuantity = value;
    }

    /**
     * Gets the value of the sppmId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSppmId() {
        return sppmId;
    }

    /**
     * Sets the value of the sppmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSppmId(BigDecimal value) {
        this.sppmId = value;
    }

    /**
     * Gets the value of the toNextPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToNextPeriod() {
        return toNextPeriod;
    }

    /**
     * Sets the value of the toNextPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToNextPeriod(BigDecimal value) {
        this.toNextPeriod = value;
    }

    /**
     * Gets the value of the distId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistId() {
        return distId;
    }

    /**
     * Sets the value of the distId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistId(BigDecimal value) {
        this.distId = value;
    }

    /**
     * Gets the value of the dvtpId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvtpId() {
        return dvtpId;
    }

    /**
     * Sets the value of the dvtpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDvtpId(BigDecimal value) {
        this.dvtpId = value;
    }

    /**
     * Gets the value of the linkDisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLinkDisId() {
        return linkDisId;
    }

    /**
     * Sets the value of the linkDisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLinkDisId(BigDecimal value) {
        this.linkDisId = value;
    }

    /**
     * Gets the value of the dtrftId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDtrftId() {
        return dtrftId;
    }

    /**
     * Sets the value of the dtrftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDtrftId(BigDecimal value) {
        this.dtrftId = value;
    }

    /**
     * Gets the value of the isShared property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsShared() {
        return isShared;
    }

    /**
     * Sets the value of the isShared property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIsShared(BigDecimal value) {
        this.isShared = value;
    }

    /**
     * Gets the value of the profId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfId() {
        return profId;
    }

    /**
     * Sets the value of the profId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfId(BigDecimal value) {
        this.profId = value;
    }

    /**
     * Gets the value of the useCalcPayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUseCalcPayPeriod() {
        return useCalcPayPeriod;
    }

    /**
     * Sets the value of the useCalcPayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUseCalcPayPeriod(BigDecimal value) {
        this.useCalcPayPeriod = value;
    }

    /**
     * Gets the value of the dflId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDflId() {
        return dflId;
    }

    /**
     * Sets the value of the dflId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDflId(BigDecimal value) {
        this.dflId = value;
    }

    /**
     * Gets the value of the dflUsageType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDflUsageType() {
        return dflUsageType;
    }

    /**
     * Sets the value of the dflUsageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDflUsageType(BigDecimal value) {
        this.dflUsageType = value;
    }

    /**
     * Gets the value of the dfrId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDfrId() {
        return dfrId;
    }

    /**
     * Sets the value of the dfrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDfrId(BigDecimal value) {
        this.dfrId = value;
    }

}
