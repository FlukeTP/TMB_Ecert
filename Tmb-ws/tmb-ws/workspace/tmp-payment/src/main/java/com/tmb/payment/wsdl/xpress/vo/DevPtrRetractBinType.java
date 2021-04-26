
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPtrRetractBin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPtrRetractBin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Index"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrRetractBinStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPtrRetractBin_Type", propOrder = {
    "index",
    "devPtrRetractBinStatus",
    "count"
})
public class DevPtrRetractBinType {

    @XmlElement(name = "Index")
    protected long index;
    @XmlElement(name = "DevPtrRetractBinStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DevPtrRetractBinStatusType devPtrRetractBinStatus;
    @XmlElement(name = "Count")
    protected Long count;

    /**
     * Gets the value of the index property.
     * 
     */
    public long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(long value) {
        this.index = value;
    }

    /**
     * Gets the value of the devPtrRetractBinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrRetractBinStatusType }
     *     
     */
    public DevPtrRetractBinStatusType getDevPtrRetractBinStatus() {
        return devPtrRetractBinStatus;
    }

    /**
     * Sets the value of the devPtrRetractBinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrRetractBinStatusType }
     *     
     */
    public void setDevPtrRetractBinStatus(DevPtrRetractBinStatusType value) {
        this.devPtrRetractBinStatus = value;
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

}
