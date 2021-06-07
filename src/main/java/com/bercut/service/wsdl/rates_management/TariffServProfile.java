//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.03 at 05:02:25 PM MSK 
//


package com.bercut.service.wsdl.rates_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Правила подключения профилей услуги
 * 
 * <p>Java class for TariffServProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffServProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tsprofId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ctId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="trplId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="servId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sactId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cscId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sactServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="baseServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currentProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="targetProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tspstId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tsptypeId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="stime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="etime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creUserId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="servProfile" type="{http://www.bercut.com/schema/commonInVoiceAPI}ServiceProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffServProfile", propOrder = {
    "tsprofId",
    "branchId",
    "ctId",
    "trplId",
    "servId",
    "sactId",
    "cscId",
    "sactServId",
    "baseServId",
    "currentProfId",
    "targetProfId",
    "tspstId",
    "tsptypeId",
    "stime",
    "etime",
    "creUserId",
    "creDate",
    "servProfile"
})
public class TariffServProfile {

    protected BigDecimal tsprofId;
    protected BigDecimal branchId;
    protected BigDecimal ctId;
    protected BigDecimal trplId;
    protected BigDecimal servId;
    protected BigDecimal sactId;
    protected BigDecimal cscId;
    protected BigDecimal sactServId;
    protected BigDecimal baseServId;
    protected BigDecimal currentProfId;
    protected BigDecimal targetProfId;
    protected BigDecimal tspstId;
    protected BigDecimal tsptypeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar etime;
    protected BigDecimal creUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDate;
    protected List<ServiceProfile> servProfile;

    /**
     * Gets the value of the tsprofId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTsprofId() {
        return tsprofId;
    }

    /**
     * Sets the value of the tsprofId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTsprofId(BigDecimal value) {
        this.tsprofId = value;
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
     * Gets the value of the cscId property.
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
     * Gets the value of the sactServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSactServId() {
        return sactServId;
    }

    /**
     * Sets the value of the sactServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSactServId(BigDecimal value) {
        this.sactServId = value;
    }

    /**
     * Gets the value of the baseServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseServId() {
        return baseServId;
    }

    /**
     * Sets the value of the baseServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseServId(BigDecimal value) {
        this.baseServId = value;
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
     * Gets the value of the tspstId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTspstId() {
        return tspstId;
    }

    /**
     * Sets the value of the tspstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTspstId(BigDecimal value) {
        this.tspstId = value;
    }

    /**
     * Gets the value of the tsptypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTsptypeId() {
        return tsptypeId;
    }

    /**
     * Sets the value of the tsptypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTsptypeId(BigDecimal value) {
        this.tsptypeId = value;
    }

    /**
     * Gets the value of the stime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStime() {
        return stime;
    }

    /**
     * Sets the value of the stime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStime(XMLGregorianCalendar value) {
        this.stime = value;
    }

    /**
     * Gets the value of the etime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEtime() {
        return etime;
    }

    /**
     * Sets the value of the etime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEtime(XMLGregorianCalendar value) {
        this.etime = value;
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
     * Gets the value of the servProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProfile }
     * 
     * 
     */
    public List<ServiceProfile> getServProfile() {
        if (servProfile == null) {
            servProfile = new ArrayList<ServiceProfile>();
        }
        return this.servProfile;
    }

}
