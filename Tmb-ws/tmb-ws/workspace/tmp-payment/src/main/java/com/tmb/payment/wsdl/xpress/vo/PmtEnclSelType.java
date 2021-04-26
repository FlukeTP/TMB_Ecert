
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclKeys"/&gt;
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
@XmlType(name = "PmtEnclSel_Type", propOrder = {
    "pmtEnclKeys"
})
public class PmtEnclSelType {

    @XmlElement(name = "PmtEnclKeys")
    protected List<PmtEnclKeysType> pmtEnclKeys;

    /**
     * Gets the value of the pmtEnclKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtEnclKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtEnclKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtEnclKeysType }
     * 
     * 
     */
    public List<PmtEnclKeysType> getPmtEnclKeys() {
        if (pmtEnclKeys == null) {
            pmtEnclKeys = new ArrayList<PmtEnclKeysType>();
        }
        return this.pmtEnclKeys;
    }

}
