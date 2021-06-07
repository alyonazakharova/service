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
 * Абонент
 * 
 * <p>Java class for subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="msisdn" type="{http://www.bercut.com/schema/commonInVoiceAPI}msisdn" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://www.bercut.com/schema/commonInVoiceAPI}subscriberId" minOccurs="0"/&gt;
 *         &lt;element name="phoneId" type="{http://www.bercut.com/schema/commonInVoiceAPI}phoneId" minOccurs="0"/&gt;
 *         &lt;element name="servPhoneId" type="{http://www.bercut.com/schema/commonInVoiceAPI}phoneId" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriber", propOrder = {
    "msisdn",
    "subscriberId",
    "phoneId",
    "servPhoneId"
})
public class Subscriber {

    protected String msisdn;
    protected BigDecimal subscriberId;
    protected BigDecimal phoneId;
    protected BigDecimal servPhoneId;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberId(BigDecimal value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the phoneId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhoneId() {
        return phoneId;
    }

    /**
     * Sets the value of the phoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhoneId(BigDecimal value) {
        this.phoneId = value;
    }

    /**
     * Gets the value of the servPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServPhoneId() {
        return servPhoneId;
    }

    /**
     * Sets the value of the servPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServPhoneId(BigDecimal value) {
        this.servPhoneId = value;
    }

}
