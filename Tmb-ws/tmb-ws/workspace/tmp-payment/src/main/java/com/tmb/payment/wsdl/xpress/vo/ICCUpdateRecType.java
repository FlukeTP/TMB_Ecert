
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCUpdateRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICCUpdateRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CardUpdateRec_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCUpdateRec_Type", propOrder = {
    "iccUpdateId",
    "iccUpdateInfo",
    "iccUpdateEnvr",
    "iccUpdateStatus"
})
public class ICCUpdateRecType
    extends CardUpdateRecType
{

    @XmlElement(name = "ICCUpdateId", required = true)
    protected String iccUpdateId;
    @XmlElement(name = "ICCUpdateInfo", required = true)
    protected ICCUpdateInfoType iccUpdateInfo;
    @XmlElement(name = "ICCUpdateEnvr")
    protected ICCUpdateEnvrType iccUpdateEnvr;
    @XmlElement(name = "ICCUpdateStatus", required = true)
    protected ICCUpdateStatusType iccUpdateStatus;

    /**
     * Gets the value of the iccUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCUpdateId() {
        return iccUpdateId;
    }

    /**
     * Sets the value of the iccUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCUpdateId(String value) {
        this.iccUpdateId = value;
    }

    /**
     * Gets the value of the iccUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public ICCUpdateInfoType getICCUpdateInfo() {
        return iccUpdateInfo;
    }

    /**
     * Sets the value of the iccUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public void setICCUpdateInfo(ICCUpdateInfoType value) {
        this.iccUpdateInfo = value;
    }

    /**
     * Gets the value of the iccUpdateEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateEnvrType }
     *     
     */
    public ICCUpdateEnvrType getICCUpdateEnvr() {
        return iccUpdateEnvr;
    }

    /**
     * Sets the value of the iccUpdateEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateEnvrType }
     *     
     */
    public void setICCUpdateEnvr(ICCUpdateEnvrType value) {
        this.iccUpdateEnvr = value;
    }

    /**
     * Gets the value of the iccUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public ICCUpdateStatusType getICCUpdateStatus() {
        return iccUpdateStatus;
    }

    /**
     * Sets the value of the iccUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public void setICCUpdateStatus(ICCUpdateStatusType value) {
        this.iccUpdateStatus = value;
    }

}
