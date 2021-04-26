
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchConvertRule_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchConvertRule_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="Indirect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchConvertRule_Type")
@XmlEnum
public enum ExchConvertRuleType {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Indirect")
    INDIRECT("Indirect");
    private final String value;

    ExchConvertRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchConvertRuleType fromValue(String v) {
        for (ExchConvertRuleType c: ExchConvertRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
