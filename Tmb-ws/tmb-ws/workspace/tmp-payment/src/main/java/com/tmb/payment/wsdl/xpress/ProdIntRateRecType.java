
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.BaseAuthType;


/**
 * <p>Java class for ProdIntRateRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ProdIntRateId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ProdIntRateKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProdIntRateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateRec_Type", propOrder = {
    "prodIntRateId",
    "prodIntRateKeys",
    "prodIntRateInfo",
    "prodIntRateAuth",
    "prodIntRateEnvr",
    "prodIntRateStatus"
})
public class ProdIntRateRecType {

    @XmlElement(name = "ProdIntRateId")
    protected String prodIntRateId;
    @XmlElement(name = "ProdIntRateKeys")
    protected ProdIntRateKeysType prodIntRateKeys;
    @XmlElement(name = "ProdIntRateInfo", required = true)
    protected ProdIntRateInfoType prodIntRateInfo;
    @XmlElement(name = "ProdIntRateAuth")
    protected BaseAuthType prodIntRateAuth;
    @XmlElement(name = "ProdIntRateEnvr")
    protected ProdIntRateEnvrType prodIntRateEnvr;
    @XmlElement(name = "ProdIntRateStatus", required = true)
    protected ProdIntRateStatusType prodIntRateStatus;

    /**
     * Gets the value of the prodIntRateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdIntRateId() {
        return prodIntRateId;
    }

    /**
     * Sets the value of the prodIntRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdIntRateId(String value) {
        this.prodIntRateId = value;
    }

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

    /**
     * Gets the value of the prodIntRateAuth property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAuthType }
     *     
     */
    public BaseAuthType getProdIntRateAuth() {
        return prodIntRateAuth;
    }

    /**
     * Sets the value of the prodIntRateAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAuthType }
     *     
     */
    public void setProdIntRateAuth(BaseAuthType value) {
        this.prodIntRateAuth = value;
    }

    /**
     * Gets the value of the prodIntRateEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateEnvrType }
     *     
     */
    public ProdIntRateEnvrType getProdIntRateEnvr() {
        return prodIntRateEnvr;
    }

    /**
     * Sets the value of the prodIntRateEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateEnvrType }
     *     
     */
    public void setProdIntRateEnvr(ProdIntRateEnvrType value) {
        this.prodIntRateEnvr = value;
    }

    /**
     * Gets the value of the prodIntRateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProdIntRateStatusType }
     *     
     */
    public ProdIntRateStatusType getProdIntRateStatus() {
        return prodIntRateStatus;
    }

    /**
     * Sets the value of the prodIntRateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdIntRateStatusType }
     *     
     */
    public void setProdIntRateStatus(ProdIntRateStatusType value) {
        this.prodIntRateStatus = value;
    }

}
