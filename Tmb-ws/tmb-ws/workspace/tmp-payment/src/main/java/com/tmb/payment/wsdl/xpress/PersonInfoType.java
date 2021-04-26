
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NamePrefix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CustFullNameEng" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NamePrefixEng" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IDNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PhoneNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostAddr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo_Type", propOrder = {
    "fullName",
    "namePrefix",
    "custFullNameEng",
    "namePrefixEng",
    "idNumber",
    "phoneNum",
    "postAddr"
})
public class PersonInfoType {

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "NamePrefix")
    protected String namePrefix;
    @XmlElement(name = "CustFullNameEng")
    protected String custFullNameEng;
    @XmlElement(name = "NamePrefixEng")
    protected String namePrefixEng;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "PhoneNum")
    protected List<PhoneNumType> phoneNum;
    @XmlElement(name = "PostAddr")
    protected List<PostAddrType> postAddr;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefix(String value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the custFullNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFullNameEng() {
        return custFullNameEng;
    }

    /**
     * Sets the value of the custFullNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFullNameEng(String value) {
        this.custFullNameEng = value;
    }

    /**
     * Gets the value of the namePrefixEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixEng() {
        return namePrefixEng;
    }

    /**
     * Sets the value of the namePrefixEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixEng(String value) {
        this.namePrefixEng = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumType }
     * 
     * 
     */
    public List<PhoneNumType> getPhoneNum() {
        if (phoneNum == null) {
            phoneNum = new ArrayList<PhoneNumType>();
        }
        return this.phoneNum;
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
     * {@link PostAddrType }
     * 
     * 
     */
    public List<PostAddrType> getPostAddr() {
        if (postAddr == null) {
            postAddr = new ArrayList<PostAddrType>();
        }
        return this.postAddr;
    }

}
