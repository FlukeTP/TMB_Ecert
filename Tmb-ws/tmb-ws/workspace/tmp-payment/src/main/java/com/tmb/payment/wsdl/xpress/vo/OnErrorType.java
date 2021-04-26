
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnError_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnError_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Continue "/&gt;
 *     &lt;enumeration value="Abort "/&gt;
 *     &lt;enumeration value="ReverseProcessed "/&gt;
 *     &lt;enumeration value="ReverseAll "/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnError_Type")
@XmlEnum
public enum OnErrorType {

    @XmlEnumValue("Continue ")
    CONTINUE("Continue "),
    @XmlEnumValue("Abort ")
    ABORT("Abort "),
    @XmlEnumValue("ReverseProcessed ")
    REVERSE_PROCESSED("ReverseProcessed "),
    @XmlEnumValue("ReverseAll ")
    REVERSE_ALL("ReverseAll ");
    private final String value;

    OnErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnErrorType fromValue(String v) {
        for (OnErrorType c: OnErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
