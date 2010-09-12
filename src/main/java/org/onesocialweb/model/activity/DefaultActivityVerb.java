/*
 *  Copyright 2010 Vodafone Group Services Ltd.
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
package org.onesocialweb.model.activity;

import org.onesocialweb.model.atom.DefaultAtomCommon;

public class DefaultActivityVerb extends DefaultAtomCommon
    implements ActivityVerb {

    private String verb;

    @Override
    public String getValue() {
        return verb;
    }

    @Override
    public void setValue(String verb) {
        this.verb = verb;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[ActivityVerb ");
        if (verb != null) {
            buffer.append("verb:" + verb + " ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}
