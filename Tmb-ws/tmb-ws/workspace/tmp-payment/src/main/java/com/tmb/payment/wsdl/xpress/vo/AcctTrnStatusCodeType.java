
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcctTrnStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="valid"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcctTrnStatusCode_Type")
@XmlEnum
public enum AcctTrnStatusCodeType {

    @XmlEnumValue("valid")
    VALID("valid"),
    @XmlEnumValue("deleted")
    DELETED("deleted");
    private final String value;

    AcctTrnStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcctTrnStatusCodeType fromValue(String v) {
        for (AcctTrnStatusCodeType c: AcctTrnStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
