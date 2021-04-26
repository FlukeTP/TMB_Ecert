
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuGreenLed_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevSiuGreenLed_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="On"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevSiuGreenLed_Type")
@XmlEnum
public enum DevSiuGreenLedType {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    DevSiuGreenLedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevSiuGreenLedType fromValue(String v) {
        for (DevSiuGreenLedType c: DevSiuGreenLedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
