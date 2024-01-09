/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.xml.bind.annotation.XmlType;

/**
 * Run status for a given Processor.
 */
@XmlType(name = "processorRunStatus")
public class ProcessorRunStatusEntity extends ComponentRunStatusEntity {

    private static final String ALLOWABLE_VALUES = "RUNNING, STOPPED, DISABLED, RUN_ONCE";

    private static String[] SUPPORTED_STATE = ALLOWABLE_VALUES.split(", ");

    @Override
    protected String[] getSupportedState() {
        return SUPPORTED_STATE;
    }

    /**
     * Run status for this Processor.
     * @return The run status
     */
    @Schema(description = "The run status of the Processor.", allowableValues = ALLOWABLE_VALUES)
    public String getState() {
        return super.getState();
    }

}
