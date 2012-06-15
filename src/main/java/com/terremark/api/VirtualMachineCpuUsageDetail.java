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
 * Java class for VirtualMachineCpuUsageDetail complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VirtualMachineCpuUsageDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{}Reference">
 *       &lt;sequence>
 *         &lt;element name="Usage" type="{}ResourceCapacity" minOccurs="0"/>
 *         &lt;element name="Utilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineCpuUsageDetail", propOrder = {"usage", "utilization", "deleted"})
public class VirtualMachineCpuUsageDetail extends Reference {

    @XmlElement(name = "Usage", nillable = true)
    protected ResourceCapacity usage;
    @XmlElement(name = "Utilization")
    protected Integer utilization;
    @XmlElement(name = "Deleted", nillable = true)
    protected Boolean deleted;

    /**
     * Gets the value of the usage property.
     *
     * @return possible object is {@link ResourceCapacity }
     */
    public ResourceCapacity getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     *
     * @param value allowed object is {@link ResourceCapacity }
     */
    public void setUsage(final ResourceCapacity value) {
        this.usage = value;
    }

    /**
     * Gets the value of the utilization property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setUtilization(final Integer value) {
        this.utilization = value;
    }

    /**
     * Gets the value of the deleted property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDeleted(final Boolean value) {
        this.deleted = value;
    }
}
