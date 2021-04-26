
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemStatData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemStatData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ItemStatType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ItemStatInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ItemStatDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemStatData_Type", propOrder = {
    "itemStatType",
    "itemStatInd",
    "itemStatDt"
})
public class ItemStatDataType {

    @XmlElement(name = "ItemStatType", required = true)
    protected String itemStatType;
    @XmlElement(name = "ItemStatInd")
    protected Boolean itemStatInd;
    @XmlElement(name = "ItemStatDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itemStatDt;

    /**
     * Gets the value of the itemStatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemStatType() {
        return itemStatType;
    }

    /**
     * Sets the value of the itemStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemStatType(String value) {
        this.itemStatType = value;
    }

    /**
     * Gets the value of the itemStatInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemStatInd() {
        return itemStatInd;
    }

    /**
     * Sets the value of the itemStatInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemStatInd(Boolean value) {
        this.itemStatInd = value;
    }

    /**
     * Gets the value of the itemStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemStatDt() {
        return itemStatDt;
    }

    /**
     * Sets the value of the itemStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemStatDt(XMLGregorianCalendar value) {
        this.itemStatDt = value;
    }

}
