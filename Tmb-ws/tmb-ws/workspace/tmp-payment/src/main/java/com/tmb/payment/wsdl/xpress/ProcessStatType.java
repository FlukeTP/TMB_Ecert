
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessStat_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessStat_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStatCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatOvrdDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessStat_Type", propOrder = {
    "processType",
    "processStatCd",
    "processStatDesc",
    "effDt",
    "memo",
    "statOvrdDesc"
})
public class ProcessStatType {

    @XmlElement(name = "ProcessType")
    protected Object processType;
    @XmlElement(name = "ProcessStatCd")
    protected Object processStatCd;
    @XmlElement(name = "ProcessStatDesc")
    protected Object processStatDesc;
    @XmlElement(name = "EffDt")
    protected Object effDt;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;
    @XmlElement(name = "StatOvrdDesc")
    protected Object statOvrdDesc;

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProcessType(Object value) {
        this.processType = value;
    }

    /**
     * Gets the value of the processStatCd property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProcessStatCd() {
        return processStatCd;
    }

    /**
     * Sets the value of the processStatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProcessStatCd(Object value) {
        this.processStatCd = value;
    }

    /**
     * Gets the value of the processStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProcessStatDesc() {
        return processStatDesc;
    }

    /**
     * Sets the value of the processStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProcessStatDesc(Object value) {
        this.processStatDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEffDt(Object value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the statOvrdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatOvrdDesc() {
        return statOvrdDesc;
    }

    /**
     * Sets the value of the statOvrdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatOvrdDesc(Object value) {
        this.statOvrdDesc = value;
    }

}
