
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaItem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaItem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaBal"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaCashData"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaChkData" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "MediaItem_Type", propOrder = {
    "mediaItemIdent",
    "mediaItemType",
    "mediaItemSubType",
    "mediaBal",
    "mediaCashData",
    "creditMediaChkData"
})
public class MediaItemType {

    @XmlElement(name = "MediaItemIdent")
    protected String mediaItemIdent;
    @XmlElement(name = "MediaItemType", required = true)
    protected String mediaItemType;
    @XmlElement(name = "MediaItemSubType")
    protected String mediaItemSubType;
    @XmlElementRef(name = "MediaBal", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType> mediaBal;
    @XmlElementRef(name = "MediaCashData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> mediaCashData;
    @XmlElementRef(name = "CreditMediaChkData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType>> creditMediaChkData;

    /**
     * Gets the value of the mediaItemIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemIdent() {
        return mediaItemIdent;
    }

    /**
     * Sets the value of the mediaItemIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemIdent(String value) {
        this.mediaItemIdent = value;
    }

    /**
     * Gets the value of the mediaItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemType() {
        return mediaItemType;
    }

    /**
     * Sets the value of the mediaItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemType(String value) {
        this.mediaItemType = value;
    }

    /**
     * Gets the value of the mediaItemSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemSubType() {
        return mediaItemSubType;
    }

    /**
     * Sets the value of the mediaItemSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemSubType(String value) {
        this.mediaItemSubType = value;
    }

    /**
     * Gets the value of the mediaBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaBalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaBalType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType> getMediaBal() {
        return mediaBal;
    }

    /**
     * Sets the value of the mediaBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaBalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaBalType }{@code >}
     *     
     */
    public void setMediaBal(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType> value) {
        this.mediaBal = value;
    }

    /**
     * Gets the value of the mediaCashData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaCashDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaCashDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> getMediaCashData() {
        return mediaCashData;
    }

    /**
     * Sets the value of the mediaCashData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaCashDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaCashDataType }{@code >}
     *     
     */
    public void setMediaCashData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> value) {
        this.mediaCashData = value;
    }

    /**
     * Gets the value of the creditMediaChkData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditMediaChkData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditMediaChkData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditMediaChkDataType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType>> getCreditMediaChkData() {
        if (creditMediaChkData == null) {
            creditMediaChkData = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType>>();
        }
        return this.creditMediaChkData;
    }

}
