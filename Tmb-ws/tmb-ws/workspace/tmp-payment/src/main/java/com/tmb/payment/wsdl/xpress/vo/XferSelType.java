
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}XferKeys"/&gt;
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
@XmlType(name = "XferSel_Type", propOrder = {
    "xferKeys"
})
public class XferSelType {

    @XmlElementRef(name = "XferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType>> xferKeys;

    /**
     * Gets the value of the xferKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType>> getXferKeys() {
        if (xferKeys == null) {
            xferKeys = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType>>();
        }
        return this.xferKeys;
    }

}
