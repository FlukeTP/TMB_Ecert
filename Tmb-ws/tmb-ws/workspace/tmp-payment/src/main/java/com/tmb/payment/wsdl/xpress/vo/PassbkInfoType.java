
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkLastItemPrinted" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkLastBalPrinted" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkNextLine" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkNextPage" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkLinesPerPage" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkPagesPerBook" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClientChgCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkInfo_Type", propOrder = {
    "acctRef",
    "name",
    "passbkLastItemPrinted",
    "passbkLastBalPrinted",
    "passbkNextLine",
    "passbkNextPage",
    "passbkFormat",
    "passbkLinesPerPage",
    "passbkPagesPerBook",
    "clientChgCode"
})
public class PassbkInfoType {

    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PassbkLastItemPrinted")
    protected String passbkLastItemPrinted;
    @XmlElement(name = "PassbkLastBalPrinted")
    protected PassbkLastBalPrintedType passbkLastBalPrinted;
    @XmlElement(name = "PassbkNextLine")
    protected Long passbkNextLine;
    @XmlElement(name = "PassbkNextPage")
    protected Long passbkNextPage;
    @XmlElement(name = "PassbkFormat")
    protected String passbkFormat;
    @XmlElement(name = "PassbkLinesPerPage")
    protected Long passbkLinesPerPage;
    @XmlElement(name = "PassbkPagesPerBook")
    protected Long passbkPagesPerBook;
    @XmlElement(name = "ClientChgCode")
    protected String clientChgCode;

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the passbkLastItemPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkLastItemPrinted() {
        return passbkLastItemPrinted;
    }

    /**
     * Sets the value of the passbkLastItemPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkLastItemPrinted(String value) {
        this.passbkLastItemPrinted = value;
    }

    /**
     * Gets the value of the passbkLastBalPrinted property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkLastBalPrintedType }
     *     
     */
    public PassbkLastBalPrintedType getPassbkLastBalPrinted() {
        return passbkLastBalPrinted;
    }

    /**
     * Sets the value of the passbkLastBalPrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkLastBalPrintedType }
     *     
     */
    public void setPassbkLastBalPrinted(PassbkLastBalPrintedType value) {
        this.passbkLastBalPrinted = value;
    }

    /**
     * Gets the value of the passbkNextLine property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkNextLine() {
        return passbkNextLine;
    }

    /**
     * Sets the value of the passbkNextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkNextLine(Long value) {
        this.passbkNextLine = value;
    }

    /**
     * Gets the value of the passbkNextPage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkNextPage() {
        return passbkNextPage;
    }

    /**
     * Sets the value of the passbkNextPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkNextPage(Long value) {
        this.passbkNextPage = value;
    }

    /**
     * Gets the value of the passbkFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkFormat() {
        return passbkFormat;
    }

    /**
     * Sets the value of the passbkFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkFormat(String value) {
        this.passbkFormat = value;
    }

    /**
     * Gets the value of the passbkLinesPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkLinesPerPage() {
        return passbkLinesPerPage;
    }

    /**
     * Sets the value of the passbkLinesPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkLinesPerPage(Long value) {
        this.passbkLinesPerPage = value;
    }

    /**
     * Gets the value of the passbkPagesPerBook property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassbkPagesPerBook() {
        return passbkPagesPerBook;
    }

    /**
     * Sets the value of the passbkPagesPerBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassbkPagesPerBook(Long value) {
        this.passbkPagesPerBook = value;
    }

    /**
     * Gets the value of the clientChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientChgCode() {
        return clientChgCode;
    }

    /**
     * Sets the value of the clientChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientChgCode(String value) {
        this.clientChgCode = value;
    }

}
