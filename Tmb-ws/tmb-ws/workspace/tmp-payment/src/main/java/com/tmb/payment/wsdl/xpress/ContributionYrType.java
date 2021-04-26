
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContributionYr_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContributionYr_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Current"/&gt;
 *     &lt;enumeration value="Previous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContributionYr_Type")
@XmlEnum
public enum ContributionYrType {

    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Previous")
    PREVIOUS("Previous");
    private final String value;

    ContributionYrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContributionYrType fromValue(String v) {
        for (ContributionYrType c: ContributionYrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
