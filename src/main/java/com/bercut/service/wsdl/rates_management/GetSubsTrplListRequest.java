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
 * Тип запроса метода получения списка тарифных планов, доступных для перехода, с текущей стоимостью переход
 * 
 * <p>Java class for getSubsTrplListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubsTrplListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="branchId" type="{http://www.bercut.com/schema/commonInVoiceAPI}BranchId"/&gt;
 *         &lt;element name="contractName" type="{http://www.bercut.com/cc/sa/ratesmanagement}getSubsTrplListContractName"/&gt;
 *         &lt;element name="subsId" type="{http://www.bercut.com/schema/commonInVoiceAPI}subscriberId"/&gt;
 *         &lt;element name="talId" type="{http://www.bercut.com/cc/sa/ratesmanagement}talId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubsTrplListRequest", namespace = "http://www.bercut.com/cc/sa/ratesmanagement", propOrder = {
    "branchId",
    "contractName",
    "subsId",
    "talId"
})
public class GetSubsTrplListRequest {

    @XmlElement(namespace = "", required = true)
    protected BigDecimal branchId;
    @XmlElement(namespace = "", required = true)
    protected String contractName;
    @XmlElement(namespace = "", required = true)
    protected BigDecimal subsId;
    @XmlElement(namespace = "")
    protected BigDecimal talId;

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
     * Gets the value of the contractName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * Sets the value of the contractName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractName(String value) {
        this.contractName = value;
    }

    /**
     * Gets the value of the subsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsId() {
        return subsId;
    }

    /**
     * Sets the value of the subsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsId(BigDecimal value) {
        this.subsId = value;
    }

    /**
     * Gets the value of the talId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTalId() {
        return talId;
    }

    /**
     * Sets the value of the talId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTalId(BigDecimal value) {
        this.talId = value;
    }

}
