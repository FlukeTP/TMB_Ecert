
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkItemInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkItemInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemDetail"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseEnvr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkItemInfo_Type", propOrder = {
    "passbkId",
    "passbkItemDetail",
    "baseEnvr"
})
public class PassbkItemInfoType {

    @XmlElement(name = "PassbkId", required = true)
    protected String passbkId;
    @XmlElement(name = "PassbkItemDetail", required = true)
    protected PassbkItemDetailType passbkItemDetail;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the passbkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkId() {
        return passbkId;
    }

    /**
     * Sets the value of the passbkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkId(String value) {
        this.passbkId = value;
    }

    /**
     * Gets the value of the passbkItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemDetailType }
     *     
     */
    public PassbkItemDetailType getPassbkItemDetail() {
        return passbkItemDetail;
    }

    /**
     * Sets the value of the passbkItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemDetailType }
     *     
     */
    public void setPassbkItemDetail(PassbkItemDetailType value) {
        this.passbkItemDetail = value;
    }

    /**
     * Gets the value of the baseEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BaseEnvrType }
     *     
     */
    public BaseEnvrType getBaseEnvr() {
        return baseEnvr;
    }

    /**
     * Sets the value of the baseEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseEnvrType }
     *     
     */
    public void setBaseEnvr(BaseEnvrType value) {
        this.baseEnvr = value;
    }

}
