
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStmtStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcctStmtStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="valid"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcctStmtStatusCode_Type")
@XmlEnum
public enum AcctStmtStatusCodeType {

    @XmlEnumValue("valid")
    VALID("valid"),
    @XmlEnumValue("deleted")
    DELETED("deleted");
    private final String value;

    AcctStmtStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcctStmtStatusCodeType fromValue(String v) {
        for (AcctStmtStatusCodeType c: AcctStmtStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
