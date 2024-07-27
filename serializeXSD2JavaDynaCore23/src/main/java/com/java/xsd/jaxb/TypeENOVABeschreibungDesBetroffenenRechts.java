//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.ENOVA.BeschreibungDesBetroffenenRechts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.ENOVA.BeschreibungDesBetroffenenRechts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Buchungsstelle" minOccurs="0"/>
 *         &lt;element name="anschrift" type="{http://www.xjustiz.de}Type.GDS.Anschrift" minOccurs="0"/>
 *         &lt;element name="weitereAngabenZumGrundstueck" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grundstuecksart" type="{http://www.xjustiz.de}Code.ENOVA.Grundstuecksart" minOccurs="0"/>
 *                   &lt;element name="baujahr" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *                   &lt;element name="wohnflaeche" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="sonstigeAngaben" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.ENOVA.BeschreibungDesBetroffenenRechts", propOrder = {
    "buchungsstelle",
    "anschrift",
    "weitereAngabenZumGrundstueck"
})
public class TypeENOVABeschreibungDesBetroffenenRechts {

    protected TypeDABAGBuchungsstelle buchungsstelle;
    protected TypeGDSAnschrift anschrift;
    protected List<TypeENOVABeschreibungDesBetroffenenRechts.WeitereAngabenZumGrundstueck> weitereAngabenZumGrundstueck;

    /**
     * Gets the value of the buchungsstelle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGBuchungsstelle }
     *     
     */
    public TypeDABAGBuchungsstelle getBuchungsstelle() {
        return buchungsstelle;
    }

    /**
     * Sets the value of the buchungsstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGBuchungsstelle }
     *     
     */
    public void setBuchungsstelle(TypeDABAGBuchungsstelle value) {
        this.buchungsstelle = value;
    }

    /**
     * Gets the value of the anschrift property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAnschrift }
     *     
     */
    public TypeGDSAnschrift getAnschrift() {
        return anschrift;
    }

    /**
     * Sets the value of the anschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAnschrift }
     *     
     */
    public void setAnschrift(TypeGDSAnschrift value) {
        this.anschrift = value;
    }

    /**
     * Gets the value of the weitereAngabenZumGrundstueck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weitereAngabenZumGrundstueck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeitereAngabenZumGrundstueck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeENOVABeschreibungDesBetroffenenRechts.WeitereAngabenZumGrundstueck }
     * 
     * 
     */
    public List<TypeENOVABeschreibungDesBetroffenenRechts.WeitereAngabenZumGrundstueck> getWeitereAngabenZumGrundstueck() {
        if (weitereAngabenZumGrundstueck == null) {
            weitereAngabenZumGrundstueck = new ArrayList<TypeENOVABeschreibungDesBetroffenenRechts.WeitereAngabenZumGrundstueck>();
        }
        return this.weitereAngabenZumGrundstueck;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="grundstuecksart" type="{http://www.xjustiz.de}Code.ENOVA.Grundstuecksart" minOccurs="0"/>
     *         &lt;element name="baujahr" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
     *         &lt;element name="wohnflaeche" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="sonstigeAngaben" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "grundstuecksart",
        "baujahr",
        "wohnflaeche",
        "sonstigeAngaben"
    })
    public static class WeitereAngabenZumGrundstueck {

        protected CodeENOVAGrundstuecksart grundstuecksart;
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar baujahr;
        protected Double wohnflaeche;
        protected String sonstigeAngaben;

        /**
         * Gets the value of the grundstuecksart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeENOVAGrundstuecksart }
         *     
         */
        public CodeENOVAGrundstuecksart getGrundstuecksart() {
            return grundstuecksart;
        }

        /**
         * Sets the value of the grundstuecksart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeENOVAGrundstuecksart }
         *     
         */
        public void setGrundstuecksart(CodeENOVAGrundstuecksart value) {
            this.grundstuecksart = value;
        }

        /**
         * Gets the value of the baujahr property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBaujahr() {
            return baujahr;
        }

        /**
         * Sets the value of the baujahr property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBaujahr(XMLGregorianCalendar value) {
            this.baujahr = value;
        }

        /**
         * Gets the value of the wohnflaeche property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getWohnflaeche() {
            return wohnflaeche;
        }

        /**
         * Sets the value of the wohnflaeche property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setWohnflaeche(Double value) {
            this.wohnflaeche = value;
        }

        /**
         * Gets the value of the sonstigeAngaben property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSonstigeAngaben() {
            return sonstigeAngaben;
        }

        /**
         * Sets the value of the sonstigeAngaben property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSonstigeAngaben(String value) {
            this.sonstigeAngaben = value;
        }

    }

}