
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumRenditionKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumRenditionKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:thumbnail"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumRenditionKind", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumRenditionKind {

    @XmlEnumValue("cmis:thumbnail")
    CMIS_THUMBNAIL("cmis:thumbnail");
    private final String value;

    EnumRenditionKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumRenditionKind fromValue(String v) {
        for (EnumRenditionKind c: EnumRenditionKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
