
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuizResponse_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuizResponse_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QuizIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuizResponse_Type", propOrder = {
    "quizIdent",
    "secTokenSecretAnswer"
})
public class QuizResponseType {

    @XmlElement(name = "QuizIdent")
    protected String quizIdent;
    @XmlElementRef(name = "SecTokenSecretAnswer", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> secTokenSecretAnswer;

    /**
     * Gets the value of the quizIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuizIdent() {
        return quizIdent;
    }

    /**
     * Sets the value of the quizIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuizIdent(String value) {
        this.quizIdent = value;
    }

    /**
     * Gets the value of the secTokenSecretAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenSecretAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenSecretAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> getSecTokenSecretAnswer() {
        if (secTokenSecretAnswer == null) {
            secTokenSecretAnswer = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>>();
        }
        return this.secTokenSecretAnswer;
    }

}
