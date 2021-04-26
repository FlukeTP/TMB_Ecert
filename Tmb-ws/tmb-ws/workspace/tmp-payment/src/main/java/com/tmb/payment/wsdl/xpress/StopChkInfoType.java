
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.TermType;


/**
 * <p>Java class for StopChkInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}StopChkInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StopPayCode" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ExpireDt" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InitiatingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ToleranceAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StopPayAction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AuthReceivedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ACH" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeAcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChkIssuedInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkInfo_Type", propOrder = {
    "stopPayCode",
    "term",
    "expireDt",
    "initiatingParty",
    "toleranceAmt",
    "stopPayAction",
    "memo",
    "authReceivedCode",
    "ach",
    "feeAcctRef",
    "chkIssuedInd"
})
public class StopChkInfoType
    extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType
{

    @XmlElement(name = "StopPayCode")
    protected String stopPayCode;
    @XmlElement(name = "Term", namespace = "urn:ifxforum-org:XSD:1")
    protected TermType term;
    @XmlElement(name = "ExpireDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDt;
    @XmlElement(name = "InitiatingParty")
    protected String initiatingParty;
    @XmlElement(name = "ToleranceAmt")
    protected ToleranceAmtType toleranceAmt;
    @XmlElement(name = "StopPayAction")
    protected Boolean stopPayAction;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;
    @XmlElement(name = "AuthReceivedCode")
    protected String authReceivedCode;
    @XmlElement(name = "ACH")
    protected ACHType ach;
    @XmlElement(name = "FeeAcctRef")
    protected FeeAcctRefType feeAcctRef;
    @XmlElement(name = "ChkIssuedInd")
    protected Boolean chkIssuedInd;

    /**
     * Gets the value of the stopPayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPayCode() {
        return stopPayCode;
    }

    /**
     * Sets the value of the stopPayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPayCode(String value) {
        this.stopPayCode = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the expireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDt() {
        return expireDt;
    }

    /**
     * Sets the value of the expireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDt(XMLGregorianCalendar value) {
        this.expireDt = value;
    }

    /**
     * Gets the value of the initiatingParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingParty() {
        return initiatingParty;
    }

    /**
     * Sets the value of the initiatingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingParty(String value) {
        this.initiatingParty = value;
    }

    /**
     * Gets the value of the toleranceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceAmtType }
     *     
     */
    public ToleranceAmtType getToleranceAmt() {
        return toleranceAmt;
    }

    /**
     * Sets the value of the toleranceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceAmtType }
     *     
     */
    public void setToleranceAmt(ToleranceAmtType value) {
        this.toleranceAmt = value;
    }

    /**
     * Gets the value of the stopPayAction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopPayAction() {
        return stopPayAction;
    }

    /**
     * Sets the value of the stopPayAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopPayAction(Boolean value) {
        this.stopPayAction = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the authReceivedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthReceivedCode() {
        return authReceivedCode;
    }

    /**
     * Sets the value of the authReceivedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthReceivedCode(String value) {
        this.authReceivedCode = value;
    }

    /**
     * Gets the value of the ach property.
     * 
     * @return
     *     possible object is
     *     {@link ACHType }
     *     
     */
    public ACHType getACH() {
        return ach;
    }

    /**
     * Sets the value of the ach property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHType }
     *     
     */
    public void setACH(ACHType value) {
        this.ach = value;
    }

    /**
     * Gets the value of the feeAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAcctRefType }
     *     
     */
    public FeeAcctRefType getFeeAcctRef() {
        return feeAcctRef;
    }

    /**
     * Sets the value of the feeAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAcctRefType }
     *     
     */
    public void setFeeAcctRef(FeeAcctRefType value) {
        this.feeAcctRef = value;
    }

    /**
     * Gets the value of the chkIssuedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChkIssuedInd() {
        return chkIssuedInd;
    }

    /**
     * Sets the value of the chkIssuedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChkIssuedInd(Boolean value) {
        this.chkIssuedInd = value;
    }

}
