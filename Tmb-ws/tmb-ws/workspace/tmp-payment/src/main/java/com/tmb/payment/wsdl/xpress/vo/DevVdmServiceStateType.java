
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevVdmServiceState_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevVdmServiceState_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="EnterPending"/&gt;
 *     &lt;enumeration value="ExitPending"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevVdmServiceState_Type")
@XmlEnum
public enum DevVdmServiceStateType {

    @XmlEnumValue("EnterPending")
    ENTER_PENDING("EnterPending"),
    @XmlEnumValue("ExitPending")
    EXIT_PENDING("ExitPending"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    DevVdmServiceStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevVdmServiceStateType fromValue(String v) {
        for (DevVdmServiceStateType c: DevVdmServiceStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
