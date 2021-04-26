
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrLamp_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPtrLamp_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Fading"/&gt;
 *     &lt;enumeration value="Inoperative"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPtrLamp_Type")
@XmlEnum
public enum DevPtrLampType {

    OK("OK"),
    @XmlEnumValue("Fading")
    FADING("Fading"),
    @XmlEnumValue("Inoperative")
    INOPERATIVE("Inoperative"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevPtrLampType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPtrLampType fromValue(String v) {
        for (DevPtrLampType c: DevPtrLampType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
