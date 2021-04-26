
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.BaseCurCodeType;
import com.tmb.payment.wsdl.xpress.vo.ForExRateSheetKeysType;


/**
 * <p>Java class for ForExRateSheetSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetKeys"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BaseCurCode" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetSel_Type", propOrder = {
    "forExRateSheetKeys",
    "fiIdent",
    "baseCurCode",
    "count"
})
public class ForExRateSheetSelType {

    @XmlElement(name = "ForExRateSheetKeys", namespace = "urn:ifxforum-org:XSD:1")
    protected ForExRateSheetKeysType forExRateSheetKeys;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElement(name = "BaseCurCode", namespace = "urn:ifxforum-org:XSD:1")
    protected BaseCurCodeType baseCurCode;
    @XmlElement(name = "Count", namespace = "urn:ifxforum-org:XSD:1")
    protected Long count;

    /**
     * Gets the value of the forExRateSheetKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public ForExRateSheetKeysType getForExRateSheetKeys() {
        return forExRateSheetKeys;
    }

    /**
     * Sets the value of the forExRateSheetKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetKeysType }
     *     
     */
    public void setForExRateSheetKeys(ForExRateSheetKeysType value) {
        this.forExRateSheetKeys = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the baseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCurCodeType }
     *     
     */
    public BaseCurCodeType getBaseCurCode() {
        return baseCurCode;
    }

    /**
     * Sets the value of the baseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCurCodeType }
     *     
     */
    public void setBaseCurCode(BaseCurCodeType value) {
        this.baseCurCode = value;
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
