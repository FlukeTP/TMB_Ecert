
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopChkRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkRec_Type", propOrder = {
    "stopChkId",
    "stopChkKeys",
    "stopChkInfo",
    "stopChkEnvr",
    "stopChkAuth",
    "stopChkStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.StopChkRecType.class
})
public class StopChkRecType {

    @XmlElement(name = "StopChkId")
    protected String stopChkId;
    @XmlElementRef(name = "StopChkKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> stopChkKeys;
    @XmlElementRef(name = "StopChkInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> stopChkInfo;
    @XmlElement(name = "StopChkEnvr")
    protected StopChkEnvrType stopChkEnvr;
    @XmlElement(name = "StopChkAuth")
    protected StopChkAuthType stopChkAuth;
    @XmlElementRef(name = "StopChkStatus", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> stopChkStatus;

    /**
     * Gets the value of the stopChkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopChkId() {
        return stopChkId;
    }

    /**
     * Sets the value of the stopChkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopChkId(String value) {
        this.stopChkId = value;
    }

    /**
     * Gets the value of the stopChkKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> getStopChkKeys() {
        return stopChkKeys;
    }

    /**
     * Sets the value of the stopChkKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkKeysType }{@code >}
     *     
     */
    public void setStopChkKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkKeysType> value) {
        this.stopChkKeys = value;
    }

    /**
     * Gets the value of the stopChkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> getStopChkInfo() {
        return stopChkInfo;
    }

    /**
     * Sets the value of the stopChkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkInfoType }{@code >}
     *     
     */
    public void setStopChkInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkInfoType> value) {
        this.stopChkInfo = value;
    }

    /**
     * Gets the value of the stopChkEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkEnvrType }
     *     
     */
    public StopChkEnvrType getStopChkEnvr() {
        return stopChkEnvr;
    }

    /**
     * Sets the value of the stopChkEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkEnvrType }
     *     
     */
    public void setStopChkEnvr(StopChkEnvrType value) {
        this.stopChkEnvr = value;
    }

    /**
     * Gets the value of the stopChkAuth property.
     * 
     * @return
     *     possible object is
     *     {@link StopChkAuthType }
     *     
     */
    public StopChkAuthType getStopChkAuth() {
        return stopChkAuth;
    }

    /**
     * Sets the value of the stopChkAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChkAuthType }
     *     
     */
    public void setStopChkAuth(StopChkAuthType value) {
        this.stopChkAuth = value;
    }

    /**
     * Gets the value of the stopChkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkStatusType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> getStopChkStatus() {
        return stopChkStatus;
    }

    /**
     * Sets the value of the stopChkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.StopChkStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.StopChkStatusType }{@code >}
     *     
     */
    public void setStopChkStatus(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.StopChkStatusType> value) {
        this.stopChkStatus = value;
    }

}
