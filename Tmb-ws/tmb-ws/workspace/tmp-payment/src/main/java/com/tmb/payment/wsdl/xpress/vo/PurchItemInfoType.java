
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchItemInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchItemInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvItemId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemDesc" minOccurs="0"/&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TotalCompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchItemInfo_Type", propOrder = {
    "seqNum",
    "count",
    "invItemId",
    "purchItemDesc",
    "compositeCurAmtAndTotalCompositeCurAmt",
    "purchItemDetail"
})
public class PurchItemInfoType {

    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "InvItemId", required = true)
    protected String invItemId;
    @XmlElement(name = "PurchItemDesc")
    protected String purchItemDesc;
    @XmlElements({
        @XmlElement(name = "CompositeCurAmt"),
        @XmlElement(name = "TotalCompositeCurAmt", type = TotalCompositeCurAmtType.class)
    })
    protected List<CompositeCurAmtType> compositeCurAmtAndTotalCompositeCurAmt;
    @XmlElement(name = "PurchItemDetail")
    protected PurchItemDetailType purchItemDetail;

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the invItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvItemId() {
        return invItemId;
    }

    /**
     * Sets the value of the invItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvItemId(String value) {
        this.invItemId = value;
    }

    /**
     * Gets the value of the purchItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchItemDesc() {
        return purchItemDesc;
    }

    /**
     * Sets the value of the purchItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchItemDesc(String value) {
        this.purchItemDesc = value;
    }

    /**
     * Gets the value of the compositeCurAmtAndTotalCompositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmtAndTotalCompositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmtAndTotalCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * {@link TotalCompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmtAndTotalCompositeCurAmt() {
        if (compositeCurAmtAndTotalCompositeCurAmt == null) {
            compositeCurAmtAndTotalCompositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmtAndTotalCompositeCurAmt;
    }

    /**
     * Gets the value of the purchItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemDetailType }
     *     
     */
    public PurchItemDetailType getPurchItemDetail() {
        return purchItemDetail;
    }

    /**
     * Sets the value of the purchItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemDetailType }
     *     
     */
    public void setPurchItemDetail(PurchItemDetailType value) {
        this.purchItemDetail = value;
    }

}
