
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidenceInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidenceInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HouseHoldType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ResidenceStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StateMovedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CitizenshipStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ForeignStatusFormDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ForeignStatusFormReqiredInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidenceInfo_Type", propOrder = {
    "houseHoldType",
    "postAddr",
    "residenceStatus",
    "startDt",
    "stateMovedDt",
    "citizenshipStatus",
    "foreignStatusFormDt",
    "foreignStatusFormReqiredInd"
})
public class ResidenceInfoType {

    @XmlElement(name = "HouseHoldType")
    protected List<String> houseHoldType;
    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType>> postAddr;
    @XmlElement(name = "ResidenceStatus")
    protected String residenceStatus;
    @XmlElement(name = "StartDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String startDt;
    @XmlElement(name = "StateMovedDt")
    protected String stateMovedDt;
    @XmlElement(name = "CitizenshipStatus")
    protected String citizenshipStatus;
    @XmlElement(name = "ForeignStatusFormDt")
    protected String foreignStatusFormDt;
    @XmlElement(name = "ForeignStatusFormReqiredInd")
    protected Boolean foreignStatusFormReqiredInd;

    /**
     * Gets the value of the houseHoldType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseHoldType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseHoldType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHouseHoldType() {
        if (houseHoldType == null) {
            houseHoldType = new ArrayList<String>();
        }
        return this.houseHoldType;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType>> getPostAddr() {
        if (postAddr == null) {
            postAddr = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType>>();
        }
        return this.postAddr;
    }

    /**
     * Gets the value of the residenceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceStatus() {
        return residenceStatus;
    }

    /**
     * Sets the value of the residenceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceStatus(String value) {
        this.residenceStatus = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the stateMovedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateMovedDt() {
        return stateMovedDt;
    }

    /**
     * Sets the value of the stateMovedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateMovedDt(String value) {
        this.stateMovedDt = value;
    }

    /**
     * Gets the value of the citizenshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    /**
     * Sets the value of the citizenshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipStatus(String value) {
        this.citizenshipStatus = value;
    }

    /**
     * Gets the value of the foreignStatusFormDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStatusFormDt() {
        return foreignStatusFormDt;
    }

    /**
     * Sets the value of the foreignStatusFormDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStatusFormDt(String value) {
        this.foreignStatusFormDt = value;
    }

    /**
     * Gets the value of the foreignStatusFormReqiredInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignStatusFormReqiredInd() {
        return foreignStatusFormReqiredInd;
    }

    /**
     * Sets the value of the foreignStatusFormReqiredInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignStatusFormReqiredInd(Boolean value) {
        this.foreignStatusFormReqiredInd = value;
    }

}
