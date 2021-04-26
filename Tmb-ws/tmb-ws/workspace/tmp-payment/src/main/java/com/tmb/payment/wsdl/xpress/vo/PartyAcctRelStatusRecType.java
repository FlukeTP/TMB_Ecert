
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelStatusRec_Type", propOrder = {
    "partyAcctRelId",
    "partyAcctRelStatus"
})
public class PartyAcctRelStatusRecType {

    @XmlElement(name = "PartyAcctRelId", required = true)
    protected String partyAcctRelId;
    @XmlElement(name = "PartyAcctRelStatus", required = true)
    protected PartyAcctRelStatusType partyAcctRelStatus;

    /**
     * Gets the value of the partyAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelId() {
        return partyAcctRelId;
    }

    /**
     * Sets the value of the partyAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelId(String value) {
        this.partyAcctRelId = value;
    }

    /**
     * Gets the value of the partyAcctRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public PartyAcctRelStatusType getPartyAcctRelStatus() {
        return partyAcctRelStatus;
    }

    /**
     * Sets the value of the partyAcctRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public void setPartyAcctRelStatus(PartyAcctRelStatusType value) {
        this.partyAcctRelStatus = value;
    }

}
