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
 * Тарифы на смену типа номера
 * 
 * <p>Java class for PtTariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtTariff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trplId" type="{http://www.bercut.com/schema/commonInVoiceAPI}trplId" minOccurs="0"/&gt;
 *         &lt;element name="servId" type="{http://www.bercut.com/schema/commonInVoiceAPI}serviceId" minOccurs="0"/&gt;
 *         &lt;element name="phtId" type="{http://www.bercut.com/schema/commonInVoiceAPI}phtId" minOccurs="0"/&gt;
 *         &lt;element name="sTime" type="{http://www.bercut.com/schema/commonInVoiceAPI}sDate" minOccurs="0"/&gt;
 *         &lt;element name="eTime" type="{http://www.bercut.com/schema/commonInVoiceAPI}eDate" minOccurs="0"/&gt;
 *         &lt;element name="firstOn" type="{http://www.bercut.com/schema/commonInVoiceAPI}firstOn" minOccurs="0"/&gt;
 *         &lt;element name="nextOn" type="{http://www.bercut.com/schema/commonInVoiceAPI}nextOn" minOccurs="0"/&gt;
 *         &lt;element name="smstId" type="{http://www.bercut.com/schema/commonInVoiceAPI}smstId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtTariff", propOrder = {
    "trplId",
    "servId",
    "phtId",
    "sTime",
    "eTime",
    "firstOn",
    "nextOn",
    "smstId"
})
public class PtTariff {

    protected BigDecimal trplId;
    protected BigDecimal servId;
    protected BigDecimal phtId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eTime;
    protected BigDecimal firstOn;
    protected BigDecimal nextOn;
    protected BigDecimal smstId;

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
     * Gets the value of the servId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServId() {
        return servId;
    }

    /**
     * Sets the value of the servId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServId(BigDecimal value) {
        this.servId = value;
    }

    /**
     * Gets the value of the phtId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhtId() {
        return phtId;
    }

    /**
     * Sets the value of the phtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhtId(BigDecimal value) {
        this.phtId = value;
    }

    /**
     * Gets the value of the sTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTime() {
        return sTime;
    }

    /**
     * Sets the value of the sTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTime(XMLGregorianCalendar value) {
        this.sTime = value;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETime() {
        return eTime;
    }

    /**
     * Sets the value of the eTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETime(XMLGregorianCalendar value) {
        this.eTime = value;
    }

    /**
     * Gets the value of the firstOn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstOn() {
        return firstOn;
    }

    /**
     * Sets the value of the firstOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstOn(BigDecimal value) {
        this.firstOn = value;
    }

    /**
     * Gets the value of the nextOn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNextOn() {
        return nextOn;
    }

    /**
     * Sets the value of the nextOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNextOn(BigDecimal value) {
        this.nextOn = value;
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

}
