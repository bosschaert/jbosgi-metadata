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

/**
 * Parse double from string.
 * 
 * @author Thomas.Diesler@jboss.com
 */
class DoubleValueCreator extends AbstractValueCreator<Double> {
    public DoubleValueCreator() {
        super();
    }

    public DoubleValueCreator(boolean trim) {
        super(trim);
    }

    public Double useString(String attribute) {
        return Double.valueOf(attribute);
    }
}
