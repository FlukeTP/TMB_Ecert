
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStmtStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctStmtStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctStmtStatusRec_Type", propOrder = {
    "acctStmtId",
    "acctStmtStatus"
})
public class AcctStmtStatusRecType {

    @XmlElement(name = "AcctStmtId", required = true)
    protected String acctStmtId;
    @XmlElement(name = "AcctStmtStatus", required = true)
    protected AcctStmtStatusType acctStmtStatus;

    /**
     * Gets the value of the acctStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStmtId() {
        return acctStmtId;
    }

    /**
     * Sets the value of the acctStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStmtId(String value) {
        this.acctStmtId = value;
    }

    /**
     * Gets the value of the acctStmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStmtStatusType }
     *     
     */
    public AcctStmtStatusType getAcctStmtStatus() {
        return acctStmtStatus;
    }

    /**
     * Sets the value of the acctStmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStmtStatusType }
     *     
     */
    public void setAcctStmtStatus(AcctStmtStatusType value) {
        this.acctStmtStatus = value;
    }

}
