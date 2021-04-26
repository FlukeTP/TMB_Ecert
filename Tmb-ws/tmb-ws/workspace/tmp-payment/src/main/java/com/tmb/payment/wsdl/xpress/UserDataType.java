
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserActionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActionDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserData_Type", propOrder = {
    "userActionType",
    "actionDt",
    "userIdent",
    "userRef",
    "userType"
})
public class UserDataType {

    @XmlElement(name = "UserActionType")
    protected String userActionType;
    @XmlElement(name = "ActionDt")
    protected String actionDt;
    @XmlElement(name = "UserIdent")
    protected String userIdent;
    @XmlElement(name = "UserRef")
    protected UserRefType userRef;
    @XmlElement(name = "UserType")
    protected String userType;

    /**
     * Gets the value of the userActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserActionType() {
        return userActionType;
    }

    /**
     * Sets the value of the userActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserActionType(String value) {
        this.userActionType = value;
    }

    /**
     * Gets the value of the actionDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDt() {
        return actionDt;
    }

    /**
     * Sets the value of the actionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDt(String value) {
        this.actionDt = value;
    }

    /**
     * Gets the value of the userIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdent() {
        return userIdent;
    }

    /**
     * Sets the value of the userIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdent(String value) {
        this.userIdent = value;
    }

    /**
     * Gets the value of the userRef property.
     * 
     * @return
     *     possible object is
     *     {@link UserRefType }
     *     
     */
    public UserRefType getUserRef() {
        return userRef;
    }

    /**
     * Sets the value of the userRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRefType }
     *     
     */
    public void setUserRef(UserRefType value) {
        this.userRef = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
