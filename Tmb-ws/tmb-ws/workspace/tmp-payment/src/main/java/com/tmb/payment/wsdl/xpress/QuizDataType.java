
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuizData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuizData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QuestionIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Question" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MultipleChoice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuizData_Type", propOrder = {
    "questionIdent",
    "question",
    "multipleChoice"
})
public class QuizDataType {

    @XmlElement(name = "QuestionIdent")
    protected String questionIdent;
    @XmlElement(name = "Question")
    protected String question;
    @XmlElement(name = "MultipleChoice")
    protected List<MulitpleChoiceType> multipleChoice;

    /**
     * Gets the value of the questionIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionIdent() {
        return questionIdent;
    }

    /**
     * Sets the value of the questionIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionIdent(String value) {
        this.questionIdent = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the multipleChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multipleChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultipleChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MulitpleChoiceType }
     * 
     * 
     */
    public List<MulitpleChoiceType> getMultipleChoice() {
        if (multipleChoice == null) {
            multipleChoice = new ArrayList<MulitpleChoiceType>();
        }
        return this.multipleChoice;
    }

}
