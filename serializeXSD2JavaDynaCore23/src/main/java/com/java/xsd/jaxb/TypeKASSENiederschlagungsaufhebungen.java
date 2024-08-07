//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Falls die Gr�nde f�r eine Niederschlagung nicht mehr vorliegen, muss sie aufgehoben werden k�nnen.
 * 
 * <p>Java class for Type.KASSE.Niederschlagungsaufhebungen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Niederschlagungsaufhebungen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niederschlagungsaufhebung" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="faelligkeit.forderung" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="niederschlagung.hoehe" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *                   &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="datum.niederschlagung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="hinweise.niederschlagungsaufhebung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gesamtbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Niederschlagungsaufhebungen", propOrder = {
    "niederschlagungsaufhebung",
    "gesamtbetrag"
})
public class TypeKASSENiederschlagungsaufhebungen {

    protected List<TypeKASSENiederschlagungsaufhebungen.Niederschlagungsaufhebung> niederschlagungsaufhebung;
    protected TypeGDSGeldbetrag gesamtbetrag;

    /**
     * Gets the value of the niederschlagungsaufhebung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niederschlagungsaufhebung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNiederschlagungsaufhebung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSENiederschlagungsaufhebungen.Niederschlagungsaufhebung }
     * 
     * 
     */
    public List<TypeKASSENiederschlagungsaufhebungen.Niederschlagungsaufhebung> getNiederschlagungsaufhebung() {
        if (niederschlagungsaufhebung == null) {
            niederschlagungsaufhebung = new ArrayList<TypeKASSENiederschlagungsaufhebungen.Niederschlagungsaufhebung>();
        }
        return this.niederschlagungsaufhebung;
    }

    /**
     * Gets the value of the gesamtbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getGesamtbetrag() {
        return gesamtbetrag;
    }

    /**
     * Sets the value of the gesamtbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setGesamtbetrag(TypeGDSGeldbetrag value) {
        this.gesamtbetrag = value;
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
     *         &lt;element name="faelligkeit.forderung" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="niederschlagung.hoehe" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
     *         &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="datum.niederschlagung" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="hinweise.niederschlagungsaufhebung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded" minOccurs="0"/>
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
        "faelligkeitForderung",
        "sachkonto",
        "niederschlagungHoehe",
        "rechnungsnummer",
        "datumNiederschlagung",
        "hinweiseNiederschlagungsaufhebung"
    })
    public static class Niederschlagungsaufhebung {

        @XmlElement(name = "faelligkeit.forderung", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar faelligkeitForderung;
        protected String sachkonto;
        @XmlElement(name = "niederschlagung.hoehe", required = true)
        protected TypeGDSGeldbetrag niederschlagungHoehe;
        protected BigInteger rechnungsnummer;
        @XmlElement(name = "datum.niederschlagung")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumNiederschlagung;
        @XmlElement(name = "hinweise.niederschlagungsaufhebung")
        protected List<String> hinweiseNiederschlagungsaufhebung;

        /**
         * Gets the value of the faelligkeitForderung property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFaelligkeitForderung() {
            return faelligkeitForderung;
        }

        /**
         * Sets the value of the faelligkeitForderung property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFaelligkeitForderung(XMLGregorianCalendar value) {
            this.faelligkeitForderung = value;
        }

        /**
         * Gets the value of the sachkonto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSachkonto() {
            return sachkonto;
        }

        /**
         * Sets the value of the sachkonto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSachkonto(String value) {
            this.sachkonto = value;
        }

        /**
         * Gets the value of the niederschlagungHoehe property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getNiederschlagungHoehe() {
            return niederschlagungHoehe;
        }

        /**
         * Sets the value of the niederschlagungHoehe property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setNiederschlagungHoehe(TypeGDSGeldbetrag value) {
            this.niederschlagungHoehe = value;
        }

        /**
         * Gets the value of the rechnungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRechnungsnummer() {
            return rechnungsnummer;
        }

        /**
         * Sets the value of the rechnungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRechnungsnummer(BigInteger value) {
            this.rechnungsnummer = value;
        }

        /**
         * Gets the value of the datumNiederschlagung property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumNiederschlagung() {
            return datumNiederschlagung;
        }

        /**
         * Sets the value of the datumNiederschlagung property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumNiederschlagung(XMLGregorianCalendar value) {
            this.datumNiederschlagung = value;
        }

        /**
         * Gets the value of the hinweiseNiederschlagungsaufhebung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hinweiseNiederschlagungsaufhebung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHinweiseNiederschlagungsaufhebung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getHinweiseNiederschlagungsaufhebung() {
            if (hinweiseNiederschlagungsaufhebung == null) {
                hinweiseNiederschlagungsaufhebung = new ArrayList<String>();
            }
            return this.hinweiseNiederschlagungsaufhebung;
        }

    }

}
