
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevIdcRetainBin_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevIdcRetainBin_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevIdcRetainBin_Type")
@XmlEnum
public enum DevIdcRetainBinType {

    OK("OK"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevIdcRetainBinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevIdcRetainBinType fromValue(String v) {
        for (DevIdcRetainBinType c: DevIdcRetainBinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
