
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Statement_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtNxtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TruncationCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ElectronicStmtInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Cycle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurrenceRule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement_Type", propOrder = {
    "stmtGroup",
    "postAddr",
    "stmtNxtDt",
    "truncationCd",
    "stmtInd",
    "electronicStmtInd",
    "cycle",
    "recurrenceRule"
})
public class StatementType {

    @XmlElement(name = "StmtGroup", namespace = "urn:ifxforum-org:XSD:1")
    protected String stmtGroup;
    @XmlElement(name = "PostAddr")
    protected PostAddrType postAddr;
    @XmlElement(name = "StmtNxtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stmtNxtDt;
    @XmlElement(name = "TruncationCd")
    protected String truncationCd;
    @XmlElement(name = "StmtInd")
    protected Boolean stmtInd;
    @XmlElement(name = "ElectronicStmtInd")
    protected Boolean electronicStmtInd;
    @XmlElement(name = "Cycle")
    protected String cycle;
    @XmlElementRef(name = "RecurrenceRule", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> recurrenceRule;

    /**
     * Gets the value of the stmtGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGroup() {
        return stmtGroup;
    }

    /**
     * Sets the value of the stmtGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGroup(String value) {
        this.stmtGroup = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddrType }
     *     
     */
    public PostAddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddrType }
     *     
     */
    public void setPostAddr(PostAddrType value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the stmtNxtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStmtNxtDt() {
        return stmtNxtDt;
    }

    /**
     * Sets the value of the stmtNxtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStmtNxtDt(XMLGregorianCalendar value) {
        this.stmtNxtDt = value;
    }

    /**
     * Gets the value of the truncationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruncationCd() {
        return truncationCd;
    }

    /**
     * Sets the value of the truncationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruncationCd(String value) {
        this.truncationCd = value;
    }

    /**
     * Gets the value of the stmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStmtInd() {
        return stmtInd;
    }

    /**
     * Sets the value of the stmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStmtInd(Boolean value) {
        this.stmtInd = value;
    }

    /**
     * Gets the value of the electronicStmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicStmtInd() {
        return electronicStmtInd;
    }

    /**
     * Sets the value of the electronicStmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicStmtInd(Boolean value) {
        this.electronicStmtInd = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycle(String value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecurrenceRuleType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> getRecurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Sets the value of the recurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecurrenceRuleType }{@code >}
     *     
     */
    public void setRecurrenceRule(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> value) {
        this.recurrenceRule = value;
    }

}
