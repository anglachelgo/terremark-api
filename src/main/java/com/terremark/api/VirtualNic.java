/**
 * Copyright 2012 Terremark Worldwide Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.terremark.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for VirtualNic complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VirtualNic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network" type="{}NetworkReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNic", propOrder = {"unitNumber", "name", "macAddress", "network"})
public class VirtualNic extends ToStringGenerator {

    @XmlElement(name = "UnitNumber", nillable = true)
    protected Integer unitNumber;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "MacAddress", nillable = true)
    protected String macAddress;
    @XmlElement(name = "Network", required = true, nillable = true)
    protected NetworkReference network;

    /**
     * Gets the value of the unitNumber property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setUnitNumber(final Integer value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     */
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Gets the value of the macAddress property.
     *
     * @return possible object is {@link String }
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMacAddress(final String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the network property.
     *
     * @return possible object is {@link NetworkReference }
     */
    public NetworkReference getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     *
     * @param value allowed object is {@link NetworkReference }
     */
    public void setNetwork(final NetworkReference value) {
        this.network = value;
    }
}
