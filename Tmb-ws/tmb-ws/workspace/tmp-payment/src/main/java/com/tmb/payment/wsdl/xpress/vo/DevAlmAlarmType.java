
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevAlmAlarm_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevAlmAlarm_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Reset"/&gt;
 *     &lt;enumeration value="Set"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevAlmAlarm_Type")
@XmlEnum
public enum DevAlmAlarmType {

    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("Set")
    SET("Set"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevAlmAlarmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevAlmAlarmType fromValue(String v) {
        for (DevAlmAlarmType c: DevAlmAlarmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
