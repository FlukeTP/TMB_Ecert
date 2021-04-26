
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAcctRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctRelEnvr" minOccurs="0"/&gt;
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
@XmlType(name = "CardAcctRelRec_Type", propOrder = {
    "cardAcctRelId",
    "cardAcctRelInfo",
    "cardAcctRelAuth",
    "cardAcctRelEnvr",
    "cardAcctRelStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CardAcctRelRecType.class
})
public class CardAcctRelRecType {

    @XmlElement(name = "CardAcctRelId", required = true)
    protected String cardAcctRelId;
    @XmlElement(name = "CardAcctRelInfo", required = true)
    protected CardAcctRelInfoType cardAcctRelInfo;
    @XmlElement(name = "CardAcctRelAuth")
    protected CardAcctRelAuthType cardAcctRelAuth;
    @XmlElement(name = "CardAcctRelEnvr")
    protected CardAcctRelEnvrType cardAcctRelEnvr;
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

    /**
     * Gets the value of the cardAcctRelAuth property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctRelAuthType }
     *     
     */
    public CardAcctRelAuthType getCardAcctRelAuth() {
        return cardAcctRelAuth;
    }

    /**
     * Sets the value of the cardAcctRelAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctRelAuthType }
     *     
     */
    public void setCardAcctRelAuth(CardAcctRelAuthType value) {
        this.cardAcctRelAuth = value;
    }

    /**
     * Gets the value of the cardAcctRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctRelEnvrType }
     *     
     */
    public CardAcctRelEnvrType getCardAcctRelEnvr() {
        return cardAcctRelEnvr;
    }

    /**
     * Sets the value of the cardAcctRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctRelEnvrType }
     *     
     */
    public void setCardAcctRelEnvr(CardAcctRelEnvrType value) {
        this.cardAcctRelEnvr = value;
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
