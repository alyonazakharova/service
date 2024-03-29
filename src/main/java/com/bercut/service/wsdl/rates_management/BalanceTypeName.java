//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.03 at 05:02:25 PM MSK 
//


package com.bercut.service.wsdl.rates_management;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceTypeName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BalanceTypeName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="main"/&gt;
 *     &lt;enumeration value="promo"/&gt;
 *     &lt;enumeration value="conditional"/&gt;
 *     &lt;enumeration value="additional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceTypeName")
@XmlEnum
public enum BalanceTypeName {


    /**
     * Основной
     * 
     */
    @XmlEnumValue("main")
    MAIN("main"),

    /**
     * Рекламный
     * 
     */
    @XmlEnumValue("promo")
    PROMO("promo"),

    /**
     * Сравнительный
     * 
     */
    @XmlEnumValue("conditional")
    CONDITIONAL("conditional"),

    /**
     * Дополнительный
     * 
     */
    @XmlEnumValue("additional")
    ADDITIONAL("additional");
    private final String value;

    BalanceTypeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BalanceTypeName fromValue(String v) {
        for (BalanceTypeName c: BalanceTypeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
