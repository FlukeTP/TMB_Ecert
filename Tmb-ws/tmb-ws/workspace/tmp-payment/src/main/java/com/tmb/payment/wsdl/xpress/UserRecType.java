
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}UserId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}UserKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRec_Type", propOrder = {
    "userId",
    "userKeys",
    "userInfo",
    "userEnvr",
    "userAuth",
    "userStatus"
})
public class UserRecType {

    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "UserKeys")
    protected UserKeysType userKeys;
    @XmlElement(name = "UserInfo", required = true)
    protected UserInfoType userInfo;
    @XmlElement(name = "UserEnvr")
    protected UserEnvrType userEnvr;
    @XmlElement(name = "UserAuth")
    protected UserAuthType userAuth;
    @XmlElement(name = "UserStatus", required = true)
    protected UserStatusType userStatus;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userKeys property.
     * 
     * @return
     *     possible object is
     *     {@link UserKeysType }
     *     
     */
    public UserKeysType getUserKeys() {
        return userKeys;
    }

    /**
     * Sets the value of the userKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserKeysType }
     *     
     */
    public void setUserKeys(UserKeysType value) {
        this.userKeys = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserInfoType }
     *     
     */
    public UserInfoType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInfoType }
     *     
     */
    public void setUserInfo(UserInfoType value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the userEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link UserEnvrType }
     *     
     */
    public UserEnvrType getUserEnvr() {
        return userEnvr;
    }

    /**
     * Sets the value of the userEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserEnvrType }
     *     
     */
    public void setUserEnvr(UserEnvrType value) {
        this.userEnvr = value;
    }

    /**
     * Gets the value of the userAuth property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthType }
     *     
     */
    public UserAuthType getUserAuth() {
        return userAuth;
    }

    /**
     * Sets the value of the userAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthType }
     *     
     */
    public void setUserAuth(UserAuthType value) {
        this.userAuth = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusType }
     *     
     */
    public UserStatusType getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusType }
     *     
     */
    public void setUserStatus(UserStatusType value) {
        this.userStatus = value;
    }

}
