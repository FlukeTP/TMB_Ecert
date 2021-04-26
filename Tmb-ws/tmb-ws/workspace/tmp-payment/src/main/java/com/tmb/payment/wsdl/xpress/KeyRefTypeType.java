
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyRef_Type_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeyRef_Type_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Parent"/&gt;
 *     &lt;enumeration value="Correction"/&gt;
 *     &lt;enumeration value="Reversal"/&gt;
 *     &lt;enumeration value="Child"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyRef_Type_Type")
@XmlEnum
public enum KeyRefTypeType {

    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Correction")
    CORRECTION("Correction"),
    @XmlEnumValue("Reversal")
    REVERSAL("Reversal"),
    @XmlEnumValue("Child")
    CHILD("Child");
    private final String value;

    KeyRefTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyRefTypeType fromValue(String v) {
        for (KeyRefTypeType c: KeyRefTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
