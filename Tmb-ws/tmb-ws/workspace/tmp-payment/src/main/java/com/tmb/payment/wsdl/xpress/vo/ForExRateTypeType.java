
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForExRateType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Commited"/&gt;
 *     &lt;enumeration value="Indicated"/&gt;
 *     &lt;enumeration value="Spot"/&gt;
 *     &lt;enumeration value="Future"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForExRateType_Type")
@XmlEnum
public enum ForExRateTypeType {

    @XmlEnumValue("Commited")
    COMMITED("Commited"),
    @XmlEnumValue("Indicated")
    INDICATED("Indicated"),
    @XmlEnumValue("Spot")
    SPOT("Spot"),
    @XmlEnumValue("Future")
    FUTURE("Future");
    private final String value;

    ForExRateTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForExRateTypeType fromValue(String v) {
        for (ForExRateTypeType c: ForExRateTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
