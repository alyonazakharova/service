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
 * Информация о совместно используемой услуге
 * 
 * <p>Java class for SharedSsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedSsh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dSubsId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sharedServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rSubsId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="shSgId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numHistory" type="{http://www.bercut.com/schema/commonInVoiceAPI}numberHistory" minOccurs="0"/&gt;
 *         &lt;element name="sTime" type="{http://www.bercut.com/schema/commonInVoiceAPI}sDate" minOccurs="0"/&gt;
 *         &lt;element name="eTime" type="{http://www.bercut.com/schema/commonInVoiceAPI}eDate" minOccurs="0"/&gt;
 *         &lt;element name="smstId" type="{http://www.bercut.com/schema/commonInVoiceAPI}smstId" minOccurs="0"/&gt;
 *         &lt;element name="creDate" type="{http://www.bercut.com/schema/commonInVoiceAPI}creDate" minOccurs="0"/&gt;
 *         &lt;element name="creUserId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rSubsAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharedSsq" type="{http://www.bercut.com/schema/commonInVoiceAPI}SharedSsq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedSsh", propOrder = {
    "dSubsId",
    "sharedServId",
    "rSubsId",
    "shSgId",
    "numHistory",
    "sTime",
    "eTime",
    "smstId",
    "creDate",
    "creUserId",
    "rSubsAlias",
    "sharedSsq"
})
public class SharedSsh {

    protected BigDecimal dSubsId;
    protected BigDecimal sharedServId;
    protected BigDecimal rSubsId;
    protected BigDecimal shSgId;
    protected BigDecimal numHistory;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eTime;
    protected BigDecimal smstId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDate;
    protected BigDecimal creUserId;
    protected String rSubsAlias;
    protected List<SharedSsq> sharedSsq;

    /**
     * Gets the value of the dSubsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDSubsId() {
        return dSubsId;
    }

    /**
     * Sets the value of the dSubsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDSubsId(BigDecimal value) {
        this.dSubsId = value;
    }

    /**
     * Gets the value of the sharedServId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharedServId() {
        return sharedServId;
    }

    /**
     * Sets the value of the sharedServId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharedServId(BigDecimal value) {
        this.sharedServId = value;
    }

    /**
     * Gets the value of the rSubsId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRSubsId() {
        return rSubsId;
    }

    /**
     * Sets the value of the rSubsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRSubsId(BigDecimal value) {
        this.rSubsId = value;
    }

    /**
     * Gets the value of the shSgId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShSgId() {
        return shSgId;
    }

    /**
     * Sets the value of the shSgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShSgId(BigDecimal value) {
        this.shSgId = value;
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
     * Gets the value of the rSubsAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSubsAlias() {
        return rSubsAlias;
    }

    /**
     * Sets the value of the rSubsAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSubsAlias(String value) {
        this.rSubsAlias = value;
    }

    /**
     * Gets the value of the sharedSsq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedSsq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedSsq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedSsq }
     * 
     * 
     */
    public List<SharedSsq> getSharedSsq() {
        if (sharedSsq == null) {
            sharedSsq = new ArrayList<SharedSsq>();
        }
        return this.sharedSsq;
    }

}