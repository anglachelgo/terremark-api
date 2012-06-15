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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SshKeyReferenceList complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SshKeyReferenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SshKey" type="{}SshKeyReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SshKeyReferenceList", propOrder = {"sshKeys"})
public class SshKeyReferenceList extends ToStringGenerator {

    @XmlElement(name = "SshKey", nillable = true)
    protected List<SshKeyReference> sshKeys;

    /**
     * Gets the value of the sshKeys property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the sshKeys property.
     * <p>
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getSshKeys().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SshKeyReference }
     */
    public List<SshKeyReference> getSshKeys() {
        if (sshKeys == null) {
            sshKeys = new ArrayList<SshKeyReference>();
        }
        return this.sshKeys;
    }
}
