
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EMVRqData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMVRqData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EMVRqRawData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Trk2EquivData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AppPan" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerScriptResultData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMVRqData_Type", propOrder = {
    "emvRqRawData",
    "trk2EquivData",
    "appPan",
    "issuerScriptResultData"
})
public class EMVRqDataType {

    @XmlElement(name = "EMVRqRawData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] emvRqRawData;
    @XmlElement(name = "Trk2EquivData", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] trk2EquivData;
    @XmlElement(name = "AppPan", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] appPan;
    @XmlElement(name = "IssuerScriptResultData")
    protected List<IssuerScriptResultDataType> issuerScriptResultData;

    /**
     * Gets the value of the emvRqRawData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEMVRqRawData() {
        return emvRqRawData;
    }

    /**
     * Sets the value of the emvRqRawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMVRqRawData(byte[] value) {
        this.emvRqRawData = value;
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
     * Gets the value of the issuerScriptResultData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerScriptResultData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerScriptResultData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerScriptResultDataType }
     * 
     * 
     */
    public List<IssuerScriptResultDataType> getIssuerScriptResultData() {
        if (issuerScriptResultData == null) {
            issuerScriptResultData = new ArrayList<IssuerScriptResultDataType>();
        }
        return this.issuerScriptResultData;
    }

}
