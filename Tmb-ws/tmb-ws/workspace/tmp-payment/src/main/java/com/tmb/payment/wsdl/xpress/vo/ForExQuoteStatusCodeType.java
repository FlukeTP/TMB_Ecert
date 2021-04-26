
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForExQuoteStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Pending "/&gt;
 *     &lt;enumeration value="Confirmed "/&gt;
 *     &lt;enumeration value="Expired "/&gt;
 *     &lt;enumeration value="Canceled "/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Indicative "/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForExQuoteStatusCode_Type")
@XmlEnum
public enum ForExQuoteStatusCodeType {

    @XmlEnumValue("Pending ")
    PENDING("Pending "),
    @XmlEnumValue("Confirmed ")
    CONFIRMED("Confirmed "),
    @XmlEnumValue("Expired ")
    EXPIRED("Expired "),
    @XmlEnumValue("Canceled ")
    CANCELED("Canceled "),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Indicative ")
    INDICATIVE("Indicative "),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    ForExQuoteStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForExQuoteStatusCodeType fromValue(String v) {
        for (ForExQuoteStatusCodeType c: ForExQuoteStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
