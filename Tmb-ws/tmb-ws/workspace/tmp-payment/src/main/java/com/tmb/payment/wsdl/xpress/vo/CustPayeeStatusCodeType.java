
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPayeeStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustPayeeStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustPayeeStatusCode_Type")
@XmlEnum
public enum CustPayeeStatusCodeType {

    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    CustPayeeStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustPayeeStatusCodeType fromValue(String v) {
        for (CustPayeeStatusCodeType c: CustPayeeStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
