//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.03 at 05:02:25 PM MSK 
//


package com.bercut.service.wsdl.rates_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Профиль абонента
 * 
 * <p>Java class for SubscriberProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Phone" type="{http://www.bercut.com/schema/commonInVoiceAPI}Phone" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberInfo" type="{http://www.bercut.com/schema/commonInVoiceAPI}SubscriberInfo" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberHistory" type="{http://www.bercut.com/schema/commonInVoiceAPI}SubscriberHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClientInfo" type="{http://www.bercut.com/schema/commonInVoiceAPI}ClientInfo" minOccurs="0"/&gt;
 *         &lt;element name="ClientHistory" type="{http://www.bercut.com/schema/commonInVoiceAPI}ClientHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Part" type="{http://www.bercut.com/schema/commonInVoiceAPI}Part" minOccurs="0"/&gt;
 *         &lt;element name="OptionalData" type="{http://www.bercut.com/schema/commonInVoiceAPI}OptionalData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubsInfoHistory" type="{http://www.bercut.com/schema/commonInVoiceAPI}SubsInfoHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.bercut.com/schema/commonInVoiceAPI}AddressIPRecord" minOccurs="0"/&gt;
 *         &lt;element name="commentAttr" type="{http://www.bercut.com/schema/commonInVoiceAPI}CommentAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="clientName" type="{http://www.bercut.com/schema/commonInVoiceAPI}ClientName" minOccurs="0"/&gt;
 *         &lt;element name="subscriberName" type="{http://www.bercut.com/schema/commonInVoiceAPI}SubscriberName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberProfile", propOrder = {
    "phone",
    "subscriberInfo",
    "subscriberHistory",
    "clientInfo",
    "clientHistory",
    "part",
    "optionalData",
    "subsInfoHistory",
    "ipAddress",
    "commentAttr",
    "clientName",
    "subscriberName"
})
public class SubscriberProfile {

    @XmlElement(name = "Phone")
    protected Phone phone;
    @XmlElement(name = "SubscriberInfo")
    protected SubscriberInfo subscriberInfo;
    @XmlElement(name = "SubscriberHistory")
    protected List<SubscriberHistory> subscriberHistory;
    @XmlElement(name = "ClientInfo")
    protected ClientInfo clientInfo;
    @XmlElement(name = "ClientHistory")
    protected List<ClientHistory> clientHistory;
    @XmlElement(name = "Part")
    protected Part part;
    @XmlElement(name = "OptionalData")
    protected List<OptionalData> optionalData;
    @XmlElement(name = "SubsInfoHistory")
    protected List<SubsInfoHistory> subsInfoHistory;
    @XmlElement(name = "IPAddress")
    protected AddressIPRecord ipAddress;
    protected List<CommentAttr> commentAttr;
    protected ClientName clientName;
    protected SubscriberName subscriberName;

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the subscriberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfo }
     *     
     */
    public SubscriberInfo getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the value of the subscriberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfo }
     *     
     */
    public void setSubscriberInfo(SubscriberInfo value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the subscriberHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberHistory }
     * 
     * 
     */
    public List<SubscriberHistory> getSubscriberHistory() {
        if (subscriberHistory == null) {
            subscriberHistory = new ArrayList<SubscriberHistory>();
        }
        return this.subscriberHistory;
    }

    /**
     * Gets the value of the clientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfo }
     *     
     */
    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    /**
     * Sets the value of the clientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfo }
     *     
     */
    public void setClientInfo(ClientInfo value) {
        this.clientInfo = value;
    }

    /**
     * Gets the value of the clientHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientHistory }
     * 
     * 
     */
    public List<ClientHistory> getClientHistory() {
        if (clientHistory == null) {
            clientHistory = new ArrayList<ClientHistory>();
        }
        return this.clientHistory;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link Part }
     *     
     */
    public Part getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link Part }
     *     
     */
    public void setPart(Part value) {
        this.part = value;
    }

    /**
     * Gets the value of the optionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalData }
     * 
     * 
     */
    public List<OptionalData> getOptionalData() {
        if (optionalData == null) {
            optionalData = new ArrayList<OptionalData>();
        }
        return this.optionalData;
    }

    /**
     * Gets the value of the subsInfoHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsInfoHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsInfoHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsInfoHistory }
     * 
     * 
     */
    public List<SubsInfoHistory> getSubsInfoHistory() {
        if (subsInfoHistory == null) {
            subsInfoHistory = new ArrayList<SubsInfoHistory>();
        }
        return this.subsInfoHistory;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressIPRecord }
     *     
     */
    public AddressIPRecord getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressIPRecord }
     *     
     */
    public void setIPAddress(AddressIPRecord value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the commentAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommentAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentAttr }
     * 
     * 
     */
    public List<CommentAttr> getCommentAttr() {
        if (commentAttr == null) {
            commentAttr = new ArrayList<CommentAttr>();
        }
        return this.commentAttr;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link ClientName }
     *     
     */
    public ClientName getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientName }
     *     
     */
    public void setClientName(ClientName value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the subscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberName }
     *     
     */
    public SubscriberName getSubscriberName() {
        return subscriberName;
    }

    /**
     * Sets the value of the subscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberName }
     *     
     */
    public void setSubscriberName(SubscriberName value) {
        this.subscriberName = value;
    }

}
