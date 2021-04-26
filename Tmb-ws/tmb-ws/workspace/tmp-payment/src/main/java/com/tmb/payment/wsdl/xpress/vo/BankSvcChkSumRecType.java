
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSumRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSumRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankSvcChkSumRec_Type", propOrder = {
    "bankSvcChkSumId",
    "bankSvcChkSumInfo",
    "bankSvcChkSumEnvr",
    "bankSvcChkSumStatus"
})
public class BankSvcChkSumRecType {

    @XmlElement(name = "BankSvcChkSumId", required = true)
    protected String bankSvcChkSumId;
    @XmlElement(name = "BankSvcChkSumInfo", required = true)
    protected BankSvcChkSumInfoType bankSvcChkSumInfo;
    @XmlElement(name = "BankSvcChkSumEnvr")
    protected BankSvcChkSumEnvrType bankSvcChkSumEnvr;
    @XmlElement(name = "BankSvcChkSumStatus", required = true)
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
     * Gets the value of the bankSvcChkSumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcChkSumInfoType }
     *     
     */
    public BankSvcChkSumInfoType getBankSvcChkSumInfo() {
        return bankSvcChkSumInfo;
    }

    /**
     * Sets the value of the bankSvcChkSumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcChkSumInfoType }
     *     
     */
    public void setBankSvcChkSumInfo(BankSvcChkSumInfoType value) {
        this.bankSvcChkSumInfo = value;
    }

    /**
     * Gets the value of the bankSvcChkSumEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcChkSumEnvrType }
     *     
     */
    public BankSvcChkSumEnvrType getBankSvcChkSumEnvr() {
        return bankSvcChkSumEnvr;
    }

    /**
     * Sets the value of the bankSvcChkSumEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcChkSumEnvrType }
     *     
     */
    public void setBankSvcChkSumEnvr(BankSvcChkSumEnvrType value) {
        this.bankSvcChkSumEnvr = value;
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
