
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillRec_Type", propOrder = {
    "billId",
    "billInfo",
    "billEnvr",
    "billStatus"
})
public class BillRecType {

    @XmlElement(name = "BillId", required = true)
    protected String billId;
    @XmlElement(name = "BillInfo", required = true)
    protected BillInfoType billInfo;
    @XmlElement(name = "BillEnvr")
    protected BillEnvrType billEnvr;
    @XmlElement(name = "BillStatus", required = true)
    protected BillStatusType billStatus;

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillId(String value) {
        this.billId = value;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillInfoType }
     *     
     */
    public BillInfoType getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInfoType }
     *     
     */
    public void setBillInfo(BillInfoType value) {
        this.billInfo = value;
    }

    /**
     * Gets the value of the billEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BillEnvrType }
     *     
     */
    public BillEnvrType getBillEnvr() {
        return billEnvr;
    }

    /**
     * Sets the value of the billEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillEnvrType }
     *     
     */
    public void setBillEnvr(BillEnvrType value) {
        this.billEnvr = value;
    }

    /**
     * Gets the value of the billStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatusType }
     *     
     */
    public BillStatusType getBillStatus() {
        return billStatus;
    }

    /**
     * Sets the value of the billStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatusType }
     *     
     */
    public void setBillStatus(BillStatusType value) {
        this.billStatus = value;
    }

}
