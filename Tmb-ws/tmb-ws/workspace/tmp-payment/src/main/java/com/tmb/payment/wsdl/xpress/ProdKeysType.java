
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ProdId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PkgInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdKeys_Type", propOrder = {
    "spName",
    "prodId",
    "prodClass",
    "pkgInd"
})
public class ProdKeysType {

    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "ProdId")
    protected String prodId;
    @XmlElement(name = "ProdClass")
    protected String prodClass;
    @XmlElement(name = "PkgInd")
    protected Boolean pkgInd;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the prodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * Sets the value of the prodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdId(String value) {
        this.prodId = value;
    }

    /**
     * Gets the value of the prodClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdClass() {
        return prodClass;
    }

    /**
     * Sets the value of the prodClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdClass(String value) {
        this.prodClass = value;
    }

    /**
     * Gets the value of the pkgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPkgInd() {
        return pkgInd;
    }

    /**
     * Sets the value of the pkgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPkgInd(Boolean value) {
        this.pkgInd = value;
    }

}
