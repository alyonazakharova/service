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
 * Информация о совместно используемых модификаторах
 * 
 * <p>Java class for SharedSsq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedSsq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="disName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtrftId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dtrftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rQuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numHistory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="eTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creUserId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="vol1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="vol2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dvtpId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dvtpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callVolumeStime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="callVolumeEtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="rServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rServName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rDisId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rDisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currentProfId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedSsq", propOrder = {
    "disId",
    "disName",
    "dtrftId",
    "dtrftName",
    "rQuota",
    "numHistory",
    "sTime",
    "eTime",
    "creDate",
    "creUserId",
    "vol1",
    "vol2",
    "lastDate",
    "dvtpId",
    "dvtpName",
    "callVolumeStime",
    "callVolumeEtime",
    "rServId",
    "rServName",
    "rDisId",
    "rDisName",
    "profId",
    "currentProfId"
})
public class SharedSsq {

    protected BigDecimal disId;
    protected String disName;
    protected BigDecimal dtrftId;
    protected String dtrftName;
    protected BigDecimal rQuota;
    protected BigDecimal numHistory;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDate;
    protected BigDecimal creUserId;
    protected BigDecimal vol1;
    protected BigDecimal vol2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDate;
    protected BigDecimal dvtpId;
    protected String dvtpName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callVolumeStime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callVolumeEtime;
    protected BigDecimal rServId;
    protected String rServName;
    protected BigDecimal rDisId;
    protected String rDisName;
    protected BigDecimal profId;
    protected BigDecimal currentProfId;

    /**
     * Gets the value of the disId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisId() {
        return disId;
    }

    /**
     * Sets the value of the disId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisId(BigDecimal value) {
        this.disId = value;
    }

    /**
     * Gets the value of the disName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisName() {
        return disName;
    }

    /**
     * Sets the value of the disName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisName(String value) {
        this.disName = value;
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
     * Gets the value of the dtrftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtrftName() {
        return dtrftName;
    }

    /**
     * Sets the value of the dtrftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtrftName(String value) {
        this.dtrftName = value;
    }

    /**
     * Gets the value of the rQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRQuota() {
        return rQuota;
    }

    /**
     * Sets the value of the rQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRQuota(BigDecimal value) {
        this.rQuota = value;
    }

    /**
     * Gets the value of the numHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumHistory() {
        return numHistory;
    }

    /**
     * Sets the value of the numHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumHistory(BigDecimal value) {
        this.numHistory = value;
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
     * Gets the value of the vol1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol1() {
        return vol1;
    }

    /**
     * Sets the value of the vol1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol1(BigDecimal value) {
        this.vol1 = value;
    }

    /**
     * Gets the value of the vol2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol2() {
        return vol2;
    }

    /**
     * Sets the value of the vol2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol2(BigDecimal value) {
        this.vol2 = value;
    }

    /**
     * Gets the value of the lastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDate() {
        return lastDate;
    }

    /**
     * Sets the value of the lastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDate(XMLGregorianCalendar value) {
        this.lastDate = value;
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
     * Gets the value of the dvtpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvtpName() {
        return dvtpName;
    }

    /**
     * Sets the value of the dvtpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvtpName(String value) {
        this.dvtpName = value;
    }

    /**
     * Gets the value of the callVolumeStime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallVolumeStime() {
        return callVolumeStime;
    }

    /**
     * Sets the value of the callVolumeStime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallVolumeStime(XMLGregorianCalendar value) {
        this.callVolumeStime = value;
    }

    /**
     * Gets the value of the callVolumeEtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallVolumeEtime() {
        return callVolumeEtime;
    }

    /**
     * Sets the value of the callVolumeEtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallVolumeEtime(XMLGregorianCalendar value) {
        this.callVolumeEtime = value;
    }

    /**
     * Gets the value of the rServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRServId() {
        return rServId;
    }

    /**
     * Sets the value of the rServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRServId(BigDecimal value) {
        this.rServId = value;
    }

    /**
     * Gets the value of the rServName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRServName() {
        return rServName;
    }

    /**
     * Sets the value of the rServName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRServName(String value) {
        this.rServName = value;
    }

    /**
     * Gets the value of the rDisId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRDisId() {
        return rDisId;
    }

    /**
     * Sets the value of the rDisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRDisId(BigDecimal value) {
        this.rDisId = value;
    }

    /**
     * Gets the value of the rDisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDisName() {
        return rDisName;
    }

    /**
     * Sets the value of the rDisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRDisName(String value) {
        this.rDisName = value;
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

}