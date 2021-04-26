
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuGuidelightStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuGuidelightStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuIdcGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuCdmGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuCoinOutGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuReceiptGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuPassbookGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuDepGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuChkGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuCimGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuDocumentGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuCoinInGuidelight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuScannerGuidelight"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuGuidelightStatus_Type", propOrder = {
    "devSiuIdcGuidelight",
    "devSiuCdmGuidelight",
    "devSiuCoinOutGuidelight",
    "devSiuReceiptGuidelight",
    "devSiuPassbookGuidelight",
    "devSiuDepGuidelight",
    "devSiuChkGuidelight",
    "devSiuCimGuidelight",
    "devSiuDocumentGuidelight",
    "devSiuCoinInGuidelight",
    "devSiuScannerGuidelight"
})
public class DevSiuGuidelightStatusType {

    @XmlElement(name = "DevSiuIdcGuidelight", required = true)
    protected String devSiuIdcGuidelight;
    @XmlElement(name = "DevSiuCdmGuidelight", required = true)
    protected String devSiuCdmGuidelight;
    @XmlElement(name = "DevSiuCoinOutGuidelight", required = true)
    protected String devSiuCoinOutGuidelight;
    @XmlElement(name = "DevSiuReceiptGuidelight", required = true)
    protected String devSiuReceiptGuidelight;
    @XmlElement(name = "DevSiuPassbookGuidelight", required = true)
    protected String devSiuPassbookGuidelight;
    @XmlElement(name = "DevSiuDepGuidelight", required = true)
    protected String devSiuDepGuidelight;
    @XmlElement(name = "DevSiuChkGuidelight", required = true)
    protected String devSiuChkGuidelight;
    @XmlElement(name = "DevSiuCimGuidelight", required = true)
    protected String devSiuCimGuidelight;
    @XmlElement(name = "DevSiuDocumentGuidelight", required = true)
    protected String devSiuDocumentGuidelight;
    @XmlElement(name = "DevSiuCoinInGuidelight", required = true)
    protected String devSiuCoinInGuidelight;
    @XmlElement(name = "DevSiuScannerGuidelight", required = true)
    protected String devSiuScannerGuidelight;

    /**
     * Gets the value of the devSiuIdcGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuIdcGuidelight() {
        return devSiuIdcGuidelight;
    }

    /**
     * Sets the value of the devSiuIdcGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuIdcGuidelight(String value) {
        this.devSiuIdcGuidelight = value;
    }

    /**
     * Gets the value of the devSiuCdmGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuCdmGuidelight() {
        return devSiuCdmGuidelight;
    }

    /**
     * Sets the value of the devSiuCdmGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuCdmGuidelight(String value) {
        this.devSiuCdmGuidelight = value;
    }

    /**
     * Gets the value of the devSiuCoinOutGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuCoinOutGuidelight() {
        return devSiuCoinOutGuidelight;
    }

    /**
     * Sets the value of the devSiuCoinOutGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuCoinOutGuidelight(String value) {
        this.devSiuCoinOutGuidelight = value;
    }

    /**
     * Gets the value of the devSiuReceiptGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuReceiptGuidelight() {
        return devSiuReceiptGuidelight;
    }

    /**
     * Sets the value of the devSiuReceiptGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuReceiptGuidelight(String value) {
        this.devSiuReceiptGuidelight = value;
    }

    /**
     * Gets the value of the devSiuPassbookGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuPassbookGuidelight() {
        return devSiuPassbookGuidelight;
    }

    /**
     * Sets the value of the devSiuPassbookGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuPassbookGuidelight(String value) {
        this.devSiuPassbookGuidelight = value;
    }

    /**
     * Gets the value of the devSiuDepGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuDepGuidelight() {
        return devSiuDepGuidelight;
    }

    /**
     * Sets the value of the devSiuDepGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuDepGuidelight(String value) {
        this.devSiuDepGuidelight = value;
    }

    /**
     * Gets the value of the devSiuChkGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuChkGuidelight() {
        return devSiuChkGuidelight;
    }

    /**
     * Sets the value of the devSiuChkGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuChkGuidelight(String value) {
        this.devSiuChkGuidelight = value;
    }

    /**
     * Gets the value of the devSiuCimGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuCimGuidelight() {
        return devSiuCimGuidelight;
    }

    /**
     * Sets the value of the devSiuCimGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuCimGuidelight(String value) {
        this.devSiuCimGuidelight = value;
    }

    /**
     * Gets the value of the devSiuDocumentGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuDocumentGuidelight() {
        return devSiuDocumentGuidelight;
    }

    /**
     * Sets the value of the devSiuDocumentGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuDocumentGuidelight(String value) {
        this.devSiuDocumentGuidelight = value;
    }

    /**
     * Gets the value of the devSiuCoinInGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuCoinInGuidelight() {
        return devSiuCoinInGuidelight;
    }

    /**
     * Sets the value of the devSiuCoinInGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuCoinInGuidelight(String value) {
        this.devSiuCoinInGuidelight = value;
    }

    /**
     * Gets the value of the devSiuScannerGuidelight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuScannerGuidelight() {
        return devSiuScannerGuidelight;
    }

    /**
     * Sets the value of the devSiuScannerGuidelight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuScannerGuidelight(String value) {
        this.devSiuScannerGuidelight = value;
    }

}
