
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnStatusRec_Type", propOrder = {
    "acctTrnId",
    "acctTrnStatus"
})
public class AcctTrnStatusRecType {

    @XmlElement(name = "AcctTrnId", required = true)
    protected String acctTrnId;
    @XmlElement(name = "AcctTrnStatus", required = true)
    protected AcctTrnStatusType acctTrnStatus;

    /**
     * Gets the value of the acctTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnId() {
        return acctTrnId;
    }

    /**
     * Sets the value of the acctTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnId(String value) {
        this.acctTrnId = value;
    }

    /**
     * Gets the value of the acctTrnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnStatusType }
     *     
     */
    public AcctTrnStatusType getAcctTrnStatus() {
        return acctTrnStatus;
    }

    /**
     * Sets the value of the acctTrnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnStatusType }
     *     
     */
    public void setAcctTrnStatus(AcctTrnStatusType value) {
        this.acctTrnStatus = value;
    }

}
