
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchItemRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchItemRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchItemRec_Type", propOrder = {
    "purchItemId",
    "purchItemInfo",
    "purchItemEnvr",
    "purchItemStatus"
})
public class PurchItemRecType {

    @XmlElement(name = "PurchItemId", required = true)
    protected String purchItemId;
    @XmlElement(name = "PurchItemInfo", required = true)
    protected PurchItemInfoType purchItemInfo;
    @XmlElement(name = "PurchItemEnvr")
    protected PurchItemEnvrType purchItemEnvr;
    @XmlElement(name = "PurchItemStatus", required = true)
    protected PurchItemStatusType purchItemStatus;

    /**
     * Gets the value of the purchItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchItemId() {
        return purchItemId;
    }

    /**
     * Sets the value of the purchItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchItemId(String value) {
        this.purchItemId = value;
    }

    /**
     * Gets the value of the purchItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemInfoType }
     *     
     */
    public PurchItemInfoType getPurchItemInfo() {
        return purchItemInfo;
    }

    /**
     * Sets the value of the purchItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemInfoType }
     *     
     */
    public void setPurchItemInfo(PurchItemInfoType value) {
        this.purchItemInfo = value;
    }

    /**
     * Gets the value of the purchItemEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemEnvrType }
     *     
     */
    public PurchItemEnvrType getPurchItemEnvr() {
        return purchItemEnvr;
    }

    /**
     * Sets the value of the purchItemEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemEnvrType }
     *     
     */
    public void setPurchItemEnvr(PurchItemEnvrType value) {
        this.purchItemEnvr = value;
    }

    /**
     * Gets the value of the purchItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemStatusType }
     *     
     */
    public PurchItemStatusType getPurchItemStatus() {
        return purchItemStatus;
    }

    /**
     * Sets the value of the purchItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemStatusType }
     *     
     */
    public void setPurchItemStatus(PurchItemStatusType value) {
        this.purchItemStatus = value;
    }

}
