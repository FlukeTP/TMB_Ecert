
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenLogin" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdQualityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdChangeRqdInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserAcctLockedInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TimeFrame" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAuth_Type", propOrder = {
    "secTokenSecretAnswer",
    "secTokenLogin",
    "pswdQualityCode",
    "pswdChangeRqdInd",
    "userAcctLockedInd",
    "timeFrame"
})
public class UserAuthType {

    @XmlElementRef(name = "SecTokenSecretAnswer", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> secTokenSecretAnswer;
    @XmlElementRef(name = "SecTokenLogin", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> secTokenLogin;
    @XmlElement(name = "PswdQualityCode")
    protected String pswdQualityCode;
    @XmlElement(name = "PswdChangeRqdInd")
    protected Boolean pswdChangeRqdInd;
    @XmlElement(name = "UserAcctLockedInd")
    protected Boolean userAcctLockedInd;
    @XmlElement(name = "TimeFrame")
    protected TimeFrameType timeFrame;

    /**
     * Gets the value of the secTokenSecretAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenSecretAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenSecretAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> getSecTokenSecretAnswer() {
        if (secTokenSecretAnswer == null) {
            secTokenSecretAnswer = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>>();
        }
        return this.secTokenSecretAnswer;
    }

    /**
     * Gets the value of the secTokenLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> getSecTokenLogin() {
        return secTokenLogin;
    }

    /**
     * Sets the value of the secTokenLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     *     
     */
    public void setSecTokenLogin(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> value) {
        this.secTokenLogin = value;
    }

    /**
     * Gets the value of the pswdQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdQualityCode() {
        return pswdQualityCode;
    }

    /**
     * Sets the value of the pswdQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdQualityCode(String value) {
        this.pswdQualityCode = value;
    }

    /**
     * Gets the value of the pswdChangeRqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPswdChangeRqdInd() {
        return pswdChangeRqdInd;
    }

    /**
     * Sets the value of the pswdChangeRqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPswdChangeRqdInd(Boolean value) {
        this.pswdChangeRqdInd = value;
    }

    /**
     * Gets the value of the userAcctLockedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAcctLockedInd() {
        return userAcctLockedInd;
    }

    /**
     * Sets the value of the userAcctLockedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAcctLockedInd(Boolean value) {
        this.userAcctLockedInd = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrameType }
     *     
     */
    public TimeFrameType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrameType }
     *     
     */
    public void setTimeFrame(TimeFrameType value) {
        this.timeFrame = value;
    }

}
