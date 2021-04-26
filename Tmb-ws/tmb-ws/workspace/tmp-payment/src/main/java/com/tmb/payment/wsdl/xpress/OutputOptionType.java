
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputOption_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputOption_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="JDBC"/&gt;
 *     &lt;enumeration value="CSV"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputOption_Type")
@XmlEnum
public enum OutputOptionType {

    JDBC,
    CSV,
    JSON;

    public String value() {
        return name();
    }

    public static OutputOptionType fromValue(String v) {
        return valueOf(v);
    }

}
