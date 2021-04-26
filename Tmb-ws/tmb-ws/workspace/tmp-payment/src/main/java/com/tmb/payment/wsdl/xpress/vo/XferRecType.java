
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}XferId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}XferKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferRec_Type", propOrder = {
    "xferId",
    "xferKeys",
    "xferInfo",
    "xferAuth",
    "xferEnvr",
    "xferStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.XferRecType.class
})
public class XferRecType {

    @XmlElement(name = "XferId")
    protected String xferId;
    @XmlElementRef(name = "XferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> xferKeys;
    @XmlElementRef(name = "XferInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> xferInfo;
    @XmlElement(name = "XferAuth")
    protected XferAuthType xferAuth;
    @XmlElement(name = "XferEnvr")
    protected XferEnvrType xferEnvr;
    @XmlElement(name = "XferStatus", required = true)
    protected XferStatusType xferStatus;

    /**
     * Gets the value of the xferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXferId() {
        return xferId;
    }

    /**
     * Sets the value of the xferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXferId(String value) {
        this.xferId = value;
    }

    /**
     * Gets the value of the xferKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> getXferKeys() {
        return xferKeys;
    }

    /**
     * Sets the value of the xferKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public void setXferKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> value) {
        this.xferKeys = value;
    }

    /**
     * Gets the value of the xferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> getXferInfo() {
        return xferInfo;
    }

    /**
     * Sets the value of the xferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     
     */
    public void setXferInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> value) {
        this.xferInfo = value;
    }

    /**
     * Gets the value of the xferAuth property.
     * 
     * @return
     *     possible object is
     *     {@link XferAuthType }
     *     
     */
    public XferAuthType getXferAuth() {
        return xferAuth;
    }

    /**
     * Sets the value of the xferAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAuthType }
     *     
     */
    public void setXferAuth(XferAuthType value) {
        this.xferAuth = value;
    }

    /**
     * Gets the value of the xferEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link XferEnvrType }
     *     
     */
    public XferEnvrType getXferEnvr() {
        return xferEnvr;
    }

    /**
     * Sets the value of the xferEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferEnvrType }
     *     
     */
    public void setXferEnvr(XferEnvrType value) {
        this.xferEnvr = value;
    }

    /**
     * Gets the value of the xferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XferStatusType }
     *     
     */
    public XferStatusType getXferStatus() {
        return xferStatus;
    }

    /**
     * Sets the value of the xferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferStatusType }
     *     
     */
    public void setXferStatus(XferStatusType value) {
        this.xferStatus = value;
    }

}
