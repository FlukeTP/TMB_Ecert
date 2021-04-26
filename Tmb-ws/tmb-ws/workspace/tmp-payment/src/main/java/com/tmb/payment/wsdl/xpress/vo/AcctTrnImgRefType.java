
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnImgRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnImgRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgInfo"/&gt;
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
@XmlType(name = "AcctTrnImgRef_Type", propOrder = {
    "acctTrnImgKeys",
    "acctTrnImgRec",
    "acctTrnImgInfo"
})
public class AcctTrnImgRefType {

    @XmlElement(name = "AcctTrnImgKeys")
    protected AcctTrnImgKeysType acctTrnImgKeys;
    @XmlElement(name = "AcctTrnImgRec")
    protected AcctTrnImgRecType acctTrnImgRec;
    @XmlElement(name = "AcctTrnImgInfo")
    protected AcctTrnImgInfoType acctTrnImgInfo;

    /**
     * Gets the value of the acctTrnImgKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnImgKeysType }
     *     
     */
    public AcctTrnImgKeysType getAcctTrnImgKeys() {
        return acctTrnImgKeys;
    }

    /**
     * Sets the value of the acctTrnImgKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnImgKeysType }
     *     
     */
    public void setAcctTrnImgKeys(AcctTrnImgKeysType value) {
        this.acctTrnImgKeys = value;
    }

    /**
     * Gets the value of the acctTrnImgRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnImgRecType }
     *     
     */
    public AcctTrnImgRecType getAcctTrnImgRec() {
        return acctTrnImgRec;
    }

    /**
     * Sets the value of the acctTrnImgRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnImgRecType }
     *     
     */
    public void setAcctTrnImgRec(AcctTrnImgRecType value) {
        this.acctTrnImgRec = value;
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

}
