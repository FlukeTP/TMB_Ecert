
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SrcTargetAcctCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrcTargetAcctCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Source"/&gt;
 *     &lt;enumeration value="Target"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SrcTargetAcctCode_Type")
@XmlEnum
public enum SrcTargetAcctCodeType {

    @XmlEnumValue("Source")
    SOURCE("Source"),
    @XmlEnumValue("Target")
    TARGET("Target");
    private final String value;

    SrcTargetAcctCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrcTargetAcctCodeType fromValue(String v) {
        for (SrcTargetAcctCodeType c: SrcTargetAcctCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
