/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Association">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Member" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Storage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccessModifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AccessModifier" />
 *       &lt;attribute name="Modifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}MemberModifier" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThisKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OtherKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsForeignKey" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Cardinality" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Cardinality" />
 *       &lt;attribute name="DeleteRule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DeleteOnNull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Association")
public class Association {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Member", required = true)
    protected String member;
    @XmlAttribute(name = "Storage")
    protected String storage;
    @XmlAttribute(name = "AccessModifier")
    protected AccessModifier accessModifier;
    @XmlAttribute(name = "Modifier")
    protected MemberModifier modifier;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "ThisKey")
    protected String thisKey;
    @XmlAttribute(name = "OtherKey")
    protected String otherKey;
    @XmlAttribute(name = "IsForeignKey")
    protected Boolean isForeignKey;
    @XmlAttribute(name = "Cardinality")
    protected Cardinality cardinality;
    @XmlAttribute(name = "DeleteRule")
    protected String deleteRule;
    @XmlAttribute(name = "DeleteOnNull")
    protected Boolean deleteOnNull;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember(String value) {
        this.member = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link MemberModifier }
     *     
     */
    public MemberModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberModifier }
     *     
     */
    public void setModifier(MemberModifier value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the thisKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThisKey() {
        return thisKey;
    }

    /**
     * Sets the value of the thisKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisKey(String value) {
        this.thisKey = value;
    }

    /**
     * Gets the value of the otherKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKey() {
        return otherKey;
    }

    /**
     * Sets the value of the otherKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKey(String value) {
        this.otherKey = value;
    }

    /**
     * Gets the value of the isForeignKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForeignKey() {
        return isForeignKey;
    }

    /**
     * Sets the value of the isForeignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForeignKey(Boolean value) {
        this.isForeignKey = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link Cardinality }
     *     
     */
    public Cardinality getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardinality }
     *     
     */
    public void setCardinality(Cardinality value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the deleteRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * Sets the value of the deleteRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteRule(String value) {
        this.deleteRule = value;
    }

    /**
     * Gets the value of the deleteOnNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteOnNull() {
        return deleteOnNull;
    }

    /**
     * Sets the value of the deleteOnNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteOnNull(Boolean value) {
        this.deleteOnNull = value;
    }

}
