
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumBasicPermissions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumBasicPermissions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:read"/&gt;
 *     &lt;enumeration value="cmis:write"/&gt;
 *     &lt;enumeration value="cmis:all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumBasicPermissions", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumBasicPermissions {

    @XmlEnumValue("cmis:read")
    CMIS_READ("cmis:read"),
    @XmlEnumValue("cmis:write")
    CMIS_WRITE("cmis:write"),
    @XmlEnumValue("cmis:all")
    CMIS_ALL("cmis:all");
    private final String value;

    EnumBasicPermissions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBasicPermissions fromValue(String v) {
        for (EnumBasicPermissions c: EnumBasicPermissions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
