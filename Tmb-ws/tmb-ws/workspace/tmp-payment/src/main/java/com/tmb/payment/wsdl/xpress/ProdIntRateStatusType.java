
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateStatusCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateStatus_Type", propOrder = {
    "prodIntRateStatusCode",
    "statusDesc",
    "effDt"
})
public class ProdIntRateStatusType {

    @XmlElement(name = "ProdIntRateStatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected ProdIntRateStatusCodeType prodIntRateStatusCode;
    @XmlElement(name = "StatusDesc", namespace = "urn:ifxforum-org:XSD:1")
    protected String statusDesc;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;

    /**
     * Gets the value of the prodIntRateStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateStatusCodeType }
     *     
     */
    public ProdIntRateStatusCodeType getProdIntRateStatusCode() {
        return prodIntRateStatusCode;
    }

    /**
     * Sets the value of the prodIntRateStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateStatusCodeType }
     *     
     */
    public void setProdIntRateStatusCode(ProdIntRateStatusCodeType value) {
        this.prodIntRateStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

}
