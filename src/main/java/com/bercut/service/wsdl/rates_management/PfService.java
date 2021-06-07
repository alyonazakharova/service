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
 * Услуга в разрезе продуктового семейства
 * 
 * <p>Java class for PfService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PfService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pfId" type="{http://www.bercut.com/schema/commonInVoiceAPI}PfId" minOccurs="0"/&gt;
 *         &lt;element name="servId" type="{http://www.bercut.com/schema/commonInVoiceAPI}serviceId" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.bercut.com/schema/commonInVoiceAPI}regionId" minOccurs="0"/&gt;
 *         &lt;element name="trplId" type="{http://www.bercut.com/schema/commonInVoiceAPI}trplId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PfService", propOrder = {
    "pfId",
    "servId",
    "regionId",
    "trplId"
})
public class PfService {

    protected BigDecimal pfId;
    protected BigDecimal servId;
    protected BigDecimal regionId;
    protected BigDecimal trplId;

    /**
     * Gets the value of the pfId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPfId() {
        return pfId;
    }

    /**
     * Sets the value of the pfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPfId(BigDecimal value) {
        this.pfId = value;
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
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegionId(BigDecimal value) {
        this.regionId = value;
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

}
