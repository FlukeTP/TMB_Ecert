
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAcctRelRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctRelRef_Type", propOrder = {
    "cardAcctRelKeys",
    "cardAcctRelRec",
    "cardAcctRelInfo"
})
public class CardAcctRelRefType {

    @XmlElement(name = "CardAcctRelKeys")
    protected CardAcctRelKeysType cardAcctRelKeys;
    @XmlElementRef(name = "CardAcctRelRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType> cardAcctRelRec;
    @XmlElement(name = "CardAcctRelInfo")
    protected CardAcctRelInfoType cardAcctRelInfo;

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

    /**
     * Gets the value of the cardAcctRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardAcctRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType> getCardAcctRelRec() {
        return cardAcctRelRec;
    }

    /**
     * Sets the value of the cardAcctRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardAcctRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType }{@code >}
     *     
     */
    public void setCardAcctRelRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardAcctRelRecType> value) {
        this.cardAcctRelRec = value;
    }

    /**
     * Gets the value of the cardAcctRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctRelInfoType }
     *     
     */
    public CardAcctRelInfoType getCardAcctRelInfo() {
        return cardAcctRelInfo;
    }

    /**
     * Sets the value of the cardAcctRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctRelInfoType }
     *     
     */
    public void setCardAcctRelInfo(CardAcctRelInfoType value) {
        this.cardAcctRelInfo = value;
    }

}
