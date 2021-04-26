
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurrencyAmountType;


/**
 * <p>Java class for CreditAcctData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAcctData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CreditAcctData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecoveryAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecoverySrc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChargeOffReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApprovalDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAcctData_Type", propOrder = {
    "recoveryAmt",
    "recoverySrc",
    "chargeOffReason",
    "approvalDt"
})
public class CreditAcctDataType
    extends com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType
{

    @XmlElement(name = "RecoveryAmt")
    protected CurrencyAmountType recoveryAmt;
    @XmlElement(name = "RecoverySrc")
    protected String recoverySrc;
    @XmlElement(name = "ChargeOffReason")
    protected String chargeOffReason;
    @XmlElement(name = "ApprovalDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approvalDt;

    /**
     * Gets the value of the recoveryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getRecoveryAmt() {
        return recoveryAmt;
    }

    /**
     * Sets the value of the recoveryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setRecoveryAmt(CurrencyAmountType value) {
        this.recoveryAmt = value;
    }

    /**
     * Gets the value of the recoverySrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecoverySrc() {
        return recoverySrc;
    }

    /**
     * Sets the value of the recoverySrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecoverySrc(String value) {
        this.recoverySrc = value;
    }

    /**
     * Gets the value of the chargeOffReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeOffReason() {
        return chargeOffReason;
    }

    /**
     * Sets the value of the chargeOffReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeOffReason(String value) {
        this.chargeOffReason = value;
    }

    /**
     * Gets the value of the approvalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDt() {
        return approvalDt;
    }

    /**
     * Sets the value of the approvalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDt(XMLGregorianCalendar value) {
        this.approvalDt = value;
    }

}
