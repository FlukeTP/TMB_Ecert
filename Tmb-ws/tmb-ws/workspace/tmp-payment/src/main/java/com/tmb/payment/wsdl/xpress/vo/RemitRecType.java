
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitRec_Type", propOrder = {
    "remitId",
    "remitInfo",
    "remitEnvr",
    "remitStatus"
})
public class RemitRecType {

    @XmlElement(name = "RemitId", required = true)
    protected String remitId;
    @XmlElement(name = "RemitInfo", required = true)
    protected RemitInfoType remitInfo;
    @XmlElement(name = "RemitEnvr")
    protected RemitEnvrType remitEnvr;
    @XmlElement(name = "RemitStatus", required = true)
    protected RemitStatusType remitStatus;

    /**
     * Gets the value of the remitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitId() {
        return remitId;
    }

    /**
     * Sets the value of the remitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitId(String value) {
        this.remitId = value;
    }

    /**
     * Gets the value of the remitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RemitInfoType }
     *     
     */
    public RemitInfoType getRemitInfo() {
        return remitInfo;
    }

    /**
     * Sets the value of the remitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitInfoType }
     *     
     */
    public void setRemitInfo(RemitInfoType value) {
        this.remitInfo = value;
    }

    /**
     * Gets the value of the remitEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link RemitEnvrType }
     *     
     */
    public RemitEnvrType getRemitEnvr() {
        return remitEnvr;
    }

    /**
     * Sets the value of the remitEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitEnvrType }
     *     
     */
    public void setRemitEnvr(RemitEnvrType value) {
        this.remitEnvr = value;
    }

    /**
     * Gets the value of the remitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RemitStatusType }
     *     
     */
    public RemitStatusType getRemitStatus() {
        return remitStatus;
    }

    /**
     * Sets the value of the remitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitStatusType }
     *     
     */
    public void setRemitStatus(RemitStatusType value) {
        this.remitStatus = value;
    }

}
