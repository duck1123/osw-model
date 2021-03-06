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
package org.onesocialweb.xml.xpp.imp;

import org.onesocialweb.model.acl.AclFactory;
import org.onesocialweb.model.acl.DefaultAclFactory;
import org.onesocialweb.model.vcard4.DefaultVCard4Factory;
import org.onesocialweb.model.vcard4.VCard4Factory;
import org.onesocialweb.xml.xpp.XppVCard4Reader;

public class DefaultXppVCard4Reader extends XppVCard4Reader {

    @Override
    protected AclFactory getAclFactory() {
        return new DefaultAclFactory();
    }

    @Override
    protected VCard4Factory getProfileFactory() {
        return new DefaultVCard4Factory();
    }
}
