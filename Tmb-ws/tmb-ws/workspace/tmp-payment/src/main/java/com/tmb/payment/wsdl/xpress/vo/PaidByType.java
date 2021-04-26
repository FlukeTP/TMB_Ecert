
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaidBy_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaidBy_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Party"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaidBy_Type")
@XmlEnum
public enum PaidByType {

    @XmlEnumValue("Party")
    PARTY("Party"),
    FI("FI");
    private final String value;

    PaidByType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidByType fromValue(String v) {
        for (PaidByType c: PaidByType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
