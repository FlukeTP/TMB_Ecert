
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclInfo"/&gt;
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
@XmlType(name = "PmtEnclRef_Type", propOrder = {
    "pmtEnclKeys",
    "pmtEnclRec",
    "pmtEnclInfo"
})
public class PmtEnclRefType {

    @XmlElement(name = "PmtEnclKeys")
    protected PmtEnclKeysType pmtEnclKeys;
    @XmlElement(name = "PmtEnclRec")
    protected PmtEnclRecType pmtEnclRec;
    @XmlElement(name = "PmtEnclInfo")
    protected PmtEnclInfoType pmtEnclInfo;

    /**
     * Gets the value of the pmtEnclKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclKeysType }
     *     
     */
    public PmtEnclKeysType getPmtEnclKeys() {
        return pmtEnclKeys;
    }

    /**
     * Sets the value of the pmtEnclKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclKeysType }
     *     
     */
    public void setPmtEnclKeys(PmtEnclKeysType value) {
        this.pmtEnclKeys = value;
    }

    /**
     * Gets the value of the pmtEnclRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclRecType }
     *     
     */
    public PmtEnclRecType getPmtEnclRec() {
        return pmtEnclRec;
    }

    /**
     * Sets the value of the pmtEnclRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclRecType }
     *     
     */
    public void setPmtEnclRec(PmtEnclRecType value) {
        this.pmtEnclRec = value;
    }

    /**
     * Gets the value of the pmtEnclInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclInfoType }
     *     
     */
    public PmtEnclInfoType getPmtEnclInfo() {
        return pmtEnclInfo;
    }

    /**
     * Sets the value of the pmtEnclInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclInfoType }
     *     
     */
    public void setPmtEnclInfo(PmtEnclInfoType value) {
        this.pmtEnclInfo = value;
    }

}
