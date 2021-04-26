
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CompositeCurAmtType;


/**
 * <p>Java class for Verification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Verification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdentValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StrategyTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="IdentVerifyResults" type="{urn:ifxforum-org:XSD:1}LongText_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TempPartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ThirdPartyRqMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ThirdPartyRsMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyErrMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyStatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentVerification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerificationReportType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerificationReport" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerificationDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyScore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyScoreReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification_Type", propOrder = {
    "verifyIdent",
    "identVerifyMethod",
    "compositeCurAmt",
    "issuedIdentType",
    "issuedIdentValue",
    "strategyTypeCode",
    "identVerifyResults",
    "tempPartyIdent",
    "verifyStatCode",
    "effDt",
    "thirdPartyRqMsg",
    "thirdPartyRsMsg",
    "verifyErrMsg",
    "verifyRefIdent",
    "verifyStatDesc",
    "questionAnswer",
    "identVerification",
    "verificationReportType",
    "verificationReport",
    "verificationDesc",
    "verifyScore",
    "verifyScoreReason"
})
public class VerificationType {

    @XmlElement(name = "VerifyIdent")
    protected String verifyIdent;
    @XmlElement(name = "IdentVerifyMethod", namespace = "urn:ifxforum-org:XSD:1")
    protected String identVerifyMethod;
    @XmlElement(name = "CompositeCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "IssuedIdentType", namespace = "urn:ifxforum-org:XSD:1")
    protected String issuedIdentType;
    @XmlElement(name = "IssuedIdentValue", namespace = "urn:ifxforum-org:XSD:1")
    protected String issuedIdentValue;
    @XmlElement(name = "StrategyTypeCode")
    protected String strategyTypeCode;
    @XmlElement(name = "IdentVerifyResults")
    protected String identVerifyResults;
    @XmlElement(name = "TempPartyIdent")
    protected String tempPartyIdent;
    @XmlElement(name = "VerifyStatCode")
    protected String verifyStatCode;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;
    @XmlElement(name = "ThirdPartyRqMsg")
    protected String thirdPartyRqMsg;
    @XmlElement(name = "ThirdPartyRsMsg")
    protected String thirdPartyRsMsg;
    @XmlElement(name = "VerifyErrMsg")
    protected String verifyErrMsg;
    @XmlElement(name = "VerifyRefIdent")
    protected String verifyRefIdent;
    @XmlElement(name = "VerifyStatDesc")
    protected String verifyStatDesc;
    @XmlElement(name = "QuestionAnswer")
    protected List<QuestionAnswerType> questionAnswer;
    @XmlElement(name = "IdentVerification")
    protected List<IdentVerificationType> identVerification;
    @XmlElement(name = "VerificationReportType")
    protected String verificationReportType;
    @XmlElement(name = "VerificationReport")
    protected String verificationReport;
    @XmlElement(name = "VerificationDesc")
    protected String verificationDesc;
    @XmlElement(name = "VerifyScore")
    protected Long verifyScore;
    @XmlElement(name = "VerifyScoreReason")
    protected List<VerifyScoreReasonType> verifyScoreReason;

    /**
     * Gets the value of the verifyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyIdent() {
        return verifyIdent;
    }

    /**
     * Sets the value of the verifyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyIdent(String value) {
        this.verifyIdent = value;
    }

    /**
     * Gets the value of the identVerifyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyMethod() {
        return identVerifyMethod;
    }

    /**
     * Sets the value of the identVerifyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyMethod(String value) {
        this.identVerifyMethod = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
    }

    /**
     * Gets the value of the issuedIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentType() {
        return issuedIdentType;
    }

    /**
     * Sets the value of the issuedIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentType(String value) {
        this.issuedIdentType = value;
    }

    /**
     * Gets the value of the issuedIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentValue() {
        return issuedIdentValue;
    }

    /**
     * Sets the value of the issuedIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentValue(String value) {
        this.issuedIdentValue = value;
    }

    /**
     * Gets the value of the strategyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyTypeCode() {
        return strategyTypeCode;
    }

    /**
     * Sets the value of the strategyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyTypeCode(String value) {
        this.strategyTypeCode = value;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyResults() {
        return identVerifyResults;
    }

    /**
     * Sets the value of the identVerifyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyResults(String value) {
        this.identVerifyResults = value;
    }

    /**
     * Gets the value of the tempPartyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPartyIdent() {
        return tempPartyIdent;
    }

    /**
     * Sets the value of the tempPartyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPartyIdent(String value) {
        this.tempPartyIdent = value;
    }

    /**
     * Gets the value of the verifyStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyStatCode() {
        return verifyStatCode;
    }

    /**
     * Sets the value of the verifyStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyStatCode(String value) {
        this.verifyStatCode = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the thirdPartyRqMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyRqMsg() {
        return thirdPartyRqMsg;
    }

    /**
     * Sets the value of the thirdPartyRqMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyRqMsg(String value) {
        this.thirdPartyRqMsg = value;
    }

    /**
     * Gets the value of the thirdPartyRsMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyRsMsg() {
        return thirdPartyRsMsg;
    }

    /**
     * Sets the value of the thirdPartyRsMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyRsMsg(String value) {
        this.thirdPartyRsMsg = value;
    }

    /**
     * Gets the value of the verifyErrMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyErrMsg() {
        return verifyErrMsg;
    }

    /**
     * Sets the value of the verifyErrMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyErrMsg(String value) {
        this.verifyErrMsg = value;
    }

    /**
     * Gets the value of the verifyRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyRefIdent() {
        return verifyRefIdent;
    }

    /**
     * Sets the value of the verifyRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyRefIdent(String value) {
        this.verifyRefIdent = value;
    }

    /**
     * Gets the value of the verifyStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyStatDesc() {
        return verifyStatDesc;
    }

    /**
     * Sets the value of the verifyStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyStatDesc(String value) {
        this.verifyStatDesc = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionAnswerType }
     * 
     * 
     */
    public List<QuestionAnswerType> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<QuestionAnswerType>();
        }
        return this.questionAnswer;
    }

    /**
     * Gets the value of the identVerification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentVerificationType }
     * 
     * 
     */
    public List<IdentVerificationType> getIdentVerification() {
        if (identVerification == null) {
            identVerification = new ArrayList<IdentVerificationType>();
        }
        return this.identVerification;
    }

    /**
     * Gets the value of the verificationReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationReportType() {
        return verificationReportType;
    }

    /**
     * Sets the value of the verificationReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationReportType(String value) {
        this.verificationReportType = value;
    }

    /**
     * Gets the value of the verificationReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationReport() {
        return verificationReport;
    }

    /**
     * Sets the value of the verificationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationReport(String value) {
        this.verificationReport = value;
    }

    /**
     * Gets the value of the verificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationDesc() {
        return verificationDesc;
    }

    /**
     * Sets the value of the verificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationDesc(String value) {
        this.verificationDesc = value;
    }

    /**
     * Gets the value of the verifyScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerifyScore() {
        return verifyScore;
    }

    /**
     * Sets the value of the verifyScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerifyScore(Long value) {
        this.verifyScore = value;
    }

    /**
     * Gets the value of the verifyScoreReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifyScoreReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifyScoreReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerifyScoreReasonType }
     * 
     * 
     */
    public List<VerifyScoreReasonType> getVerifyScoreReason() {
        if (verifyScoreReason == null) {
            verifyScoreReason = new ArrayList<VerifyScoreReasonType>();
        }
        return this.verifyScoreReason;
    }

}
