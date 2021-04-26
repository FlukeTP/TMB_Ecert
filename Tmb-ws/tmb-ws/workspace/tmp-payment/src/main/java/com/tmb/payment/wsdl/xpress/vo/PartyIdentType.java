
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyIdentValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdent_Type", propOrder = {
    "partyIdentType",
    "partyIdentValue"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyIdentType.class
})
public class PartyIdentType {

    @XmlElement(name = "PartyIdentType")
    protected String partyIdentType;
    @XmlElement(name = "PartyIdentValue")
    protected String partyIdentValue;

    /**
     * Gets the value of the partyIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentType() {
        return partyIdentType;
    }

    /**
     * Sets the value of the partyIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentType(String value) {
        this.partyIdentType = value;
    }

    /**
     * Gets the value of the partyIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentValue() {
        return partyIdentValue;
    }

    /**
     * Sets the value of the partyIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentValue(String value) {
        this.partyIdentValue = value;
    }

}
