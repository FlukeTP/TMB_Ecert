
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnImgStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnImgStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnImgStatusRec_Type", propOrder = {
    "acctTrnImgId",
    "acctTrnImgStatus"
})
public class AcctTrnImgStatusRecType {

    @XmlElement(name = "AcctTrnImgId", required = true)
    protected String acctTrnImgId;
    @XmlElement(name = "AcctTrnImgStatus", required = true)
    protected AcctTrnImgStatusType acctTrnImgStatus;

    /**
     * Gets the value of the acctTrnImgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnImgId() {
        return acctTrnImgId;
    }

    /**
     * Sets the value of the acctTrnImgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnImgId(String value) {
        this.acctTrnImgId = value;
    }

    /**
     * Gets the value of the acctTrnImgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnImgStatusType }
     *     
     */
    public AcctTrnImgStatusType getAcctTrnImgStatus() {
        return acctTrnImgStatus;
    }

    /**
     * Sets the value of the acctTrnImgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnImgStatusType }
     *     
     */
    public void setAcctTrnImgStatus(AcctTrnImgStatusType value) {
        this.acctTrnImgStatus = value;
    }

}
