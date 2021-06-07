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
 * Набор информационных параметров тарфиного плана
 * 
 * <p>Java class for TarifInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TarifInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarifId" type="{http://www.bercut.com/schema/commonInVoiceAPI}trplId" minOccurs="0"/&gt;
 *         &lt;element name="tarifName" type="{http://www.bercut.com/schema/commonInVoiceAPI}trplName" minOccurs="0"/&gt;
 *         &lt;element name="firstOn" type="{http://www.bercut.com/schema/commonInVoiceAPI}firstOn" minOccurs="0"/&gt;
 *         &lt;element name="nextOn" type="{http://www.bercut.com/schema/commonInVoiceAPI}nextOn" minOccurs="0"/&gt;
 *         &lt;element name="firstOnAdd" type="{http://www.bercut.com/schema/commonInVoiceAPI}firstOnAdd" minOccurs="0"/&gt;
 *         &lt;element name="nextOnAdd" type="{http://www.bercut.com/schema/commonInVoiceAPI}nextOnAdd" minOccurs="0"/&gt;
 *         &lt;element name="currencyId" type="{http://www.bercut.com/schema/commonInVoiceAPI}currencyId" minOccurs="0"/&gt;
 *         &lt;element name="tssId" type="{http://www.bercut.com/schema/commonInVoiceAPI}tssId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TarifInfo", propOrder = {
    "tarifId",
    "tarifName",
    "firstOn",
    "nextOn",
    "firstOnAdd",
    "nextOnAdd",
    "currencyId",
    "tssId"
})
public class TarifInfo {

    protected BigDecimal tarifId;
    protected String tarifName;
    protected BigDecimal firstOn;
    protected BigDecimal nextOn;
    protected BigDecimal firstOnAdd;
    protected BigDecimal nextOnAdd;
    protected BigDecimal currencyId;
    protected BigDecimal tssId;

    /**
     * Gets the value of the tarifId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarifId() {
        return tarifId;
    }

    /**
     * Sets the value of the tarifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarifId(BigDecimal value) {
        this.tarifId = value;
    }

    /**
     * Gets the value of the tarifName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifName() {
        return tarifName;
    }

    /**
     * Sets the value of the tarifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifName(String value) {
        this.tarifName = value;
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
     * Gets the value of the firstOnAdd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstOnAdd() {
        return firstOnAdd;
    }

    /**
     * Sets the value of the firstOnAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstOnAdd(BigDecimal value) {
        this.firstOnAdd = value;
    }

    /**
     * Gets the value of the nextOnAdd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNextOnAdd() {
        return nextOnAdd;
    }

    /**
     * Sets the value of the nextOnAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNextOnAdd(BigDecimal value) {
        this.nextOnAdd = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyId(BigDecimal value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the tssId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTssId() {
        return tssId;
    }

    /**
     * Sets the value of the tssId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTssId(BigDecimal value) {
        this.tssId = value;
    }

}
