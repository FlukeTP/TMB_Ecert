
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateType" maxOccurs="unbounded"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}FixingDateStartDt"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}FixingDateEndDt"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}RecievingMethod" maxOccurs="unbounded"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDtType"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDt"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetIdent" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "ForExRateSheetKeys_Type", propOrder = {
    "spName",
    "forExRateSheetId",
    "forExRateType",
    "fixingDateStartDt",
    "fixingDateEndDt",
    "recievingMethod",
    "forExValDtType",
    "forExValDt",
    "forExRateSheetIdent"
})
public class ForExRateSheetKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "ForExRateSheetId")
    protected String forExRateSheetId;
    @XmlElement(name = "ForExRateType")
    @XmlSchemaType(name = "string")
    protected List<ForExRateTypeType> forExRateType;
    @XmlElement(name = "FixingDateStartDt")
    protected String fixingDateStartDt;
    @XmlElement(name = "FixingDateEndDt")
    protected String fixingDateEndDt;
    @XmlElement(name = "RecievingMethod")
    protected List<String> recievingMethod;
    @XmlElement(name = "ForExValDtType")
    @XmlSchemaType(name = "string")
    protected ForExValDtTypeType forExValDtType;
    @XmlElement(name = "ForExValDt")
    protected String forExValDt;
    @XmlElement(name = "ForExRateSheetIdent")
    protected String forExRateSheetIdent;

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
     * Gets the value of the forExRateSheetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateSheetId() {
        return forExRateSheetId;
    }

    /**
     * Sets the value of the forExRateSheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateSheetId(String value) {
        this.forExRateSheetId = value;
    }

    /**
     * Gets the value of the forExRateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forExRateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForExRateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForExRateTypeType }
     * 
     * 
     */
    public List<ForExRateTypeType> getForExRateType() {
        if (forExRateType == null) {
            forExRateType = new ArrayList<ForExRateTypeType>();
        }
        return this.forExRateType;
    }

    /**
     * Gets the value of the fixingDateStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingDateStartDt() {
        return fixingDateStartDt;
    }

    /**
     * Sets the value of the fixingDateStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDateStartDt(String value) {
        this.fixingDateStartDt = value;
    }

    /**
     * Gets the value of the fixingDateEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingDateEndDt() {
        return fixingDateEndDt;
    }

    /**
     * Sets the value of the fixingDateEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDateEndDt(String value) {
        this.fixingDateEndDt = value;
    }

    /**
     * Gets the value of the recievingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recievingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecievingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecievingMethod() {
        if (recievingMethod == null) {
            recievingMethod = new ArrayList<String>();
        }
        return this.recievingMethod;
    }

    /**
     * Gets the value of the forExValDtType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public ForExValDtTypeType getForExValDtType() {
        return forExValDtType;
    }

    /**
     * Sets the value of the forExValDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public void setForExValDtType(ForExValDtTypeType value) {
        this.forExValDtType = value;
    }

    /**
     * Gets the value of the forExValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExValDt() {
        return forExValDt;
    }

    /**
     * Sets the value of the forExValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExValDt(String value) {
        this.forExValDt = value;
    }

    /**
     * Gets the value of the forExRateSheetIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateSheetIdent() {
        return forExRateSheetIdent;
    }

    /**
     * Sets the value of the forExRateSheetIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateSheetIdent(String value) {
        this.forExRateSheetIdent = value;
    }

}
