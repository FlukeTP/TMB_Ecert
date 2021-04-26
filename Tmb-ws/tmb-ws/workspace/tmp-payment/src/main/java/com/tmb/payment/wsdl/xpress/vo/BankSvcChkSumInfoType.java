
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSumInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSumInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MsgType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankSvcChkSumInfo_Type", propOrder = {
    "refData",
    "msgType",
    "count",
    "bankSvcChkSum"
})
public class BankSvcChkSumInfoType {

    @XmlElement(name = "RefData")
    protected RefDataType refData;
    @XmlElement(name = "MsgType", required = true)
    protected String msgType;
    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "BankSvcChkSum")
    protected List<BankSvcChkSumType> bankSvcChkSum;

    /**
     * Gets the value of the refData property.
     * 
     * @return
     *     possible object is
     *     {@link RefDataType }
     *     
     */
    public RefDataType getRefData() {
        return refData;
    }

    /**
     * Sets the value of the refData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDataType }
     *     
     */
    public void setRefData(RefDataType value) {
        this.refData = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
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
     * Gets the value of the bankSvcChkSum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankSvcChkSum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankSvcChkSum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankSvcChkSumType }
     * 
     * 
     */
    public List<BankSvcChkSumType> getBankSvcChkSum() {
        if (bankSvcChkSum == null) {
            bankSvcChkSum = new ArrayList<BankSvcChkSumType>();
        }
        return this.bankSvcChkSum;
    }

}
