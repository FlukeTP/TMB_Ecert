
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NextTrnIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BusinessDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinLimitAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxLimitAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctInfo_Type", propOrder = {
    "mediaAcctIdent",
    "mediaAcctType",
    "mediaItem",
    "curAmt",
    "count",
    "branchIdent",
    "nextTrnIdent",
    "businessDt",
    "minLimitAmt",
    "maxLimitAmt"
})
public class MediaAcctInfoType {

    @XmlElement(name = "MediaAcctIdent")
    protected String mediaAcctIdent;
    @XmlElement(name = "MediaAcctType", required = true)
    protected String mediaAcctType;
    @XmlElement(name = "MediaItem")
    protected List<MediaItemType> mediaItem;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "BranchIdent")
    protected String branchIdent;
    @XmlElement(name = "NextTrnIdent")
    protected Long nextTrnIdent;
    @XmlElement(name = "BusinessDt")
    protected String businessDt;
    @XmlElement(name = "MinLimitAmt")
    protected MinLimitAmtType minLimitAmt;
    @XmlElement(name = "MaxLimitAmt")
    protected MaxLimitAmtType maxLimitAmt;

    /**
     * Gets the value of the mediaAcctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctIdent() {
        return mediaAcctIdent;
    }

    /**
     * Sets the value of the mediaAcctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctIdent(String value) {
        this.mediaAcctIdent = value;
    }

    /**
     * Gets the value of the mediaAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctType() {
        return mediaAcctType;
    }

    /**
     * Sets the value of the mediaAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctType(String value) {
        this.mediaAcctType = value;
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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

    /**
     * Gets the value of the nextTrnIdent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNextTrnIdent() {
        return nextTrnIdent;
    }

    /**
     * Sets the value of the nextTrnIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNextTrnIdent(Long value) {
        this.nextTrnIdent = value;
    }

    /**
     * Gets the value of the businessDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDt() {
        return businessDt;
    }

    /**
     * Sets the value of the businessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDt(String value) {
        this.businessDt = value;
    }

    /**
     * Gets the value of the minLimitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinLimitAmtType }
     *     
     */
    public MinLimitAmtType getMinLimitAmt() {
        return minLimitAmt;
    }

    /**
     * Sets the value of the minLimitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinLimitAmtType }
     *     
     */
    public void setMinLimitAmt(MinLimitAmtType value) {
        this.minLimitAmt = value;
    }

    /**
     * Gets the value of the maxLimitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxLimitAmtType }
     *     
     */
    public MaxLimitAmtType getMaxLimitAmt() {
        return maxLimitAmt;
    }

    /**
     * Sets the value of the maxLimitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLimitAmtType }
     *     
     */
    public void setMaxLimitAmt(MaxLimitAmtType value) {
        this.maxLimitAmt = value;
    }

}
