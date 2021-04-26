
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.SubjectPassCodeType;


/**
 * <p>Java class for ApplicantAth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicantAth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecTokenLogin" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubjectPassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecTokenSecretAnswer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecretWrd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EnrollStatCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Phrase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantAth_Type", propOrder = {
    "secTokenLogin",
    "subjectPassCode",
    "secTokenSecretAnswer",
    "secretWrd",
    "enrollStatCd",
    "phrase"
})
public class ApplicantAthType {

    @XmlElement(name = "SecTokenLogin")
    protected SecTokenLoginType secTokenLogin;
    @XmlElement(name = "SubjectPassCode")
    protected SubjectPassCodeType subjectPassCode;
    @XmlElement(name = "SecTokenSecretAnswer")
    protected SecTokenSecretAnswerType secTokenSecretAnswer;
    @XmlElement(name = "SecretWrd")
    protected String secretWrd;
    @XmlElement(name = "EnrollStatCd")
    protected String enrollStatCd;
    @XmlElement(name = "Phrase")
    protected String phrase;

    /**
     * Gets the value of the secTokenLogin property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenLoginType }
     *     
     */
    public SecTokenLoginType getSecTokenLogin() {
        return secTokenLogin;
    }

    /**
     * Sets the value of the secTokenLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenLoginType }
     *     
     */
    public void setSecTokenLogin(SecTokenLoginType value) {
        this.secTokenLogin = value;
    }

    /**
     * Gets the value of the subjectPassCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPassCodeType }
     *     
     */
    public SubjectPassCodeType getSubjectPassCode() {
        return subjectPassCode;
    }

    /**
     * Sets the value of the subjectPassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPassCodeType }
     *     
     */
    public void setSubjectPassCode(SubjectPassCodeType value) {
        this.subjectPassCode = value;
    }

    /**
     * Gets the value of the secTokenSecretAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenSecretAnswerType }
     *     
     */
    public SecTokenSecretAnswerType getSecTokenSecretAnswer() {
        return secTokenSecretAnswer;
    }

    /**
     * Sets the value of the secTokenSecretAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenSecretAnswerType }
     *     
     */
    public void setSecTokenSecretAnswer(SecTokenSecretAnswerType value) {
        this.secTokenSecretAnswer = value;
    }

    /**
     * Gets the value of the secretWrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretWrd() {
        return secretWrd;
    }

    /**
     * Sets the value of the secretWrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretWrd(String value) {
        this.secretWrd = value;
    }

    /**
     * Gets the value of the enrollStatCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollStatCd() {
        return enrollStatCd;
    }

    /**
     * Sets the value of the enrollStatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollStatCd(String value) {
        this.enrollStatCd = value;
    }

    /**
     * Gets the value of the phrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhrase(String value) {
        this.phrase = value;
    }

}
