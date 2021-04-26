
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnImgRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnImgRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgEnvr" minOccurs="0"/&gt;
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
@XmlType(name = "AcctTrnImgRec_Type", propOrder = {
    "acctTrnImgId",
    "acctTrnImgInfo",
    "acctTrnImgEnvr",
    "acctTrnImgStatus"
})
public class AcctTrnImgRecType {

    @XmlElement(name = "AcctTrnImgId", required = true)
    protected String acctTrnImgId;
    @XmlElement(name = "AcctTrnImgInfo", required = true)
    protected AcctTrnImgInfoType acctTrnImgInfo;
    @XmlElement(name = "AcctTrnImgEnvr")
    protected AcctTrnImgEnvrType acctTrnImgEnvr;
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
     * Gets the value of the acctTrnImgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnImgInfoType }
     *     
     */
    public AcctTrnImgInfoType getAcctTrnImgInfo() {
        return acctTrnImgInfo;
    }

    /**
     * Sets the value of the acctTrnImgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnImgInfoType }
     *     
     */
    public void setAcctTrnImgInfo(AcctTrnImgInfoType value) {
        this.acctTrnImgInfo = value;
    }

    /**
     * Gets the value of the acctTrnImgEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnImgEnvrType }
     *     
     */
    public AcctTrnImgEnvrType getAcctTrnImgEnvr() {
        return acctTrnImgEnvr;
    }

    /**
     * Sets the value of the acctTrnImgEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnImgEnvrType }
     *     
     */
    public void setAcctTrnImgEnvr(AcctTrnImgEnvrType value) {
        this.acctTrnImgEnvr = value;
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
