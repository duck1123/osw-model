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

public class DefaultAtomGenerator extends DefaultAtomCommon implements AtomGenerator {

    private String uri;

    private String version;

    private String text;

    @Override
    public String getUri() {
        return uri;
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[AtomGenerator ");

        if (hasUri()) {
            buffer.append("uri:" + uri + " ");
        }

        if (hasVersion()) {
            buffer.append("version:" + version + " ");
        }

        if (hasText()) {
            buffer.append("text:" + text + " ");
        }

        buffer.append("]");
        return buffer.toString();
    }

    @Override
    public boolean hasUri() {
        return uri != null;
    }

    @Override
    public boolean hasVersion() {
        return version != null;
    }

    @Override
    public boolean hasText() {
        return text != null;
    }
}
