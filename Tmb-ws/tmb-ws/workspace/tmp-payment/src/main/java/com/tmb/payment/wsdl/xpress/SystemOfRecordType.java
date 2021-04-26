
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.RefDataType;


/**
 * <p>Java class for SystemOfRecord_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemOfRecord_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyIdentValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemOfRecord_Type", propOrder = {
    "name",
    "partyIdentValue",
    "refData"
})
public class SystemOfRecordType {

    @XmlElement(name = "Name", namespace = "urn:ifxforum-org:XSD:1")
    protected String name;
    @XmlElement(name = "PartyIdentValue")
    protected String partyIdentValue;
    @XmlElement(name = "RefData", namespace = "urn:ifxforum-org:XSD:1")
    protected List<RefDataType> refData;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the partyIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentValue() {
        return partyIdentValue;
    }

    /**
     * Sets the value of the partyIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentValue(String value) {
        this.partyIdentValue = value;
    }

    /**
     * Gets the value of the refData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefDataType }
     * 
     * 
     */
    public List<RefDataType> getRefData() {
        if (refData == null) {
            refData = new ArrayList<RefDataType>();
        }
        return this.refData;
    }

}
