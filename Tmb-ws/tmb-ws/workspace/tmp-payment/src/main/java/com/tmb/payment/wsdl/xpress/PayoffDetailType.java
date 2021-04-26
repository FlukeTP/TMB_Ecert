
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.BalAmtType;


/**
 * <p>Java class for PayoffDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayoffDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AdjAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Rebate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RptGrp" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmtType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PayAmtDue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LoanBalAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayoffDetail_Type", propOrder = {
    "adjAmt",
    "rebate",
    "rptGrp",
    "amtType",
    "payAmtDue",
    "loanBalAmt"
})
public class PayoffDetailType {

    @XmlElement(name = "AdjAmt")
    protected AdjAmtType adjAmt;
    @XmlElement(name = "Rebate")
    protected BigDecimal rebate;
    @XmlElement(name = "RptGrp")
    protected String rptGrp;
    @XmlElement(name = "AmtType")
    protected String amtType;
    @XmlElement(name = "PayAmtDue")
    protected BalAmtType payAmtDue;
    @XmlElement(name = "LoanBalAmt")
    protected BalAmtType loanBalAmt;

    /**
     * Gets the value of the adjAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AdjAmtType }
     *     
     */
    public AdjAmtType getAdjAmt() {
        return adjAmt;
    }

    /**
     * Sets the value of the adjAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjAmtType }
     *     
     */
    public void setAdjAmt(AdjAmtType value) {
        this.adjAmt = value;
    }

    /**
     * Gets the value of the rebate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRebate() {
        return rebate;
    }

    /**
     * Sets the value of the rebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRebate(BigDecimal value) {
        this.rebate = value;
    }

    /**
     * Gets the value of the rptGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptGrp() {
        return rptGrp;
    }

    /**
     * Sets the value of the rptGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptGrp(String value) {
        this.rptGrp = value;
    }

    /**
     * Gets the value of the amtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtType() {
        return amtType;
    }

    /**
     * Sets the value of the amtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtType(String value) {
        this.amtType = value;
    }

    /**
     * Gets the value of the payAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link BalAmtType }
     *     
     */
    public BalAmtType getPayAmtDue() {
        return payAmtDue;
    }

    /**
     * Sets the value of the payAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalAmtType }
     *     
     */
    public void setPayAmtDue(BalAmtType value) {
        this.payAmtDue = value;
    }

    /**
     * Gets the value of the loanBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BalAmtType }
     *     
     */
    public BalAmtType getLoanBalAmt() {
        return loanBalAmt;
    }

    /**
     * Sets the value of the loanBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalAmtType }
     *     
     */
    public void setLoanBalAmt(BalAmtType value) {
        this.loanBalAmt = value;
    }

}
