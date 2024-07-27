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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.KASSE.Zahlungspartnerdaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Zahlungspartnerdaten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ref.beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
 *         &lt;element name="buchungen.zahlungspartner" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="erledigungen" type="{http://www.xjustiz.de}Type.KASSE.Erledigungen" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="zahlungen" type="{http://www.xjustiz.de}Type.KASSE.Zahlungen" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zahlungsbetrag.netto" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *         &lt;element name="zahlungsbetragt.brutto" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *         &lt;element name="beziehung.zahlungspartner" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ref.zahlungspartner" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
 *                   &lt;element name="beziehungszweck" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
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
@XmlType(name = "Type.KASSE.Zahlungspartnerdaten", propOrder = {
    "refBeteiligter",
    "buchungenZahlungspartner",
    "zahlungsbetragNetto",
    "zahlungsbetragtBrutto",
    "beziehungZahlungspartner"
})
public class TypeKASSEZahlungspartnerdaten {

    @XmlElement(name = "ref.beteiligter", required = true)
    protected TypeGDSRefBeteiligtennummer refBeteiligter;
    @XmlElement(name = "buchungen.zahlungspartner")
    protected TypeKASSEZahlungspartnerdaten.BuchungenZahlungspartner buchungenZahlungspartner;
    @XmlElement(name = "zahlungsbetrag.netto", required = true)
    protected TypeGDSGeldbetrag zahlungsbetragNetto;
    @XmlElement(name = "zahlungsbetragt.brutto")
    protected TypeGDSGeldbetrag zahlungsbetragtBrutto;
    @XmlElement(name = "beziehung.zahlungspartner")
    protected List<TypeKASSEZahlungspartnerdaten.BeziehungZahlungspartner> beziehungZahlungspartner;

    /**
     * Gets the value of the refBeteiligter property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public TypeGDSRefBeteiligtennummer getRefBeteiligter() {
        return refBeteiligter;
    }

    /**
     * Sets the value of the refBeteiligter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSRefBeteiligtennummer }
     *     
     */
    public void setRefBeteiligter(TypeGDSRefBeteiligtennummer value) {
        this.refBeteiligter = value;
    }

    /**
     * Gets the value of the buchungenZahlungspartner property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKASSEZahlungspartnerdaten.BuchungenZahlungspartner }
     *     
     */
    public TypeKASSEZahlungspartnerdaten.BuchungenZahlungspartner getBuchungenZahlungspartner() {
        return buchungenZahlungspartner;
    }

    /**
     * Sets the value of the buchungenZahlungspartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKASSEZahlungspartnerdaten.BuchungenZahlungspartner }
     *     
     */
    public void setBuchungenZahlungspartner(TypeKASSEZahlungspartnerdaten.BuchungenZahlungspartner value) {
        this.buchungenZahlungspartner = value;
    }

    /**
     * Gets the value of the zahlungsbetragNetto property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getZahlungsbetragNetto() {
        return zahlungsbetragNetto;
    }

    /**
     * Sets the value of the zahlungsbetragNetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setZahlungsbetragNetto(TypeGDSGeldbetrag value) {
        this.zahlungsbetragNetto = value;
    }

    /**
     * Gets the value of the zahlungsbetragtBrutto property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getZahlungsbetragtBrutto() {
        return zahlungsbetragtBrutto;
    }

    /**
     * Sets the value of the zahlungsbetragtBrutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setZahlungsbetragtBrutto(TypeGDSGeldbetrag value) {
        this.zahlungsbetragtBrutto = value;
    }

    /**
     * Gets the value of the beziehungZahlungspartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beziehungZahlungspartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeziehungZahlungspartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSEZahlungspartnerdaten.BeziehungZahlungspartner }
     * 
     * 
     */
    public List<TypeKASSEZahlungspartnerdaten.BeziehungZahlungspartner> getBeziehungZahlungspartner() {
        if (beziehungZahlungspartner == null) {
            beziehungZahlungspartner = new ArrayList<TypeKASSEZahlungspartnerdaten.BeziehungZahlungspartner>();
        }
        return this.beziehungZahlungspartner;
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
     *         &lt;element name="ref.zahlungspartner" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer"/>
     *         &lt;element name="beziehungszweck" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
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
        "refZahlungspartner",
        "beziehungszweck"
    })
    public static class BeziehungZahlungspartner {

        @XmlElement(name = "ref.zahlungspartner", required = true)
        protected TypeGDSRefBeteiligtennummer refZahlungspartner;
        @XmlElement(required = true)
        protected String beziehungszweck;

        /**
         * Gets the value of the refZahlungspartner property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSRefBeteiligtennummer }
         *     
         */
        public TypeGDSRefBeteiligtennummer getRefZahlungspartner() {
            return refZahlungspartner;
        }

        /**
         * Sets the value of the refZahlungspartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSRefBeteiligtennummer }
         *     
         */
        public void setRefZahlungspartner(TypeGDSRefBeteiligtennummer value) {
            this.refZahlungspartner = value;
        }

        /**
         * Gets the value of the beziehungszweck property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeziehungszweck() {
            return beziehungszweck;
        }

        /**
         * Sets the value of the beziehungszweck property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeziehungszweck(String value) {
            this.beziehungszweck = value;
        }

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
     *         &lt;element name="erledigungen" type="{http://www.xjustiz.de}Type.KASSE.Erledigungen" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="zahlungen" type="{http://www.xjustiz.de}Type.KASSE.Zahlungen" maxOccurs="unbounded" minOccurs="0"/>
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
        "erledigungen",
        "zahlungen"
    })
    public static class BuchungenZahlungspartner {

        protected List<TypeKASSEErledigungen> erledigungen;
        protected List<TypeKASSEZahlungen> zahlungen;

        /**
         * Gets the value of the erledigungen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the erledigungen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErledigungen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeKASSEErledigungen }
         * 
         * 
         */
        public List<TypeKASSEErledigungen> getErledigungen() {
            if (erledigungen == null) {
                erledigungen = new ArrayList<TypeKASSEErledigungen>();
            }
            return this.erledigungen;
        }

        /**
         * Gets the value of the zahlungen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zahlungen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZahlungen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeKASSEZahlungen }
         * 
         * 
         */
        public List<TypeKASSEZahlungen> getZahlungen() {
            if (zahlungen == null) {
                zahlungen = new ArrayList<TypeKASSEZahlungen>();
            }
            return this.zahlungen;
        }

    }

}