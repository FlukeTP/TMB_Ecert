
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyPartyRelKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRole" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RelPartyRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelKeys_Type", propOrder = {
    "partyRole",
    "relPartyRole"
})
public class PartyPartyRelKeysType
    extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType
{

    @XmlElement(name = "PartyRole", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyRole;
    @XmlElement(name = "RelPartyRole", namespace = "urn:ifxforum-org:XSD:1")
    protected String relPartyRole;

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRole(String value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the relPartyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelPartyRole() {
        return relPartyRole;
    }

    /**
     * Sets the value of the relPartyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelPartyRole(String value) {
        this.relPartyRole = value;
    }

}
