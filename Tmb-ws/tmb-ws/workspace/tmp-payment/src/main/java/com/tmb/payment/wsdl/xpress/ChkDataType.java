
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ChkData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MediaItemType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MediaItemDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreditorData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DebtorData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkData_Type", propOrder = {
    "mediaItemType",
    "mediaItemDesc",
    "creditorData",
    "debtorData"
})
public class ChkDataType
    extends com.tmb.payment.wsdl.xpress.vo.ChkDataType
{

    @XmlElement(name = "MediaItemType")
    protected String mediaItemType;
    @XmlElement(name = "MediaItemDesc")
    protected String mediaItemDesc;
    @XmlElement(name = "CreditorData")
    protected CreditorDataType creditorData;
    @XmlElement(name = "DebtorData")
    protected DebtorDataType debtorData;

    /**
     * Gets the value of the mediaItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemType() {
        return mediaItemType;
    }

    /**
     * Sets the value of the mediaItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemType(String value) {
        this.mediaItemType = value;
    }

    /**
     * Gets the value of the mediaItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemDesc() {
        return mediaItemDesc;
    }

    /**
     * Sets the value of the mediaItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemDesc(String value) {
        this.mediaItemDesc = value;
    }

    /**
     * Gets the value of the creditorData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorDataType }
     *     
     */
    public CreditorDataType getCreditorData() {
        return creditorData;
    }

    /**
     * Sets the value of the creditorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorDataType }
     *     
     */
    public void setCreditorData(CreditorDataType value) {
        this.creditorData = value;
    }

    /**
     * Gets the value of the debtorData property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorDataType }
     *     
     */
    public DebtorDataType getDebtorData() {
        return debtorData;
    }

    /**
     * Sets the value of the debtorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorDataType }
     *     
     */
    public void setDebtorData(DebtorDataType value) {
        this.debtorData = value;
    }

}
