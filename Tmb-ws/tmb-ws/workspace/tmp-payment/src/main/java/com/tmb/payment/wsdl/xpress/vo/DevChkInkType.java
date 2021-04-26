
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevChkInk_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevChkInk_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Out"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevChkInk_Type")
@XmlEnum
public enum DevChkInkType {

    @XmlEnumValue("Out")
    OUT("Out"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevChkInkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevChkInkType fromValue(String v) {
        for (DevChkInkType c: DevChkInkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
