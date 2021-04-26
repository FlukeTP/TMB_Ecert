
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevStatusCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDetail"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPlatformData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusModBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevStatus_Type", propOrder = {
    "devStatusCode",
    "devDetail",
    "devPlatformData",
    "statusDesc",
    "effDt",
    "statusModBy"
})
public class DevStatusType {

    @XmlElement(name = "DevStatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected DevStatusCodeType devStatusCode;
    @XmlElement(name = "DevDetail", required = true)
    protected DevDetailType devDetail;
    @XmlElement(name = "DevPlatformData")
    protected List<DevPlatformDataType> devPlatformData;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the devStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DevStatusCodeType }
     *     
     */
    public DevStatusCodeType getDevStatusCode() {
        return devStatusCode;
    }

    /**
     * Sets the value of the devStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevStatusCodeType }
     *     
     */
    public void setDevStatusCode(DevStatusCodeType value) {
        this.devStatusCode = value;
    }

    /**
     * Gets the value of the devDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DevDetailType }
     *     
     */
    public DevDetailType getDevDetail() {
        return devDetail;
    }

    /**
     * Sets the value of the devDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDetailType }
     *     
     */
    public void setDevDetail(DevDetailType value) {
        this.devDetail = value;
    }

    /**
     * Gets the value of the devPlatformData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devPlatformData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevPlatformData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevPlatformDataType }
     * 
     * 
     */
    public List<DevPlatformDataType> getDevPlatformData() {
        if (devPlatformData == null) {
            devPlatformData = new ArrayList<DevPlatformDataType>();
        }
        return this.devPlatformData;
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

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

}
