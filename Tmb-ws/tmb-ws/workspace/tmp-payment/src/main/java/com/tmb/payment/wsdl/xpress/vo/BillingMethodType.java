
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingMethod_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingMethod_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="Institution"/&gt;
 *     &lt;enumeration value="Check printer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillingMethod_Type")
@XmlEnum
public enum BillingMethodType {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Institution")
    INSTITUTION("Institution"),
    @XmlEnumValue("Check printer")
    CHECK_PRINTER("Check printer");
    private final String value;

    BillingMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingMethodType fromValue(String v) {
        for (BillingMethodType c: BillingMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
