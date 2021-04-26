
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcAcctStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SvcAcctStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Activated"/&gt;
 *     &lt;enumeration value="ActivatePend"/&gt;
 *     &lt;enumeration value="Deactivated"/&gt;
 *     &lt;enumeration value="DeactivatePend"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SvcAcctStatusCode_Type")
@XmlEnum
public enum SvcAcctStatusCodeType {

    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),
    @XmlEnumValue("ActivatePend")
    ACTIVATE_PEND("ActivatePend"),
    @XmlEnumValue("Deactivated")
    DEACTIVATED("Deactivated"),
    @XmlEnumValue("DeactivatePend")
    DEACTIVATE_PEND("DeactivatePend"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    SvcAcctStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SvcAcctStatusCodeType fromValue(String v) {
        for (SvcAcctStatusCodeType c: SvcAcctStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
