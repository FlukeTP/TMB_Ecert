
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailIdc"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailPtr"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailCdm"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailPIN"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailChk"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailDep"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailTtu"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailSiu"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailVdm"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailCam"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailAlm"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailCim"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetailApp"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetail_Type", propOrder = {
    "devDetailIdc",
    "devDetailPtr",
    "devDetailCdm",
    "devDetailPIN",
    "devDetailChk",
    "devDetailDep",
    "devDetailTtu",
    "devDetailSiu",
    "devDetailVdm",
    "devDetailCam",
    "devDetailAlm",
    "devDetailCim",
    "devDetailApp"
})
public class DevDetailType {

    @XmlElement(name = "DevDetailIdc")
    protected DevDetailIdcType devDetailIdc;
    @XmlElement(name = "DevDetailPtr")
    protected DevDetailPtrType devDetailPtr;
    @XmlElement(name = "DevDetailCdm")
    protected DevDetailCdmType devDetailCdm;
    @XmlElement(name = "DevDetailPIN")
    protected DevDetailPINType devDetailPIN;
    @XmlElement(name = "DevDetailChk")
    protected DevDetailChkType devDetailChk;
    @XmlElement(name = "DevDetailDep")
    protected DevDetailDepType devDetailDep;
    @XmlElement(name = "DevDetailTtu")
    protected DevDetailTtuType devDetailTtu;
    @XmlElement(name = "DevDetailSiu")
    protected DevDetailSiuType devDetailSiu;
    @XmlElement(name = "DevDetailVdm")
    protected DevDetailVdmType devDetailVdm;
    @XmlElement(name = "DevDetailCam")
    protected DevDetailCamType devDetailCam;
    @XmlElement(name = "DevDetailAlm")
    protected DevDetailAlmType devDetailAlm;
    @XmlElement(name = "DevDetailCim")
    protected DevDetailCimType devDetailCim;
    @XmlElement(name = "DevDetailApp")
    protected DevDetailAppType devDetailApp;

    /**
     * Gets the value of the devDetailIdc property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailIdcType }
     *     
     */
    public DevDetailIdcType getDevDetailIdc() {
        return devDetailIdc;
    }

    /**
     * Sets the value of the devDetailIdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailIdcType }
     *     
     */
    public void setDevDetailIdc(DevDetailIdcType value) {
        this.devDetailIdc = value;
    }

    /**
     * Gets the value of the devDetailPtr property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailPtrType }
     *     
     */
    public DevDetailPtrType getDevDetailPtr() {
        return devDetailPtr;
    }

    /**
     * Sets the value of the devDetailPtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailPtrType }
     *     
     */
    public void setDevDetailPtr(DevDetailPtrType value) {
        this.devDetailPtr = value;
    }

    /**
     * Gets the value of the devDetailCdm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCdmType }
     *     
     */
    public DevDetailCdmType getDevDetailCdm() {
        return devDetailCdm;
    }

    /**
     * Sets the value of the devDetailCdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCdmType }
     *     
     */
    public void setDevDetailCdm(DevDetailCdmType value) {
        this.devDetailCdm = value;
    }

    /**
     * Gets the value of the devDetailPIN property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailPINType }
     *     
     */
    public DevDetailPINType getDevDetailPIN() {
        return devDetailPIN;
    }

    /**
     * Sets the value of the devDetailPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailPINType }
     *     
     */
    public void setDevDetailPIN(DevDetailPINType value) {
        this.devDetailPIN = value;
    }

    /**
     * Gets the value of the devDetailChk property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailChkType }
     *     
     */
    public DevDetailChkType getDevDetailChk() {
        return devDetailChk;
    }

    /**
     * Sets the value of the devDetailChk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailChkType }
     *     
     */
    public void setDevDetailChk(DevDetailChkType value) {
        this.devDetailChk = value;
    }

    /**
     * Gets the value of the devDetailDep property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailDepType }
     *     
     */
    public DevDetailDepType getDevDetailDep() {
        return devDetailDep;
    }

    /**
     * Sets the value of the devDetailDep property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailDepType }
     *     
     */
    public void setDevDetailDep(DevDetailDepType value) {
        this.devDetailDep = value;
    }

    /**
     * Gets the value of the devDetailTtu property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailTtuType }
     *     
     */
    public DevDetailTtuType getDevDetailTtu() {
        return devDetailTtu;
    }

    /**
     * Sets the value of the devDetailTtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailTtuType }
     *     
     */
    public void setDevDetailTtu(DevDetailTtuType value) {
        this.devDetailTtu = value;
    }

    /**
     * Gets the value of the devDetailSiu property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailSiuType }
     *     
     */
    public DevDetailSiuType getDevDetailSiu() {
        return devDetailSiu;
    }

    /**
     * Sets the value of the devDetailSiu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailSiuType }
     *     
     */
    public void setDevDetailSiu(DevDetailSiuType value) {
        this.devDetailSiu = value;
    }

    /**
     * Gets the value of the devDetailVdm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailVdmType }
     *     
     */
    public DevDetailVdmType getDevDetailVdm() {
        return devDetailVdm;
    }

    /**
     * Sets the value of the devDetailVdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailVdmType }
     *     
     */
    public void setDevDetailVdm(DevDetailVdmType value) {
        this.devDetailVdm = value;
    }

    /**
     * Gets the value of the devDetailCam property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCamType }
     *     
     */
    public DevDetailCamType getDevDetailCam() {
        return devDetailCam;
    }

    /**
     * Sets the value of the devDetailCam property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCamType }
     *     
     */
    public void setDevDetailCam(DevDetailCamType value) {
        this.devDetailCam = value;
    }

    /**
     * Gets the value of the devDetailAlm property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailAlmType }
     *     
     */
    public DevDetailAlmType getDevDetailAlm() {
        return devDetailAlm;
    }

    /**
     * Sets the value of the devDetailAlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailAlmType }
     *     
     */
    public void setDevDetailAlm(DevDetailAlmType value) {
        this.devDetailAlm = value;
    }

    /**
     * Gets the value of the devDetailCim property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailCimType }
     *     
     */
    public DevDetailCimType getDevDetailCim() {
        return devDetailCim;
    }

    /**
     * Sets the value of the devDetailCim property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailCimType }
     *     
     */
    public void setDevDetailCim(DevDetailCimType value) {
        this.devDetailCim = value;
    }

    /**
     * Gets the value of the devDetailApp property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailAppType }
     *     
     */
    public DevDetailAppType getDevDetailApp() {
        return devDetailApp;
    }

    /**
     * Sets the value of the devDetailApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailAppType }
     *     
     */
    public void setDevDetailApp(DevDetailAppType value) {
        this.devDetailApp = value;
    }

}
