
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insurance_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RequiredCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InsuranceOrgData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IndexCardCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExpNoticeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExpNoticesCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExpNoticeLeadDays" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Flood" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance_Type", propOrder = {
    "requiredCode",
    "insuranceOrgData",
    "typeCode",
    "indexCardCount",
    "expNoticeCode",
    "expNoticesCount",
    "expNoticeLeadDays",
    "expDt",
    "flood"
})
public class InsuranceType {

    @XmlElement(name = "RequiredCode")
    protected String requiredCode;
    @XmlElement(name = "InsuranceOrgData")
    protected InsuranceOrgDataType insuranceOrgData;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "IndexCardCount")
    protected Long indexCardCount;
    @XmlElement(name = "ExpNoticeCode")
    protected String expNoticeCode;
    @XmlElement(name = "ExpNoticesCount")
    protected Long expNoticesCount;
    @XmlElement(name = "ExpNoticeLeadDays")
    protected Long expNoticeLeadDays;
    @XmlElement(name = "ExpDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String expDt;
    @XmlElement(name = "Flood")
    protected FloodType flood;

    /**
     * Gets the value of the requiredCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredCode() {
        return requiredCode;
    }

    /**
     * Sets the value of the requiredCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredCode(String value) {
        this.requiredCode = value;
    }

    /**
     * Gets the value of the insuranceOrgData property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOrgDataType }
     *     
     */
    public InsuranceOrgDataType getInsuranceOrgData() {
        return insuranceOrgData;
    }

    /**
     * Sets the value of the insuranceOrgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOrgDataType }
     *     
     */
    public void setInsuranceOrgData(InsuranceOrgDataType value) {
        this.insuranceOrgData = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the indexCardCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndexCardCount() {
        return indexCardCount;
    }

    /**
     * Sets the value of the indexCardCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndexCardCount(Long value) {
        this.indexCardCount = value;
    }

    /**
     * Gets the value of the expNoticeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpNoticeCode() {
        return expNoticeCode;
    }

    /**
     * Sets the value of the expNoticeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpNoticeCode(String value) {
        this.expNoticeCode = value;
    }

    /**
     * Gets the value of the expNoticesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpNoticesCount() {
        return expNoticesCount;
    }

    /**
     * Sets the value of the expNoticesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpNoticesCount(Long value) {
        this.expNoticesCount = value;
    }

    /**
     * Gets the value of the expNoticeLeadDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpNoticeLeadDays() {
        return expNoticeLeadDays;
    }

    /**
     * Sets the value of the expNoticeLeadDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpNoticeLeadDays(Long value) {
        this.expNoticeLeadDays = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the flood property.
     * 
     * @return
     *     possible object is
     *     {@link FloodType }
     *     
     */
    public FloodType getFlood() {
        return flood;
    }

    /**
     * Sets the value of the flood property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodType }
     *     
     */
    public void setFlood(FloodType value) {
        this.flood = value;
    }

}
