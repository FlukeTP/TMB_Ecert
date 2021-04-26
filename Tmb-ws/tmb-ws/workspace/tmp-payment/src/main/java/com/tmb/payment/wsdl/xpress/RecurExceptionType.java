
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.DurationType;


/**
 * <p>Java class for RecurException_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurException_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurExceptionType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SkipNextN"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EndDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Duration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurException_Type", propOrder = {
    "recurExceptionType",
    "skipNextN",
    "startDt",
    "endDt",
    "duration"
})
public class RecurExceptionType {

    @XmlElement(name = "RecurExceptionType", required = true)
    protected String recurExceptionType;
    @XmlElement(name = "SkipNextN")
    protected long skipNextN;
    @XmlElement(name = "StartDt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String startDt;
    @XmlElement(name = "EndDt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String endDt;
    @XmlElement(name = "Duration", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected DurationType duration;

    /**
     * Gets the value of the recurExceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurExceptionType() {
        return recurExceptionType;
    }

    /**
     * Sets the value of the recurExceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurExceptionType(String value) {
        this.recurExceptionType = value;
    }

    /**
     * Gets the value of the skipNextN property.
     * 
     */
    public long getSkipNextN() {
        return skipNextN;
    }

    /**
     * Sets the value of the skipNextN property.
     * 
     */
    public void setSkipNextN(long value) {
        this.skipNextN = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

}
