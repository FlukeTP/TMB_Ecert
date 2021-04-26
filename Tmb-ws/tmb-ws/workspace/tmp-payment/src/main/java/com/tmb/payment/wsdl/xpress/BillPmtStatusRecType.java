
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPmtStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPmtStatusRec_Type", propOrder = {
    "billPmtKeys",
    "billPmtStatus"
})
public class BillPmtStatusRecType {

    @XmlElement(name = "BillPmtKeys")
    protected BillPmtKeysType billPmtKeys;
    @XmlElement(name = "BillPmtStatus")
    protected BillPmtStatusType billPmtStatus;

    /**
     * Gets the value of the billPmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtKeysType }
     *     
     */
    public BillPmtKeysType getBillPmtKeys() {
        return billPmtKeys;
    }

    /**
     * Sets the value of the billPmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtKeysType }
     *     
     */
    public void setBillPmtKeys(BillPmtKeysType value) {
        this.billPmtKeys = value;
    }

    /**
     * Gets the value of the billPmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtStatusType }
     *     
     */
    public BillPmtStatusType getBillPmtStatus() {
        return billPmtStatus;
    }

    /**
     * Sets the value of the billPmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtStatusType }
     *     
     */
    public void setBillPmtStatus(BillPmtStatusType value) {
        this.billPmtStatus = value;
    }

}
