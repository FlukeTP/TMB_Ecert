
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAcctRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAcctRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardAcctPriority"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RelEstablishDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardPref" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcctRelInfo_Type", propOrder = {
    "cardRef",
    "acctRef",
    "cardAcctPriority",
    "nickname",
    "relEstablishDt",
    "cardPref"
})
public class CardAcctRelInfoType {

    @XmlElement(name = "CardRef", required = true)
    protected CardRefType cardRef;
    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "CardAcctPriority")
    protected long cardAcctPriority;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "RelEstablishDt")
    protected String relEstablishDt;
    @XmlElement(name = "CardPref")
    protected CardPrefType cardPref;

    /**
     * Gets the value of the cardRef property.
     * 
     * @return
     *     possible object is
     *     {@link CardRefType }
     *     
     */
    public CardRefType getCardRef() {
        return cardRef;
    }

    /**
     * Sets the value of the cardRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRefType }
     *     
     */
    public void setCardRef(CardRefType value) {
        this.cardRef = value;
    }

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the cardAcctPriority property.
     * 
     */
    public long getCardAcctPriority() {
        return cardAcctPriority;
    }

    /**
     * Sets the value of the cardAcctPriority property.
     * 
     */
    public void setCardAcctPriority(long value) {
        this.cardAcctPriority = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the relEstablishDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelEstablishDt() {
        return relEstablishDt;
    }

    /**
     * Sets the value of the relEstablishDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelEstablishDt(String value) {
        this.relEstablishDt = value;
    }

    /**
     * Gets the value of the cardPref property.
     * 
     * @return
     *     possible object is
     *     {@link CardPrefType }
     *     
     */
    public CardPrefType getCardPref() {
        return cardPref;
    }

    /**
     * Sets the value of the cardPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPrefType }
     *     
     */
    public void setCardPref(CardPrefType value) {
        this.cardPref = value;
    }

}
