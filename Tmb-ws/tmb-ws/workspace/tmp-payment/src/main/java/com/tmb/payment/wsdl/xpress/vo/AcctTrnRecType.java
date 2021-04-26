
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnRec_Type", propOrder = {
    "acctTrnId",
    "acctTrnKeys",
    "acctTrnInfo",
    "acctTrnEnvr",
    "acctTrnAuth",
    "acctTrnStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.AcctTrnRecType.class
})
public class AcctTrnRecType {

    @XmlElement(name = "AcctTrnId")
    protected String acctTrnId;
    @XmlElement(name = "AcctTrnKeys")
    protected AcctTrnKeysType acctTrnKeys;
    @XmlElementRef(name = "AcctTrnInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> acctTrnInfo;
    @XmlElementRef(name = "AcctTrnEnvr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType> acctTrnEnvr;
    @XmlElement(name = "AcctTrnAuth")
    protected AcctTrnAuthType acctTrnAuth;
    @XmlElement(name = "AcctTrnStatus", required = true)
    protected AcctTrnStatusType acctTrnStatus;

    /**
     * Gets the value of the acctTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnId() {
        return acctTrnId;
    }

    /**
     * Sets the value of the acctTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnId(String value) {
        this.acctTrnId = value;
    }

    /**
     * Gets the value of the acctTrnKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnKeysType }
     *     
     */
    public AcctTrnKeysType getAcctTrnKeys() {
        return acctTrnKeys;
    }

    /**
     * Sets the value of the acctTrnKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnKeysType }
     *     
     */
    public void setAcctTrnKeys(AcctTrnKeysType value) {
        this.acctTrnKeys = value;
    }

    /**
     * Gets the value of the acctTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> getAcctTrnInfo() {
        return acctTrnInfo;
    }

    /**
     * Sets the value of the acctTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType }{@code >}
     *     
     */
    public void setAcctTrnInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> value) {
        this.acctTrnInfo = value;
    }

    /**
     * Gets the value of the acctTrnEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnEnvrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType> getAcctTrnEnvr() {
        return acctTrnEnvr;
    }

    /**
     * Sets the value of the acctTrnEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnEnvrType }{@code >}
     *     
     */
    public void setAcctTrnEnvr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnEnvrType> value) {
        this.acctTrnEnvr = value;
    }

    /**
     * Gets the value of the acctTrnAuth property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnAuthType }
     *     
     */
    public AcctTrnAuthType getAcctTrnAuth() {
        return acctTrnAuth;
    }

    /**
     * Sets the value of the acctTrnAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnAuthType }
     *     
     */
    public void setAcctTrnAuth(AcctTrnAuthType value) {
        this.acctTrnAuth = value;
    }

    /**
     * Gets the value of the acctTrnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnStatusType }
     *     
     */
    public AcctTrnStatusType getAcctTrnStatus() {
        return acctTrnStatus;
    }

    /**
     * Sets the value of the acctTrnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnStatusType }
     *     
     */
    public void setAcctTrnStatus(AcctTrnStatusType value) {
        this.acctTrnStatus = value;
    }

}
