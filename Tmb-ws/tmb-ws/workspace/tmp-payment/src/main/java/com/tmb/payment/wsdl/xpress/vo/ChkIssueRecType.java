
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueRec_Type", propOrder = {
    "chkIssueId",
    "chkIssueKeys",
    "chkIssueInfo",
    "chkIssueEnvr",
    "chkIssueAuth",
    "chkIssueStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ChkIssueRecType.class
})
public class ChkIssueRecType {

    @XmlElement(name = "ChkIssueId")
    protected String chkIssueId;
    @XmlElement(name = "ChkIssueKeys")
    protected ChkIssueKeysType chkIssueKeys;
    @XmlElementRef(name = "ChkIssueInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> chkIssueInfo;
    @XmlElement(name = "ChkIssueEnvr")
    protected ChkIssueEnvrType chkIssueEnvr;
    @XmlElement(name = "ChkIssueAuth")
    protected ChkIssueAuthType chkIssueAuth;
    @XmlElement(name = "ChkIssueStatus", required = true)
    protected ChkIssueStatusType chkIssueStatus;

    /**
     * Gets the value of the chkIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkIssueId() {
        return chkIssueId;
    }

    /**
     * Sets the value of the chkIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkIssueId(String value) {
        this.chkIssueId = value;
    }

    /**
     * Gets the value of the chkIssueKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueKeysType }
     *     
     */
    public ChkIssueKeysType getChkIssueKeys() {
        return chkIssueKeys;
    }

    /**
     * Sets the value of the chkIssueKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueKeysType }
     *     
     */
    public void setChkIssueKeys(ChkIssueKeysType value) {
        this.chkIssueKeys = value;
    }

    /**
     * Gets the value of the chkIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> getChkIssueInfo() {
        return chkIssueInfo;
    }

    /**
     * Sets the value of the chkIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType }{@code >}
     *     
     */
    public void setChkIssueInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> value) {
        this.chkIssueInfo = value;
    }

    /**
     * Gets the value of the chkIssueEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueEnvrType }
     *     
     */
    public ChkIssueEnvrType getChkIssueEnvr() {
        return chkIssueEnvr;
    }

    /**
     * Sets the value of the chkIssueEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueEnvrType }
     *     
     */
    public void setChkIssueEnvr(ChkIssueEnvrType value) {
        this.chkIssueEnvr = value;
    }

    /**
     * Gets the value of the chkIssueAuth property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueAuthType }
     *     
     */
    public ChkIssueAuthType getChkIssueAuth() {
        return chkIssueAuth;
    }

    /**
     * Sets the value of the chkIssueAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueAuthType }
     *     
     */
    public void setChkIssueAuth(ChkIssueAuthType value) {
        this.chkIssueAuth = value;
    }

    /**
     * Gets the value of the chkIssueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public ChkIssueStatusType getChkIssueStatus() {
        return chkIssueStatus;
    }

    /**
     * Sets the value of the chkIssueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public void setChkIssueStatus(ChkIssueStatusType value) {
        this.chkIssueStatus = value;
    }

}
