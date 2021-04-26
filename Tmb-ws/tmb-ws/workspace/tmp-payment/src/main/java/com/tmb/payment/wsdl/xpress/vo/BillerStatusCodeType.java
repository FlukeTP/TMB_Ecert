
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillerStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="AvailPend"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="DelPend"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillerStatusCode_Type")
@XmlEnum
public enum BillerStatusCodeType {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("AvailPend")
    AVAIL_PEND("AvailPend"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("DelPend")
    DEL_PEND("DelPend"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    BillerStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillerStatusCodeType fromValue(String v) {
        for (BillerStatusCodeType c: BillerStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
