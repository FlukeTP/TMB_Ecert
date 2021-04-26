
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaCashData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaCashData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MediaCashData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnImgData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaCashData_Type", propOrder = {
    "mediaBal",
    "trnImgData"
})
public class MediaCashDataType
    extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType
{

    @XmlElementRef(name = "MediaBal", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType>> mediaBal;
    @XmlElement(name = "TrnImgData")
    protected ChkImgDataType trnImgData;

    /**
     * Gets the value of the mediaBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaBalType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaBalType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType>> getMediaBal() {
        if (mediaBal == null) {
            mediaBal = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaBalType>>();
        }
        return this.mediaBal;
    }

    /**
     * Gets the value of the trnImgData property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgDataType }
     *     
     */
    public ChkImgDataType getTrnImgData() {
        return trnImgData;
    }

    /**
     * Sets the value of the trnImgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgDataType }
     *     
     */
    public void setTrnImgData(ChkImgDataType value) {
        this.trnImgData = value;
    }

}
