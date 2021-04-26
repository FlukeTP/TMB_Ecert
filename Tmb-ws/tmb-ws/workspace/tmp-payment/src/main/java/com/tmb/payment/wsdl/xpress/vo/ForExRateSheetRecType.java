
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetRec_Type", propOrder = {
    "forExRateSheetId",
    "forExRateSheetKeys",
    "forExRateSheetInfo",
    "forExRateSheetEnvr",
    "forExRateSheetAuth",
    "forExRateSheetStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ForExRateSheetRecType.class
})
public class ForExRateSheetRecType {

    @XmlElement(name = "ForExRateSheetId")
    protected String forExRateSheetId;
    @XmlElement(name = "ForExRateSheetKeys")
    protected ForExRateSheetKeysType forExRateSheetKeys;
    @XmlElementRef(name = "ForExRateSheetInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> forExRateSheetInfo;
    @XmlElement(name = "ForExRateSheetEnvr")
    protected ForExRateSheetEnvrType forExRateSheetEnvr;
    @XmlElement(name = "ForExRateSheetAuth")
    protected ForExRateSheetAuthType forExRateSheetAuth;
    @XmlElement(name = "ForExRateSheetStatus", required = true)
    protected ForExRateSheetStatusType forExRateSheetStatus;

    /**
     * Gets the value of the forExRateSheetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateSheetId() {
        return forExRateSheetId;
    }

    /**
     * Sets the value of the forExRateSheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateSheetId(String value) {
        this.forExRateSheetId = value;
    }

    /**
     * Gets the value of the forExRateSheetKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public ForExRateSheetKeysType getForExRateSheetKeys() {
        return forExRateSheetKeys;
    }

    /**
     * Sets the value of the forExRateSheetKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public void setForExRateSheetKeys(ForExRateSheetKeysType value) {
        this.forExRateSheetKeys = value;
    }

    /**
     * Gets the value of the forExRateSheetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> getForExRateSheetInfo() {
        return forExRateSheetInfo;
    }

    /**
     * Sets the value of the forExRateSheetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType }{@code >}
     *     
     */
    public void setForExRateSheetInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetInfoType> value) {
        this.forExRateSheetInfo = value;
    }

    /**
     * Gets the value of the forExRateSheetEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetEnvrType }
     *     
     */
    public ForExRateSheetEnvrType getForExRateSheetEnvr() {
        return forExRateSheetEnvr;
    }

    /**
     * Sets the value of the forExRateSheetEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetEnvrType }
     *     
     */
    public void setForExRateSheetEnvr(ForExRateSheetEnvrType value) {
        this.forExRateSheetEnvr = value;
    }

    /**
     * Gets the value of the forExRateSheetAuth property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetAuthType }
     *     
     */
    public ForExRateSheetAuthType getForExRateSheetAuth() {
        return forExRateSheetAuth;
    }

    /**
     * Sets the value of the forExRateSheetAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetAuthType }
     *     
     */
    public void setForExRateSheetAuth(ForExRateSheetAuthType value) {
        this.forExRateSheetAuth = value;
    }

    /**
     * Gets the value of the forExRateSheetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetStatusType }
     *     
     */
    public ForExRateSheetStatusType getForExRateSheetStatus() {
        return forExRateSheetStatus;
    }

    /**
     * Sets the value of the forExRateSheetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetStatusType }
     *     
     */
    public void setForExRateSheetStatus(ForExRateSheetStatusType value) {
        this.forExRateSheetStatus = value;
    }

}
