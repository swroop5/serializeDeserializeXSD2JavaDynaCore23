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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nachrichtenID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="auskunftID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                   &lt;element name="voraussetzungenAuskunftsersuchen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
 *                             &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
 *                             &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/>
 *                             &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.ezoll.auskunftsersuchen.2400002")
public class NachrichtEzollAuskunftsersuchen2400002 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtEzollAuskunftsersuchen2400002 .Fachdaten fachdaten;

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
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten }
     *     
     */
    public NachrichtEzollAuskunftsersuchen2400002 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtEzollAuskunftsersuchen2400002 .Fachdaten value) {
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
     *         &lt;element name="nachrichtenID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="auskunftID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *         &lt;element name="voraussetzungenAuskunftsersuchen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
     *                   &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
     *                   &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/>
     *                   &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "nachrichtenID",
        "auskunftID",
        "voraussetzungenAuskunftsersuchen"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected String nachrichtenID;
        @XmlElement(required = true)
        protected String auskunftID;
        @XmlElement(required = true)
        protected NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen voraussetzungenAuskunftsersuchen;

        /**
         * Gets the value of the nachrichtenID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachrichtenID() {
            return nachrichtenID;
        }

        /**
         * Sets the value of the nachrichtenID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachrichtenID(String value) {
            this.nachrichtenID = value;
        }

        /**
         * Gets the value of the auskunftID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuskunftID() {
            return auskunftID;
        }

        /**
         * Sets the value of the auskunftID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuskunftID(String value) {
            this.auskunftID = value;
        }

        /**
         * Gets the value of the voraussetzungenAuskunftsersuchen property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen }
         *     
         */
        public NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen getVoraussetzungenAuskunftsersuchen() {
            return voraussetzungenAuskunftsersuchen;
        }

        /**
         * Sets the value of the voraussetzungenAuskunftsersuchen property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen }
         *     
         */
        public void setVoraussetzungenAuskunftsersuchen(NachrichtEzollAuskunftsersuchen2400002 .Fachdaten.VoraussetzungenAuskunftsersuchen value) {
            this.voraussetzungenAuskunftsersuchen = value;
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
         *         &lt;element name="forderung.einordnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
         *         &lt;element name="forderung.bezeichnung" type="{http://www.xjustiz.de}Code.EZOLL.Forderung"/>
         *         &lt;element name="benennungGlaeubiger" type="{http://www.xjustiz.de}Code.EZOLL.Glaeubiger"/>
         *         &lt;element name="bisherigeBemuehungenErfolglos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="bestaetigungDatenNotwendig" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "forderungEinordnung",
            "forderungBezeichnung",
            "benennungGlaeubiger",
            "bisherigeBemuehungenErfolglos",
            "bestaetigungDatenNotwendig"
        })
        public static class VoraussetzungenAuskunftsersuchen {

            @XmlElement(name = "forderung.einordnung", required = true)
            protected CodeEZOLLForderung forderungEinordnung;
            @XmlElement(name = "forderung.bezeichnung", required = true)
            protected CodeEZOLLForderung forderungBezeichnung;
            @XmlElement(required = true)
            protected CodeEZOLLGlaeubiger benennungGlaeubiger;
            protected boolean bisherigeBemuehungenErfolglos;
            protected boolean bestaetigungDatenNotwendig;

            /**
             * Gets the value of the forderungEinordnung property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public CodeEZOLLForderung getForderungEinordnung() {
                return forderungEinordnung;
            }

            /**
             * Sets the value of the forderungEinordnung property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public void setForderungEinordnung(CodeEZOLLForderung value) {
                this.forderungEinordnung = value;
            }

            /**
             * Gets the value of the forderungBezeichnung property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public CodeEZOLLForderung getForderungBezeichnung() {
                return forderungBezeichnung;
            }

            /**
             * Sets the value of the forderungBezeichnung property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLForderung }
             *     
             */
            public void setForderungBezeichnung(CodeEZOLLForderung value) {
                this.forderungBezeichnung = value;
            }

            /**
             * Gets the value of the benennungGlaeubiger property.
             * 
             * @return
             *     possible object is
             *     {@link CodeEZOLLGlaeubiger }
             *     
             */
            public CodeEZOLLGlaeubiger getBenennungGlaeubiger() {
                return benennungGlaeubiger;
            }

            /**
             * Sets the value of the benennungGlaeubiger property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeEZOLLGlaeubiger }
             *     
             */
            public void setBenennungGlaeubiger(CodeEZOLLGlaeubiger value) {
                this.benennungGlaeubiger = value;
            }

            /**
             * Gets the value of the bisherigeBemuehungenErfolglos property.
             * 
             */
            public boolean isBisherigeBemuehungenErfolglos() {
                return bisherigeBemuehungenErfolglos;
            }

            /**
             * Sets the value of the bisherigeBemuehungenErfolglos property.
             * 
             */
            public void setBisherigeBemuehungenErfolglos(boolean value) {
                this.bisherigeBemuehungenErfolglos = value;
            }

            /**
             * Gets the value of the bestaetigungDatenNotwendig property.
             * 
             */
            public boolean isBestaetigungDatenNotwendig() {
                return bestaetigungDatenNotwendig;
            }

            /**
             * Sets the value of the bestaetigungDatenNotwendig property.
             * 
             */
            public void setBestaetigungDatenNotwendig(boolean value) {
                this.bestaetigungDatenNotwendig = value;
            }

        }

    }

}
