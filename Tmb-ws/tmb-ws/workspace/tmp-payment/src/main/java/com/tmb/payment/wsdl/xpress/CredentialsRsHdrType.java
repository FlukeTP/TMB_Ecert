
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialsRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialsRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CredentialsRsHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubjectStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CredentialsStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CredentialsStatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RiskScore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FailCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MatchCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AdditionalStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OOBAuthStatCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialsRsHdr_Type", propOrder = {
    "subjectStatus",
    "credentialsStatCode",
    "credentialsStatDesc",
    "riskScore",
    "failCount",
    "matchCount",
    "additionalStatCode",
    "oobAuthStatCode"
})
public class CredentialsRsHdrType
    extends com.tmb.payment.wsdl.xpress.vo.CredentialsRsHdrType
{

    @XmlElement(name = "SubjectStatus")
    protected String subjectStatus;
    @XmlElement(name = "CredentialsStatCode")
    protected String credentialsStatCode;
    @XmlElement(name = "CredentialsStatDesc")
    protected String credentialsStatDesc;
    @XmlElement(name = "RiskScore")
    protected String riskScore;
    @XmlElement(name = "FailCount")
    protected Long failCount;
    @XmlElement(name = "MatchCount")
    protected Long matchCount;
    @XmlElement(name = "AdditionalStatCode")
    protected String additionalStatCode;
    @XmlElement(name = "OOBAuthStatCode")
    protected String oobAuthStatCode;

    /**
     * Gets the value of the subjectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectStatus() {
        return subjectStatus;
    }

    /**
     * Sets the value of the subjectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectStatus(String value) {
        this.subjectStatus = value;
    }

    /**
     * Gets the value of the credentialsStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialsStatCode() {
        return credentialsStatCode;
    }

    /**
     * Sets the value of the credentialsStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialsStatCode(String value) {
        this.credentialsStatCode = value;
    }

    /**
     * Gets the value of the credentialsStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialsStatDesc() {
        return credentialsStatDesc;
    }

    /**
     * Sets the value of the credentialsStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialsStatDesc(String value) {
        this.credentialsStatDesc = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the failCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFailCount() {
        return failCount;
    }

    /**
     * Sets the value of the failCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFailCount(Long value) {
        this.failCount = value;
    }

    /**
     * Gets the value of the matchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchCount() {
        return matchCount;
    }

    /**
     * Sets the value of the matchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchCount(Long value) {
        this.matchCount = value;
    }

    /**
     * Gets the value of the additionalStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalStatCode() {
        return additionalStatCode;
    }

    /**
     * Sets the value of the additionalStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalStatCode(String value) {
        this.additionalStatCode = value;
    }

    /**
     * Gets the value of the oobAuthStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOOBAuthStatCode() {
        return oobAuthStatCode;
    }

    /**
     * Sets the value of the oobAuthStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOOBAuthStatCode(String value) {
        this.oobAuthStatCode = value;
    }

}
