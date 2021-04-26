
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvcRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DvcRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcFingerPrint" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcTokenCookie" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcTokenFSO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HttpAccept" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HttpAcceptChars" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HttpAcceptEncoding" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Language" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HttpAcceptReferrer" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserAgent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BindingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcFraudChkInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UpdateCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvcRqHdr_Type", propOrder = {
    "dvcFingerPrint",
    "dvcTokenCookie",
    "dvcTokenFSO",
    "httpAccept",
    "httpAcceptChars",
    "httpAcceptEncoding",
    "language",
    "httpAcceptReferrer",
    "userAgent",
    "bindingType",
    "nickname",
    "dvcFraudChkInd",
    "updateCode"
})
public class DvcRqHdrType {

    @XmlElement(name = "DvcFingerPrint")
    protected byte[] dvcFingerPrint;
    @XmlElement(name = "DvcTokenCookie")
    protected String dvcTokenCookie;
    @XmlElement(name = "DvcTokenFSO")
    protected String dvcTokenFSO;
    @XmlElement(name = "HttpAccept")
    protected byte[] httpAccept;
    @XmlElement(name = "HttpAcceptChars")
    protected String httpAcceptChars;
    @XmlElement(name = "HttpAcceptEncoding")
    protected String httpAcceptEncoding;
    @XmlElement(name = "Language", namespace = "urn:ifxforum-org:XSD:1")
    protected String language;
    @XmlElement(name = "HttpAcceptReferrer")
    protected String httpAcceptReferrer;
    @XmlElement(name = "UserAgent")
    protected String userAgent;
    @XmlElement(name = "BindingType")
    protected String bindingType;
    @XmlElement(name = "Nickname", namespace = "urn:ifxforum-org:XSD:1")
    protected String nickname;
    @XmlElement(name = "DvcFraudChkInd")
    protected Boolean dvcFraudChkInd;
    @XmlElement(name = "UpdateCode")
    protected String updateCode;

    /**
     * Gets the value of the dvcFingerPrint property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDvcFingerPrint() {
        return dvcFingerPrint;
    }

    /**
     * Sets the value of the dvcFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDvcFingerPrint(byte[] value) {
        this.dvcFingerPrint = value;
    }

    /**
     * Gets the value of the dvcTokenCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTokenCookie() {
        return dvcTokenCookie;
    }

    /**
     * Sets the value of the dvcTokenCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcTokenCookie(String value) {
        this.dvcTokenCookie = value;
    }

    /**
     * Gets the value of the dvcTokenFSO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTokenFSO() {
        return dvcTokenFSO;
    }

    /**
     * Sets the value of the dvcTokenFSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcTokenFSO(String value) {
        this.dvcTokenFSO = value;
    }

    /**
     * Gets the value of the httpAccept property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHttpAccept() {
        return httpAccept;
    }

    /**
     * Sets the value of the httpAccept property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHttpAccept(byte[] value) {
        this.httpAccept = value;
    }

    /**
     * Gets the value of the httpAcceptChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAcceptChars() {
        return httpAcceptChars;
    }

    /**
     * Sets the value of the httpAcceptChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAcceptChars(String value) {
        this.httpAcceptChars = value;
    }

    /**
     * Gets the value of the httpAcceptEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAcceptEncoding() {
        return httpAcceptEncoding;
    }

    /**
     * Sets the value of the httpAcceptEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAcceptEncoding(String value) {
        this.httpAcceptEncoding = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the httpAcceptReferrer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAcceptReferrer() {
        return httpAcceptReferrer;
    }

    /**
     * Sets the value of the httpAcceptReferrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAcceptReferrer(String value) {
        this.httpAcceptReferrer = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the bindingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingType() {
        return bindingType;
    }

    /**
     * Sets the value of the bindingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingType(String value) {
        this.bindingType = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the dvcFraudChkInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDvcFraudChkInd() {
        return dvcFraudChkInd;
    }

    /**
     * Sets the value of the dvcFraudChkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDvcFraudChkInd(Boolean value) {
        this.dvcFraudChkInd = value;
    }

    /**
     * Gets the value of the updateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateCode() {
        return updateCode;
    }

    /**
     * Sets the value of the updateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateCode(String value) {
        this.updateCode = value;
    }

}
