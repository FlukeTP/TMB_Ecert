
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for W9UserCert_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="W9UserCert_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W9EntityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W9CertInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W9CertDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxWithhldExmptInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W9UserCert_Type", propOrder = {
    "w9EntityCode",
    "w9CertInd",
    "w9CertDate",
    "taxWithhldExmptInd",
    "taxClassCode",
    "memo"
})
public class W9UserCertType {

    @XmlElement(name = "W9EntityCode")
    protected String w9EntityCode;
    @XmlElement(name = "W9CertInd")
    protected Boolean w9CertInd;
    @XmlElement(name = "W9CertDate")
    protected String w9CertDate;
    @XmlElement(name = "TaxWithhldExmptInd")
    protected Boolean taxWithhldExmptInd;
    @XmlElement(name = "TaxClassCode")
    protected String taxClassCode;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;

    /**
     * Gets the value of the w9EntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW9EntityCode() {
        return w9EntityCode;
    }

    /**
     * Sets the value of the w9EntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW9EntityCode(String value) {
        this.w9EntityCode = value;
    }

    /**
     * Gets the value of the w9CertInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isW9CertInd() {
        return w9CertInd;
    }

    /**
     * Sets the value of the w9CertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setW9CertInd(Boolean value) {
        this.w9CertInd = value;
    }

    /**
     * Gets the value of the w9CertDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW9CertDate() {
        return w9CertDate;
    }

    /**
     * Sets the value of the w9CertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW9CertDate(String value) {
        this.w9CertDate = value;
    }

    /**
     * Gets the value of the taxWithhldExmptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxWithhldExmptInd() {
        return taxWithhldExmptInd;
    }

    /**
     * Sets the value of the taxWithhldExmptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxWithhldExmptInd(Boolean value) {
        this.taxWithhldExmptInd = value;
    }

    /**
     * Gets the value of the taxClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClassCode() {
        return taxClassCode;
    }

    /**
     * Sets the value of the taxClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClassCode(String value) {
        this.taxClassCode = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

}
