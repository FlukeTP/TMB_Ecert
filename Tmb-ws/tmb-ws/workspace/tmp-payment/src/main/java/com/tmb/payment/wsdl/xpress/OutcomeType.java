
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common Business Outcome.
 * 
 * <p>Java class for Outcome_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Outcome_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OutComeName"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OutComeSelected" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Outcome_Type", propOrder = {
    "outComeName",
    "desc",
    "outComeSelected"
})
public class OutcomeType {

    @XmlElement(name = "OutComeName", required = true)
    protected String outComeName;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String desc;
    @XmlElement(name = "OutComeSelected")
    protected Boolean outComeSelected;

    /**
     * Gets the value of the outComeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutComeName() {
        return outComeName;
    }

    /**
     * Sets the value of the outComeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutComeName(String value) {
        this.outComeName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the outComeSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutComeSelected() {
        return outComeSelected;
    }

    /**
     * Sets the value of the outComeSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutComeSelected(Boolean value) {
        this.outComeSelected = value;
    }

}
