
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkImgData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkImgData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ChkImgData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ImgId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ImgData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ImgDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkImgData_Type", propOrder = {
    "imgId",
    "imgData",
    "imgDesc"
})
public class ChkImgDataType
    extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType
{

    @XmlElement(name = "ImgId")
    protected String imgId;
    @XmlElement(name = "ImgData")
    protected String imgData;
    @XmlElement(name = "ImgDesc")
    protected String imgDesc;

    /**
     * Gets the value of the imgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgId() {
        return imgId;
    }

    /**
     * Sets the value of the imgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgId(String value) {
        this.imgId = value;
    }

    /**
     * Gets the value of the imgData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgData() {
        return imgData;
    }

    /**
     * Sets the value of the imgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgData(String value) {
        this.imgData = value;
    }

    /**
     * Gets the value of the imgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgDesc() {
        return imgDesc;
    }

    /**
     * Sets the value of the imgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgDesc(String value) {
        this.imgDesc = value;
    }

}
