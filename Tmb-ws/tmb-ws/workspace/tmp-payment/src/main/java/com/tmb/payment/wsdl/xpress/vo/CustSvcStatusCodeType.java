
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSvcStatusCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustSvcStatusCode_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="EnablePend"/&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="DisablePend"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="valid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustSvcStatusCode_Type")
@XmlEnum
public enum CustSvcStatusCodeType {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("EnablePend")
    ENABLE_PEND("EnablePend"),
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("DisablePend")
    DISABLE_PEND("DisablePend"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("valid")
    VALID("valid");
    private final String value;

    CustSvcStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustSvcStatusCodeType fromValue(String v) {
        for (CustSvcStatusCodeType c: CustSvcStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
