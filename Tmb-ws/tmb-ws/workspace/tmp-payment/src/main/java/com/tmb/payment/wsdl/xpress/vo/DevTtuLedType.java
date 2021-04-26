
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevTtuLed_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevTtuLed_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="BlinkingSlowly"/&gt;
 *     &lt;enumeration value="MediumFlash"/&gt;
 *     &lt;enumeration value="QuickFlash"/&gt;
 *     &lt;enumeration value="Continuous"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevTtuLed_Type")
@XmlEnum
public enum DevTtuLedType {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("BlinkingSlowly")
    BLINKING_SLOWLY("BlinkingSlowly"),
    @XmlEnumValue("MediumFlash")
    MEDIUM_FLASH("MediumFlash"),
    @XmlEnumValue("QuickFlash")
    QUICK_FLASH("QuickFlash"),
    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    DevTtuLedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevTtuLedType fromValue(String v) {
        for (DevTtuLedType c: DevTtuLedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
