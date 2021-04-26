
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalSPObjStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TerminalSPObjStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="ServiceAvailable"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="ServiceUnavailable"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TerminalSPObjStatusCode_Type")
@XmlEnum
public enum TerminalSPObjStatusCodeType {

    @XmlEnumValue("ServiceAvailable")
    SERVICE_AVAILABLE("ServiceAvailable"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("ServiceUnavailable")
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    TerminalSPObjStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminalSPObjStatusCodeType fromValue(String v) {
        for (TerminalSPObjStatusCodeType c: TerminalSPObjStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
