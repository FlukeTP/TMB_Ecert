
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSumRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSumRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumInfo"/&gt;
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
@XmlType(name = "BankSvcChkSumRef_Type", propOrder = {
    "bankSvcChkSumKeys",
    "bankSvcChkSumRec",
    "bankSvcChkSumInfo"
})
public class BankSvcChkSumRefType {

    @XmlElement(name = "BankSvcChkSumKeys")
    protected BankSvcChkSumKeysType bankSvcChkSumKeys;
    @XmlElement(name = "BankSvcChkSumRec")
    protected BankSvcChkSumRecType bankSvcChkSumRec;
    @XmlElement(name = "BankSvcChkSumInfo")
    protected BankSvcChkSumInfoType bankSvcChkSumInfo;

    /**
     * Gets the value of the bankSvcChkSumKeys property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcChkSumKeysType }
     *     
     */
    public BankSvcChkSumKeysType getBankSvcChkSumKeys() {
        return bankSvcChkSumKeys;
    }

    /**
     * Sets the value of the bankSvcChkSumKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcChkSumKeysType }
     *     
     */
    public void setBankSvcChkSumKeys(BankSvcChkSumKeysType value) {
        this.bankSvcChkSumKeys = value;
    }

    /**
     * Gets the value of the bankSvcChkSumRec property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcChkSumRecType }
     *     
     */
    public BankSvcChkSumRecType getBankSvcChkSumRec() {
        return bankSvcChkSumRec;
    }

    /**
     * Sets the value of the bankSvcChkSumRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcChkSumRecType }
     *     
     */
    public void setBankSvcChkSumRec(BankSvcChkSumRecType value) {
        this.bankSvcChkSumRec = value;
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

}
