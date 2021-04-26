
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailTtu_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailTtu_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevTtuType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevTtuOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevTtuKbd"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevTtuKbdLock"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevTtuLed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailTtu_Type", propOrder = {
    "devTtuType",
    "devTtuOperation",
    "devTtuKbd",
    "devTtuKbdLock",
    "devTtuLed"
})
public class DevDetailTtuType {

    @XmlElement(name = "DevTtuType", required = true)
    protected String devTtuType;
    @XmlElement(name = "DevTtuOperation")
    protected String devTtuOperation;
    @XmlElement(name = "DevTtuKbd", required = true)
    @XmlSchemaType(name = "string")
    protected DevTtuKbdType devTtuKbd;
    @XmlElement(name = "DevTtuKbdLock", required = true)
    @XmlSchemaType(name = "string")
    protected DevTtuKbdLockType devTtuKbdLock;
    @XmlElement(name = "DevTtuLed")
    @XmlSchemaType(name = "string")
    protected List<DevTtuLedType> devTtuLed;

    /**
     * Gets the value of the devTtuType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevTtuType() {
        return devTtuType;
    }

    /**
     * Sets the value of the devTtuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevTtuType(String value) {
        this.devTtuType = value;
    }

    /**
     * Gets the value of the devTtuOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevTtuOperation() {
        return devTtuOperation;
    }

    /**
     * Sets the value of the devTtuOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevTtuOperation(String value) {
        this.devTtuOperation = value;
    }

    /**
     * Gets the value of the devTtuKbd property.
     * 
     * @return
     *     possible object is
     *     {@link DevTtuKbdType }
     *     
     */
    public DevTtuKbdType getDevTtuKbd() {
        return devTtuKbd;
    }

    /**
     * Sets the value of the devTtuKbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevTtuKbdType }
     *     
     */
    public void setDevTtuKbd(DevTtuKbdType value) {
        this.devTtuKbd = value;
    }

    /**
     * Gets the value of the devTtuKbdLock property.
     * 
     * @return
     *     possible object is
     *     {@link DevTtuKbdLockType }
     *     
     */
    public DevTtuKbdLockType getDevTtuKbdLock() {
        return devTtuKbdLock;
    }

    /**
     * Sets the value of the devTtuKbdLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevTtuKbdLockType }
     *     
     */
    public void setDevTtuKbdLock(DevTtuKbdLockType value) {
        this.devTtuKbdLock = value;
    }

    /**
     * Gets the value of the devTtuLed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devTtuLed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevTtuLed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevTtuLedType }
     * 
     * 
     */
    public List<DevTtuLedType> getDevTtuLed() {
        if (devTtuLed == null) {
            devTtuLed = new ArrayList<DevTtuLedType>();
        }
        return this.devTtuLed;
    }

}
