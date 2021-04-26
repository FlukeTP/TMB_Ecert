
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPmtRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}BillPmtKeys"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}BillPmtRec"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}BillPmtInfo"/&gt;
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
@XmlType(name = "BillPmtRef_Type", propOrder = {
    "spName",
    "billPmtKeys",
    "billPmtRec",
    "billPmtInfo"
})
public class BillPmtRefType {

    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String spName;
    @XmlElement(name = "BillPmtKeys")
    protected BillPmtKeysType billPmtKeys;
    @XmlElement(name = "BillPmtRec")
    protected BillPmtRecType billPmtRec;
    @XmlElement(name = "BillPmtInfo")
    protected BillPmtInfoType billPmtInfo;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

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
     * Gets the value of the billPmtRec property.
     * 
     * @return
     *     possible object is
     *     {@link BillPmtRecType }
     *     
     */
    public BillPmtRecType getBillPmtRec() {
        return billPmtRec;
    }

    /**
     * Sets the value of the billPmtRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPmtRecType }
     *     
     */
    public void setBillPmtRec(BillPmtRecType value) {
        this.billPmtRec = value;
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

}
