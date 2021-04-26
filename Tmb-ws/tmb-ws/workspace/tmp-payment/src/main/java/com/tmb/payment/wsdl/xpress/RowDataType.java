
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RowSeq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ColumnData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowData_Type", propOrder = {
    "rowSeq",
    "columnData"
})
public class RowDataType {

    @XmlElement(name = "RowSeq")
    protected Long rowSeq;
    @XmlElement(name = "ColumnData")
    protected List<ColumnDataType> columnData;

    /**
     * Gets the value of the rowSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowSeq() {
        return rowSeq;
    }

    /**
     * Sets the value of the rowSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowSeq(Long value) {
        this.rowSeq = value;
    }

    /**
     * Gets the value of the columnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnDataType }
     * 
     * 
     */
    public List<ColumnDataType> getColumnData() {
        if (columnData == null) {
            columnData = new ArrayList<ColumnDataType>();
        }
        return this.columnData;
    }

}
