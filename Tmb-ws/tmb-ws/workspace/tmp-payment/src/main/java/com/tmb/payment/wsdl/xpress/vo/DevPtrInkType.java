
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrInk_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPtrInk_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Out"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPtrInk_Type")
@XmlEnum
public enum DevPtrInkType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Out")
    OUT("Out"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevPtrInkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPtrInkType fromValue(String v) {
        for (DevPtrInkType c: DevPtrInkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
