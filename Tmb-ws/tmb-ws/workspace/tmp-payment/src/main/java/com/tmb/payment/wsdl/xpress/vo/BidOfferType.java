
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidOffer_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidOffer_Type"&gt;
 *   &lt;restriction base="{urn:ifxforum-org:XSD:1}ClosedEnum_Type"&gt;
 *     &lt;enumeration value="Bid"/&gt;
 *     &lt;enumeration value="Offer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BidOffer_Type")
@XmlEnum
public enum BidOfferType {

    @XmlEnumValue("Bid")
    BID("Bid"),
    @XmlEnumValue("Offer")
    OFFER("Offer");
    private final String value;

    BidOfferType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidOfferType fromValue(String v) {
        for (BidOfferType c: BidOfferType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
