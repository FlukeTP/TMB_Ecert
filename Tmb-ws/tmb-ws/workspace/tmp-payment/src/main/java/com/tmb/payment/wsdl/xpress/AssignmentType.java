
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assignment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assignment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CurrInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AssignedUser" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FamilyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GivenName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MiddleName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AssignedUserTeam" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AssignedUserRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AssignedUserLoc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assignment_Type", propOrder = {
    "currInd",
    "assignedUser",
    "familyName",
    "givenName",
    "middleName",
    "date",
    "assignedUserTeam",
    "assignedUserRole",
    "assignedUserLoc"
})
public class AssignmentType {

    @XmlElement(name = "CurrInd")
    protected Boolean currInd;
    @XmlElement(name = "AssignedUser")
    protected String assignedUser;
    @XmlElement(name = "FamilyName", namespace = "urn:ifxforum-org:XSD:1")
    protected String familyName;
    @XmlElement(name = "GivenName", namespace = "urn:ifxforum-org:XSD:1")
    protected String givenName;
    @XmlElement(name = "MiddleName", namespace = "urn:ifxforum-org:XSD:1")
    protected String middleName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "AssignedUserTeam")
    protected String assignedUserTeam;
    @XmlElement(name = "AssignedUserRole")
    protected String assignedUserRole;
    @XmlElement(name = "AssignedUserLoc")
    protected String assignedUserLoc;

    /**
     * Gets the value of the currInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrInd() {
        return currInd;
    }

    /**
     * Sets the value of the currInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrInd(Boolean value) {
        this.currInd = value;
    }

    /**
     * Gets the value of the assignedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUser() {
        return assignedUser;
    }

    /**
     * Sets the value of the assignedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUser(String value) {
        this.assignedUser = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the assignedUserTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserTeam() {
        return assignedUserTeam;
    }

    /**
     * Sets the value of the assignedUserTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserTeam(String value) {
        this.assignedUserTeam = value;
    }

    /**
     * Gets the value of the assignedUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserRole() {
        return assignedUserRole;
    }

    /**
     * Sets the value of the assignedUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserRole(String value) {
        this.assignedUserRole = value;
    }

    /**
     * Gets the value of the assignedUserLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedUserLoc() {
        return assignedUserLoc;
    }

    /**
     * Sets the value of the assignedUserLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedUserLoc(String value) {
        this.assignedUserLoc = value;
    }

}
