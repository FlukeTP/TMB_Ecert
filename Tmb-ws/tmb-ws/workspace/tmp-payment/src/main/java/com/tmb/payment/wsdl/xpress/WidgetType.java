
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Widget_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Widget_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisplayHiddenInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HorizontalOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerticalOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Options" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Widget_Type", propOrder = {
    "displayHiddenInd",
    "horizontalOffset",
    "verticalOffset",
    "options"
})
public class WidgetType {

    @XmlElement(name = "DisplayHiddenInd")
    protected Boolean displayHiddenInd;
    @XmlElement(name = "HorizontalOffset")
    protected Long horizontalOffset;
    @XmlElement(name = "VerticalOffset")
    protected Long verticalOffset;
    @XmlElement(name = "Options")
    protected List<OptionsType> options;

    /**
     * Gets the value of the displayHiddenInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayHiddenInd() {
        return displayHiddenInd;
    }

    /**
     * Sets the value of the displayHiddenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayHiddenInd(Boolean value) {
        this.displayHiddenInd = value;
    }

    /**
     * Gets the value of the horizontalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorizontalOffset() {
        return horizontalOffset;
    }

    /**
     * Sets the value of the horizontalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorizontalOffset(Long value) {
        this.horizontalOffset = value;
    }

    /**
     * Gets the value of the verticalOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerticalOffset() {
        return verticalOffset;
    }

    /**
     * Sets the value of the verticalOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerticalOffset(Long value) {
        this.verticalOffset = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionsType }
     * 
     * 
     */
    public List<OptionsType> getOptions() {
        if (options == null) {
            options = new ArrayList<OptionsType>();
        }
        return this.options;
    }

}
