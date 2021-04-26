
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerScriptData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerScriptData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerPreScriptData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerPostScriptData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerScriptData_Type", propOrder = {
    "issuerPreScriptData",
    "issuerPostScriptData"
})
public class IssuerScriptDataType {

    @XmlElement(name = "IssuerPreScriptData")
    protected List<IssuerPreScriptDataType> issuerPreScriptData;
    @XmlElement(name = "IssuerPostScriptData")
    protected List<IssuerPostScriptDataType> issuerPostScriptData;

    /**
     * Gets the value of the issuerPreScriptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerPreScriptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerPreScriptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerPreScriptDataType }
     * 
     * 
     */
    public List<IssuerPreScriptDataType> getIssuerPreScriptData() {
        if (issuerPreScriptData == null) {
            issuerPreScriptData = new ArrayList<IssuerPreScriptDataType>();
        }
        return this.issuerPreScriptData;
    }

    /**
     * Gets the value of the issuerPostScriptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerPostScriptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerPostScriptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerPostScriptDataType }
     * 
     * 
     */
    public List<IssuerPostScriptDataType> getIssuerPostScriptData() {
        if (issuerPostScriptData == null) {
            issuerPostScriptData = new ArrayList<IssuerPostScriptDataType>();
        }
        return this.issuerPostScriptData;
    }

}
