
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}TrnRef_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnRef_Type", propOrder = {
    "acctTrnKeys",
    "acctTrnRec",
    "acctTrnInfo"
})
public class AcctTrnRefType
    extends TrnRefType
{

    @XmlElement(name = "AcctTrnKeys")
    protected AcctTrnKeysType acctTrnKeys;
    @XmlElementRef(name = "AcctTrnRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnRecType> acctTrnRec;
    @XmlElementRef(name = "AcctTrnInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> acctTrnInfo;

    /**
     * Gets the value of the acctTrnKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnKeysType }
     *     
     */
    public AcctTrnKeysType getAcctTrnKeys() {
        return acctTrnKeys;
    }

    /**
     * Sets the value of the acctTrnKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnKeysType }
     *     
     */
    public void setAcctTrnKeys(AcctTrnKeysType value) {
        this.acctTrnKeys = value;
    }

    /**
     * Gets the value of the acctTrnRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnRecType> getAcctTrnRec() {
        return acctTrnRec;
    }

    /**
     * Sets the value of the acctTrnRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnRecType }{@code >}
     *     
     */
    public void setAcctTrnRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnRecType> value) {
        this.acctTrnRec = value;
    }

    /**
     * Gets the value of the acctTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> getAcctTrnInfo() {
        return acctTrnInfo;
    }

    /**
     * Sets the value of the acctTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTrnInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType }{@code >}
     *     
     */
    public void setAcctTrnInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTrnInfoType> value) {
        this.acctTrnInfo = value;
    }

}
