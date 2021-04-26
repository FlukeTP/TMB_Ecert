
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagCardUpdateRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagCardUpdateRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CardUpdateRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagCardUpdateRec_Type", propOrder = {
    "magCardUpdateId",
    "magCardUpdateInfo",
    "magCardUpdateEnvr",
    "magCardUpdateStatus"
})
public class MagCardUpdateRecType
    extends CardUpdateRecType
{

    @XmlElement(name = "MagCardUpdateId", required = true)
    protected String magCardUpdateId;
    @XmlElement(name = "MagCardUpdateInfo", required = true)
    protected MagCardUpdateInfoType magCardUpdateInfo;
    @XmlElement(name = "MagCardUpdateEnvr")
    protected MagCardUpdateEnvrType magCardUpdateEnvr;
    @XmlElement(name = "MagCardUpdateStatus", required = true)
    protected MagCardUpdateStatusType magCardUpdateStatus;

    /**
     * Gets the value of the magCardUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagCardUpdateId() {
        return magCardUpdateId;
    }

    /**
     * Sets the value of the magCardUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagCardUpdateId(String value) {
        this.magCardUpdateId = value;
    }

    /**
     * Gets the value of the magCardUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public MagCardUpdateInfoType getMagCardUpdateInfo() {
        return magCardUpdateInfo;
    }

    /**
     * Sets the value of the magCardUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public void setMagCardUpdateInfo(MagCardUpdateInfoType value) {
        this.magCardUpdateInfo = value;
    }

    /**
     * Gets the value of the magCardUpdateEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateEnvrType }
     *     
     */
    public MagCardUpdateEnvrType getMagCardUpdateEnvr() {
        return magCardUpdateEnvr;
    }

    /**
     * Sets the value of the magCardUpdateEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateEnvrType }
     *     
     */
    public void setMagCardUpdateEnvr(MagCardUpdateEnvrType value) {
        this.magCardUpdateEnvr = value;
    }

    /**
     * Gets the value of the magCardUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public MagCardUpdateStatusType getMagCardUpdateStatus() {
        return magCardUpdateStatus;
    }

    /**
     * Sets the value of the magCardUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public void setMagCardUpdateStatus(MagCardUpdateStatusType value) {
        this.magCardUpdateStatus = value;
    }

}
