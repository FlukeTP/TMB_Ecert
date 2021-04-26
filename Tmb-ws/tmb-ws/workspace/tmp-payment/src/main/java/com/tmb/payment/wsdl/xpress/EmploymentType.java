
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
 * <p>Java class for Employment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}Employment_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EmploymentIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmtRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SalaryRangeCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Dept" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employment_Type", propOrder = {
    "employmentIdent",
    "curAmtRange",
    "salaryRangeCd",
    "dept"
})
public class EmploymentType
    extends com.tmb.payment.wsdl.xpress.vo.EmploymentType
{

    @XmlElement(name = "EmploymentIdent")
    protected String employmentIdent;
    @XmlElementRef(name = "CurAmtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType>> curAmtRange;
    @XmlElement(name = "SalaryRangeCd")
    protected String salaryRangeCd;
    @XmlElement(name = "Dept")
    protected String dept;

    /**
     * Gets the value of the employmentIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentIdent() {
        return employmentIdent;
    }

    /**
     * Sets the value of the employmentIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentIdent(String value) {
        this.employmentIdent = value;
    }

    /**
     * Gets the value of the curAmtRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curAmtRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurAmtRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType>> getCurAmtRange() {
        if (curAmtRange == null) {
            curAmtRange = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType>>();
        }
        return this.curAmtRange;
    }

    /**
     * Gets the value of the salaryRangeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryRangeCd() {
        return salaryRangeCd;
    }

    /**
     * Sets the value of the salaryRangeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryRangeCd(String value) {
        this.salaryRangeCd = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

}
