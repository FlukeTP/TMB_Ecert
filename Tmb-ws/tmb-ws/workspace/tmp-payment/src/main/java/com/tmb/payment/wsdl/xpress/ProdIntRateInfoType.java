
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ProdIntRateKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Region" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://www.fnf.com/xes}ProdIntRateTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRateData" type="{http://www.fnf.com/xes}ProdIntRateData_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RateChange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateInfo_Type", propOrder = {
    "productIdent",
    "prodIntRateKeys",
    "region",
    "term",
    "intRateData",
    "rateChange"
})
public class ProdIntRateInfoType {

    @XmlElement(name = "ProductIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String productIdent;
    @XmlElement(name = "ProdIntRateKeys")
    protected ProdIntRateKeysType prodIntRateKeys;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Term")
    protected ProdIntRateTermType term;
    @XmlElement(name = "IntRateData")
    protected List<ProdIntRateDataType> intRateData;
    @XmlElement(name = "RateChange")
    protected RateChangeType rateChange;

    /**
     * Gets the value of the productIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdent() {
        return productIdent;
    }

    /**
     * Sets the value of the productIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdent(String value) {
        this.productIdent = value;
    }

    /**
     * Gets the value of the prodIntRateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateKeysType }
     *     
     */
    public ProdIntRateKeysType getProdIntRateKeys() {
        return prodIntRateKeys;
    }

    /**
     * Sets the value of the prodIntRateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateKeysType }
     *     
     */
    public void setProdIntRateKeys(ProdIntRateKeysType value) {
        this.prodIntRateKeys = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateTermType }
     *     
     */
    public ProdIntRateTermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateTermType }
     *     
     */
    public void setTerm(ProdIntRateTermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the intRateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intRateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntRateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdIntRateDataType }
     * 
     * 
     */
    public List<ProdIntRateDataType> getIntRateData() {
        if (intRateData == null) {
            intRateData = new ArrayList<ProdIntRateDataType>();
        }
        return this.intRateData;
    }

    /**
     * Gets the value of the rateChange property.
     * 
     * @return
     *     possible object is
     *     {@link RateChangeType }
     *     
     */
    public RateChangeType getRateChange() {
        return rateChange;
    }

    /**
     * Sets the value of the rateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateChangeType }
     *     
     */
    public void setRateChange(RateChangeType value) {
        this.rateChange = value;
    }

}
