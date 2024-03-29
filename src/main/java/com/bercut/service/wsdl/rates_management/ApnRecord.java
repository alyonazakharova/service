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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запись APN
 * 
 * <p>Java class for ApnRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApnRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apnId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="apnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apnDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApnRecord", propOrder = {
    "apnId",
    "apnName",
    "apnDescription"
})
public class ApnRecord {

    @XmlElement(required = true)
    protected BigDecimal apnId;
    @XmlElement(required = true)
    protected String apnName;
    @XmlElement(required = true)
    protected String apnDescription;

    /**
     * Gets the value of the apnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApnId() {
        return apnId;
    }

    /**
     * Sets the value of the apnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApnId(BigDecimal value) {
        this.apnId = value;
    }

    /**
     * Gets the value of the apnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApnName() {
        return apnName;
    }

    /**
     * Sets the value of the apnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApnName(String value) {
        this.apnName = value;
    }

    /**
     * Gets the value of the apnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApnDescription() {
        return apnDescription;
    }

    /**
     * Sets the value of the apnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApnDescription(String value) {
        this.apnDescription = value;
    }

}
