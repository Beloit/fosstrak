package org.fosstrak.webadapters.epcis.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for EPCListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="epc" type="{urn:epcglobal:xsd:1}EPC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCListType", namespace = "urn:epcglobal:epcis:xsd:1", propOrder = {
    "epc"
})
public class EPCListType {

    protected List<EPC> epc;

    /**
     * Gets the value of the epc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EPC }
     * 
     * 
     */
    public List<EPC> getEpc() {
        if (epc == null) {
            epc = new ArrayList<EPC>();
        }
        return this.epc;
    }
}
