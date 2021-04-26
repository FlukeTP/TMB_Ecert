
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AlertKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AlertInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AlertEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AlertStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRec_Type", propOrder = {
    "svcIdent",
    "alertKeys",
    "alertInfo",
    "alertEnvr",
    "alertStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.AlertRecType.class
})
public class AlertRecType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElementRef(name = "AlertKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertKeysType> alertKeys;
    @XmlElementRef(name = "AlertInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertInfoType> alertInfo;
    @XmlElement(name = "AlertEnvr")
    protected AlertEnvrType alertEnvr;
    @XmlElement(name = "AlertStatus", required = true)
    protected AlertStatusType alertStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIdent(String value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the alertKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AlertKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AlertKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertKeysType> getAlertKeys() {
        return alertKeys;
    }

    /**
     * Sets the value of the alertKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AlertKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AlertKeysType }{@code >}
     *     
     */
    public void setAlertKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertKeysType> value) {
        this.alertKeys = value;
    }

    /**
     * Gets the value of the alertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AlertInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AlertInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertInfoType> getAlertInfo() {
        return alertInfo;
    }

    /**
     * Sets the value of the alertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AlertInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AlertInfoType }{@code >}
     *     
     */
    public void setAlertInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AlertInfoType> value) {
        this.alertInfo = value;
    }

    /**
     * Gets the value of the alertEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link AlertEnvrType }
     *     
     */
    public AlertEnvrType getAlertEnvr() {
        return alertEnvr;
    }

    /**
     * Sets the value of the alertEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertEnvrType }
     *     
     */
    public void setAlertEnvr(AlertEnvrType value) {
        this.alertEnvr = value;
    }

    /**
     * Gets the value of the alertStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AlertStatusType }
     *     
     */
    public AlertStatusType getAlertStatus() {
        return alertStatus;
    }

    /**
     * Sets the value of the alertStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertStatusType }
     *     
     */
    public void setAlertStatus(AlertStatusType value) {
        this.alertStatus = value;
    }

}
