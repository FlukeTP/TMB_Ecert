
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AlertId"/&gt;
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
@XmlType(name = "AlertStatusRec_Type", propOrder = {
    "svcIdent",
    "alertId",
    "alertStatus"
})
public class AlertStatusRecType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "AlertId", required = true)
    protected String alertId;
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
     * Gets the value of the alertId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertId() {
        return alertId;
    }

    /**
     * Sets the value of the alertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertId(String value) {
        this.alertId = value;
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
