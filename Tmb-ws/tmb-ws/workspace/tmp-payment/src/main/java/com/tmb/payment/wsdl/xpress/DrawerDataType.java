
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawerData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrawerData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerSeqNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawerData_Type", propOrder = {
    "branchIdent",
    "drawerName",
    "drawerSeqNo",
    "drawerId",
    "drawerDt"
})
public class DrawerDataType {

    @XmlElement(name = "BranchIdent", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String branchIdent;
    @XmlElement(name = "DrawerName")
    protected String drawerName;
    @XmlElement(name = "DrawerSeqNo")
    protected Long drawerSeqNo;
    @XmlElement(name = "DrawerId")
    protected String drawerId;
    @XmlElement(name = "DrawerDt")
    protected String drawerDt;

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

    /**
     * Gets the value of the drawerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerName() {
        return drawerName;
    }

    /**
     * Sets the value of the drawerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerName(String value) {
        this.drawerName = value;
    }

    /**
     * Gets the value of the drawerSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDrawerSeqNo() {
        return drawerSeqNo;
    }

    /**
     * Sets the value of the drawerSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDrawerSeqNo(Long value) {
        this.drawerSeqNo = value;
    }

    /**
     * Gets the value of the drawerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerId() {
        return drawerId;
    }

    /**
     * Sets the value of the drawerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerId(String value) {
        this.drawerId = value;
    }

    /**
     * Gets the value of the drawerDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerDt() {
        return drawerDt;
    }

    /**
     * Sets the value of the drawerDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerDt(String value) {
        this.drawerDt = value;
    }

}
