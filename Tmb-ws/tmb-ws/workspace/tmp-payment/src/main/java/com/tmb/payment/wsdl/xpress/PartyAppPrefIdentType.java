
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAppPrefIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAppPrefIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyAppPrefIdentValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAppPrefIdent_Type", propOrder = {
    "partyAppPrefIdentValue"
})
public class PartyAppPrefIdentType {

    @XmlElement(name = "PartyAppPrefIdentValue", required = true)
    protected String partyAppPrefIdentValue;

    /**
     * Gets the value of the partyAppPrefIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAppPrefIdentValue() {
        return partyAppPrefIdentValue;
    }

    /**
     * Sets the value of the partyAppPrefIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAppPrefIdentValue(String value) {
        this.partyAppPrefIdentValue = value;
    }

}
