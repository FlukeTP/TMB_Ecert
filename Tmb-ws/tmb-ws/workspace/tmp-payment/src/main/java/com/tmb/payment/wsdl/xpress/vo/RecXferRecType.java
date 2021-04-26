
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecXferRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferRec_Type", propOrder = {
    "recXferId",
    "recXferKeys",
    "recXferInfo",
    "recXferEnvr",
    "recXferAuth",
    "recXferStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.RecXferRecType.class
})
public class RecXferRecType {

    @XmlElement(name = "RecXferId")
    protected String recXferId;
    @XmlElementRef(name = "RecXferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> recXferKeys;
    @XmlElementRef(name = "RecXferInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> recXferInfo;
    @XmlElement(name = "RecXferEnvr")
    protected RecXferEnvrType recXferEnvr;
    @XmlElement(name = "RecXferAuth")
    protected RecXferAuthType recXferAuth;
    @XmlElement(name = "RecXferStatus", required = true)
    protected RecXferStatusType recXferStatus;

    /**
     * Gets the value of the recXferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecXferId() {
        return recXferId;
    }

    /**
     * Sets the value of the recXferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecXferId(String value) {
        this.recXferId = value;
    }

    /**
     * Gets the value of the recXferKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> getRecXferKeys() {
        return recXferKeys;
    }

    /**
     * Sets the value of the recXferKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferKeysType }{@code >}
     *     
     */
    public void setRecXferKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType> value) {
        this.recXferKeys = value;
    }

    /**
     * Gets the value of the recXferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> getRecXferInfo() {
        return recXferInfo;
    }

    /**
     * Sets the value of the recXferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecXferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecXferInfoType }{@code >}
     *     
     */
    public void setRecXferInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType> value) {
        this.recXferInfo = value;
    }

    /**
     * Gets the value of the recXferEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link RecXferEnvrType }
     *     
     */
    public RecXferEnvrType getRecXferEnvr() {
        return recXferEnvr;
    }

    /**
     * Sets the value of the recXferEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecXferEnvrType }
     *     
     */
    public void setRecXferEnvr(RecXferEnvrType value) {
        this.recXferEnvr = value;
    }

    /**
     * Gets the value of the recXferAuth property.
     * 
     * @return
     *     possible object is
     *     {@link RecXferAuthType }
     *     
     */
    public RecXferAuthType getRecXferAuth() {
        return recXferAuth;
    }

    /**
     * Sets the value of the recXferAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecXferAuthType }
     *     
     */
    public void setRecXferAuth(RecXferAuthType value) {
        this.recXferAuth = value;
    }

    /**
     * Gets the value of the recXferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecXferStatusType }
     *     
     */
    public RecXferStatusType getRecXferStatus() {
        return recXferStatus;
    }

    /**
     * Sets the value of the recXferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecXferStatusType }
     *     
     */
    public void setRecXferStatus(RecXferStatusType value) {
        this.recXferStatus = value;
    }

}
