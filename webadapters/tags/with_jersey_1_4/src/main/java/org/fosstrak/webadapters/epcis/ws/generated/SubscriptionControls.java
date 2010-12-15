package org.fosstrak.webadapters.epcis.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;

/**
 * <p>Java class for SubscriptionControls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionControls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schedule" type="{urn:epcglobal:epcis-query:xsd:1}QuerySchedule" minOccurs="0"/>
 *         &lt;element name="trigger" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="initialRecordTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reportIfEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis-query:xsd:1}SubscriptionControlsExtensionType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionControls", propOrder = {
    "schedule",
    "trigger",
    "initialRecordTime",
    "reportIfEmpty",
    "extension",
    "any"
})
public class SubscriptionControls {

    protected QuerySchedule schedule;
    @XmlSchemaType(name = "anyURI")
    protected String trigger;
    protected XMLGregorianCalendar initialRecordTime;
    protected boolean reportIfEmpty;
    protected SubscriptionControlsExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySchedule }
     *     
     */
    public QuerySchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySchedule }
     *     
     */
    public void setSchedule(QuerySchedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigger(String value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the initialRecordTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialRecordTime() {
        return initialRecordTime;
    }

    /**
     * Sets the value of the initialRecordTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialRecordTime(XMLGregorianCalendar value) {
        this.initialRecordTime = value;
    }

    /**
     * Gets the value of the reportIfEmpty property.
     * 
     */
    public boolean isReportIfEmpty() {
        return reportIfEmpty;
    }

    /**
     * Sets the value of the reportIfEmpty property.
     * 
     */
    public void setReportIfEmpty(boolean value) {
        this.reportIfEmpty = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionControlsExtensionType }
     *     
     */
    public SubscriptionControlsExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionControlsExtensionType }
     *     
     */
    public void setExtension(SubscriptionControlsExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
