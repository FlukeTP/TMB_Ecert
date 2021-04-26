
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyAcctRelData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Role" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardOrderInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OwnerPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ECOACd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelData_Type", propOrder = {
    "partyId",
    "role",
    "cardOrderInd",
    "ownerPercent",
    "ecoaCd"
})
public class PartyAcctRelDataType
    extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelDataType
{

    @XmlElement(name = "PartyId", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyId;
    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "CardOrderInd")
    protected Boolean cardOrderInd;
    @XmlElement(name = "OwnerPercent")
    protected BigDecimal ownerPercent;
    @XmlElement(name = "ECOACd")
    protected String ecoaCd;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the cardOrderInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardOrderInd() {
        return cardOrderInd;
    }

    /**
     * Sets the value of the cardOrderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardOrderInd(Boolean value) {
        this.cardOrderInd = value;
    }

    /**
     * Gets the value of the ownerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerPercent() {
        return ownerPercent;
    }

    /**
     * Sets the value of the ownerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerPercent(BigDecimal value) {
        this.ownerPercent = value;
    }

    /**
     * Gets the value of the ecoaCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECOACd() {
        return ecoaCd;
    }

    /**
     * Sets the value of the ecoaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECOACd(String value) {
        this.ecoaCd = value;
    }

}
