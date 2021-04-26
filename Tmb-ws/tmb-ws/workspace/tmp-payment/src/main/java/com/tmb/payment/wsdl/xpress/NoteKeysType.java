
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoteId" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}BusinessCaseKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ReferralIdent" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CalendarItemKeys" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoteType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoteIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicationKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteKeys_Type", propOrder = {
    "noteId",
    "partyKeys",
    "acctKeys",
    "businessCaseKeys",
    "referralIdent",
    "calendarItemKeys",
    "noteType",
    "noteIdent",
    "applicationKeys"
})
public class NoteKeysType {

    @XmlElement(name = "NoteId")
    protected String noteId;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "BusinessCaseKeys")
    protected BusinessCaseKeysType businessCaseKeys;
    @XmlElement(name = "ReferralIdent")
    protected String referralIdent;
    @XmlElement(name = "CalendarItemKeys")
    protected CalendarItemKeysType calendarItemKeys;
    @XmlElement(name = "NoteType")
    protected String noteType;
    @XmlElement(name = "NoteIdent")
    protected NoteIdentType noteIdent;
    @XmlElement(name = "ApplicationKeys")
    protected ApplicationKeysType applicationKeys;

    /**
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteId(String value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the businessCaseKeys property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCaseKeysType }
     *     
     */
    public BusinessCaseKeysType getBusinessCaseKeys() {
        return businessCaseKeys;
    }

    /**
     * Sets the value of the businessCaseKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCaseKeysType }
     *     
     */
    public void setBusinessCaseKeys(BusinessCaseKeysType value) {
        this.businessCaseKeys = value;
    }

    /**
     * Gets the value of the referralIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralIdent() {
        return referralIdent;
    }

    /**
     * Sets the value of the referralIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralIdent(String value) {
        this.referralIdent = value;
    }

    /**
     * Gets the value of the calendarItemKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemKeysType }
     *     
     */
    public CalendarItemKeysType getCalendarItemKeys() {
        return calendarItemKeys;
    }

    /**
     * Sets the value of the calendarItemKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemKeysType }
     *     
     */
    public void setCalendarItemKeys(CalendarItemKeysType value) {
        this.calendarItemKeys = value;
    }

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

    /**
     * Gets the value of the noteIdent property.
     * 
     * @return
     *     possible object is
     *     {@link NoteIdentType }
     *     
     */
    public NoteIdentType getNoteIdent() {
        return noteIdent;
    }

    /**
     * Sets the value of the noteIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteIdentType }
     *     
     */
    public void setNoteIdent(NoteIdentType value) {
        this.noteIdent = value;
    }

    /**
     * Gets the value of the applicationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationKeysType }
     *     
     */
    public ApplicationKeysType getApplicationKeys() {
        return applicationKeys;
    }

    /**
     * Sets the value of the applicationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationKeysType }
     *     
     */
    public void setApplicationKeys(ApplicationKeysType value) {
        this.applicationKeys = value;
    }

}
