
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtInst_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtInst_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtInstType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettlementData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtInst_Type", propOrder = {
    "pmtInstType",
    "brand",
    "settlementData"
})
public class PmtInstType {

    @XmlElement(name = "PmtInstType", required = true)
    @XmlSchemaType(name = "string")
    protected PmtInstTypeType pmtInstType;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "SettlementData")
    protected List<SettlementDataType> settlementData;

    /**
     * Gets the value of the pmtInstType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtInstTypeType }
     *     
     */
    public PmtInstTypeType getPmtInstType() {
        return pmtInstType;
    }

    /**
     * Sets the value of the pmtInstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtInstTypeType }
     *     
     */
    public void setPmtInstType(PmtInstTypeType value) {
        this.pmtInstType = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the settlementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementDataType }
     * 
     * 
     */
    public List<SettlementDataType> getSettlementData() {
        if (settlementData == null) {
            settlementData = new ArrayList<SettlementDataType>();
        }
        return this.settlementData;
    }

}
