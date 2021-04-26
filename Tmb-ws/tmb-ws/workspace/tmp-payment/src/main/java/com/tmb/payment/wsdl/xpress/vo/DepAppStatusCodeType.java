
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAppStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepAppStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Feature Pending"/&gt;
 *     &lt;enumeration value="In Work"/&gt;
 *     &lt;enumeration value="Incomplete"/&gt;
 *     &lt;enumeration value="New customer Pending"/&gt;
 *     &lt;enumeration value="Post Failed"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Transmitting"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DepAppStatusCode_Type")
@XmlEnum
public enum DepAppStatusCodeType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Feature Pending")
    FEATURE_PENDING("Feature Pending"),
    @XmlEnumValue("In Work")
    IN_WORK("In Work"),
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("New customer Pending")
    NEW_CUSTOMER_PENDING("New customer Pending"),
    @XmlEnumValue("Post Failed")
    POST_FAILED("Post Failed"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Transmitting")
    TRANSMITTING("Transmitting"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    DepAppStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepAppStatusCodeType fromValue(String v) {
        for (DepAppStatusCodeType c: DepAppStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
