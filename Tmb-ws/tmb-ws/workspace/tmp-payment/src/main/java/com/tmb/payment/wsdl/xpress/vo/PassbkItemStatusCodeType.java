
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkItemStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassbkItemStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="NotPrinted"/&gt;
 *     &lt;enumeration value="Printed"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassbkItemStatusCode_Type")
@XmlEnum
public enum PassbkItemStatusCodeType {

    @XmlEnumValue("NotPrinted")
    NOT_PRINTED("NotPrinted"),
    @XmlEnumValue("Printed")
    PRINTED("Printed"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    PassbkItemStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassbkItemStatusCodeType fromValue(String v) {
        for (PassbkItemStatusCodeType c: PassbkItemStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
