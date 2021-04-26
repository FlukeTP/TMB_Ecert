
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeferredData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeferredData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DocDepositId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DocScanned" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DocTrnNbr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DeferedCompBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeferredData_Type", propOrder = {
    "docDepositId",
    "docScanned",
    "docTrnNbr",
    "deferedCompBy"
})
public class DeferredDataType {

    @XmlElement(name = "DocDepositId")
    protected String docDepositId;
    @XmlElement(name = "DocScanned")
    protected String docScanned;
    @XmlElement(name = "DocTrnNbr")
    protected String docTrnNbr;
    @XmlElement(name = "DeferedCompBy")
    protected String deferedCompBy;

    /**
     * Gets the value of the docDepositId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDepositId() {
        return docDepositId;
    }

    /**
     * Sets the value of the docDepositId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDepositId(String value) {
        this.docDepositId = value;
    }

    /**
     * Gets the value of the docScanned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocScanned() {
        return docScanned;
    }

    /**
     * Sets the value of the docScanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocScanned(String value) {
        this.docScanned = value;
    }

    /**
     * Gets the value of the docTrnNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTrnNbr() {
        return docTrnNbr;
    }

    /**
     * Sets the value of the docTrnNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTrnNbr(String value) {
        this.docTrnNbr = value;
    }

    /**
     * Gets the value of the deferedCompBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferedCompBy() {
        return deferedCompBy;
    }

    /**
     * Sets the value of the deferedCompBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferedCompBy(String value) {
        this.deferedCompBy = value;
    }

}
