
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecTokenImage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenImage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BinLength" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BinData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ImgWidth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ImgLoc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenImage_Type", propOrder = {
    "binLength",
    "binData",
    "imgWidth",
    "refDesc",
    "imgLoc"
})
public class SecTokenImageType {

    @XmlElement(name = "BinLength", namespace = "urn:ifxforum-org:XSD:1")
    protected Long binLength;
    @XmlElement(name = "BinData", namespace = "urn:ifxforum-org:XSD:1")
    protected byte[] binData;
    @XmlElement(name = "ImgWidth")
    protected Long imgWidth;
    @XmlElement(name = "RefDesc", namespace = "urn:ifxforum-org:XSD:1")
    protected String refDesc;
    @XmlElement(name = "ImgLoc")
    protected String imgLoc;

    /**
     * Gets the value of the binLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBinLength() {
        return binLength;
    }

    /**
     * Sets the value of the binLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBinLength(Long value) {
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

    /**
     * Gets the value of the imgWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImgWidth() {
        return imgWidth;
    }

    /**
     * Sets the value of the imgWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImgWidth(Long value) {
        this.imgWidth = value;
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
     * Gets the value of the imgLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgLoc() {
        return imgLoc;
    }

    /**
     * Sets the value of the imgLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgLoc(String value) {
        this.imgLoc = value;
    }

}
