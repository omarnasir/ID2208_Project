//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.27 at 05:14:45 PM CET 
//


package outputObjects;

import java.text.DecimalFormat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchedElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchedElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InputElement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchedElementType", propOrder = {
    "outputElement",
    "inputElement",
    "score"
})
public class MatchedElementType {
	
    @XmlElement(name = "OutputElement", required = true)
    protected String outputElement;
    @XmlElement(name = "InputElement", required = true)
    protected String inputElement;
    @XmlElement(name = "Score")
    protected String score;

    /**
     * Gets the value of the outputElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputElement() {
        return outputElement;
    }

    /**
     * Sets the value of the outputElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputElement(String value) {
        this.outputElement = value;
    }

    /**
     * Gets the value of the inputElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputElement() {
        return inputElement;
    }

    /**
     * Sets the value of the inputElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputElement(String value) {
        this.inputElement = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(double value) {
    	DecimalFormat numberFormat = new DecimalFormat("#.00");
        this.score = numberFormat.format(value);
    }

}
