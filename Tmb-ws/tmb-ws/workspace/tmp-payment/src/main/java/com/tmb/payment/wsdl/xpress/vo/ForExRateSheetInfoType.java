
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffTimeFrame"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FixingDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetCurRate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetInfo_Type", propOrder = {
    "effTimeFrame",
    "minCurAmt",
    "maxCurAmt",
    "fixingDt",
    "forExRateType",
    "forExRateSheetCurRate"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ForExRateSheetInfoType.class
})
public class ForExRateSheetInfoType {

    @XmlElement(name = "EffTimeFrame", required = true)
    protected EffTimeFrameType effTimeFrame;
    @XmlElement(name = "MinCurAmt")
    protected MinCurAmtType minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected MaxCurAmtType maxCurAmt;
    @XmlElement(name = "FixingDt")
    protected String fixingDt;
    @XmlElement(name = "ForExRateType")
    @XmlSchemaType(name = "string")
    protected ForExRateTypeType forExRateType;
    @XmlElementRef(name = "ForExRateSheetCurRate", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetCurRateType>> forExRateSheetCurRate;

    /**
     * Gets the value of the effTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link EffTimeFrameType }
     *     
     */
    public EffTimeFrameType getEffTimeFrame() {
        return effTimeFrame;
    }

    /**
     * Sets the value of the effTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffTimeFrameType }
     *     
     */
    public void setEffTimeFrame(EffTimeFrameType value) {
        this.effTimeFrame = value;
    }

    /**
     * Gets the value of the minCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinCurAmtType }
     *     
     */
    public MinCurAmtType getMinCurAmt() {
        return minCurAmt;
    }

    /**
     * Sets the value of the minCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinCurAmtType }
     *     
     */
    public void setMinCurAmt(MinCurAmtType value) {
        this.minCurAmt = value;
    }

    /**
     * Gets the value of the maxCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxCurAmtType }
     *     
     */
    public MaxCurAmtType getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Sets the value of the maxCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxCurAmtType }
     *     
     */
    public void setMaxCurAmt(MaxCurAmtType value) {
        this.maxCurAmt = value;
    }

    /**
     * Gets the value of the fixingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingDt() {
        return fixingDt;
    }

    /**
     * Sets the value of the fixingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDt(String value) {
        this.fixingDt = value;
    }

    /**
     * Gets the value of the forExRateType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateTypeType }
     *     
     */
    public ForExRateTypeType getForExRateType() {
        return forExRateType;
    }

    /**
     * Sets the value of the forExRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateTypeType }
     *     
     */
    public void setForExRateType(ForExRateTypeType value) {
        this.forExRateType = value;
    }

    /**
     * Gets the value of the forExRateSheetCurRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forExRateSheetCurRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForExRateSheetCurRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ForExRateSheetCurRateType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ForExRateSheetCurRateType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetCurRateType>> getForExRateSheetCurRate() {
        if (forExRateSheetCurRate == null) {
            forExRateSheetCurRate = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ForExRateSheetCurRateType>>();
        }
        return this.forExRateSheetCurRate;
    }

}
