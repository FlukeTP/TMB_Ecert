
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyCardRelStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCardRelStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyCardRelStatusRec_Type", propOrder = {
    "partyCardRelId",
    "partyCardRelStatus"
})
public class PartyCardRelStatusRecType {

    @XmlElement(name = "PartyCardRelId", required = true)
    protected String partyCardRelId;
    @XmlElement(name = "PartyCardRelStatus", required = true)
    protected PartyCardRelStatusType partyCardRelStatus;

    /**
     * Gets the value of the partyCardRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCardRelId() {
        return partyCardRelId;
    }

    /**
     * Sets the value of the partyCardRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCardRelId(String value) {
        this.partyCardRelId = value;
    }

    /**
     * Gets the value of the partyCardRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelStatusType }
     *     
     */
    public PartyCardRelStatusType getPartyCardRelStatus() {
        return partyCardRelStatus;
    }

    /**
     * Sets the value of the partyCardRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelStatusType }
     *     
     */
    public void setPartyCardRelStatus(PartyCardRelStatusType value) {
        this.partyCardRelStatus = value;
    }

}
