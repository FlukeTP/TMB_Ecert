
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.ChkNumRangeType;


/**
 * <p>Java class for AlertInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AlertInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DeliveryInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AlertAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ThresholdOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertInfo_Type", propOrder = {
    "deliveryInstruction",
    "alertAmt",
    "chkNum",
    "chkNumRange",
    "thresholdOperation",
    "count"
})
public class AlertInfoType
    extends com.tmb.payment.wsdl.xpress.vo.AlertInfoType
{

    @XmlElement(name = "DeliveryInstruction")
    protected List<DeliveryInstructionType> deliveryInstruction;
    @XmlElement(name = "AlertAmt")
    protected AlertAmtType alertAmt;
    @XmlElement(name = "ChkNum", namespace = "urn:ifxforum-org:XSD:1")
    protected String chkNum;
    @XmlElement(name = "ChkNumRange", namespace = "urn:ifxforum-org:XSD:1")
    protected ChkNumRangeType chkNumRange;
    @XmlElement(name = "ThresholdOperation")
    protected String thresholdOperation;
    @XmlElement(name = "Count", namespace = "urn:ifxforum-org:XSD:1")
    protected Long count;

    /**
     * Gets the value of the deliveryInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInstructionType }
     * 
     * 
     */
    public List<DeliveryInstructionType> getDeliveryInstruction() {
        if (deliveryInstruction == null) {
            deliveryInstruction = new ArrayList<DeliveryInstructionType>();
        }
        return this.deliveryInstruction;
    }

    /**
     * Gets the value of the alertAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AlertAmtType }
     *     
     */
    public AlertAmtType getAlertAmt() {
        return alertAmt;
    }

    /**
     * Sets the value of the alertAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertAmtType }
     *     
     */
    public void setAlertAmt(AlertAmtType value) {
        this.alertAmt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the chkNumRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumRangeType }
     *     
     */
    public ChkNumRangeType getChkNumRange() {
        return chkNumRange;
    }

    /**
     * Sets the value of the chkNumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumRangeType }
     *     
     */
    public void setChkNumRange(ChkNumRangeType value) {
        this.chkNumRange = value;
    }

    /**
     * Gets the value of the thresholdOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholdOperation() {
        return thresholdOperation;
    }

    /**
     * Sets the value of the thresholdOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholdOperation(String value) {
        this.thresholdOperation = value;
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
