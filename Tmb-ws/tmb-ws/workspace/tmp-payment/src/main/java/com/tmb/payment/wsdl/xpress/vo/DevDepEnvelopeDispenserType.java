
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDepEnvelopeDispenser_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevDepEnvelopeDispenser_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Inoperable"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevDepEnvelopeDispenser_Type")
@XmlEnum
public enum DevDepEnvelopeDispenserType {

    OK("OK"),
    @XmlEnumValue("Inoperable")
    INOPERABLE("Inoperable"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevDepEnvelopeDispenserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevDepEnvelopeDispenserType fromValue(String v) {
        for (DevDepEnvelopeDispenserType c: DevDepEnvelopeDispenserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
