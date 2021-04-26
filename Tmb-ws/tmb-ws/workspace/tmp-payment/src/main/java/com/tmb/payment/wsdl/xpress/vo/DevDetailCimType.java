
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailCim_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailCim_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimSafeDoor"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimCashUnits"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimIntermediateStacker"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimStackerItems"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimNoteReader"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimDropBox"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimPosition"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBin" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailCim_Type", propOrder = {
    "devCimType",
    "devCimOperation",
    "devCimSafeDoor",
    "devCimCashUnits",
    "devCimIntermediateStacker",
    "devCimStackerItems",
    "devCimNoteReader",
    "devCimDropBox",
    "devCimPosition",
    "devCimBin"
})
public class DevDetailCimType {

    @XmlElement(name = "DevCimType", required = true)
    protected String devCimType;
    @XmlElement(name = "DevCimOperation")
    protected String devCimOperation;
    @XmlElement(name = "DevCimSafeDoor", required = true)
    protected String devCimSafeDoor;
    @XmlElement(name = "DevCimCashUnits", required = true)
    protected String devCimCashUnits;
    @XmlElement(name = "DevCimIntermediateStacker", required = true)
    protected String devCimIntermediateStacker;
    @XmlElement(name = "DevCimStackerItems", required = true)
    protected String devCimStackerItems;
    @XmlElement(name = "DevCimNoteReader", required = true)
    protected String devCimNoteReader;
    @XmlElement(name = "DevCimDropBox", required = true)
    protected String devCimDropBox;
    @XmlElement(name = "DevCimPosition", required = true)
    protected DevCimPositionType devCimPosition;
    @XmlElement(name = "DevCimBin", required = true)
    protected List<DevCimBinType> devCimBin;

    /**
     * Gets the value of the devCimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimType() {
        return devCimType;
    }

    /**
     * Sets the value of the devCimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimType(String value) {
        this.devCimType = value;
    }

    /**
     * Gets the value of the devCimOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimOperation() {
        return devCimOperation;
    }

    /**
     * Sets the value of the devCimOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimOperation(String value) {
        this.devCimOperation = value;
    }

    /**
     * Gets the value of the devCimSafeDoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimSafeDoor() {
        return devCimSafeDoor;
    }

    /**
     * Sets the value of the devCimSafeDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimSafeDoor(String value) {
        this.devCimSafeDoor = value;
    }

    /**
     * Gets the value of the devCimCashUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimCashUnits() {
        return devCimCashUnits;
    }

    /**
     * Sets the value of the devCimCashUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimCashUnits(String value) {
        this.devCimCashUnits = value;
    }

    /**
     * Gets the value of the devCimIntermediateStacker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimIntermediateStacker() {
        return devCimIntermediateStacker;
    }

    /**
     * Sets the value of the devCimIntermediateStacker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimIntermediateStacker(String value) {
        this.devCimIntermediateStacker = value;
    }

    /**
     * Gets the value of the devCimStackerItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimStackerItems() {
        return devCimStackerItems;
    }

    /**
     * Sets the value of the devCimStackerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimStackerItems(String value) {
        this.devCimStackerItems = value;
    }

    /**
     * Gets the value of the devCimNoteReader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimNoteReader() {
        return devCimNoteReader;
    }

    /**
     * Sets the value of the devCimNoteReader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimNoteReader(String value) {
        this.devCimNoteReader = value;
    }

    /**
     * Gets the value of the devCimDropBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimDropBox() {
        return devCimDropBox;
    }

    /**
     * Sets the value of the devCimDropBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimDropBox(String value) {
        this.devCimDropBox = value;
    }

    /**
     * Gets the value of the devCimPosition property.
     * 
     * @return
     *     possible object is
     *     {@link DevCimPositionType }
     *     
     */
    public DevCimPositionType getDevCimPosition() {
        return devCimPosition;
    }

    /**
     * Sets the value of the devCimPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCimPositionType }
     *     
     */
    public void setDevCimPosition(DevCimPositionType value) {
        this.devCimPosition = value;
    }

    /**
     * Gets the value of the devCimBin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devCimBin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevCimBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevCimBinType }
     * 
     * 
     */
    public List<DevCimBinType> getDevCimBin() {
        if (devCimBin == null) {
            devCimBin = new ArrayList<DevCimBinType>();
        }
        return this.devCimBin;
    }

}
