/*
 *  Copyright 2010 Kronk Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.onesocialweb.model.atom;

/*
 * @since 0.7
 */
public interface AtomGenerator extends AtomCommon {

    /**
     * @return a uri representing the generating agent.
     */
    String getUri();

    /**
     * @return the version of the generating agent.
     */
    String getVersion();

    /**
     * @return a human-readable label for the generating agent
     */
    String getText();

    /**
     * @param uri a uri representing the generating agent.
     */
    void setUri(final String uri);

    /**
     * @param version the version of the generating agent.
     */
    void setVersion(final String version);

    /**
     * @param text a human-readable label for the generating agent
     */
    void setText(final String text);

    /**
     * @return does the generator element have a URI?
     */
    boolean hasUri();

    /**
     * @return does the generator element have a version?
     */
    boolean hasVersion();

    /**
     * @return does the generator element have text?
     */
    boolean hasText();
}
