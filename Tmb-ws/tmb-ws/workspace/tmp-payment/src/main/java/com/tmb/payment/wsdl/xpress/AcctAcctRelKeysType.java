
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctAcctRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAcctRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}AcctAcctRelId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}RelAcctKeys"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}NotAvailInd"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctRelType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctRelName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctAcctRelKeys_Type", propOrder = {
    "acctAcctRelId",
    "acctKeys",
    "relAcctKeys",
    "notAvailInd",
    "acctRelType",
    "acctRelName"
})
public class AcctAcctRelKeysType {

    @XmlElement(name = "AcctAcctRelId")
    protected String acctAcctRelId;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "RelAcctKeys")
    protected RelAcctKeysType relAcctKeys;
    @XmlElement(name = "NotAvailInd")
    protected Boolean notAvailInd;
    @XmlElement(name = "AcctRelType", required = true)
    protected String acctRelType;
    @XmlElement(name = "AcctRelName")
    protected String acctRelName;

    /**
     * Gets the value of the acctAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctAcctRelId() {
        return acctAcctRelId;
    }

    /**
     * Sets the value of the acctAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctAcctRelId(String value) {
        this.acctAcctRelId = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the relAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RelAcctKeysType }
     *     
     */
    public RelAcctKeysType getRelAcctKeys() {
        return relAcctKeys;
    }

    /**
     * Sets the value of the relAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelAcctKeysType }
     *     
     */
    public void setRelAcctKeys(RelAcctKeysType value) {
        this.relAcctKeys = value;
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

    /**
     * Gets the value of the acctRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelType() {
        return acctRelType;
    }

    /**
     * Sets the value of the acctRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelType(String value) {
        this.acctRelType = value;
    }

    /**
     * Gets the value of the acctRelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctRelName() {
        return acctRelName;
    }

    /**
     * Sets the value of the acctRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctRelName(String value) {
        this.acctRelName = value;
    }

}
