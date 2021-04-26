
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgCategoryCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgCategoryCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MCC" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}NAICS" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SIC" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgCatIdent" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgCategoryCode_Type", propOrder = {
    "mccAndNAICSAndSIC"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.OrgCategoryCodeType.class
})
public class OrgCategoryCodeType {

    @XmlElementRefs({
        @XmlElementRef(name = "OrgCatIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MCC", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SIC", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NAICS", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> mccAndNAICSAndSIC;

    /**
     * Gets the value of the mccAndNAICSAndSIC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mccAndNAICSAndSIC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMCCAndNAICSAndSIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link OrgCatIdentType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getMCCAndNAICSAndSIC() {
        if (mccAndNAICSAndSIC == null) {
            mccAndNAICSAndSIC = new ArrayList<JAXBElement<?>>();
        }
        return this.mccAndNAICSAndSIC;
    }

}
