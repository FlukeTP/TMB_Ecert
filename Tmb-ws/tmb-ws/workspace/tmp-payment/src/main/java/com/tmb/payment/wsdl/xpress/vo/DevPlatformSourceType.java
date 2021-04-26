
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPlatformSource_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPlatformSource_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Native"/&gt;
 *     &lt;enumeration value="Interpreted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPlatformSource_Type")
@XmlEnum
public enum DevPlatformSourceType {

    @XmlEnumValue("Native")
    NATIVE("Native"),
    @XmlEnumValue("Interpreted")
    INTERPRETED("Interpreted");
    private final String value;

    DevPlatformSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPlatformSourceType fromValue(String v) {
        for (DevPlatformSourceType c: DevPlatformSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
