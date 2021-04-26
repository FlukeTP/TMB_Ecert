
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelData_Type", propOrder = {
    "partyAcctRelType",
    "partyAcctRelDesc"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyAcctRelDataType.class
})
public class PartyAcctRelDataType {

    @XmlElement(name = "PartyAcctRelType", required = true)
    protected String partyAcctRelType;
    @XmlElement(name = "PartyAcctRelDesc")
    protected String partyAcctRelDesc;

    /**
     * Gets the value of the partyAcctRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelType() {
        return partyAcctRelType;
    }

    /**
     * Sets the value of the partyAcctRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelType(String value) {
        this.partyAcctRelType = value;
    }

    /**
     * Gets the value of the partyAcctRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelDesc() {
        return partyAcctRelDesc;
    }

    /**
     * Sets the value of the partyAcctRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelDesc(String value) {
        this.partyAcctRelDesc = value;
    }

}
