
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeFrame_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}TimeFrame_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurException" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame_Type", propOrder = {
    "recurException"
})
public class TimeFrameType
    extends com.tmb.payment.wsdl.xpress.vo.TimeFrameType
{

    @XmlElement(name = "RecurException")
    protected RecurExceptionType recurException;

    /**
     * Gets the value of the recurException property.
     * 
     * @return
     *     possible object is
     *     {@link RecurExceptionType }
     *     
     */
    public RecurExceptionType getRecurException() {
        return recurException;
    }

    /**
     * Sets the value of the recurException property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurExceptionType }
     *     
     */
    public void setRecurException(RecurExceptionType value) {
        this.recurException = value;
    }

}
