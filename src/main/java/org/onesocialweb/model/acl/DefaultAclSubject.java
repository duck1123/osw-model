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
package org.onesocialweb.model.acl;



public class DefaultAclSubject implements AclSubject {

    private String type;

    private String name;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AclSubject) {
            AclSubject other = (AclSubject) obj;
            return other.getName().equals(name) && other.getType().equals(type);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[AclSubject ");
        if (name != null) {
            buffer.append("name:" + name + " ");
        }
        if (type != null) {
            buffer.append("type:" + type + " ");
        }
        buffer.append("]");
        return buffer.toString();
    }

    @Override
    public boolean hasName() {
        return (name != null && name.length() > 0);
    }

    @Override
    public boolean hasType() {
        return (type != null && type.length() > 0);
    }
}
