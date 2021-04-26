
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbookData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbookData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PassbkIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PassbkLastItemPrinted" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PassbkNextLine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbookData_Type", propOrder = {
    "passbkIdent",
    "passbkLastItemPrinted",
    "passbkNextLine"
})
public class PassbookDataType {

    @XmlElement(name = "PassbkIdent")
    protected String passbkIdent;
    @XmlElement(name = "PassbkLastItemPrinted")
    protected String passbkLastItemPrinted;
    @XmlElement(name = "PassbkNextLine")
    protected Long passbkNextLine;

    /**
     * Gets the value of the passbkIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkIdent() {
        return passbkIdent;
    }

    /**
     * Sets the value of the passbkIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkIdent(String value) {
        this.passbkIdent = value;
    }

    /**
     * Gets the value of the passbkLastItemPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkLastItemPrinted() {
        return passbkLastItemPrinted;
    }

    /**
     * Sets the value of the passbkLastItemPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkLastItemPrinted(String value) {
        this.passbkLastItemPrinted = value;
    }

    /**
     * Gets the value of the passbkNextLine property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkNextLine() {
        return passbkNextLine;
    }

    /**
     * Sets the value of the passbkNextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkNextLine(Long value) {
        this.passbkNextLine = value;
    }

}
