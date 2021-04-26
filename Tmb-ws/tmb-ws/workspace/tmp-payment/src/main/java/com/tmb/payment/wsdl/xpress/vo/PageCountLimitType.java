
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageCountLimit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageCountLimit_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PageType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CollatingSequence" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PageNumRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageCountLimit_Type", propOrder = {
    "pageType",
    "collatingSequence",
    "pageNumRange"
})
public class PageCountLimitType {

    @XmlElement(name = "PageType")
    protected String pageType;
    @XmlElement(name = "CollatingSequence")
    protected String collatingSequence;
    @XmlElement(name = "PageNumRange")
    protected List<PageNumRangeType> pageNumRange;

    /**
     * Gets the value of the pageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the value of the pageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageType(String value) {
        this.pageType = value;
    }

    /**
     * Gets the value of the collatingSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollatingSequence() {
        return collatingSequence;
    }

    /**
     * Sets the value of the collatingSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollatingSequence(String value) {
        this.collatingSequence = value;
    }

    /**
     * Gets the value of the pageNumRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageNumRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageNumRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageNumRangeType }
     * 
     * 
     */
    public List<PageNumRangeType> getPageNumRange() {
        if (pageNumRange == null) {
            pageNumRange = new ArrayList<PageNumRangeType>();
        }
        return this.pageNumRange;
    }

}
