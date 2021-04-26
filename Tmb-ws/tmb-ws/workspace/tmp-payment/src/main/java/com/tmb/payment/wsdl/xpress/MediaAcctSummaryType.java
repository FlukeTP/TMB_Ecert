
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctSummary_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctSummary_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MediaAcctSummary_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AttributeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatisticInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrwDisabledInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SettleInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SysDefInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctSummary_Type", propOrder = {
    "attributeType",
    "statisticInd",
    "drwDisabledInd",
    "settleInd",
    "sysDefInd",
    "drawerData"
})
public class MediaAcctSummaryType
    extends com.tmb.payment.wsdl.xpress.vo.MediaAcctSummaryType
{

    @XmlElement(name = "AttributeType")
    protected String attributeType;
    @XmlElement(name = "StatisticInd")
    protected Boolean statisticInd;
    @XmlElement(name = "DrwDisabledInd")
    protected Boolean drwDisabledInd;
    @XmlElement(name = "SettleInd")
    protected Boolean settleInd;
    @XmlElement(name = "SysDefInd")
    protected Boolean sysDefInd;
    @XmlElement(name = "DrawerData")
    protected DrawerDataType drawerData;

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }

    /**
     * Gets the value of the statisticInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatisticInd() {
        return statisticInd;
    }

    /**
     * Sets the value of the statisticInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatisticInd(Boolean value) {
        this.statisticInd = value;
    }

    /**
     * Gets the value of the drwDisabledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrwDisabledInd() {
        return drwDisabledInd;
    }

    /**
     * Sets the value of the drwDisabledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrwDisabledInd(Boolean value) {
        this.drwDisabledInd = value;
    }

    /**
     * Gets the value of the settleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSettleInd() {
        return settleInd;
    }

    /**
     * Sets the value of the settleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSettleInd(Boolean value) {
        this.settleInd = value;
    }

    /**
     * Gets the value of the sysDefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysDefInd() {
        return sysDefInd;
    }

    /**
     * Sets the value of the sysDefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysDefInd(Boolean value) {
        this.sysDefInd = value;
    }

    /**
     * Gets the value of the drawerData property.
     * 
     * @return
     *     possible object is
     *     {@link DrawerDataType }
     *     
     */
    public DrawerDataType getDrawerData() {
        return drawerData;
    }

    /**
     * Sets the value of the drawerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawerDataType }
     *     
     */
    public void setDrawerData(DrawerDataType value) {
        this.drawerData = value;
    }

}
