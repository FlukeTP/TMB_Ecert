
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyCardRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCardRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelType"/&gt;
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
@XmlType(name = "PartyCardRelInfo_Type", propOrder = {
    "partyRef",
    "cardRef",
    "partyCardRelType",
    "nickname",
    "relEstablishDt",
    "cardPref"
})
public class PartyCardRelInfoType {

    @XmlElement(name = "PartyRef", required = true)
    protected PartyRefType partyRef;
    @XmlElement(name = "CardRef", required = true)
    protected CardRefType cardRef;
    @XmlElement(name = "PartyCardRelType", required = true)
    protected String partyCardRelType;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "RelEstablishDt")
    protected String relEstablishDt;
    @XmlElement(name = "CardPref")
    protected CardPrefType cardPref;

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

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
     * Gets the value of the partyCardRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCardRelType() {
        return partyCardRelType;
    }

    /**
     * Sets the value of the partyCardRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCardRelType(String value) {
        this.partyCardRelType = value;
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
