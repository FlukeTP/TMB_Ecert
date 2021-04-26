
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrnType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnType_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnTypeValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnTypeSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnType_Type", propOrder = {
    "trnTypeValue",
    "trnTypeSource"
})
public class TrnTypeType {

    @XmlElement(name = "TrnTypeValue")
    protected String trnTypeValue;
    @XmlElement(name = "TrnTypeSource")
    protected String trnTypeSource;

    /**
     * Gets the value of the trnTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnTypeValue() {
        return trnTypeValue;
    }

    /**
     * Sets the value of the trnTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnTypeValue(String value) {
        this.trnTypeValue = value;
    }

    /**
     * Gets the value of the trnTypeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnTypeSource() {
        return trnTypeSource;
    }

    /**
     * Sets the value of the trnTypeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnTypeSource(String value) {
        this.trnTypeSource = value;
    }

}
