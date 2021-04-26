
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteSubjectIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteSubjectIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoteSubjectIdentType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoteSubjectIdentValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteSubjectIdent_Type", propOrder = {
    "noteSubjectIdentTypeAndNoteSubjectIdentValue"
})
public class NoteSubjectIdentType {

    @XmlElementRefs({
        @XmlElementRef(name = "NoteSubjectIdentValue", namespace = "http://www.fnf.com/xes", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NoteSubjectIdentType", namespace = "http://www.fnf.com/xes", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> noteSubjectIdentTypeAndNoteSubjectIdentValue;

    /**
     * Gets the value of the noteSubjectIdentTypeAndNoteSubjectIdentValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteSubjectIdentTypeAndNoteSubjectIdentValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteSubjectIdentTypeAndNoteSubjectIdentValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getNoteSubjectIdentTypeAndNoteSubjectIdentValue() {
        if (noteSubjectIdentTypeAndNoteSubjectIdentValue == null) {
            noteSubjectIdentTypeAndNoteSubjectIdentValue = new ArrayList<JAXBElement<String>>();
        }
        return this.noteSubjectIdentTypeAndNoteSubjectIdentValue;
    }

}
