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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="datum.verfahrensende" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="verfahrensendeArt">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="beendigungUrteil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="beendigungVergleichsbeschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="beendigungKlageruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="beendigungRechtsmittelruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="beendigungErledigungRechtsstreit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="sonstigeBeendigung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="teilrechtskraftEntscheidung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="beschlussinhalt" type="{http://www.xjustiz.de}Type.MFKREG.Bekanntmachungstexte" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.mfkreg.beendigung.3100003")
public class NachrichtMfkregBeendigung3100003 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected NachrichtMfkregBeendigung3100003 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtMfkregBeendigung3100003 .Fachdaten }
     *     
     */
    public NachrichtMfkregBeendigung3100003 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtMfkregBeendigung3100003 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtMfkregBeendigung3100003 .Fachdaten value) {
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
     *         &lt;element name="datum.verfahrensende" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="verfahrensendeArt">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="beendigungUrteil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="beendigungVergleichsbeschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="beendigungKlageruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="beendigungRechtsmittelruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="beendigungErledigungRechtsstreit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="sonstigeBeendigung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="teilrechtskraftEntscheidung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="beschlussinhalt" type="{http://www.xjustiz.de}Type.MFKREG.Bekanntmachungstexte" maxOccurs="unbounded"/>
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
        "datumVerfahrensende",
        "verfahrensendeArt",
        "teilrechtskraftEntscheidung",
        "beschlussinhalt"
    })
    public static class Fachdaten {

        @XmlElement(name = "datum.verfahrensende", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumVerfahrensende;
        @XmlElement(required = true)
        protected NachrichtMfkregBeendigung3100003 .Fachdaten.VerfahrensendeArt verfahrensendeArt;
        protected String teilrechtskraftEntscheidung;
        @XmlElement(required = true)
        protected List<TypeMFKREGBekanntmachungstexte> beschlussinhalt;

        /**
         * Gets the value of the datumVerfahrensende property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumVerfahrensende() {
            return datumVerfahrensende;
        }

        /**
         * Sets the value of the datumVerfahrensende property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumVerfahrensende(XMLGregorianCalendar value) {
            this.datumVerfahrensende = value;
        }

        /**
         * Gets the value of the verfahrensendeArt property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtMfkregBeendigung3100003 .Fachdaten.VerfahrensendeArt }
         *     
         */
        public NachrichtMfkregBeendigung3100003 .Fachdaten.VerfahrensendeArt getVerfahrensendeArt() {
            return verfahrensendeArt;
        }

        /**
         * Sets the value of the verfahrensendeArt property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtMfkregBeendigung3100003 .Fachdaten.VerfahrensendeArt }
         *     
         */
        public void setVerfahrensendeArt(NachrichtMfkregBeendigung3100003 .Fachdaten.VerfahrensendeArt value) {
            this.verfahrensendeArt = value;
        }

        /**
         * Gets the value of the teilrechtskraftEntscheidung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeilrechtskraftEntscheidung() {
            return teilrechtskraftEntscheidung;
        }

        /**
         * Sets the value of the teilrechtskraftEntscheidung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeilrechtskraftEntscheidung(String value) {
            this.teilrechtskraftEntscheidung = value;
        }

        /**
         * Gets the value of the beschlussinhalt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the beschlussinhalt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBeschlussinhalt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeMFKREGBekanntmachungstexte }
         * 
         * 
         */
        public List<TypeMFKREGBekanntmachungstexte> getBeschlussinhalt() {
            if (beschlussinhalt == null) {
                beschlussinhalt = new ArrayList<TypeMFKREGBekanntmachungstexte>();
            }
            return this.beschlussinhalt;
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
         *         &lt;element name="beendigungUrteil" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="beendigungVergleichsbeschluss" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="beendigungKlageruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="beendigungRechtsmittelruecknahme" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="beendigungErledigungRechtsstreit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="sonstigeBeendigung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
            "beendigungUrteil",
            "beendigungVergleichsbeschluss",
            "beendigungKlageruecknahme",
            "beendigungRechtsmittelruecknahme",
            "beendigungErledigungRechtsstreit",
            "sonstigeBeendigung"
        })
        public static class VerfahrensendeArt {

            protected boolean beendigungUrteil;
            protected boolean beendigungVergleichsbeschluss;
            protected boolean beendigungKlageruecknahme;
            protected boolean beendigungRechtsmittelruecknahme;
            protected boolean beendigungErledigungRechtsstreit;
            protected String sonstigeBeendigung;

            /**
             * Gets the value of the beendigungUrteil property.
             * 
             */
            public boolean isBeendigungUrteil() {
                return beendigungUrteil;
            }

            /**
             * Sets the value of the beendigungUrteil property.
             * 
             */
            public void setBeendigungUrteil(boolean value) {
                this.beendigungUrteil = value;
            }

            /**
             * Gets the value of the beendigungVergleichsbeschluss property.
             * 
             */
            public boolean isBeendigungVergleichsbeschluss() {
                return beendigungVergleichsbeschluss;
            }

            /**
             * Sets the value of the beendigungVergleichsbeschluss property.
             * 
             */
            public void setBeendigungVergleichsbeschluss(boolean value) {
                this.beendigungVergleichsbeschluss = value;
            }

            /**
             * Gets the value of the beendigungKlageruecknahme property.
             * 
             */
            public boolean isBeendigungKlageruecknahme() {
                return beendigungKlageruecknahme;
            }

            /**
             * Sets the value of the beendigungKlageruecknahme property.
             * 
             */
            public void setBeendigungKlageruecknahme(boolean value) {
                this.beendigungKlageruecknahme = value;
            }

            /**
             * Gets the value of the beendigungRechtsmittelruecknahme property.
             * 
             */
            public boolean isBeendigungRechtsmittelruecknahme() {
                return beendigungRechtsmittelruecknahme;
            }

            /**
             * Sets the value of the beendigungRechtsmittelruecknahme property.
             * 
             */
            public void setBeendigungRechtsmittelruecknahme(boolean value) {
                this.beendigungRechtsmittelruecknahme = value;
            }

            /**
             * Gets the value of the beendigungErledigungRechtsstreit property.
             * 
             */
            public boolean isBeendigungErledigungRechtsstreit() {
                return beendigungErledigungRechtsstreit;
            }

            /**
             * Sets the value of the beendigungErledigungRechtsstreit property.
             * 
             */
            public void setBeendigungErledigungRechtsstreit(boolean value) {
                this.beendigungErledigungRechtsstreit = value;
            }

            /**
             * Gets the value of the sonstigeBeendigung property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSonstigeBeendigung() {
                return sonstigeBeendigung;
            }

            /**
             * Sets the value of the sonstigeBeendigung property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSonstigeBeendigung(String value) {
                this.sonstigeBeendigung = value;
            }

        }

    }

}