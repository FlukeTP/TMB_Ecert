
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctInfo"/&gt;
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
@XmlType(name = "MediaAcctRef_Type", propOrder = {
    "mediaAcctKeys",
    "mediaAcctRec",
    "mediaAcctInfo"
})
public class MediaAcctRefType {

    @XmlElement(name = "MediaAcctKeys")
    protected MediaAcctKeysType mediaAcctKeys;
    @XmlElementRef(name = "MediaAcctRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> mediaAcctRec;
    @XmlElement(name = "MediaAcctInfo")
    protected MediaAcctInfoType mediaAcctInfo;

    /**
     * Gets the value of the mediaAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public MediaAcctKeysType getMediaAcctKeys() {
        return mediaAcctKeys;
    }

    /**
     * Sets the value of the mediaAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public void setMediaAcctKeys(MediaAcctKeysType value) {
        this.mediaAcctKeys = value;
    }

    /**
     * Gets the value of the mediaAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> getMediaAcctRec() {
        return mediaAcctRec;
    }

    /**
     * Sets the value of the mediaAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType }{@code >}
     *     
     */
    public void setMediaAcctRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctRecType> value) {
        this.mediaAcctRec = value;
    }

    /**
     * Gets the value of the mediaAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctInfoType }
     *     
     */
    public MediaAcctInfoType getMediaAcctInfo() {
        return mediaAcctInfo;
    }

    /**
     * Sets the value of the mediaAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctInfoType }
     *     
     */
    public void setMediaAcctInfo(MediaAcctInfoType value) {
        this.mediaAcctInfo = value;
    }

}
