
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelStatusRec_Type", propOrder = {
    "partyPartyRelId",
    "partyPartyRelStatus"
})
public class PartyPartyRelStatusRecType {

    @XmlElement(name = "PartyPartyRelId", required = true)
    protected String partyPartyRelId;
    @XmlElement(name = "PartyPartyRelStatus", required = true)
    protected PartyPartyRelStatusType partyPartyRelStatus;

    /**
     * Gets the value of the partyPartyRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyPartyRelId() {
        return partyPartyRelId;
    }

    /**
     * Sets the value of the partyPartyRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyPartyRelId(String value) {
        this.partyPartyRelId = value;
    }

    /**
     * Gets the value of the partyPartyRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public PartyPartyRelStatusType getPartyPartyRelStatus() {
        return partyPartyRelStatus;
    }

    /**
     * Sets the value of the partyPartyRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public void setPartyPartyRelStatus(PartyPartyRelStatusType value) {
        this.partyPartyRelStatus = value;
    }

}
