
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemitStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Posted"/&gt;
 *     &lt;enumeration value="Refused"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Returned"/&gt;
 *     &lt;enumeration value="DelPend"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RemitStatusCode_Type")
@XmlEnum
public enum RemitStatusCodeType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("Refused")
    REFUSED("Refused"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Returned")
    RETURNED("Returned"),
    @XmlEnumValue("DelPend")
    DEL_PEND("DelPend"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    RemitStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemitStatusCodeType fromValue(String v) {
        for (RemitStatusCodeType c: RemitStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
