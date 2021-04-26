
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MktgMaterial_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MktgMaterial_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgImg" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgURL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MktgMaterial_Type", propOrder = {
    "mktgText",
    "mktgImg",
    "mktgURL"
})
public class MktgMaterialType {

    @XmlElement(name = "MktgText")
    protected String mktgText;
    @XmlElement(name = "MktgImg")
    protected MktgImgType mktgImg;
    @XmlElement(name = "MktgURL")
    protected String mktgURL;

    /**
     * Gets the value of the mktgText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgText() {
        return mktgText;
    }

    /**
     * Sets the value of the mktgText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgText(String value) {
        this.mktgText = value;
    }

    /**
     * Gets the value of the mktgImg property.
     * 
     * @return
     *     possible object is
     *     {@link MktgImgType }
     *     
     */
    public MktgImgType getMktgImg() {
        return mktgImg;
    }

    /**
     * Sets the value of the mktgImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktgImgType }
     *     
     */
    public void setMktgImg(MktgImgType value) {
        this.mktgImg = value;
    }

    /**
     * Gets the value of the mktgURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktgURL() {
        return mktgURL;
    }

    /**
     * Sets the value of the mktgURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktgURL(String value) {
        this.mktgURL = value;
    }

}
