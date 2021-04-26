
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailVdm_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailVdm_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevVdmOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevVdmServiceState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailVdm_Type", propOrder = {
    "devVdmOperation",
    "devVdmServiceState"
})
public class DevDetailVdmType {

    @XmlElement(name = "DevVdmOperation")
    protected String devVdmOperation;
    @XmlElement(name = "DevVdmServiceState")
    @XmlSchemaType(name = "string")
    protected DevVdmServiceStateType devVdmServiceState;

    /**
     * Gets the value of the devVdmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevVdmOperation() {
        return devVdmOperation;
    }

    /**
     * Sets the value of the devVdmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevVdmOperation(String value) {
        this.devVdmOperation = value;
    }

    /**
     * Gets the value of the devVdmServiceState property.
     * 
     * @return
     *     possible object is
     *     {@link DevVdmServiceStateType }
     *     
     */
    public DevVdmServiceStateType getDevVdmServiceState() {
        return devVdmServiceState;
    }

    /**
     * Sets the value of the devVdmServiceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevVdmServiceStateType }
     *     
     */
    public void setDevVdmServiceState(DevVdmServiceStateType value) {
        this.devVdmServiceState = value;
    }

}
