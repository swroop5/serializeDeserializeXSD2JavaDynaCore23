//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Basisnachricht">
 *       &lt;sequence>
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="einleitdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *                   &lt;element name="kostenGericht" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *                   &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.STRAF.Entscheidungsart"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.straf.owi.einleitungErzwingungshaft.0500021")
public class NachrichtStrafOwiEinleitungErzwingungshaft0500021
    extends TypeGDSBasisnachricht
{

    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtStrafOwiEinleitungErzwingungshaft0500021 .Fachdaten fachdaten;

    /**
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public TypeGDSSchriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(TypeGDSSchriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafOwiEinleitungErzwingungshaft0500021 .Fachdaten }
     *     
     */
    public NachrichtStrafOwiEinleitungErzwingungshaft0500021 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafOwiEinleitungErzwingungshaft0500021 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafOwiEinleitungErzwingungshaft0500021 .Fachdaten value) {
        this.fachdaten = value;
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
     *         &lt;element name="einleitdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
     *         &lt;element name="kostenGericht" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
     *         &lt;element name="entscheidung" type="{http://www.xjustiz.de}Type.STRAF.Entscheidungsart"/>
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
        "einleitdatum",
        "kostenGericht",
        "entscheidung"
    })
    public static class Fachdaten {

        protected String einleitdatum;
        protected TypeGDSGeldbetrag kostenGericht;
        @XmlElement(required = true)
        protected TypeSTRAFEntscheidungsart entscheidung;

        /**
         * Gets the value of the einleitdatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEinleitdatum() {
            return einleitdatum;
        }

        /**
         * Sets the value of the einleitdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEinleitdatum(String value) {
            this.einleitdatum = value;
        }

        /**
         * Gets the value of the kostenGericht property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getKostenGericht() {
            return kostenGericht;
        }

        /**
         * Sets the value of the kostenGericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setKostenGericht(TypeGDSGeldbetrag value) {
            this.kostenGericht = value;
        }

        /**
         * Gets the value of the entscheidung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSTRAFEntscheidungsart }
         *     
         */
        public TypeSTRAFEntscheidungsart getEntscheidung() {
            return entscheidung;
        }

        /**
         * Sets the value of the entscheidung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSTRAFEntscheidungsart }
         *     
         */
        public void setEntscheidung(TypeSTRAFEntscheidungsart value) {
            this.entscheidung = value;
        }

    }

}
