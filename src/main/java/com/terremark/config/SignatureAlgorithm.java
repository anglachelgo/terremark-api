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
package com.terremark.config;

/**
 * Signature algorithm to use when using Cloud API authentication.
 *
 * @author <a href="mailto:spasam@terremark.com">Seshu Pasam</a>
 * @see com.terremark.config.PropertiesBuilder#setSignatureAlgorithm(SignatureAlgorithm)
 */
public enum SignatureAlgorithm {
    /** HMAC SHA-1 */
    HMAC_SHA1,
    /** HMAC SHA-256 */
    HMAC_SHA256,
    /** HMAC SHA-512 */
    HMAC_SHA512
}