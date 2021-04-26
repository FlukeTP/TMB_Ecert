
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctKeysType;
import com.tmb.payment.wsdl.xpress.vo.CurrencyAmountType;


/**
 * <p>Java class for PmtCreditDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtCreditDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}DebtorCurAmt"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CreditorCurAmt"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreditorData"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ToAcctKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtCreditDetail_Type", propOrder = {
    "debtorCurAmt",
    "creditorCurAmt",
    "creditorData",
    "toAcctKeys"
})
public class PmtCreditDetailType {

    @XmlElement(name = "DebtorCurAmt")
    protected CurrencyAmountType debtorCurAmt;
    @XmlElement(name = "CreditorCurAmt")
    protected CurrencyAmountType creditorCurAmt;
    @XmlElement(name = "CreditorData", required = true)
    protected CreditorDataType creditorData;
    @XmlElement(name = "ToAcctKeys")
    protected AcctKeysType toAcctKeys;

    /**
     * Gets the value of the debtorCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getDebtorCurAmt() {
        return debtorCurAmt;
    }

    /**
     * Sets the value of the debtorCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setDebtorCurAmt(CurrencyAmountType value) {
        this.debtorCurAmt = value;
    }

    /**
     * Gets the value of the creditorCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getCreditorCurAmt() {
        return creditorCurAmt;
    }

    /**
     * Sets the value of the creditorCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setCreditorCurAmt(CurrencyAmountType value) {
        this.creditorCurAmt = value;
    }

    /**
     * Gets the value of the creditorData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorDataType }
     *     
     */
    public CreditorDataType getCreditorData() {
        return creditorData;
    }

    /**
     * Sets the value of the creditorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorDataType }
     *     
     */
    public void setCreditorData(CreditorDataType value) {
        this.creditorData = value;
    }

    /**
     * Gets the value of the toAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getToAcctKeys() {
        return toAcctKeys;
    }

    /**
     * Sets the value of the toAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setToAcctKeys(AcctKeysType value) {
        this.toAcctKeys = value;
    }

}
