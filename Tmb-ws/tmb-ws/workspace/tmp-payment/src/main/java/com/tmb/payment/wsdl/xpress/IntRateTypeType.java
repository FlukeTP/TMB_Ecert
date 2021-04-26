
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntRateType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntRateType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Adjustable"/&gt;
 *     &lt;enumeration value="Fixed"/&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="SplitFloat"/&gt;
 *     &lt;enumeration value="Base"/&gt;
 *     &lt;enumeration value="Tiered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntRateType_Type")
@XmlEnum
public enum IntRateTypeType {

    @XmlEnumValue("Adjustable")
    ADJUSTABLE("Adjustable"),
    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("SplitFloat")
    SPLIT_FLOAT("SplitFloat"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Tiered")
    TIERED("Tiered");
    private final String value;

    IntRateTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntRateTypeType fromValue(String v) {
        for (IntRateTypeType c: IntRateTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
