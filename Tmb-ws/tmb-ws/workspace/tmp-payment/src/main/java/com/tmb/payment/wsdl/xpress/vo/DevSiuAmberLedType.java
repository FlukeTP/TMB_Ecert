
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuAmberLed_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevSiuAmberLed_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="On"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevSiuAmberLed_Type")
@XmlEnum
public enum DevSiuAmberLedType {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    DevSiuAmberLedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevSiuAmberLedType fromValue(String v) {
        for (DevSiuAmberLedType c: DevSiuAmberLedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
