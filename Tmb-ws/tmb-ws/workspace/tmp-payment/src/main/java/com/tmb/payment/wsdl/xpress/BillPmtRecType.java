
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPmtRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtKeys"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPmtRec_Type", propOrder = {
    "billPmtKeys",
    "billPmtInfo",
    "billPmtEnvr",
    "billPmtAuth",
    "billPmtStatus"
})
public class BillPmtRecType {

    @XmlElement(name = "BillPmtKeys", required = true)
    protected BillPmtKeysType billPmtKeys;
    @XmlElement(name = "BillPmtInfo", required = true)
    protected BillPmtInfoType billPmtInfo;
    @XmlElement(name = "BillPmtEnvr")
    protected BillPmtEnvrType billPmtEnvr;
    @XmlElement(name = "BillPmtAuth")
    protected BillPmtAuthType billPmtAuth;
    @XmlElement(name = "BillPmtStatus", required = true)
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
     * Gets the value of the billPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtInfoType }
     *     
     */
    public BillPmtInfoType getBillPmtInfo() {
        return billPmtInfo;
    }

    /**
     * Sets the value of the billPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtInfoType }
     *     
     */
    public void setBillPmtInfo(BillPmtInfoType value) {
        this.billPmtInfo = value;
    }

    /**
     * Gets the value of the billPmtEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtEnvrType }
     *     
     */
    public BillPmtEnvrType getBillPmtEnvr() {
        return billPmtEnvr;
    }

    /**
     * Sets the value of the billPmtEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtEnvrType }
     *     
     */
    public void setBillPmtEnvr(BillPmtEnvrType value) {
        this.billPmtEnvr = value;
    }

    /**
     * Gets the value of the billPmtAuth property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtAuthType }
     *     
     */
    public BillPmtAuthType getBillPmtAuth() {
        return billPmtAuth;
    }

    /**
     * Sets the value of the billPmtAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtAuthType }
     *     
     */
    public void setBillPmtAuth(BillPmtAuthType value) {
        this.billPmtAuth = value;
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
