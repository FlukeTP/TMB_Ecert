
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenominationType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DenominationType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="COIN"/&gt;
 *     &lt;enumeration value="NOTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenominationType_Type")
@XmlEnum
public enum DenominationTypeType {

    COIN,
    NOTE;

    public String value() {
        return name();
    }

    public static DenominationTypeType fromValue(String v) {
        return valueOf(v);
    }

}
