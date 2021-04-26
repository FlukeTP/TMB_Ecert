
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProdIntRateStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProdIntRateStatusCode_Type")
@XmlEnum
public enum ProdIntRateStatusCodeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ProdIntRateStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProdIntRateStatusCodeType fromValue(String v) {
        for (ProdIntRateStatusCodeType c: ProdIntRateStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
