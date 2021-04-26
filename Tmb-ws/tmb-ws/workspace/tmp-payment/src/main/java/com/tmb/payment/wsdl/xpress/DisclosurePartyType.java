
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclosureParty_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosurePartyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureParty_Type", propOrder = {
    "disclosurePartyCode"
})
public class DisclosurePartyType {

    @XmlElement(name = "DisclosurePartyCode")
    protected String disclosurePartyCode;

    /**
     * Gets the value of the disclosurePartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosurePartyCode() {
        return disclosurePartyCode;
    }

    /**
     * Sets the value of the disclosurePartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosurePartyCode(String value) {
        this.disclosurePartyCode = value;
    }

}
