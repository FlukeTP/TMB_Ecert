
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnImgStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcctTrnImgStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="valid"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcctTrnImgStatusCode_Type")
@XmlEnum
public enum AcctTrnImgStatusCodeType {

    @XmlEnumValue("valid")
    VALID("valid"),
    @XmlEnumValue("deleted")
    DELETED("deleted");
    private final String value;

    AcctTrnImgStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcctTrnImgStatusCodeType fromValue(String v) {
        for (AcctTrnImgStatusCodeType c: AcctTrnImgStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
