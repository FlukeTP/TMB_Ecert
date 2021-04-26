
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtInstType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PmtInstType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="CheckAcct"/&gt;
 *     &lt;enumeration value="CreditCard"/&gt;
 *     &lt;enumeration value="ElectronicCash"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PmtInstType_Type")
@XmlEnum
public enum PmtInstTypeType {

    @XmlEnumValue("CheckAcct")
    CHECK_ACCT("CheckAcct"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("ElectronicCash")
    ELECTRONIC_CASH("ElectronicCash");
    private final String value;

    PmtInstTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PmtInstTypeType fromValue(String v) {
        for (PmtInstTypeType c: PmtInstTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
