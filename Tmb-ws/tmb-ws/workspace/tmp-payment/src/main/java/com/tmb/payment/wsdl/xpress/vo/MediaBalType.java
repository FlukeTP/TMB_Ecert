
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaBal_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaBal_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaTotal" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "MediaBal_Type", propOrder = {
    "curAmt",
    "mediaTotal",
    "chkNumRange"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MediaBalType.class
})
public class MediaBalType {

    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "MediaTotal")
    protected List<MediaTotalType> mediaTotal;
    @XmlElement(name = "ChkNumRange")
    protected List<ChkNumRangeType> chkNumRange;

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
     * Gets the value of the mediaTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaTotalType }
     * 
     * 
     */
    public List<MediaTotalType> getMediaTotal() {
        if (mediaTotal == null) {
            mediaTotal = new ArrayList<MediaTotalType>();
        }
        return this.mediaTotal;
    }

    /**
     * Gets the value of the chkNumRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkNumRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkNumRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChkNumRangeType }
     * 
     * 
     */
    public List<ChkNumRangeType> getChkNumRange() {
        if (chkNumRange == null) {
            chkNumRange = new ArrayList<ChkNumRangeType>();
        }
        return this.chkNumRange;
    }

}
