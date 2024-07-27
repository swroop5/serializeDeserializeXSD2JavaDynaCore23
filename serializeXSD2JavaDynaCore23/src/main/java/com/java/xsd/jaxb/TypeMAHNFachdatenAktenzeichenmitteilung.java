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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.MAHN.Fachdaten.Aktenzeichenmitteilung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.MAHN.Fachdaten.Aktenzeichenmitteilung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanzdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="geschaeftszeichen.gericht" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
@XmlType(name = "Type.MAHN.Fachdaten.Aktenzeichenmitteilung", propOrder = {
    "instanzdaten"
})
public class TypeMAHNFachdatenAktenzeichenmitteilung {

    @XmlElement(required = true)
    protected TypeMAHNFachdatenAktenzeichenmitteilung.Instanzdaten instanzdaten;

    /**
     * Gets the value of the instanzdaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMAHNFachdatenAktenzeichenmitteilung.Instanzdaten }
     *     
     */
    public TypeMAHNFachdatenAktenzeichenmitteilung.Instanzdaten getInstanzdaten() {
        return instanzdaten;
    }

    /**
     * Sets the value of the instanzdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMAHNFachdatenAktenzeichenmitteilung.Instanzdaten }
     *     
     */
    public void setInstanzdaten(TypeMAHNFachdatenAktenzeichenmitteilung.Instanzdaten value) {
        this.instanzdaten = value;
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
     *         &lt;element name="ref.instanznummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="geschaeftszeichen.gericht" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
        "refInstanznummer",
        "geschaeftszeichenGericht"
    })
    public static class Instanzdaten {

        @XmlElement(name = "ref.instanznummer", required = true)
        protected String refInstanznummer;
        @XmlElement(name = "geschaeftszeichen.gericht")
        protected String geschaeftszeichenGericht;

        /**
         * Gets the value of the refInstanznummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefInstanznummer() {
            return refInstanznummer;
        }

        /**
         * Sets the value of the refInstanznummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefInstanznummer(String value) {
            this.refInstanznummer = value;
        }

        /**
         * Gets the value of the geschaeftszeichenGericht property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeschaeftszeichenGericht() {
            return geschaeftszeichenGericht;
        }

        /**
         * Sets the value of the geschaeftszeichenGericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeschaeftszeichenGericht(String value) {
            this.geschaeftszeichenGericht = value;
        }

    }

}
