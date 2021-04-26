
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExValDtType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForExValDtType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Cash"/&gt;
 *     &lt;enumeration value="Tomorrow"/&gt;
 *     &lt;enumeration value="Spot"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *     &lt;enumeration value="Window"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForExValDtType_Type")
@XmlEnum
public enum ForExValDtTypeType {

    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Tomorrow")
    TOMORROW("Tomorrow"),
    @XmlEnumValue("Spot")
    SPOT("Spot"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Window")
    WINDOW("Window");
    private final String value;

    ForExValDtTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForExValDtTypeType fromValue(String v) {
        for (ForExValDtTypeType c: ForExValDtTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
