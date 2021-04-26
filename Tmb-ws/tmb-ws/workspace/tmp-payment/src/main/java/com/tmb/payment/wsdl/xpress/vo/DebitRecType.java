
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitRec_Type", propOrder = {
    "debitId",
    "debitInfo",
    "debitEnvr",
    "debitStatus"
})
public class DebitRecType {

    @XmlElement(name = "DebitId", required = true)
    protected String debitId;
    @XmlElement(name = "DebitInfo", required = true)
    protected DebitInfoType debitInfo;
    @XmlElement(name = "DebitEnvr")
    protected DebitEnvrType debitEnvr;
    @XmlElement(name = "DebitStatus", required = true)
    protected DebitStatusType debitStatus;

    /**
     * Gets the value of the debitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitId() {
        return debitId;
    }

    /**
     * Sets the value of the debitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitId(String value) {
        this.debitId = value;
    }

    /**
     * Gets the value of the debitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DebitInfoType }
     *     
     */
    public DebitInfoType getDebitInfo() {
        return debitInfo;
    }

    /**
     * Sets the value of the debitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitInfoType }
     *     
     */
    public void setDebitInfo(DebitInfoType value) {
        this.debitInfo = value;
    }

    /**
     * Gets the value of the debitEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link DebitEnvrType }
     *     
     */
    public DebitEnvrType getDebitEnvr() {
        return debitEnvr;
    }

    /**
     * Sets the value of the debitEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitEnvrType }
     *     
     */
    public void setDebitEnvr(DebitEnvrType value) {
        this.debitEnvr = value;
    }

    /**
     * Gets the value of the debitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DebitStatusType }
     *     
     */
    public DebitStatusType getDebitStatus() {
        return debitStatus;
    }

    /**
     * Sets the value of the debitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitStatusType }
     *     
     */
    public void setDebitStatus(DebitStatusType value) {
        this.debitStatus = value;
    }

}
