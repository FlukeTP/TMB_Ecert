
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.AdjAmtType;


/**
 * <p>Java class for CurrencyAmount_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmount_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Amt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmount_Type", propOrder = {
    "amt",
    "curCode"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ChkEnteredAmtType.class,
    BalAmtType.class,
    AdjAmtType.class,
    AnnualIncomeType.class,
    CurAmtType.class,
    CashAmtType.class,
    ChkCourtesyAmtType.class,
    com.tmb.payment.wsdl.xpress.vo.ChkEnteredAmtType.class,
    FinancialAmtType.class,
    HighCurAmtType.class,
    InitialAmountType.class,
    InterestRateYieldType.class,
    InvoicePremiumType.class,
    LOCLimitType.class,
    LowCurAmtType.class,
    MaxCurAmtType.class,
    MaxLimitAmtType.class,
    MinLimitAmtType.class,
    MinAmtDueType.class,
    MinCurAmtType.class,
    MinPmtType.class,
    NextPmtType.class,
    PaidCurAmtType.class,
    PassbkLastBalPrintedType.class,
    PrepayPenaltyType.class,
    RegPmtType.class,
    SignatureAmtLimitType.class,
    StmtRunningBalType.class,
    TotalCurAmtType.class,
    FeeOvrdAmtType.class
})
public class CurrencyAmountType {

    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CurCode")
    protected CurCodeType curCode;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
    }

}
