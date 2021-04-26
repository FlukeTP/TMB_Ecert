
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;


/**
 * <p>Java class for ProdIntRateSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ProdIntRateKeys"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}Region" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}ProdIntRateIdent"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}DtRange" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}RateChange" minOccurs="0"/&gt;
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
@XmlType(name = "ProdIntRateSel_Type", propOrder = {
    "prodIntRateKeys",
    "region",
    "acctType",
    "prodIntRateIdent",
    "fiIdent",
    "dtRange",
    "rateChange"
})
public class ProdIntRateSelType {

    @XmlElement(name = "ProdIntRateKeys")
    protected ProdIntRateKeysType prodIntRateKeys;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "AcctType", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctTypeType acctType;
    @XmlElement(name = "ProdIntRateIdent")
    protected String prodIntRateIdent;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElementRef(name = "DtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> dtRange;
    @XmlElement(name = "RateChange")
    protected RateChangeType rateChange;

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
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the prodIntRateIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdIntRateIdent() {
        return prodIntRateIdent;
    }

    /**
     * Sets the value of the prodIntRateIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdIntRateIdent(String value) {
        this.prodIntRateIdent = value;
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
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public void setDtRange(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> value) {
        this.dtRange = value;
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
