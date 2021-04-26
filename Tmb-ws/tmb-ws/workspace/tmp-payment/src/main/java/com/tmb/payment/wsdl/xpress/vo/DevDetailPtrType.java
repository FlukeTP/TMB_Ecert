
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailPtr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailPtr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrMedia"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrRetractBin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrSupply" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrInk" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrToner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPtrLamp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailPtr_Type", propOrder = {
    "devPtrType",
    "devPtrOperation",
    "devPtrMedia",
    "devPtrRetractBin",
    "devPtrSupply",
    "devPtrInk",
    "devPtrToner",
    "devPtrLamp"
})
public class DevDetailPtrType {

    @XmlElement(name = "DevPtrType", required = true)
    protected String devPtrType;
    @XmlElement(name = "DevPtrOperation")
    protected String devPtrOperation;
    @XmlElement(name = "DevPtrMedia", required = true)
    @XmlSchemaType(name = "string")
    protected DevPtrMediaType devPtrMedia;
    @XmlElement(name = "DevPtrRetractBin")
    protected List<DevPtrRetractBinType> devPtrRetractBin;
    @XmlElement(name = "DevPtrSupply")
    protected List<DevPtrSupplyType> devPtrSupply;
    @XmlElement(name = "DevPtrInk")
    @XmlSchemaType(name = "string")
    protected DevPtrInkType devPtrInk;
    @XmlElement(name = "DevPtrToner")
    @XmlSchemaType(name = "string")
    protected DevPtrTonerType devPtrToner;
    @XmlElement(name = "DevPtrLamp")
    @XmlSchemaType(name = "string")
    protected DevPtrLampType devPtrLamp;

    /**
     * Gets the value of the devPtrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPtrType() {
        return devPtrType;
    }

    /**
     * Sets the value of the devPtrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPtrType(String value) {
        this.devPtrType = value;
    }

    /**
     * Gets the value of the devPtrOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPtrOperation() {
        return devPtrOperation;
    }

    /**
     * Sets the value of the devPtrOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPtrOperation(String value) {
        this.devPtrOperation = value;
    }

    /**
     * Gets the value of the devPtrMedia property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrMediaType }
     *     
     */
    public DevPtrMediaType getDevPtrMedia() {
        return devPtrMedia;
    }

    /**
     * Sets the value of the devPtrMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrMediaType }
     *     
     */
    public void setDevPtrMedia(DevPtrMediaType value) {
        this.devPtrMedia = value;
    }

    /**
     * Gets the value of the devPtrRetractBin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devPtrRetractBin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevPtrRetractBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevPtrRetractBinType }
     * 
     * 
     */
    public List<DevPtrRetractBinType> getDevPtrRetractBin() {
        if (devPtrRetractBin == null) {
            devPtrRetractBin = new ArrayList<DevPtrRetractBinType>();
        }
        return this.devPtrRetractBin;
    }

    /**
     * Gets the value of the devPtrSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devPtrSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevPtrSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevPtrSupplyType }
     * 
     * 
     */
    public List<DevPtrSupplyType> getDevPtrSupply() {
        if (devPtrSupply == null) {
            devPtrSupply = new ArrayList<DevPtrSupplyType>();
        }
        return this.devPtrSupply;
    }

    /**
     * Gets the value of the devPtrInk property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrInkType }
     *     
     */
    public DevPtrInkType getDevPtrInk() {
        return devPtrInk;
    }

    /**
     * Sets the value of the devPtrInk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrInkType }
     *     
     */
    public void setDevPtrInk(DevPtrInkType value) {
        this.devPtrInk = value;
    }

    /**
     * Gets the value of the devPtrToner property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrTonerType }
     *     
     */
    public DevPtrTonerType getDevPtrToner() {
        return devPtrToner;
    }

    /**
     * Sets the value of the devPtrToner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrTonerType }
     *     
     */
    public void setDevPtrToner(DevPtrTonerType value) {
        this.devPtrToner = value;
    }

    /**
     * Gets the value of the devPtrLamp property.
     * 
     * @return
     *     possible object is
     *     {@link DevPtrLampType }
     *     
     */
    public DevPtrLampType getDevPtrLamp() {
        return devPtrLamp;
    }

    /**
     * Sets the value of the devPtrLamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPtrLampType }
     *     
     */
    public void setDevPtrLamp(DevPtrLampType value) {
        this.devPtrLamp = value;
    }

}
