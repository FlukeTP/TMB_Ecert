
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateChangeFreq_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateChangeFreq_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="EndOfMonth"/&gt;
 *     &lt;enumeration value="EndOfQtr"/&gt;
 *     &lt;enumeration value="EndOfYear"/&gt;
 *     &lt;enumeration value="IssuedAnnually"/&gt;
 *     &lt;enumeration value="IssuedMonthly"/&gt;
 *     &lt;enumeration value="IssuedQtrly"/&gt;
 *     &lt;enumeration value="IssuedSemiAnly"/&gt;
 *     &lt;enumeration value="Never"/&gt;
 *     &lt;enumeration value="OnRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateChangeFreq_Type")
@XmlEnum
public enum RateChangeFreqType {

    @XmlEnumValue("EndOfMonth")
    END_OF_MONTH("EndOfMonth"),
    @XmlEnumValue("EndOfQtr")
    END_OF_QTR("EndOfQtr"),
    @XmlEnumValue("EndOfYear")
    END_OF_YEAR("EndOfYear"),
    @XmlEnumValue("IssuedAnnually")
    ISSUED_ANNUALLY("IssuedAnnually"),
    @XmlEnumValue("IssuedMonthly")
    ISSUED_MONTHLY("IssuedMonthly"),
    @XmlEnumValue("IssuedQtrly")
    ISSUED_QTRLY("IssuedQtrly"),
    @XmlEnumValue("IssuedSemiAnly")
    ISSUED_SEMI_ANLY("IssuedSemiAnly"),
    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest");
    private final String value;

    RateChangeFreqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateChangeFreqType fromValue(String v) {
        for (RateChangeFreqType c: RateChangeFreqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
