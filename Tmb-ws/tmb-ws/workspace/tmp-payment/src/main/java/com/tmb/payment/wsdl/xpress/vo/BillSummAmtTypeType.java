
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillSummAmtType_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillSummAmtType_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Payable"/&gt;
 *     &lt;enumeration value="Supplemental"/&gt;
 *     &lt;enumeration value="InfoOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BillSummAmtType_Type")
@XmlEnum
public enum BillSummAmtTypeType {

    @XmlEnumValue("Payable")
    PAYABLE("Payable"),
    @XmlEnumValue("Supplemental")
    SUPPLEMENTAL("Supplemental"),
    @XmlEnumValue("InfoOnly")
    INFO_ONLY("InfoOnly");
    private final String value;

    BillSummAmtTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillSummAmtTypeType fromValue(String v) {
        for (BillSummAmtTypeType c: BillSummAmtTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
