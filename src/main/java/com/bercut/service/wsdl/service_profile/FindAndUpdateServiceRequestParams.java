//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 06:01:22 PM MSK 
//


package com.bercut.service.wsdl.service_profile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Service find and modification request. Can contain data and service description 
 * 
 * <p>Java class for FindAndUpdateServiceRequestParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindAndUpdateServiceRequestParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}branchId"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}serviceIds"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}serviceStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}tag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/dsi/ServiceProfile}queryServiceParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.bercut.com/spec/dsi/ServiceProfile}timeTag" minOccurs="0"/&gt;
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
@XmlType(name = "FindAndUpdateServiceRequestParams", propOrder = {
    "branchId",
    "serviceIds",
    "serviceStatus",
    "tag",
    "queryServiceParameter",
    "timeTag",
    "extension"
})
public class FindAndUpdateServiceRequestParams {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected long branchId;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", required = true)
    protected ServiceIds serviceIds;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "string")
    protected ServiceStatus serviceStatus;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String tag;
    protected List<QueryServiceParameter> queryServiceParameter;
    protected TimeAndTagCriteria timeTag;
    protected FindAndUpdateServiceRequestParams.Extension extension;

    /**
     * Gets the value of the branchId property.
     * 
     */
    public long getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     */
    public void setBranchId(long value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the serviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIds }
     *     
     */
    public ServiceIds getServiceIds() {
        return serviceIds;
    }

    /**
     * Sets the value of the serviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIds }
     *     
     */
    public void setServiceIds(ServiceIds value) {
        this.serviceIds = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the queryServiceParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryServiceParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryServiceParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryServiceParameter }
     * 
     * 
     */
    public List<QueryServiceParameter> getQueryServiceParameter() {
        if (queryServiceParameter == null) {
            queryServiceParameter = new ArrayList<QueryServiceParameter>();
        }
        return this.queryServiceParameter;
    }

    /**
     * Gets the value of the timeTag property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAndTagCriteria }
     *     
     */
    public TimeAndTagCriteria getTimeTag() {
        return timeTag;
    }

    /**
     * Sets the value of the timeTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAndTagCriteria }
     *     
     */
    public void setTimeTag(TimeAndTagCriteria value) {
        this.timeTag = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FindAndUpdateServiceRequestParams.Extension }
     *     
     */
    public FindAndUpdateServiceRequestParams.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindAndUpdateServiceRequestParams.Extension }
     *     
     */
    public void setExtension(FindAndUpdateServiceRequestParams.Extension value) {
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
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
