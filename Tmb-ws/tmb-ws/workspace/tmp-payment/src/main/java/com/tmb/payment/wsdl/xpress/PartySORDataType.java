
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartySORData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySORData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubFIPartyIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SystemOfRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartySORData_Type", propOrder = {
    "subFIPartyIdent",
    "fiIdent",
    "systemOfRecord"
})
public class PartySORDataType {

    @XmlElement(name = "SubFIPartyIdent", required = true)
    protected String subFIPartyIdent;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElement(name = "SystemOfRecord")
    protected List<SystemOfRecordType> systemOfRecord;

    /**
     * Gets the value of the subFIPartyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFIPartyIdent() {
        return subFIPartyIdent;
    }

    /**
     * Sets the value of the subFIPartyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFIPartyIdent(String value) {
        this.subFIPartyIdent = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the systemOfRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemOfRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemOfRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemOfRecordType }
     * 
     * 
     */
    public List<SystemOfRecordType> getSystemOfRecord() {
        if (systemOfRecord == null) {
            systemOfRecord = new ArrayList<SystemOfRecordType>();
        }
        return this.systemOfRecord;
    }

}
