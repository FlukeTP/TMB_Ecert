
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Healthy"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="Fatal"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Suspend"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevStatusCode_Type")
@XmlEnum
public enum DevStatusCodeType {

    @XmlEnumValue("Healthy")
    HEALTHY("Healthy"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Fatal")
    FATAL("Fatal"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Suspend")
    SUSPEND("Suspend"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    DevStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevStatusCodeType fromValue(String v) {
        for (DevStatusCodeType c: DevStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
