
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrToner_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPtrToner_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Out"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPtrToner_Type")
@XmlEnum
public enum DevPtrTonerType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Out")
    OUT("Out"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevPtrTonerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPtrTonerType fromValue(String v) {
        for (DevPtrTonerType c: DevPtrTonerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
