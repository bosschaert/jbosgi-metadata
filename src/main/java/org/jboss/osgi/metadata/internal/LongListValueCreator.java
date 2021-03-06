/*
 * #%L
 * JBossOSGi Resolver Metadata
 * %%
 * Copyright (C) 2010 - 2012 JBoss by Red Hat
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.jboss.osgi.metadata.internal;

import java.util.Arrays;
import java.util.List;

import org.jboss.osgi.metadata.spi.ElementParser;

/**
 * Split string into list of long.
 * 
 * @author Thomas.Diesler@jboss.com
 */
class LongListValueCreator extends ListValueCreator<Long> {

    public LongListValueCreator() {
        super(true);
    }

    public List<Long> useString(String attribute) {
        List<String> parts = ElementParser.parseDelimitedString(attribute, ',');
        Long[] result = new Long[parts.size()];
        for (int i = 0; i < parts.size(); i++) {
            result[i] = Long.valueOf(parts.get(i));
        }
        return Arrays.asList(result);
    }
}
