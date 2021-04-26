
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrnTypes_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrnTypes_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="WIRE_TRANSFER"/&gt;
 *     &lt;enumeration value="NEGOTIABLE_INSTR_PURCHASED"/&gt;
 *     &lt;enumeration value="NEGOTIABLE_INSTR_CASHED"/&gt;
 *     &lt;enumeration value="DEPOSIT_WITHDRAW"/&gt;
 *     &lt;enumeration value="CURRENCY_EXCHANGE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrnTypes_Type")
@XmlEnum
public enum TrnTypesType {

    WIRE_TRANSFER,
    NEGOTIABLE_INSTR_PURCHASED,
    NEGOTIABLE_INSTR_CASHED,
    DEPOSIT_WITHDRAW,
    CURRENCY_EXCHANGE,
    OTHER;

    public String value() {
        return name();
    }

    public static TrnTypesType fromValue(String v) {
        return valueOf(v);
    }

}
