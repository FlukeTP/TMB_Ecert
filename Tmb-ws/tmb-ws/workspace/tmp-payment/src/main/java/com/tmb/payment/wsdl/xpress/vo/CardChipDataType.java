
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CardChipData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardChipData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppPan" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppPanSeq" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Trk2EquivData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardChipData_Type", propOrder = {
    "appPan",
    "appPanSeq",
    "appIdent",
    "trk2EquivData"
})
public class CardChipDataType {

    @XmlElement(name = "AppPan", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPan;
    @XmlElement(name = "AppPanSeq", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPanSeq;
    @XmlElement(name = "AppIdent", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appIdent;
    @XmlElement(name = "Trk2EquivData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] trk2EquivData;

    /**
     * Gets the value of the appPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPan() {
        return appPan;
    }

    /**
     * Sets the value of the appPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPan(byte[] value) {
        this.appPan = value;
    }

    /**
     * Gets the value of the appPanSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppPanSeq() {
        return appPanSeq;
    }

    /**
     * Sets the value of the appPanSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPanSeq(byte[] value) {
        this.appPanSeq = value;
    }

    /**
     * Gets the value of the appIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAppIdent() {
        return appIdent;
    }

    /**
     * Sets the value of the appIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppIdent(byte[] value) {
        this.appIdent = value;
    }

    /**
     * Gets the value of the trk2EquivData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getTrk2EquivData() {
        return trk2EquivData;
    }

    /**
     * Sets the value of the trk2EquivData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrk2EquivData(byte[] value) {
        this.trk2EquivData = value;
    }

}
