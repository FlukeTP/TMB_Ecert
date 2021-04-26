
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaTotal_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaTotal_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaTotalType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TotalCurAmt" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaTotal_Type", propOrder = {
    "mediaTotalType",
    "count",
    "totalCurAmt"
})
public class MediaTotalType {

    @XmlElement(name = "MediaTotalType", required = true)
    protected String mediaTotalType;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "TotalCurAmt")
    protected TotalCurAmtType totalCurAmt;

    /**
     * Gets the value of the mediaTotalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTotalType() {
        return mediaTotalType;
    }

    /**
     * Sets the value of the mediaTotalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTotalType(String value) {
        this.mediaTotalType = value;
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
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmtType }
     *     
     */
    public TotalCurAmtType getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmtType }
     *     
     */
    public void setTotalCurAmt(TotalCurAmtType value) {
        this.totalCurAmt = value;
    }

}
