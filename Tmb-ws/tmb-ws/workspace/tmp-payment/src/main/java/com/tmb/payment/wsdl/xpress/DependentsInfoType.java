
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DependentsInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentsInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HeadofHouseHoldInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HouseholdMemberCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChildrenCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChildrenPresenceInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RetirementAcctHolderInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependentsInfo_Type", propOrder = {
    "headofHouseHoldInd",
    "householdMemberCount",
    "childrenCount",
    "childrenPresenceInd",
    "retirementAcctHolderInd"
})
public class DependentsInfoType {

    @XmlElement(name = "HeadofHouseHoldInd")
    protected Boolean headofHouseHoldInd;
    @XmlElement(name = "HouseholdMemberCount")
    protected Long householdMemberCount;
    @XmlElement(name = "ChildrenCount")
    protected Long childrenCount;
    @XmlElement(name = "ChildrenPresenceInd")
    protected Boolean childrenPresenceInd;
    @XmlElement(name = "RetirementAcctHolderInd")
    protected Boolean retirementAcctHolderInd;

    /**
     * Gets the value of the headofHouseHoldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadofHouseHoldInd() {
        return headofHouseHoldInd;
    }

    /**
     * Sets the value of the headofHouseHoldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadofHouseHoldInd(Boolean value) {
        this.headofHouseHoldInd = value;
    }

    /**
     * Gets the value of the householdMemberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseholdMemberCount() {
        return householdMemberCount;
    }

    /**
     * Sets the value of the householdMemberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseholdMemberCount(Long value) {
        this.householdMemberCount = value;
    }

    /**
     * Gets the value of the childrenCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChildrenCount() {
        return childrenCount;
    }

    /**
     * Sets the value of the childrenCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChildrenCount(Long value) {
        this.childrenCount = value;
    }

    /**
     * Gets the value of the childrenPresenceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildrenPresenceInd() {
        return childrenPresenceInd;
    }

    /**
     * Sets the value of the childrenPresenceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildrenPresenceInd(Boolean value) {
        this.childrenPresenceInd = value;
    }

    /**
     * Gets the value of the retirementAcctHolderInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetirementAcctHolderInd() {
        return retirementAcctHolderInd;
    }

    /**
     * Sets the value of the retirementAcctHolderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetirementAcctHolderInd(Boolean value) {
        this.retirementAcctHolderInd = value;
    }

}
