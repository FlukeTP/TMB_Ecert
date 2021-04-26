
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPayeeStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StdPayeeStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StdPayeeStatusCode_Type")
@XmlEnum
public enum StdPayeeStatusCodeType {

    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    StdPayeeStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StdPayeeStatusCodeType fromValue(String v) {
        for (StdPayeeStatusCodeType c: StdPayeeStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
