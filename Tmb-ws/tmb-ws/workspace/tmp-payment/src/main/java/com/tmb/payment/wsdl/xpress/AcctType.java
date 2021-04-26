
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRefType;


/**
 * <p>Java class for Acct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelRef"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStat"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acct_Type", propOrder = {
    "acctRef",
    "partyAcctRelRef",
    "processStat"
})
public class AcctType {

    @XmlElement(name = "AcctRef", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "PartyAcctRelRef", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected PartyAcctRelRefType partyAcctRelRef;
    @XmlElement(name = "ProcessStat", required = true, nillable = true)
    protected ProcessStatType processStat;

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the partyAcctRelRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelRefType }
     *     
     */
    public PartyAcctRelRefType getPartyAcctRelRef() {
        return partyAcctRelRef;
    }

    /**
     * Sets the value of the partyAcctRelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelRefType }
     *     
     */
    public void setPartyAcctRelRef(PartyAcctRelRefType value) {
        this.partyAcctRelRef = value;
    }

    /**
     * Gets the value of the processStat property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessStatType }
     *     
     */
    public ProcessStatType getProcessStat() {
        return processStat;
    }

    /**
     * Sets the value of the processStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessStatType }
     *     
     */
    public void setProcessStat(ProcessStatType value) {
        this.processStat = value;
    }

}
