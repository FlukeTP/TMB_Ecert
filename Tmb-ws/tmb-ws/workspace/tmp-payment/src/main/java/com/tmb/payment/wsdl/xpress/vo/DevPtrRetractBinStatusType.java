
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrRetractBinStatus_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPtrRetractBinStatus_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPtrRetractBinStatus_Type")
@XmlEnum
public enum DevPtrRetractBinStatusType {

    OK("OK"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevPtrRetractBinStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPtrRetractBinStatusType fromValue(String v) {
        for (DevPtrRetractBinStatusType c: DevPtrRetractBinStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
