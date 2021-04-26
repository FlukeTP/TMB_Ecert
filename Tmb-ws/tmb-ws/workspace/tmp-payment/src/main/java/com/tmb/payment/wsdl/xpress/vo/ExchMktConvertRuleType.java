
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchMktConvertRule_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchMktConvertRule_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="Indirect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchMktConvertRule_Type")
@XmlEnum
public enum ExchMktConvertRuleType {

    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Indirect")
    INDIRECT("Indirect");
    private final String value;

    ExchMktConvertRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchMktConvertRuleType fromValue(String v) {
        for (ExchMktConvertRuleType c: ExchMktConvertRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
