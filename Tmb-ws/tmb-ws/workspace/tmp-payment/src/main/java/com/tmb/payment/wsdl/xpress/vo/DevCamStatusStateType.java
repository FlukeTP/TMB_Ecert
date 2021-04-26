
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCamStatusState_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevCamStatusState_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Inoperative"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevCamStatusState_Type")
@XmlEnum
public enum DevCamStatusStateType {

    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    OK("OK"),
    @XmlEnumValue("Inoperative")
    INOPERATIVE("Inoperative"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DevCamStatusStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevCamStatusStateType fromValue(String v) {
        for (DevCamStatusStateType c: DevCamStatusStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
