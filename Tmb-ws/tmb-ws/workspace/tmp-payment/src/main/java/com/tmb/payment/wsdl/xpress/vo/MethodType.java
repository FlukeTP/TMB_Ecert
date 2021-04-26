
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Method_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Method_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Mod"/&gt;
 *     &lt;enumeration value="Del"/&gt;
 *     &lt;enumeration value="Can"/&gt;
 *     &lt;enumeration value="Advise"/&gt;
 *     &lt;enumeration value="StatusMod"/&gt;
 *     &lt;enumeration value="AuthMod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Method_Type")
@XmlEnum
public enum MethodType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Mod")
    MOD("Mod"),
    @XmlEnumValue("Del")
    DEL("Del"),
    @XmlEnumValue("Can")
    CAN("Can"),
    @XmlEnumValue("Advise")
    ADVISE("Advise"),
    @XmlEnumValue("StatusMod")
    STATUS_MOD("StatusMod"),
    @XmlEnumValue("AuthMod")
    AUTH_MOD("AuthMod");
    private final String value;

    MethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodType fromValue(String v) {
        for (MethodType c: MethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
