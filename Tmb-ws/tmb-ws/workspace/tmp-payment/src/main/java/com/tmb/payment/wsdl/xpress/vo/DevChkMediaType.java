
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevChkMedia_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DevChkMedia_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Jammed"/&gt;
 *     &lt;enumeration value="Present"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="NotPresent"/&gt;
 *     &lt;enumeration value="NotSupported"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DevChkMedia_Type")
@XmlEnum
public enum DevChkMediaType {

    @XmlEnumValue("Jammed")
    JAMMED("Jammed"),
    @XmlEnumValue("Present")
    PRESENT("Present"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("NotPresent")
    NOT_PRESENT("NotPresent"),
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported");
    private final String value;

    DevChkMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DevChkMediaType fromValue(String v) {
        for (DevChkMediaType c: DevChkMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
