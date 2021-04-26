
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailyAccrual_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DailyAccrual_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Actual365"/&gt;
 *     &lt;enumeration value="Actual366"/&gt;
 *     &lt;enumeration value="Standard360"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DailyAccrual_Type")
@XmlEnum
public enum DailyAccrualType {

    @XmlEnumValue("Actual365")
    ACTUAL_365("Actual365"),
    @XmlEnumValue("Actual366")
    ACTUAL_366("Actual366"),
    @XmlEnumValue("Standard360")
    STANDARD_360("Standard360");
    private final String value;

    DailyAccrualType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DailyAccrualType fromValue(String v) {
        for (DailyAccrualType c: DailyAccrualType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
