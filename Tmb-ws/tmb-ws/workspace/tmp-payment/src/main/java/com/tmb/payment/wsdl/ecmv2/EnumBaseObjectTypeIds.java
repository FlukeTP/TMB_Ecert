
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enumBaseObjectTypeIds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="enumBaseObjectTypeIds"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cmis:document"/&gt;
 *     &lt;enumeration value="cmis:folder"/&gt;
 *     &lt;enumeration value="cmis:relationship"/&gt;
 *     &lt;enumeration value="cmis:policy"/&gt;
 *     &lt;enumeration value="cmis:item"/&gt;
 *     &lt;enumeration value="cmis:secondary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumBaseObjectTypeIds", namespace = "http://docs.oasis-open.org/ns/cmis/core/200908/")
@XmlEnum
public enum EnumBaseObjectTypeIds {

    @XmlEnumValue("cmis:document")
    CMIS_DOCUMENT("cmis:document"),
    @XmlEnumValue("cmis:folder")
    CMIS_FOLDER("cmis:folder"),
    @XmlEnumValue("cmis:relationship")
    CMIS_RELATIONSHIP("cmis:relationship"),
    @XmlEnumValue("cmis:policy")
    CMIS_POLICY("cmis:policy"),
    @XmlEnumValue("cmis:item")
    CMIS_ITEM("cmis:item"),
    @XmlEnumValue("cmis:secondary")
    CMIS_SECONDARY("cmis:secondary");
    private final String value;

    EnumBaseObjectTypeIds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBaseObjectTypeIds fromValue(String v) {
        for (EnumBaseObjectTypeIds c: EnumBaseObjectTypeIds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
