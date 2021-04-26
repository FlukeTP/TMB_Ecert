
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetireAcctTrnData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetireAcctTrnData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ContributionData" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}DistributionData" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RetireAcctTrnData_Type", propOrder = {
    "contributionData",
    "distributionData"
})
public class RetireAcctTrnDataType {

    @XmlElement(name = "ContributionData")
    protected List<ContributionDataType> contributionData;
    @XmlElement(name = "DistributionData")
    protected List<DistributionDataType> distributionData;

    /**
     * Gets the value of the contributionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributionDataType }
     * 
     * 
     */
    public List<ContributionDataType> getContributionData() {
        if (contributionData == null) {
            contributionData = new ArrayList<ContributionDataType>();
        }
        return this.contributionData;
    }

    /**
     * Gets the value of the distributionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionDataType }
     * 
     * 
     */
    public List<DistributionDataType> getDistributionData() {
        if (distributionData == null) {
            distributionData = new ArrayList<DistributionDataType>();
        }
        return this.distributionData;
    }

}
