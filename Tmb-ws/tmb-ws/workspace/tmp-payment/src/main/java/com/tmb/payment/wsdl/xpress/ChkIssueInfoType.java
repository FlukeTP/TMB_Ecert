
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ChkIssueInfo_Type"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PackType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SerialNumStart" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SerialNumEnd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Payee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChkImgData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueInfo_Type", propOrder = {
    "deliveryInstruction",
    "count",
    "packType",
    "serialNumStart",
    "serialNumEnd",
    "payee",
    "chkImgData",
    "acctKeys"
})
public class ChkIssueInfoType
    extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType
{

    @XmlElement(name = "DeliveryInstruction", namespace = "urn:ifxforum-org:XSD:1")
    protected String deliveryInstruction;
    @XmlElement(name = "Count", namespace = "urn:ifxforum-org:XSD:1")
    protected Long count;
    @XmlElement(name = "PackType")
    protected String packType;
    @XmlElement(name = "SerialNumStart", namespace = "urn:ifxforum-org:XSD:1")
    protected String serialNumStart;
    @XmlElement(name = "SerialNumEnd", namespace = "urn:ifxforum-org:XSD:1")
    protected String serialNumEnd;
    @XmlElement(name = "Payee")
    protected List<String> payee;
    @XmlElement(name = "ChkImgData")
    protected ChkImgDataType chkImgData;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;

    /**
     * Gets the value of the deliveryInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstruction() {
        return deliveryInstruction;
    }

    /**
     * Sets the value of the deliveryInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstruction(String value) {
        this.deliveryInstruction = value;
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
     * Gets the value of the packType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackType() {
        return packType;
    }

    /**
     * Sets the value of the packType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackType(String value) {
        this.packType = value;
    }

    /**
     * Gets the value of the serialNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumStart() {
        return serialNumStart;
    }

    /**
     * Sets the value of the serialNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumStart(String value) {
        this.serialNumStart = value;
    }

    /**
     * Gets the value of the serialNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumEnd() {
        return serialNumEnd;
    }

    /**
     * Sets the value of the serialNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumEnd(String value) {
        this.serialNumEnd = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPayee() {
        if (payee == null) {
            payee = new ArrayList<String>();
        }
        return this.payee;
    }

    /**
     * Gets the value of the chkImgData property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgDataType }
     *     
     */
    public ChkImgDataType getChkImgData() {
        return chkImgData;
    }

    /**
     * Sets the value of the chkImgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgDataType }
     *     
     */
    public void setChkImgData(ChkImgDataType value) {
        this.chkImgData = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

}
