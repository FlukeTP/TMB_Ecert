
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurrencyCodeType;


/**
 * <p>Java class for PCNInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCNInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PCNIssDt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PCNVendCd"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PCNSeqNbr"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurrencyCode"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PCN"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCNInfo_Type", propOrder = {
    "pcnIssDt",
    "pcnVendCd",
    "pcnSeqNbr",
    "currencyCode",
    "pcn"
})
public class PCNInfoType {

    @XmlElement(name = "PCNIssDt", required = true)
    protected String pcnIssDt;
    @XmlElement(name = "PCNVendCd", required = true)
    protected String pcnVendCd;
    @XmlElement(name = "PCNSeqNbr", required = true)
    protected String pcnSeqNbr;
    @XmlElement(name = "CurrencyCode", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "PCN", required = true)
    protected String pcn;

    /**
     * Gets the value of the pcnIssDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCNIssDt() {
        return pcnIssDt;
    }

    /**
     * Sets the value of the pcnIssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCNIssDt(String value) {
        this.pcnIssDt = value;
    }

    /**
     * Gets the value of the pcnVendCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCNVendCd() {
        return pcnVendCd;
    }

    /**
     * Sets the value of the pcnVendCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCNVendCd(String value) {
        this.pcnVendCd = value;
    }

    /**
     * Gets the value of the pcnSeqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCNSeqNbr() {
        return pcnSeqNbr;
    }

    /**
     * Sets the value of the pcnSeqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCNSeqNbr(String value) {
        this.pcnSeqNbr = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the pcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCN() {
        return pcn;
    }

    /**
     * Sets the value of the pcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCN(String value) {
        this.pcn = value;
    }

}
