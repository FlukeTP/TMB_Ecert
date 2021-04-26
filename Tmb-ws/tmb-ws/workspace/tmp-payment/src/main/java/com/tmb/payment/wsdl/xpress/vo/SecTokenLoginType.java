
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecTokenLogin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenLogin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecToken_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AthServiceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LoginName"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SubjectPswd"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SubjectPassCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenLogin_Type", propOrder = {
    "athServiceType",
    "loginName",
    "subjectPswd",
    "subjectPassCode"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.SecTokenLoginType.class
})
public class SecTokenLoginType
    extends SecTokenType
{

    @XmlElement(name = "AthServiceType")
    protected String athServiceType;
    @XmlElement(name = "LoginName", required = true)
    protected String loginName;
    @XmlElement(name = "SubjectPswd", required = true)
    protected SubjectPswdType subjectPswd;
    @XmlElement(name = "SubjectPassCode")
    protected SubjectPassCodeType subjectPassCode;

    /**
     * Gets the value of the athServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthServiceType() {
        return athServiceType;
    }

    /**
     * Sets the value of the athServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthServiceType(String value) {
        this.athServiceType = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the subjectPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPswdType }
     *     
     */
    public SubjectPswdType getSubjectPswd() {
        return subjectPswd;
    }

    /**
     * Sets the value of the subjectPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPswdType }
     *     
     */
    public void setSubjectPswd(SubjectPswdType value) {
        this.subjectPswd = value;
    }

    /**
     * Gets the value of the subjectPassCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPassCodeType }
     *     
     */
    public SubjectPassCodeType getSubjectPassCode() {
        return subjectPassCode;
    }

    /**
     * Sets the value of the subjectPassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPassCodeType }
     *     
     */
    public void setSubjectPassCode(SubjectPassCodeType value) {
        this.subjectPassCode = value;
    }

}
