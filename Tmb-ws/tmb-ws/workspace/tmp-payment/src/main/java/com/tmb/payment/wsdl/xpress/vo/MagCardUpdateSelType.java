
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagCardUpdateSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagCardUpdateSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateKeys"/&gt;
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
@XmlType(name = "MagCardUpdateSel_Type", propOrder = {
    "magCardUpdateKeys"
})
public class MagCardUpdateSelType {

    @XmlElement(name = "MagCardUpdateKeys")
    protected List<MagCardUpdateKeysType> magCardUpdateKeys;

    /**
     * Gets the value of the magCardUpdateKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magCardUpdateKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMagCardUpdateKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MagCardUpdateKeysType }
     * 
     * 
     */
    public List<MagCardUpdateKeysType> getMagCardUpdateKeys() {
        if (magCardUpdateKeys == null) {
            magCardUpdateKeys = new ArrayList<MagCardUpdateKeysType>();
        }
        return this.magCardUpdateKeys;
    }

}
