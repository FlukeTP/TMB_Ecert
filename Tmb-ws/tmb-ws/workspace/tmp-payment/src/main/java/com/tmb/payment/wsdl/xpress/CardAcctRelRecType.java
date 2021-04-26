
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CardAcctRelKeysType;


/**
 * <p>Java class for CardAcctRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CardAcctRelRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelKeys"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctRelRec_Type", propOrder = {
    "cardAcctRelKeys"
})
public class CardAcctRelRecType
    extends com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType
{

    @XmlElement(name = "CardAcctRelKeys", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected CardAcctRelKeysType cardAcctRelKeys;

    /**
     * Gets the value of the cardAcctRelKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctRelKeysType }
     *     
     */
    public CardAcctRelKeysType getCardAcctRelKeys() {
        return cardAcctRelKeys;
    }

    /**
     * Sets the value of the cardAcctRelKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctRelKeysType }
     *     
     */
    public void setCardAcctRelKeys(CardAcctRelKeysType value) {
        this.cardAcctRelKeys = value;
    }

}
