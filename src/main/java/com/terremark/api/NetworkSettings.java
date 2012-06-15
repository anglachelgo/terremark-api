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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for NetworkSettings complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NetworkSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkAdapterSettings" type="{}NetworkAdapterSettings"/>
 *         &lt;element name="DnsSettings" type="{}DnsSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSettings", propOrder = {"networkAdapterSettings", "dnsSettings"})
public class NetworkSettings extends ToStringGenerator {

    @XmlElement(name = "DnsSettings", nillable = true)
    protected DnsSettings dnsSettings;
    @XmlElementWrapper(name = "NetworkAdapterSettings")
    @XmlElement(name = "NetworkAdapter")
    protected List<NetworkAdapterSetting> networkAdapterSettings;

    /**
     * Gets the value of the dnsSettings property.
     *
     * @return possible object is {@link DnsSettings }
     */
    public DnsSettings getDnsSettings() {
        return dnsSettings;
    }

    /**
     * Sets the value of the dnsSettings property.
     *
     * @param value allowed object is {@link DnsSettings }
     */
    public void setDnsSettings(final DnsSettings value) {
        this.dnsSettings = value;
    }

    public List<NetworkAdapterSetting> getNetworkAdapterSettings() {
        if (networkAdapterSettings == null) {
            networkAdapterSettings = new ArrayList<NetworkAdapterSetting>();
        }
        return networkAdapterSettings;
    }
}
