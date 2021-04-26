
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStmtRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctStmtRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctStmtRef_Type", propOrder = {
    "acctStmtKeys",
    "acctStmtRec",
    "acctStmtInfo"
})
public class AcctStmtRefType {

    @XmlElement(name = "AcctStmtKeys")
    protected AcctStmtKeysType acctStmtKeys;
    @XmlElement(name = "AcctStmtRec")
    protected AcctStmtRecType acctStmtRec;
    @XmlElement(name = "AcctStmtInfo")
    protected AcctStmtInfoType acctStmtInfo;

    /**
     * Gets the value of the acctStmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStmtKeysType }
     *     
     */
    public AcctStmtKeysType getAcctStmtKeys() {
        return acctStmtKeys;
    }

    /**
     * Sets the value of the acctStmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStmtKeysType }
     *     
     */
    public void setAcctStmtKeys(AcctStmtKeysType value) {
        this.acctStmtKeys = value;
    }

    /**
     * Gets the value of the acctStmtRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStmtRecType }
     *     
     */
    public AcctStmtRecType getAcctStmtRec() {
        return acctStmtRec;
    }

    /**
     * Sets the value of the acctStmtRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStmtRecType }
     *     
     */
    public void setAcctStmtRec(AcctStmtRecType value) {
        this.acctStmtRec = value;
    }

    /**
     * Gets the value of the acctStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStmtInfoType }
     *     
     */
    public AcctStmtInfoType getAcctStmtInfo() {
        return acctStmtInfo;
    }

    /**
     * Sets the value of the acctStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStmtInfoType }
     *     
     */
    public void setAcctStmtInfo(AcctStmtInfoType value) {
        this.acctStmtInfo = value;
    }

}
