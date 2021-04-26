
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCimBinStatus_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevCimBinStatus_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *     &lt;enumeration value="Empty"/&gt;
 *     &lt;enumeration value="Inoperable"/&gt;
 *     &lt;enumeration value="Missing"/&gt;
 *     &lt;enumeration value="NotAvailable"/&gt;
 *     &lt;enumeration value="NoReference"/&gt;
 *     &lt;enumeration value="Manipulated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevCimBinStatus_Type")
@XmlEnum
public enum DevCimBinStatusType {

    OK("OK"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Inoperable")
    INOPERABLE("Inoperable"),
    @XmlEnumValue("Missing")
    MISSING("Missing"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("NoReference")
    NO_REFERENCE("NoReference"),
    @XmlEnumValue("Manipulated")
    MANIPULATED("Manipulated");
    private final String value;

    DevCimBinStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevCimBinStatusType fromValue(String v) {
        for (DevCimBinStatusType c: DevCimBinStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
