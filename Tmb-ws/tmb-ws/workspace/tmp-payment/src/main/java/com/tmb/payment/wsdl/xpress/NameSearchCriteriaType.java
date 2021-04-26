
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameSearchCriteria_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSearchCriteria_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="PARTIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameSearchCriteria_Type")
@XmlEnum
public enum NameSearchCriteriaType {

    FULL,
    PARTIAL;

    public String value() {
        return name();
    }

    public static NameSearchCriteriaType fromValue(String v) {
        return valueOf(v);
    }

}
