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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Правило подключения
 * 
 * <p>Java class for ServRuleConnection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServRuleConnection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}srcId" minOccurs="0"/&gt;
 *         &lt;element name="checkServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkRule" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkServStat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dlrId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}ctId" minOccurs="0"/&gt;
 *         &lt;element name="cposId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}stId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}trplId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}statId" minOccurs="0"/&gt;
 *         &lt;element name="currentServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currentProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currentServStat" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currentCscId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priorityRule" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rtId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sactId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}cscId" minOccurs="0"/&gt;
 *         &lt;element name="targetProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantitySubs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantitySubsInt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityBasicServ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityBasicServInt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityServOff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityServOffInt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="chargeOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="notSendReq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priorityOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}startDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}endDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}creUserId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}creDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}updUserId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}updDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServRuleConnection", propOrder = {
    "srcId",
    "checkServId",
    "checkProfId",
    "checkRule",
    "checkServStat",
    "branchId",
    "dlrId",
    "ctId",
    "cposId",
    "stId",
    "trplId",
    "statId",
    "currentServId",
    "currentProfId",
    "currentServStat",
    "currentCscId",
    "priorityRule",
    "rtId",
    "sactId",
    "cscId",
    "targetProfId",
    "quantitySubs",
    "quantitySubsInt",
    "quantityBasicServ",
    "quantityBasicServInt",
    "quantityServOff",
    "quantityServOffInt",
    "chargeOrder",
    "notSendReq",
    "priorityOrder",
    "startDate",
    "endDate",
    "creUserId",
    "creDate",
    "updUserId",
    "updDate"
})
public class ServRuleConnection {

    protected BigDecimal srcId;
    protected BigDecimal checkServId;
    protected BigDecimal checkProfId;
    protected BigDecimal checkRule;
    protected BigDecimal checkServStat;
    protected BigDecimal branchId;
    protected BigDecimal dlrId;
    protected BigDecimal ctId;
    protected BigDecimal cposId;
    protected BigDecimal stId;
    protected BigDecimal trplId;
    protected BigDecimal statId;
    protected BigDecimal currentServId;
    protected BigDecimal currentProfId;
    protected BigDecimal currentServStat;
    protected BigDecimal currentCscId;
    protected BigDecimal priorityRule;
    protected BigDecimal rtId;
    protected BigDecimal sactId;
    protected BigDecimal cscId;
    protected BigDecimal targetProfId;
    protected BigDecimal quantitySubs;
    protected BigDecimal quantitySubsInt;
    protected BigDecimal quantityBasicServ;
    protected BigDecimal quantityBasicServInt;
    protected BigDecimal quantityServOff;
    protected BigDecimal quantityServOffInt;
    protected BigDecimal chargeOrder;
    protected BigDecimal notSendReq;
    protected BigDecimal priorityOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected BigDecimal creUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDate;
    protected BigDecimal updUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updDate;

    /**
     * Gets the value of the srcId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcId() {
        return srcId;
    }

    /**
     * Sets the value of the srcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrcId(BigDecimal value) {
        this.srcId = value;
    }

    /**
     * Gets the value of the checkServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckServId() {
        return checkServId;
    }

    /**
     * Sets the value of the checkServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckServId(BigDecimal value) {
        this.checkServId = value;
    }

    /**
     * Gets the value of the checkProfId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckProfId() {
        return checkProfId;
    }

    /**
     * Sets the value of the checkProfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckProfId(BigDecimal value) {
        this.checkProfId = value;
    }

    /**
     * Gets the value of the checkRule property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckRule() {
        return checkRule;
    }

    /**
     * Sets the value of the checkRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckRule(BigDecimal value) {
        this.checkRule = value;
    }

    /**
     * Gets the value of the checkServStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckServStat() {
        return checkServStat;
    }

    /**
     * Sets the value of the checkServStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckServStat(BigDecimal value) {
        this.checkServStat = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBranchId(BigDecimal value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the dlrId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDlrId() {
        return dlrId;
    }

    /**
     * Sets the value of the dlrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDlrId(BigDecimal value) {
        this.dlrId = value;
    }

    /**
     * Gets the value of the ctId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtId() {
        return ctId;
    }

    /**
     * Sets the value of the ctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtId(BigDecimal value) {
        this.ctId = value;
    }

    /**
     * Gets the value of the cposId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCposId() {
        return cposId;
    }

    /**
     * Sets the value of the cposId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCposId(BigDecimal value) {
        this.cposId = value;
    }

    /**
     * Gets the value of the stId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStId() {
        return stId;
    }

    /**
     * Sets the value of the stId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStId(BigDecimal value) {
        this.stId = value;
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
     * Gets the value of the statId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStatId() {
        return statId;
    }

    /**
     * Sets the value of the statId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStatId(BigDecimal value) {
        this.statId = value;
    }

    /**
     * Gets the value of the currentServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentServId() {
        return currentServId;
    }

    /**
     * Sets the value of the currentServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentServId(BigDecimal value) {
        this.currentServId = value;
    }

    /**
     * Gets the value of the currentProfId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentProfId() {
        return currentProfId;
    }

    /**
     * Sets the value of the currentProfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentProfId(BigDecimal value) {
        this.currentProfId = value;
    }

    /**
     * Gets the value of the currentServStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentServStat() {
        return currentServStat;
    }

    /**
     * Sets the value of the currentServStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentServStat(BigDecimal value) {
        this.currentServStat = value;
    }

    /**
     * Gets the value of the currentCscId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentCscId() {
        return currentCscId;
    }

    /**
     * Sets the value of the currentCscId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentCscId(BigDecimal value) {
        this.currentCscId = value;
    }

    /**
     * Gets the value of the priorityRule property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriorityRule() {
        return priorityRule;
    }

    /**
     * Sets the value of the priorityRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriorityRule(BigDecimal value) {
        this.priorityRule = value;
    }

    /**
     * Gets the value of the rtId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtId() {
        return rtId;
    }

    /**
     * Sets the value of the rtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRtId(BigDecimal value) {
        this.rtId = value;
    }

    /**
     * Gets the value of the sactId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSactId() {
        return sactId;
    }

    /**
     * Sets the value of the sactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSactId(BigDecimal value) {
        this.sactId = value;
    }

    /**
     * Параметр определяет причину действия с услугой. По умолчанию -42 "Изменение статуса услуги по правилу подключения"
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCscId() {
        return cscId;
    }

    /**
     * Sets the value of the cscId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCscId(BigDecimal value) {
        this.cscId = value;
    }

    /**
     * Gets the value of the targetProfId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetProfId() {
        return targetProfId;
    }

    /**
     * Sets the value of the targetProfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetProfId(BigDecimal value) {
        this.targetProfId = value;
    }

    /**
     * Gets the value of the quantitySubs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantitySubs() {
        return quantitySubs;
    }

    /**
     * Sets the value of the quantitySubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantitySubs(BigDecimal value) {
        this.quantitySubs = value;
    }

    /**
     * Gets the value of the quantitySubsInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantitySubsInt() {
        return quantitySubsInt;
    }

    /**
     * Sets the value of the quantitySubsInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantitySubsInt(BigDecimal value) {
        this.quantitySubsInt = value;
    }

    /**
     * Gets the value of the quantityBasicServ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityBasicServ() {
        return quantityBasicServ;
    }

    /**
     * Sets the value of the quantityBasicServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityBasicServ(BigDecimal value) {
        this.quantityBasicServ = value;
    }

    /**
     * Gets the value of the quantityBasicServInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityBasicServInt() {
        return quantityBasicServInt;
    }

    /**
     * Sets the value of the quantityBasicServInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityBasicServInt(BigDecimal value) {
        this.quantityBasicServInt = value;
    }

    /**
     * Gets the value of the quantityServOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityServOff() {
        return quantityServOff;
    }

    /**
     * Sets the value of the quantityServOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityServOff(BigDecimal value) {
        this.quantityServOff = value;
    }

    /**
     * Gets the value of the quantityServOffInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityServOffInt() {
        return quantityServOffInt;
    }

    /**
     * Sets the value of the quantityServOffInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityServOffInt(BigDecimal value) {
        this.quantityServOffInt = value;
    }

    /**
     * Gets the value of the chargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeOrder() {
        return chargeOrder;
    }

    /**
     * Sets the value of the chargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeOrder(BigDecimal value) {
        this.chargeOrder = value;
    }

    /**
     * Gets the value of the notSendReq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNotSendReq() {
        return notSendReq;
    }

    /**
     * Sets the value of the notSendReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNotSendReq(BigDecimal value) {
        this.notSendReq = value;
    }

    /**
     * Gets the value of the priorityOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * Sets the value of the priorityOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriorityOrder(BigDecimal value) {
        this.priorityOrder = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the creUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreUserId() {
        return creUserId;
    }

    /**
     * Sets the value of the creUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreUserId(BigDecimal value) {
        this.creUserId = value;
    }

    /**
     * Gets the value of the creDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDate() {
        return creDate;
    }

    /**
     * Sets the value of the creDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDate(XMLGregorianCalendar value) {
        this.creDate = value;
    }

    /**
     * Gets the value of the updUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpdUserId() {
        return updUserId;
    }

    /**
     * Sets the value of the updUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpdUserId(BigDecimal value) {
        this.updUserId = value;
    }

    /**
     * Gets the value of the updDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdDate() {
        return updDate;
    }

    /**
     * Sets the value of the updDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdDate(XMLGregorianCalendar value) {
        this.updDate = value;
    }

}