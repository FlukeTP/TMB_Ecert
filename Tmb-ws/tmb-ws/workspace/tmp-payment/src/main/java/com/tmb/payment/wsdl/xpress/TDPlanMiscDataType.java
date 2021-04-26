
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDPlanMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDPlanMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDPlanMiscData_Type", propOrder = {
    "tdPlanMiscType",
    "miscText",
    "miscInd",
    "miscDate",
    "miscDetail"
})
public class TDPlanMiscDataType {

    @XmlElement(name = "TDPlanMiscType", required = true)
    protected String tdPlanMiscType;
    @XmlElement(name = "MiscText")
    protected String miscText;
    @XmlElement(name = "MiscInd")
    protected Boolean miscInd;
    @XmlElement(name = "MiscDate")
    protected String miscDate;
    @XmlElement(name = "MiscDetail")
    protected MiscDetailType miscDetail;

    /**
     * Gets the value of the tdPlanMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDPlanMiscType() {
        return tdPlanMiscType;
    }

    /**
     * Sets the value of the tdPlanMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDPlanMiscType(String value) {
        this.tdPlanMiscType = value;
    }

    /**
     * Gets the value of the miscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscText() {
        return miscText;
    }

    /**
     * Sets the value of the miscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscText(String value) {
        this.miscText = value;
    }

    /**
     * Gets the value of the miscInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiscInd() {
        return miscInd;
    }

    /**
     * Sets the value of the miscInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiscInd(Boolean value) {
        this.miscInd = value;
    }

    /**
     * Gets the value of the miscDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDate() {
        return miscDate;
    }

    /**
     * Sets the value of the miscDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDate(String value) {
        this.miscDate = value;
    }

    /**
     * Gets the value of the miscDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MiscDetailType }
     *     
     */
    public MiscDetailType getMiscDetail() {
        return miscDetail;
    }

    /**
     * Sets the value of the miscDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscDetailType }
     *     
     */
    public void setMiscDetail(MiscDetailType value) {
        this.miscDetail = value;
    }

}
