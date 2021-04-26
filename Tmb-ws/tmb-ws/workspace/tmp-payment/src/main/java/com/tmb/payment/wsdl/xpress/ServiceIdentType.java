
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ServiceIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ServiceIdentValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIdent_Type", propOrder = {
    "serviceIdentType",
    "serviceIdentValue"
})
public class ServiceIdentType {

    @XmlElement(name = "ServiceIdentType")
    protected String serviceIdentType;
    @XmlElement(name = "ServiceIdentValue")
    protected String serviceIdentValue;

    /**
     * Gets the value of the serviceIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentType() {
        return serviceIdentType;
    }

    /**
     * Sets the value of the serviceIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentType(String value) {
        this.serviceIdentType = value;
    }

    /**
     * Gets the value of the serviceIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentValue() {
        return serviceIdentValue;
    }

    /**
     * Sets the value of the serviceIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentValue(String value) {
        this.serviceIdentValue = value;
    }

}
