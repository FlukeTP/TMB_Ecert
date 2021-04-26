
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ACH_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACH_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurrenceRule" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrCrInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACH_Type", propOrder = {
    "legalName",
    "recurrenceRule",
    "dueDt",
    "drCrInd"
})
public class ACHType {

    @XmlElement(name = "LegalName", namespace = "urn:ifxforum-org:XSD:1")
    protected String legalName;
    @XmlElement(name = "RecurrenceRule")
    protected RecurrenceRuleType recurrenceRule;
    @XmlElement(name = "DueDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "DrCrInd")
    protected Boolean drCrInd;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public RecurrenceRuleType getRecurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Sets the value of the recurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public void setRecurrenceRule(RecurrenceRuleType value) {
        this.recurrenceRule = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the drCrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrCrInd() {
        return drCrInd;
    }

    /**
     * Sets the value of the drCrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrCrInd(Boolean value) {
        this.drCrInd = value;
    }

}
