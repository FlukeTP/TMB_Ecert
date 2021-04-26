
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}Contact_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContactIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}JobTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DoNotSolicit" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PreferredTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContactMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Correspondence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_Type", propOrder = {
    "contactIdent",
    "fiIdent",
    "jobTitle",
    "doNotSolicit",
    "preferredTime",
    "contactMiscData",
    "correspondence"
})
public class ContactType
    extends com.tmb.payment.wsdl.xpress.vo.ContactType
{

    @XmlElement(name = "ContactIdent")
    protected String contactIdent;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElement(name = "JobTitle", namespace = "urn:ifxforum-org:XSD:1")
    protected String jobTitle;
    @XmlElement(name = "DoNotSolicit")
    protected Boolean doNotSolicit;
    @XmlElement(name = "PreferredTime")
    protected String preferredTime;
    @XmlElement(name = "ContactMiscData")
    protected List<ContactMiscDataType> contactMiscData;
    @XmlElement(name = "Correspondence")
    protected List<CorrespondenceType> correspondence;

    /**
     * Gets the value of the contactIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIdent() {
        return contactIdent;
    }

    /**
     * Sets the value of the contactIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIdent(String value) {
        this.contactIdent = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the doNotSolicit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotSolicit() {
        return doNotSolicit;
    }

    /**
     * Sets the value of the doNotSolicit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotSolicit(Boolean value) {
        this.doNotSolicit = value;
    }

    /**
     * Gets the value of the preferredTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTime() {
        return preferredTime;
    }

    /**
     * Sets the value of the preferredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTime(String value) {
        this.preferredTime = value;
    }

    /**
     * Gets the value of the contactMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMiscDataType }
     * 
     * 
     */
    public List<ContactMiscDataType> getContactMiscData() {
        if (contactMiscData == null) {
            contactMiscData = new ArrayList<ContactMiscDataType>();
        }
        return this.contactMiscData;
    }

    /**
     * Gets the value of the correspondence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondenceType }
     * 
     * 
     */
    public List<CorrespondenceType> getCorrespondence() {
        if (correspondence == null) {
            correspondence = new ArrayList<CorrespondenceType>();
        }
        return this.correspondence;
    }

}
