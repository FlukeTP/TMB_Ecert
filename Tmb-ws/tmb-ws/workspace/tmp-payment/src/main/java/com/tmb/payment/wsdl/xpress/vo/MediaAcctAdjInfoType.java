
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctAdjInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctAdjInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaTrnType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnAuthIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnRqUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RelatedCreditRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseEnvr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctAdjInfo_Type", propOrder = {
    "mediaAcctId",
    "mediaTrnType",
    "curAmt",
    "trnAuthIdent",
    "trnRqUID",
    "relatedCreditRef",
    "mediaItem",
    "baseEnvr"
})
public class MediaAcctAdjInfoType {

    @XmlElement(name = "MediaAcctId", required = true)
    protected String mediaAcctId;
    @XmlElement(name = "MediaTrnType")
    protected String mediaTrnType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "TrnAuthIdent")
    protected String trnAuthIdent;
    @XmlElement(name = "TrnRqUID")
    protected String trnRqUID;
    @XmlElement(name = "RelatedCreditRef")
    protected String relatedCreditRef;
    @XmlElement(name = "MediaItem", required = true)
    protected List<MediaItemType> mediaItem;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the mediaAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctId() {
        return mediaAcctId;
    }

    /**
     * Sets the value of the mediaAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctId(String value) {
        this.mediaAcctId = value;
    }

    /**
     * Gets the value of the mediaTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTrnType() {
        return mediaTrnType;
    }

    /**
     * Sets the value of the mediaTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTrnType(String value) {
        this.mediaTrnType = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the trnAuthIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnAuthIdent() {
        return trnAuthIdent;
    }

    /**
     * Sets the value of the trnAuthIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnAuthIdent(String value) {
        this.trnAuthIdent = value;
    }

    /**
     * Gets the value of the trnRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnRqUID() {
        return trnRqUID;
    }

    /**
     * Sets the value of the trnRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnRqUID(String value) {
        this.trnRqUID = value;
    }

    /**
     * Gets the value of the relatedCreditRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCreditRef() {
        return relatedCreditRef;
    }

    /**
     * Sets the value of the relatedCreditRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCreditRef(String value) {
        this.relatedCreditRef = value;
    }

    /**
     * Gets the value of the mediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaItemType }
     * 
     * 
     */
    public List<MediaItemType> getMediaItem() {
        if (mediaItem == null) {
            mediaItem = new ArrayList<MediaItemType>();
        }
        return this.mediaItem;
    }

    /**
     * Gets the value of the baseEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BaseEnvrType }
     *     
     */
    public BaseEnvrType getBaseEnvr() {
        return baseEnvr;
    }

    /**
     * Sets the value of the baseEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseEnvrType }
     *     
     */
    public void setBaseEnvr(BaseEnvrType value) {
        this.baseEnvr = value;
    }

}
