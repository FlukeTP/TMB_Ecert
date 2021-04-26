
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AdditionalStatus_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OvrrideExceptn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalStatus_Type", propOrder = {
    "ovrrideExceptn"
})
public class AdditionalStatusType
    extends com.tmb.payment.wsdl.xpress.vo.AdditionalStatusType
{

    @XmlElement(name = "OvrrideExceptn")
    protected List<OvrrideExceptnType> ovrrideExceptn;

    /**
     * Gets the value of the ovrrideExceptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ovrrideExceptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOvrrideExceptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OvrrideExceptnType }
     * 
     * 
     */
    public List<OvrrideExceptnType> getOvrrideExceptn() {
        if (ovrrideExceptn == null) {
            ovrrideExceptn = new ArrayList<OvrrideExceptnType>();
        }
        return this.ovrrideExceptn;
    }

}
