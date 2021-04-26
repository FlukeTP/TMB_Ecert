
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueRef_Type", propOrder = {
    "chkIssueKeys",
    "chkIssueRec",
    "chkIssueInfo"
})
public class ChkIssueRefType {

    @XmlElement(name = "ChkIssueKeys")
    protected ChkIssueKeysType chkIssueKeys;
    @XmlElementRef(name = "ChkIssueRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueRecType> chkIssueRec;
    @XmlElementRef(name = "ChkIssueInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> chkIssueInfo;

    /**
     * Gets the value of the chkIssueKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueKeysType }
     *     
     */
    public ChkIssueKeysType getChkIssueKeys() {
        return chkIssueKeys;
    }

    /**
     * Sets the value of the chkIssueKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueKeysType }
     *     
     */
    public void setChkIssueKeys(ChkIssueKeysType value) {
        this.chkIssueKeys = value;
    }

    /**
     * Gets the value of the chkIssueRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueRecType> getChkIssueRec() {
        return chkIssueRec;
    }

    /**
     * Sets the value of the chkIssueRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueRecType }{@code >}
     *     
     */
    public void setChkIssueRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueRecType> value) {
        this.chkIssueRec = value;
    }

    /**
     * Gets the value of the chkIssueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> getChkIssueInfo() {
        return chkIssueInfo;
    }

    /**
     * Sets the value of the chkIssueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkIssueInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType }{@code >}
     *     
     */
    public void setChkIssueInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkIssueInfoType> value) {
        this.chkIssueInfo = value;
    }

}
