
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecObjStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecObjStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="OutofSync"/&gt;
 *     &lt;enumeration value="SuspectedResults"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="RolloverInitiated"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecObjStatusCode_Type")
@XmlEnum
public enum SecObjStatusCodeType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("OutofSync")
    OUTOF_SYNC("OutofSync"),
    @XmlEnumValue("SuspectedResults")
    SUSPECTED_RESULTS("SuspectedResults"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("RolloverInitiated")
    ROLLOVER_INITIATED("RolloverInitiated"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    SecObjStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecObjStatusCodeType fromValue(String v) {
        for (SecObjStatusCodeType c: SecObjStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
