
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DtRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DtRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}DtRange_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DtRangeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NumDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InclPastRelInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DtRange_Type", propOrder = {
    "dtRangeType",
    "numDays",
    "inclPastRelInd"
})
public class DtRangeType
    extends com.tmb.payment.wsdl.xpress.vo.DtRangeType
{

    @XmlElement(name = "DtRangeType")
    protected String dtRangeType;
    @XmlElement(name = "NumDays")
    protected String numDays;
    @XmlElement(name = "InclPastRelInd")
    protected Boolean inclPastRelInd;

    /**
     * Gets the value of the dtRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtRangeType() {
        return dtRangeType;
    }

    /**
     * Sets the value of the dtRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtRangeType(String value) {
        this.dtRangeType = value;
    }

    /**
     * Gets the value of the numDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDays() {
        return numDays;
    }

    /**
     * Sets the value of the numDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDays(String value) {
        this.numDays = value;
    }

    /**
     * Gets the value of the inclPastRelInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclPastRelInd() {
        return inclPastRelInd;
    }

    /**
     * Sets the value of the inclPastRelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclPastRelInd(Boolean value) {
        this.inclPastRelInd = value;
    }

}
