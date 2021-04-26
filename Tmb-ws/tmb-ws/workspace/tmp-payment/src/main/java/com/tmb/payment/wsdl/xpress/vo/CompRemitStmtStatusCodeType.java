
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompRemitStmtStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompRemitStmtStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Deposited"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompRemitStmtStatusCode_Type")
@XmlEnum
public enum CompRemitStmtStatusCodeType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Deposited")
    DEPOSITED("Deposited"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    CompRemitStmtStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompRemitStmtStatusCodeType fromValue(String v) {
        for (CompRemitStmtStatusCodeType c: CompRemitStmtStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
