
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSumStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSumStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankSvcChkSumStatusRec_Type", propOrder = {
    "bankSvcChkSumId",
    "bankSvcChkSumStatus"
})
public class BankSvcChkSumStatusRecType {

    @XmlElement(name = "BankSvcChkSumId")
    protected String bankSvcChkSumId;
    @XmlElement(name = "BankSvcChkSumStatus")
    protected BankSvcChkSumStatusType bankSvcChkSumStatus;

    /**
     * Gets the value of the bankSvcChkSumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSvcChkSumId() {
        return bankSvcChkSumId;
    }

    /**
     * Sets the value of the bankSvcChkSumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSvcChkSumId(String value) {
        this.bankSvcChkSumId = value;
    }

    /**
     * Gets the value of the bankSvcChkSumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcChkSumStatusType }
     *     
     */
    public BankSvcChkSumStatusType getBankSvcChkSumStatus() {
        return bankSvcChkSumStatus;
    }

    /**
     * Sets the value of the bankSvcChkSumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcChkSumStatusType }
     *     
     */
    public void setBankSvcChkSumStatus(BankSvcChkSumStatusType value) {
        this.bankSvcChkSumStatus = value;
    }

}
