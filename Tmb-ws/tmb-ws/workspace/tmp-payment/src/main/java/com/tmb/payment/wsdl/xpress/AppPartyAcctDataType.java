
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppPartyAcctData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppPartyAcctData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyAcctRelData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OwnerPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ECOACd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppPartyAcctData_Type", propOrder = {
    "partyAcctRelData",
    "ownerPercent",
    "ecoaCd"
})
public class AppPartyAcctDataType {

    @XmlElement(name = "PartyAcctRelData")
    protected PartyAcctRelDataType partyAcctRelData;
    @XmlElement(name = "OwnerPercent")
    protected BigDecimal ownerPercent;
    @XmlElement(name = "ECOACd")
    protected String ecoaCd;

    /**
     * Gets the value of the partyAcctRelData property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelDataType }
     *     
     */
    public PartyAcctRelDataType getPartyAcctRelData() {
        return partyAcctRelData;
    }

    /**
     * Sets the value of the partyAcctRelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelDataType }
     *     
     */
    public void setPartyAcctRelData(PartyAcctRelDataType value) {
        this.partyAcctRelData = value;
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
