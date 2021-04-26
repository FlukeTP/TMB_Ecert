
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutOfWalletKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutOfWalletKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}OutOfWalletId" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}OutOfWalletIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NotAvailInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfWalletKeys_Type", propOrder = {
    "outOfWalletId",
    "outOfWalletIdent",
    "notAvailInd"
})
public class OutOfWalletKeysType {

    @XmlElement(name = "OutOfWalletId")
    protected String outOfWalletId;
    @XmlElement(name = "OutOfWalletIdent")
    protected List<OutOfWalletIdentType> outOfWalletIdent;
    @XmlElement(name = "NotAvailInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the outOfWalletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfWalletId() {
        return outOfWalletId;
    }

    /**
     * Sets the value of the outOfWalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfWalletId(String value) {
        this.outOfWalletId = value;
    }

    /**
     * Gets the value of the outOfWalletIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOfWalletIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOfWalletIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutOfWalletIdentType }
     * 
     * 
     */
    public List<OutOfWalletIdentType> getOutOfWalletIdent() {
        if (outOfWalletIdent == null) {
            outOfWalletIdent = new ArrayList<OutOfWalletIdentType>();
        }
        return this.outOfWalletIdent;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
