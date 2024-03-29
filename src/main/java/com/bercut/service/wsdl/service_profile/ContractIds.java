//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.27 at 06:01:22 PM MSK 
//


package com.bercut.service.wsdl.service_profile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractIds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractIds"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="parameters"/&gt;
 *     &lt;enumeration value="header"/&gt;
 *     &lt;enumeration value="__unknown__"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContractIds", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum ContractIds {


    /**
     * Get all the service description (including the service header and its parameters)
     * 
     */
    @XmlEnumValue("all")
    ALL("all"),

    /**
     * Get only the service parameters
     * 
     */
    @XmlEnumValue("parameters")
    PARAMETERS("parameters"),

    /**
     * Get only the service header
     * 
     */
    @XmlEnumValue("header")
    HEADER("header"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    ContractIds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractIds fromValue(String v) {
        for (ContractIds c: ContractIds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
