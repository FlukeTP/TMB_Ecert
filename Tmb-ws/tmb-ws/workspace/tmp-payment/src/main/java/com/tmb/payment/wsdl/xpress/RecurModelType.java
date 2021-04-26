
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurModel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurModel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurrenceRule" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurException" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DupXferOverride" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SeqNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurModel_Type", propOrder = {
    "recurrenceRule",
    "recurException",
    "nickname",
    "dupXferOverride",
    "seqNum"
})
public class RecurModelType {

    @XmlElement(name = "RecurrenceRule")
    protected List<RecurrenceRuleType> recurrenceRule;
    @XmlElement(name = "RecurException")
    protected RecurExceptionType recurException;
    @XmlElement(name = "Nickname", namespace = "urn:ifxforum-org:XSD:1")
    protected String nickname;
    @XmlElement(name = "DupXferOverride")
    protected Boolean dupXferOverride;
    @XmlElement(name = "SeqNum")
    protected String seqNum;

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurrenceRuleType }
     * 
     * 
     */
    public List<RecurrenceRuleType> getRecurrenceRule() {
        if (recurrenceRule == null) {
            recurrenceRule = new ArrayList<RecurrenceRuleType>();
        }
        return this.recurrenceRule;
    }

    /**
     * Gets the value of the recurException property.
     * 
     * @return
     *     possible object is
     *     {@link RecurExceptionType }
     *     
     */
    public RecurExceptionType getRecurException() {
        return recurException;
    }

    /**
     * Sets the value of the recurException property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurExceptionType }
     *     
     */
    public void setRecurException(RecurExceptionType value) {
        this.recurException = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the dupXferOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDupXferOverride() {
        return dupXferOverride;
    }

    /**
     * Sets the value of the dupXferOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDupXferOverride(Boolean value) {
        this.dupXferOverride = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNum(String value) {
        this.seqNum = value;
    }

}
