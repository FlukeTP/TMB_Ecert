
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcProfRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcProfRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcProfRec_Type", propOrder = {
    "svcProfId",
    "svcProfInfo",
    "svcProfEnvr",
    "svcProfStatus"
})
public class SvcProfRecType {

    @XmlElement(name = "SvcProfId", required = true)
    protected String svcProfId;
    @XmlElement(name = "SvcProfInfo", required = true)
    protected SvcProfInfoType svcProfInfo;
    @XmlElement(name = "SvcProfEnvr")
    protected SvcProfEnvrType svcProfEnvr;
    @XmlElement(name = "SvcProfStatus", required = true)
    protected SvcProfStatusType svcProfStatus;

    /**
     * Gets the value of the svcProfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProfId() {
        return svcProfId;
    }

    /**
     * Sets the value of the svcProfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProfId(String value) {
        this.svcProfId = value;
    }

    /**
     * Gets the value of the svcProfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfInfoType }
     *     
     */
    public SvcProfInfoType getSvcProfInfo() {
        return svcProfInfo;
    }

    /**
     * Sets the value of the svcProfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfInfoType }
     *     
     */
    public void setSvcProfInfo(SvcProfInfoType value) {
        this.svcProfInfo = value;
    }

    /**
     * Gets the value of the svcProfEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfEnvrType }
     *     
     */
    public SvcProfEnvrType getSvcProfEnvr() {
        return svcProfEnvr;
    }

    /**
     * Sets the value of the svcProfEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfEnvrType }
     *     
     */
    public void setSvcProfEnvr(SvcProfEnvrType value) {
        this.svcProfEnvr = value;
    }

    /**
     * Gets the value of the svcProfStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfStatusType }
     *     
     */
    public SvcProfStatusType getSvcProfStatus() {
        return svcProfStatus;
    }

    /**
     * Sets the value of the svcProfStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfStatusType }
     *     
     */
    public void setSvcProfStatus(SvcProfStatusType value) {
        this.svcProfStatus = value;
    }

}
