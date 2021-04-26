
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentCharacterData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentCharacterData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrigIssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentProgram" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentReadMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentPrevReadMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentPrevServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyResults" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentCharacterData_Type", propOrder = {
    "identType",
    "expDt",
    "startDt",
    "origIssueDt",
    "identProgram",
    "identReadMethod",
    "identPrevReadMethod",
    "identServiceCode",
    "identPrevServiceCode",
    "identVerifyMethod",
    "identVerifyEntity",
    "identConditions",
    "identVerifyResults"
})
public class IdentCharacterDataType {

    @XmlElement(name = "IdentType", required = true)
    protected String identType;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "StartDt")
    protected String startDt;
    @XmlElement(name = "OrigIssueDt")
    protected String origIssueDt;
    @XmlElement(name = "IdentProgram")
    protected String identProgram;
    @XmlElement(name = "IdentReadMethod")
    protected List<String> identReadMethod;
    @XmlElement(name = "IdentPrevReadMethod")
    protected List<String> identPrevReadMethod;
    @XmlElement(name = "IdentServiceCode")
    protected String identServiceCode;
    @XmlElement(name = "IdentPrevServiceCode")
    protected String identPrevServiceCode;
    @XmlElement(name = "IdentVerifyMethod")
    protected List<String> identVerifyMethod;
    @XmlElement(name = "IdentVerifyEntity")
    protected List<String> identVerifyEntity;
    @XmlElement(name = "IdentConditions")
    protected List<String> identConditions;
    @XmlElement(name = "IdentVerifyResults")
    protected List<String> identVerifyResults;

    /**
     * Gets the value of the identType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentType() {
        return identType;
    }

    /**
     * Sets the value of the identType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentType(String value) {
        this.identType = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
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
     * Gets the value of the origIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigIssueDt() {
        return origIssueDt;
    }

    /**
     * Sets the value of the origIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigIssueDt(String value) {
        this.origIssueDt = value;
    }

    /**
     * Gets the value of the identProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentProgram() {
        return identProgram;
    }

    /**
     * Sets the value of the identProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentProgram(String value) {
        this.identProgram = value;
    }

    /**
     * Gets the value of the identReadMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identReadMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentReadMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentReadMethod() {
        if (identReadMethod == null) {
            identReadMethod = new ArrayList<String>();
        }
        return this.identReadMethod;
    }

    /**
     * Gets the value of the identPrevReadMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identPrevReadMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentPrevReadMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentPrevReadMethod() {
        if (identPrevReadMethod == null) {
            identPrevReadMethod = new ArrayList<String>();
        }
        return this.identPrevReadMethod;
    }

    /**
     * Gets the value of the identServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentServiceCode() {
        return identServiceCode;
    }

    /**
     * Sets the value of the identServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentServiceCode(String value) {
        this.identServiceCode = value;
    }

    /**
     * Gets the value of the identPrevServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentPrevServiceCode() {
        return identPrevServiceCode;
    }

    /**
     * Sets the value of the identPrevServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentPrevServiceCode(String value) {
        this.identPrevServiceCode = value;
    }

    /**
     * Gets the value of the identVerifyMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyMethod() {
        if (identVerifyMethod == null) {
            identVerifyMethod = new ArrayList<String>();
        }
        return this.identVerifyMethod;
    }

    /**
     * Gets the value of the identVerifyEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyEntity() {
        if (identVerifyEntity == null) {
            identVerifyEntity = new ArrayList<String>();
        }
        return this.identVerifyEntity;
    }

    /**
     * Gets the value of the identConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentConditions() {
        if (identConditions == null) {
            identConditions = new ArrayList<String>();
        }
        return this.identConditions;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identVerifyResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentVerifyResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentVerifyResults() {
        if (identVerifyResults == null) {
            identVerifyResults = new ArrayList<String>();
        }
        return this.identVerifyResults;
    }

}
