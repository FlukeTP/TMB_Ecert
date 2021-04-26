
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardUpdateRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardUpdateRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateRec"/&gt;
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
@XmlType(name = "CardUpdateRsHdr_Type", propOrder = {
    "iccUpdateRec",
    "magCardUpdateRec"
})
public class CardUpdateRsHdrType {

    @XmlElement(name = "ICCUpdateRec")
    protected ICCUpdateRecType iccUpdateRec;
    @XmlElement(name = "MagCardUpdateRec")
    protected MagCardUpdateRecType magCardUpdateRec;

    /**
     * Gets the value of the iccUpdateRec property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateRecType }
     *     
     */
    public ICCUpdateRecType getICCUpdateRec() {
        return iccUpdateRec;
    }

    /**
     * Sets the value of the iccUpdateRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateRecType }
     *     
     */
    public void setICCUpdateRec(ICCUpdateRecType value) {
        this.iccUpdateRec = value;
    }

    /**
     * Gets the value of the magCardUpdateRec property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateRecType }
     *     
     */
    public MagCardUpdateRecType getMagCardUpdateRec() {
        return magCardUpdateRec;
    }

    /**
     * Sets the value of the magCardUpdateRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateRecType }
     *     
     */
    public void setMagCardUpdateRec(MagCardUpdateRecType value) {
        this.magCardUpdateRec = value;
    }

}
