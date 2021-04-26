
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTrnData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeTrnData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TradeDrawerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}JournalKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTrnData_Type", propOrder = {
    "tradeDrawerId",
    "branchIdent",
    "journalKey"
})
public class TradeTrnDataType {

    @XmlElement(name = "TradeDrawerId")
    protected String tradeDrawerId;
    @XmlElement(name = "BranchIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String branchIdent;
    @XmlElement(name = "JournalKey")
    protected DrawerDataType journalKey;

    /**
     * Gets the value of the tradeDrawerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeDrawerId() {
        return tradeDrawerId;
    }

    /**
     * Sets the value of the tradeDrawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeDrawerId(String value) {
        this.tradeDrawerId = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

    /**
     * Gets the value of the journalKey property.
     * 
     * @return
     *     possible object is
     *     {@link DrawerDataType }
     *     
     */
    public DrawerDataType getJournalKey() {
        return journalKey;
    }

    /**
     * Sets the value of the journalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawerDataType }
     *     
     */
    public void setJournalKey(DrawerDataType value) {
        this.journalKey = value;
    }

}
