//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 06:01:22 PM MSK 
//


package com.bercut.service.wsdl.service_profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Elements used to identify subscriber
 * 
 * <p>Java class for UserIdentificators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificators"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}msisdn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}imsi" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}userId" minOccurs="0"/&gt;
 *         &lt;element name="extension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}invoiceUserId" minOccurs="0"/&gt;
 *                   &lt;element name="extension" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificators", namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", propOrder = {
    "msisdn",
    "imsi",
    "userId",
    "extension"
})
public class UserIdentificators {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String msisdn;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String imsi;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected Long userId;
    protected UserIdentificators.Extension extension;

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
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificators.Extension }
     *     
     */
    public UserIdentificators.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificators.Extension }
     *     
     */
    public void setExtension(UserIdentificators.Extension value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}invoiceUserId" minOccurs="0"/&gt;
     *         &lt;element name="extension" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invoiceUserId",
        "extension"
    })
    public static class Extension {

        @XmlElement(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition")
        protected InvoiceUserId invoiceUserId;
        @XmlElement(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition")
        protected Extension extension;

        /**
         * Gets the value of the invoiceUserId property.
         * 
         * @return
         *     possible object is
         *     {@link InvoiceUserId }
         *     
         */
        public InvoiceUserId getInvoiceUserId() {
            return invoiceUserId;
        }

        /**
         * Sets the value of the invoiceUserId property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvoiceUserId }
         *     
         */
        public void setInvoiceUserId(InvoiceUserId value) {
            this.invoiceUserId = value;
        }

        /**
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link Extension }
         *     
         */
        public Extension getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link Extension }
         *     
         */
        public void setExtension(Extension value) {
            this.extension = value;
        }

    }

}
