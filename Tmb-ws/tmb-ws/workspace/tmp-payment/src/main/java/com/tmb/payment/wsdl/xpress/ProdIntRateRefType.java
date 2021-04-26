
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateKeys"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateRec"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateRef_Type", propOrder = {
    "prodIntRateKeys",
    "prodIntRateRec",
    "prodIntRateInfo"
})
public class ProdIntRateRefType {

    @XmlElement(name = "ProdIntRateKeys")
    protected ProdIntRateKeysType prodIntRateKeys;
    @XmlElement(name = "ProdIntRateRec")
    protected ProdIntRateRecType prodIntRateRec;
    @XmlElement(name = "ProdIntRateInfo")
    protected ProdIntRateInfoType prodIntRateInfo;

    /**
     * Gets the value of the prodIntRateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateKeysType }
     *     
     */
    public ProdIntRateKeysType getProdIntRateKeys() {
        return prodIntRateKeys;
    }

    /**
     * Sets the value of the prodIntRateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateKeysType }
     *     
     */
    public void setProdIntRateKeys(ProdIntRateKeysType value) {
        this.prodIntRateKeys = value;
    }

    /**
     * Gets the value of the prodIntRateRec property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateRecType }
     *     
     */
    public ProdIntRateRecType getProdIntRateRec() {
        return prodIntRateRec;
    }

    /**
     * Sets the value of the prodIntRateRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateRecType }
     *     
     */
    public void setProdIntRateRec(ProdIntRateRecType value) {
        this.prodIntRateRec = value;
    }

    /**
     * Gets the value of the prodIntRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateInfoType }
     *     
     */
    public ProdIntRateInfoType getProdIntRateInfo() {
        return prodIntRateInfo;
    }

    /**
     * Sets the value of the prodIntRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateInfoType }
     *     
     */
    public void setProdIntRateInfo(ProdIntRateInfoType value) {
        this.prodIntRateInfo = value;
    }

}
