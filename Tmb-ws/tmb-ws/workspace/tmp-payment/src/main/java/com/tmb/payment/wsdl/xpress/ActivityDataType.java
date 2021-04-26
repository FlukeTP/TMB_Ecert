
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * When no active tasks are returnd then the case is now closed.
 * 
 * <p>Java class for ActivityData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActivityType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActivityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActivityAction" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActivityStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExtActivityIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClosedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CaseData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CaseDataExecutionInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Outcome" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Disclosure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityData_Type", propOrder = {
    "activityType",
    "activityName",
    "desc",
    "priority",
    "activityAction",
    "activityStatCode",
    "extActivityIdent",
    "escalationData",
    "startDt",
    "closedDt",
    "userData",
    "caseData",
    "caseDataExecutionInfo",
    "outcome",
    "disclosure"
})
public class ActivityDataType {

    @XmlElement(name = "ActivityType")
    protected String activityType;
    @XmlElement(name = "ActivityName")
    protected String activityName;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1")
    protected String desc;
    @XmlElement(name = "Priority")
    protected Long priority;
    @XmlElement(name = "ActivityAction")
    protected String activityAction;
    @XmlElement(name = "ActivityStatCode")
    protected String activityStatCode;
    @XmlElement(name = "ExtActivityIdent")
    protected String extActivityIdent;
    @XmlElement(name = "EscalationData")
    protected List<EscalationDataType> escalationData;
    @XmlElement(name = "StartDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String startDt;
    @XmlElement(name = "ClosedDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closedDt;
    @XmlElement(name = "UserData")
    protected List<UserDataType> userData;
    @XmlElement(name = "CaseData")
    protected String caseData;
    @XmlElement(name = "CaseDataExecutionInfo")
    protected List<CaseDataExecutionInfoType> caseDataExecutionInfo;
    @XmlElement(name = "Outcome")
    protected List<OutcomeType> outcome;
    @XmlElement(name = "Disclosure")
    protected List<DisclosureType> disclosure;

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the activityAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityAction() {
        return activityAction;
    }

    /**
     * Sets the value of the activityAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityAction(String value) {
        this.activityAction = value;
    }

    /**
     * Gets the value of the activityStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityStatCode() {
        return activityStatCode;
    }

    /**
     * Sets the value of the activityStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityStatCode(String value) {
        this.activityStatCode = value;
    }

    /**
     * Gets the value of the extActivityIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtActivityIdent() {
        return extActivityIdent;
    }

    /**
     * Sets the value of the extActivityIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtActivityIdent(String value) {
        this.extActivityIdent = value;
    }

    /**
     * Gets the value of the escalationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escalationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscalationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscalationDataType }
     * 
     * 
     */
    public List<EscalationDataType> getEscalationData() {
        if (escalationData == null) {
            escalationData = new ArrayList<EscalationDataType>();
        }
        return this.escalationData;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDt(XMLGregorianCalendar value) {
        this.closedDt = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDataType }
     * 
     * 
     */
    public List<UserDataType> getUserData() {
        if (userData == null) {
            userData = new ArrayList<UserDataType>();
        }
        return this.userData;
    }

    /**
     * Gets the value of the caseData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseData() {
        return caseData;
    }

    /**
     * Sets the value of the caseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseData(String value) {
        this.caseData = value;
    }

    /**
     * Gets the value of the caseDataExecutionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseDataExecutionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseDataExecutionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseDataExecutionInfoType }
     * 
     * 
     */
    public List<CaseDataExecutionInfoType> getCaseDataExecutionInfo() {
        if (caseDataExecutionInfo == null) {
            caseDataExecutionInfo = new ArrayList<CaseDataExecutionInfoType>();
        }
        return this.caseDataExecutionInfo;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeType }
     * 
     * 
     */
    public List<OutcomeType> getOutcome() {
        if (outcome == null) {
            outcome = new ArrayList<OutcomeType>();
        }
        return this.outcome;
    }

    /**
     * Gets the value of the disclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureType }
     * 
     * 
     */
    public List<DisclosureType> getDisclosure() {
        if (disclosure == null) {
            disclosure = new ArrayList<DisclosureType>();
        }
        return this.disclosure;
    }

}
