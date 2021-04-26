
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailCdm_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailCdm_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmSafeDoor"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmCashUnits"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmIntermediateStacker"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmPosition"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBin" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailCdm_Type", propOrder = {
    "devCdmType",
    "devCdmOperation",
    "devCdmSafeDoor",
    "devCdmCashUnits",
    "devCdmIntermediateStacker",
    "devCdmPosition",
    "devCdmBin"
})
public class DevDetailCdmType {

    @XmlElement(name = "DevCdmType", required = true)
    protected String devCdmType;
    @XmlElement(name = "DevCdmOperation")
    protected String devCdmOperation;
    @XmlElement(name = "DevCdmSafeDoor", required = true)
    @XmlSchemaType(name = "string")
    protected DevCdmSafeDoorType devCdmSafeDoor;
    @XmlElement(name = "DevCdmCashUnits", required = true)
    protected String devCdmCashUnits;
    @XmlElement(name = "DevCdmIntermediateStacker", required = true)
    protected String devCdmIntermediateStacker;
    @XmlElement(name = "DevCdmPosition", required = true)
    protected DevCdmPositionType devCdmPosition;
    @XmlElement(name = "DevCdmBin", required = true)
    protected List<DevCdmBinType> devCdmBin;

    /**
     * Gets the value of the devCdmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmType() {
        return devCdmType;
    }

    /**
     * Sets the value of the devCdmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmType(String value) {
        this.devCdmType = value;
    }

    /**
     * Gets the value of the devCdmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmOperation() {
        return devCdmOperation;
    }

    /**
     * Sets the value of the devCdmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmOperation(String value) {
        this.devCdmOperation = value;
    }

    /**
     * Gets the value of the devCdmSafeDoor property.
     * 
     * @return
     *     possible object is
     *     {@link DevCdmSafeDoorType }
     *     
     */
    public DevCdmSafeDoorType getDevCdmSafeDoor() {
        return devCdmSafeDoor;
    }

    /**
     * Sets the value of the devCdmSafeDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCdmSafeDoorType }
     *     
     */
    public void setDevCdmSafeDoor(DevCdmSafeDoorType value) {
        this.devCdmSafeDoor = value;
    }

    /**
     * Gets the value of the devCdmCashUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmCashUnits() {
        return devCdmCashUnits;
    }

    /**
     * Sets the value of the devCdmCashUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmCashUnits(String value) {
        this.devCdmCashUnits = value;
    }

    /**
     * Gets the value of the devCdmIntermediateStacker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmIntermediateStacker() {
        return devCdmIntermediateStacker;
    }

    /**
     * Sets the value of the devCdmIntermediateStacker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmIntermediateStacker(String value) {
        this.devCdmIntermediateStacker = value;
    }

    /**
     * Gets the value of the devCdmPosition property.
     * 
     * @return
     *     possible object is
     *     {@link DevCdmPositionType }
     *     
     */
    public DevCdmPositionType getDevCdmPosition() {
        return devCdmPosition;
    }

    /**
     * Sets the value of the devCdmPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCdmPositionType }
     *     
     */
    public void setDevCdmPosition(DevCdmPositionType value) {
        this.devCdmPosition = value;
    }

    /**
     * Gets the value of the devCdmBin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devCdmBin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevCdmBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevCdmBinType }
     * 
     * 
     */
    public List<DevCdmBinType> getDevCdmBin() {
        if (devCdmBin == null) {
            devCdmBin = new ArrayList<DevCdmBinType>();
        }
        return this.devCdmBin;
    }

}
