
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAcctRelStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctRelStatusRec_Type", propOrder = {
    "cardAcctRelId",
    "cardAcctRelStatus"
})
public class CardAcctRelStatusRecType {

    @XmlElement(name = "CardAcctRelId", required = true)
    protected String cardAcctRelId;
    @XmlElement(name = "CardAcctRelStatus", required = true)
    protected CardAcctRelStatusType cardAcctRelStatus;

    /**
     * Gets the value of the cardAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcctRelId() {
        return cardAcctRelId;
    }

    /**
     * Sets the value of the cardAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcctRelId(String value) {
        this.cardAcctRelId = value;
    }

    /**
     * Gets the value of the cardAcctRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctRelStatusType }
     *     
     */
    public CardAcctRelStatusType getCardAcctRelStatus() {
        return cardAcctRelStatus;
    }

    /**
     * Sets the value of the cardAcctRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctRelStatusType }
     *     
     */
    public void setCardAcctRelStatus(CardAcctRelStatusType value) {
        this.cardAcctRelStatus = value;
    }

}
