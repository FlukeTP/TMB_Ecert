
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExDealStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForExDealStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Confirmed "/&gt;
 *     &lt;enumeration value="Expired "/&gt;
 *     &lt;enumeration value="Canceled "/&gt;
 *     &lt;enumeration value="Complete "/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForExDealStatusCode_Type")
@XmlEnum
public enum ForExDealStatusCodeType {

    @XmlEnumValue("Confirmed ")
    CONFIRMED("Confirmed "),
    @XmlEnumValue("Expired ")
    EXPIRED("Expired "),
    @XmlEnumValue("Canceled ")
    CANCELED("Canceled "),
    @XmlEnumValue("Complete ")
    COMPLETE("Complete "),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    ForExDealStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForExDealStatusCodeType fromValue(String v) {
        for (ForExDealStatusCodeType c: ForExDealStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
