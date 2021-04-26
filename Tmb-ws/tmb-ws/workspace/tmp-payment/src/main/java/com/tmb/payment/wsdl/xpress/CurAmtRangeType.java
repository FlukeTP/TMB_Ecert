
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurAmtRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurAmtRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CurAmtRange_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CurAmtRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurAmtRange_Type", propOrder = {
    "curAmtRangeType"
})
public class CurAmtRangeType
    extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType
{

    @XmlElement(name = "CurAmtRangeType")
    protected String curAmtRangeType;

    /**
     * Gets the value of the curAmtRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurAmtRangeType() {
        return curAmtRangeType;
    }

    /**
     * Sets the value of the curAmtRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurAmtRangeType(String value) {
        this.curAmtRangeType = value;
    }

}
