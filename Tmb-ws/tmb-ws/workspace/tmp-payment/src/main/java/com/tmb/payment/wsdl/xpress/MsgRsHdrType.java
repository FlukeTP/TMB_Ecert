
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MsgRsHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcRsHdr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRsHdr_Type", propOrder = {
    "dvcRsHdr"
})
public class MsgRsHdrType
    extends com.tmb.payment.wsdl.xpress.vo.MsgRsHdrType
{

    @XmlElement(name = "DvcRsHdr")
    protected DvcRsHdrType dvcRsHdr;

    /**
     * Gets the value of the dvcRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link DvcRsHdrType }
     *     
     */
    public DvcRsHdrType getDvcRsHdr() {
        return dvcRsHdr;
    }

    /**
     * Sets the value of the dvcRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvcRsHdrType }
     *     
     */
    public void setDvcRsHdr(DvcRsHdrType value) {
        this.dvcRsHdr = value;
    }

}
