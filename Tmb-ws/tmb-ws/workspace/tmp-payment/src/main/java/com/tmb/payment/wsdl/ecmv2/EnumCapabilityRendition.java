
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumCapabilityRendition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumCapabilityRendition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="read"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumCapabilityRendition", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumCapabilityRendition {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("read")
    READ("read");
    private final String value;

    EnumCapabilityRendition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCapabilityRendition fromValue(String v) {
        for (EnumCapabilityRendition c: EnumCapabilityRendition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
