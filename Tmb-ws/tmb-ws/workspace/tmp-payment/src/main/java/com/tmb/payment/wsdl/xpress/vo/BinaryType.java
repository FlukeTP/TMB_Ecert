
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Binary_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Binary_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContentType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BinLength"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BinData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Binary_Type", propOrder = {
    "contentType",
    "binLength",
    "binData"
})
@XmlSeeAlso({
    CashSignatureType.class,
    CertificateType.class,
    ChkImgBackType.class,
    ChkImgFrontType.class,
    CursorType.class,
    FormImgType.class,
    IdentImgType.class,
    MktgImgType.class,
    StmtImgType.class,
    TrnImgType.class
})
public class BinaryType {

    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "BinLength")
    protected long binLength;
    @XmlElement(name = "BinData", required = true)
    protected byte[] binData;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the binLength property.
     * 
     */
    public long getBinLength() {
        return binLength;
    }

    /**
     * Sets the value of the binLength property.
     * 
     */
    public void setBinLength(long value) {
        this.binLength = value;
    }

    /**
     * Gets the value of the binData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinData() {
        return binData;
    }

    /**
     * Sets the value of the binData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinData(byte[] value) {
        this.binData = value;
    }

}
