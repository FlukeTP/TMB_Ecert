
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailDep_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailDep_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepTransport"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepContainer"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepEnvelopeSupply"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepEnvelopeDispenser"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepPrinter"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepToner"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepShutter"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevDepNumOfDeposits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailDep_Type", propOrder = {
    "devDepType",
    "devDepOperation",
    "devDepTransport",
    "devDepContainer",
    "devDepEnvelopeSupply",
    "devDepEnvelopeDispenser",
    "devDepPrinter",
    "devDepToner",
    "devDepShutter",
    "devDepNumOfDeposits"
})
public class DevDetailDepType {

    @XmlElement(name = "DevDepType", required = true)
    protected String devDepType;
    @XmlElement(name = "DevDepOperation")
    protected String devDepOperation;
    @XmlElement(name = "DevDepTransport", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepTransportType devDepTransport;
    @XmlElement(name = "DevDepContainer", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepContainerType devDepContainer;
    @XmlElement(name = "DevDepEnvelopeSupply", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepEnvelopeSupplyType devDepEnvelopeSupply;
    @XmlElement(name = "DevDepEnvelopeDispenser", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepEnvelopeDispenserType devDepEnvelopeDispenser;
    @XmlElement(name = "DevDepPrinter", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepPrinterType devDepPrinter;
    @XmlElement(name = "DevDepToner", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepTonerType devDepToner;
    @XmlElement(name = "DevDepShutter", required = true)
    @XmlSchemaType(name = "string")
    protected DevDepShutterType devDepShutter;
    @XmlElement(name = "DevDepNumOfDeposits")
    protected Long devDepNumOfDeposits;

    /**
     * Gets the value of the devDepType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevDepType() {
        return devDepType;
    }

    /**
     * Sets the value of the devDepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevDepType(String value) {
        this.devDepType = value;
    }

    /**
     * Gets the value of the devDepOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevDepOperation() {
        return devDepOperation;
    }

    /**
     * Sets the value of the devDepOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevDepOperation(String value) {
        this.devDepOperation = value;
    }

    /**
     * Gets the value of the devDepTransport property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepTransportType }
     *     
     */
    public DevDepTransportType getDevDepTransport() {
        return devDepTransport;
    }

    /**
     * Sets the value of the devDepTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepTransportType }
     *     
     */
    public void setDevDepTransport(DevDepTransportType value) {
        this.devDepTransport = value;
    }

    /**
     * Gets the value of the devDepContainer property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepContainerType }
     *     
     */
    public DevDepContainerType getDevDepContainer() {
        return devDepContainer;
    }

    /**
     * Sets the value of the devDepContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepContainerType }
     *     
     */
    public void setDevDepContainer(DevDepContainerType value) {
        this.devDepContainer = value;
    }

    /**
     * Gets the value of the devDepEnvelopeSupply property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepEnvelopeSupplyType }
     *     
     */
    public DevDepEnvelopeSupplyType getDevDepEnvelopeSupply() {
        return devDepEnvelopeSupply;
    }

    /**
     * Sets the value of the devDepEnvelopeSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepEnvelopeSupplyType }
     *     
     */
    public void setDevDepEnvelopeSupply(DevDepEnvelopeSupplyType value) {
        this.devDepEnvelopeSupply = value;
    }

    /**
     * Gets the value of the devDepEnvelopeDispenser property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepEnvelopeDispenserType }
     *     
     */
    public DevDepEnvelopeDispenserType getDevDepEnvelopeDispenser() {
        return devDepEnvelopeDispenser;
    }

    /**
     * Sets the value of the devDepEnvelopeDispenser property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepEnvelopeDispenserType }
     *     
     */
    public void setDevDepEnvelopeDispenser(DevDepEnvelopeDispenserType value) {
        this.devDepEnvelopeDispenser = value;
    }

    /**
     * Gets the value of the devDepPrinter property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepPrinterType }
     *     
     */
    public DevDepPrinterType getDevDepPrinter() {
        return devDepPrinter;
    }

    /**
     * Sets the value of the devDepPrinter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepPrinterType }
     *     
     */
    public void setDevDepPrinter(DevDepPrinterType value) {
        this.devDepPrinter = value;
    }

    /**
     * Gets the value of the devDepToner property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepTonerType }
     *     
     */
    public DevDepTonerType getDevDepToner() {
        return devDepToner;
    }

    /**
     * Sets the value of the devDepToner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepTonerType }
     *     
     */
    public void setDevDepToner(DevDepTonerType value) {
        this.devDepToner = value;
    }

    /**
     * Gets the value of the devDepShutter property.
     * 
     * @return
     *     possible object is
     *     {@link DevDepShutterType }
     *     
     */
    public DevDepShutterType getDevDepShutter() {
        return devDepShutter;
    }

    /**
     * Sets the value of the devDepShutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevDepShutterType }
     *     
     */
    public void setDevDepShutter(DevDepShutterType value) {
        this.devDepShutter = value;
    }

    /**
     * Gets the value of the devDepNumOfDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevDepNumOfDeposits() {
        return devDepNumOfDeposits;
    }

    /**
     * Sets the value of the devDepNumOfDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevDepNumOfDeposits(Long value) {
        this.devDepNumOfDeposits = value;
    }

}
