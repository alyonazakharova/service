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
 * Данные записи журнала переноса трафика
 * 
 * <p>Java class for DiscountTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountTransfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bercut.com/schema/commonInVoiceAPI}DiscountTransferBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}mathDtdName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}causeDtdName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}statDtdName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}creDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}updDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}sendDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}sendCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/schema/commonInVoiceAPI}sendUserId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountTransfer", propOrder = {
    "mathDtdName",
    "causeDtdName",
    "statDtdName",
    "creDate",
    "updDate",
    "sendDate",
    "sendCount",
    "sendUserId"
})
public class DiscountTransfer
    extends DiscountTransferBasic
{

    protected String mathDtdName;
    protected String causeDtdName;
    protected String statDtdName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    protected BigDecimal sendCount;
    protected BigDecimal sendUserId;

    /**
     * Gets the value of the mathDtdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMathDtdName() {
        return mathDtdName;
    }

    /**
     * Sets the value of the mathDtdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMathDtdName(String value) {
        this.mathDtdName = value;
    }

    /**
     * Gets the value of the causeDtdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseDtdName() {
        return causeDtdName;
    }

    /**
     * Sets the value of the causeDtdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseDtdName(String value) {
        this.causeDtdName = value;
    }

    /**
     * Gets the value of the statDtdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatDtdName() {
        return statDtdName;
    }

    /**
     * Sets the value of the statDtdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatDtdName(String value) {
        this.statDtdName = value;
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

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the sendCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSendCount() {
        return sendCount;
    }

    /**
     * Sets the value of the sendCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSendCount(BigDecimal value) {
        this.sendCount = value;
    }

    /**
     * Gets the value of the sendUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSendUserId() {
        return sendUserId;
    }

    /**
     * Sets the value of the sendUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSendUserId(BigDecimal value) {
        this.sendUserId = value;
    }

}
