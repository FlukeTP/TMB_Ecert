
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDepEnvelopeSupply_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevDepEnvelopeSupply_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *     &lt;enumeration value="Inoperable"/&gt;
 *     &lt;enumeration value="Unlocked"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevDepEnvelopeSupply_Type")
@XmlEnum
public enum DevDepEnvelopeSupplyType {

    OK("OK"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Inoperable")
    INOPERABLE("Inoperable"),
    @XmlEnumValue("Unlocked")
    UNLOCKED("Unlocked"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevDepEnvelopeSupplyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevDepEnvelopeSupplyType fromValue(String v) {
        for (DevDepEnvelopeSupplyType c: DevDepEnvelopeSupplyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
