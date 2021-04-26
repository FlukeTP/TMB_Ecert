
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditRec_Type", propOrder = {
    "creditKeys",
    "creditInfo",
    "creditEnvr",
    "creditAuth",
    "creditStatus"
})
public class CreditRecType {

    @XmlElement(name = "CreditKeys", required = true)
    protected CreditKeysType creditKeys;
    @XmlElementRef(name = "CreditInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> creditInfo;
    @XmlElement(name = "CreditEnvr")
    protected CreditEnvrType creditEnvr;
    @XmlElement(name = "CreditAuth")
    protected CreditAuthType creditAuth;
    @XmlElement(name = "CreditStatus", required = true)
    protected CreditStatusType creditStatus;

    /**
     * Gets the value of the creditKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CreditKeysType }
     *     
     */
    public CreditKeysType getCreditKeys() {
        return creditKeys;
    }

    /**
     * Sets the value of the creditKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditKeysType }
     *     
     */
    public void setCreditKeys(CreditKeysType value) {
        this.creditKeys = value;
    }

    /**
     * Gets the value of the creditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> getCreditInfo() {
        return creditInfo;
    }

    /**
     * Sets the value of the creditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditInfoType }{@code >}
     *     
     */
    public void setCreditInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditInfoType> value) {
        this.creditInfo = value;
    }

    /**
     * Gets the value of the creditEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEnvrType }
     *     
     */
    public CreditEnvrType getCreditEnvr() {
        return creditEnvr;
    }

    /**
     * Sets the value of the creditEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEnvrType }
     *     
     */
    public void setCreditEnvr(CreditEnvrType value) {
        this.creditEnvr = value;
    }

    /**
     * Gets the value of the creditAuth property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAuthType }
     *     
     */
    public CreditAuthType getCreditAuth() {
        return creditAuth;
    }

    /**
     * Sets the value of the creditAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAuthType }
     *     
     */
    public void setCreditAuth(CreditAuthType value) {
        this.creditAuth = value;
    }

    /**
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditStatusType }
     *     
     */
    public CreditStatusType getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditStatusType }
     *     
     */
    public void setCreditStatus(CreditStatusType value) {
        this.creditStatus = value;
    }

}
