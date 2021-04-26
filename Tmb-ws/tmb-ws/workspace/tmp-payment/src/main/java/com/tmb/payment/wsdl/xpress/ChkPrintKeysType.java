
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkPrintKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkPrintKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ChkPrintId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}ChkPrintIdent"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}MediaItemType" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}MediaItemDesc" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotAvailInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkPrintKeys_Type", propOrder = {
    "chkPrintId",
    "chkPrintIdent",
    "mediaItemType",
    "mediaItemDesc",
    "notAvailInd"
})
public class ChkPrintKeysType {

    @XmlElement(name = "ChkPrintId")
    protected String chkPrintId;
    @XmlElement(name = "ChkPrintIdent")
    protected String chkPrintIdent;
    @XmlElement(name = "MediaItemType")
    protected String mediaItemType;
    @XmlElement(name = "MediaItemDesc")
    protected String mediaItemDesc;
    @XmlElement(name = "NotAvailInd")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the chkPrintId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkPrintId() {
        return chkPrintId;
    }

    /**
     * Sets the value of the chkPrintId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkPrintId(String value) {
        this.chkPrintId = value;
    }

    /**
     * Gets the value of the chkPrintIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkPrintIdent() {
        return chkPrintIdent;
    }

    /**
     * Sets the value of the chkPrintIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkPrintIdent(String value) {
        this.chkPrintIdent = value;
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
     * Gets the value of the mediaItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemDesc() {
        return mediaItemDesc;
    }

    /**
     * Sets the value of the mediaItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemDesc(String value) {
        this.mediaItemDesc = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
