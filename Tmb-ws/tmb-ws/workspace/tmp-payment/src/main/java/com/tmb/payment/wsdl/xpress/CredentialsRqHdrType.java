
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialsRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialsRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CredentialsRqHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubjectStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecTokenPswd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExceptionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QuizResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialsRqHdr_Type", propOrder = {
    "subjectStatus",
    "secTokenPswd",
    "exceptionCode",
    "quizResponse"
})
public class CredentialsRqHdrType
    extends com.tmb.payment.wsdl.xpress.vo.CredentialsRqHdrType
{

    @XmlElement(name = "SubjectStatus")
    protected String subjectStatus;
    @XmlElement(name = "SecTokenPswd")
    protected SecTokenPswdType secTokenPswd;
    @XmlElement(name = "ExceptionCode")
    protected List<String> exceptionCode;
    @XmlElement(name = "QuizResponse")
    protected List<QuizResponseType> quizResponse;

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
     * Gets the value of the secTokenPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenPswdType }
     *     
     */
    public SecTokenPswdType getSecTokenPswd() {
        return secTokenPswd;
    }

    /**
     * Sets the value of the secTokenPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenPswdType }
     *     
     */
    public void setSecTokenPswd(SecTokenPswdType value) {
        this.secTokenPswd = value;
    }

    /**
     * Gets the value of the exceptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExceptionCode() {
        if (exceptionCode == null) {
            exceptionCode = new ArrayList<String>();
        }
        return this.exceptionCode;
    }

    /**
     * Gets the value of the quizResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quizResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuizResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuizResponseType }
     * 
     * 
     */
    public List<QuizResponseType> getQuizResponse() {
        if (quizResponse == null) {
            quizResponse = new ArrayList<QuizResponseType>();
        }
        return this.quizResponse;
    }

}
