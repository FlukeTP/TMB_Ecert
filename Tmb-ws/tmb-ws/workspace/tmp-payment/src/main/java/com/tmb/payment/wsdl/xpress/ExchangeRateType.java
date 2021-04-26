
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.BuySellIndicatorType;


/**
 * <p>Java class for ExchangeRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ExchangeRate_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ConvOper" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BuySellIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate_Type", propOrder = {
    "convOper",
    "buySellIndicator"
})
public class ExchangeRateType
    extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType
{

    @XmlElement(name = "ConvOper")
    protected Boolean convOper;
    @XmlElement(name = "BuySellIndicator", namespace = "urn:ifxforum-org:XSD:1", required = true)
    @XmlSchemaType(name = "string")
    protected BuySellIndicatorType buySellIndicator;

    /**
     * Gets the value of the convOper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvOper() {
        return convOper;
    }

    /**
     * Sets the value of the convOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvOper(Boolean value) {
        this.convOper = value;
    }

    /**
     * Gets the value of the buySellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public BuySellIndicatorType getBuySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Sets the value of the buySellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public void setBuySellIndicator(BuySellIndicatorType value) {
        this.buySellIndicator = value;
    }

}
