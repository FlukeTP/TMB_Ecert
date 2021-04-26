
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdDfltMisc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdDfltMisc_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdDfltMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDecimal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RefDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DiscInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Path" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdDfltMisc_Type", propOrder = {
    "prodDfltMiscType",
    "miscText",
    "miscInd",
    "miscDate",
    "miscNum",
    "miscDecimal",
    "miscAmt",
    "refDesc",
    "discInd",
    "path"
})
public class ProdDfltMiscType {

    @XmlElement(name = "ProdDfltMiscType", required = true)
    protected String prodDfltMiscType;
    @XmlElement(name = "MiscText")
    protected String miscText;
    @XmlElement(name = "MiscInd")
    protected Boolean miscInd;
    @XmlElement(name = "MiscDate")
    protected String miscDate;
    @XmlElement(name = "MiscNum")
    protected String miscNum;
    @XmlElement(name = "MiscDecimal")
    protected BigDecimal miscDecimal;
    @XmlElement(name = "MiscAmt")
    protected BigDecimal miscAmt;
    @XmlElement(name = "RefDesc")
    protected String refDesc;
    @XmlElement(name = "DiscInd")
    protected Boolean discInd;
    @XmlElement(name = "Path")
    protected String path;

    /**
     * Gets the value of the prodDfltMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdDfltMiscType() {
        return prodDfltMiscType;
    }

    /**
     * Sets the value of the prodDfltMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdDfltMiscType(String value) {
        this.prodDfltMiscType = value;
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
     * Gets the value of the miscNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscNum() {
        return miscNum;
    }

    /**
     * Sets the value of the miscNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscNum(String value) {
        this.miscNum = value;
    }

    /**
     * Gets the value of the miscDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscDecimal() {
        return miscDecimal;
    }

    /**
     * Sets the value of the miscDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscDecimal(BigDecimal value) {
        this.miscDecimal = value;
    }

    /**
     * Gets the value of the miscAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscAmt() {
        return miscAmt;
    }

    /**
     * Sets the value of the miscAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscAmt(BigDecimal value) {
        this.miscAmt = value;
    }

    /**
     * Gets the value of the refDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDesc() {
        return refDesc;
    }

    /**
     * Sets the value of the refDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDesc(String value) {
        this.refDesc = value;
    }

    /**
     * Gets the value of the discInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscInd() {
        return discInd;
    }

    /**
     * Sets the value of the discInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscInd(Boolean value) {
        this.discInd = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
