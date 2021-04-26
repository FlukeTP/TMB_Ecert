
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCdmBinMedia_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevCdmBinMedia_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevCdmBinMedia_Type")
@XmlEnum
public enum DevCdmBinMediaType {

    OK("OK"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevCdmBinMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevCdmBinMediaType fromValue(String v) {
        for (DevCdmBinMediaType c: DevCdmBinMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
