
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPINEncStat_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevPINEncStat_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="NotReady"/&gt;
 *     &lt;enumeration value="NotInitialized"/&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Initialized"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevPINEncStat_Type")
@XmlEnum
public enum DevPINEncStatType {

    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("NotReady")
    NOT_READY("NotReady"),
    @XmlEnumValue("NotInitialized")
    NOT_INITIALIZED("NotInitialized"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Initialized")
    INITIALIZED("Initialized");
    private final String value;

    DevPINEncStatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevPINEncStatType fromValue(String v) {
        for (DevPINEncStatType c: DevPINEncStatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
