
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevIdcSecurity_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevIdcSecurity_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *     &lt;enumeration value="NotReady"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevIdcSecurity_Type")
@XmlEnum
public enum DevIdcSecurityType {

    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),
    @XmlEnumValue("NotReady")
    NOT_READY("NotReady"),
    @XmlEnumValue("Open")
    OPEN("Open");
    private final String value;

    DevIdcSecurityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevIdcSecurityType fromValue(String v) {
        for (DevIdcSecurityType c: DevIdcSecurityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
