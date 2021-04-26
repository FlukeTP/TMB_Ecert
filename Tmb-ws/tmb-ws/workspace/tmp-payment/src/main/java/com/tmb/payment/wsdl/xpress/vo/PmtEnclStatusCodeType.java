
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PmtEnclStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="AcceptedToVerify"/&gt;
 *     &lt;enumeration value="Verified"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PmtEnclStatusCode_Type")
@XmlEnum
public enum PmtEnclStatusCodeType {

    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("AcceptedToVerify")
    ACCEPTED_TO_VERIFY("AcceptedToVerify"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Held")
    HELD("Held"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    PmtEnclStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PmtEnclStatusCodeType fromValue(String v) {
        for (PmtEnclStatusCodeType c: PmtEnclStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
