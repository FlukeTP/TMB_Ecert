
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrnKeyType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrnKeyType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="EJ"/&gt;
 *     &lt;enumeration value="BRANCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrnKeyType_Type")
@XmlEnum
public enum TrnKeyTypeType {

    EJ,
    BRANCH;

    public String value() {
        return name();
    }

    public static TrnKeyTypeType fromValue(String v) {
        return valueOf(v);
    }

}
