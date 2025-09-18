/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link MissingOptionException}.
 */
public class MissingOptionExceptionTest {

    @Test
    void testGetMessage() {
        final List<String> originalList = new ArrayList<>();
        originalList.add("optA");
        originalList.add("optB");
        final MissingOptionException exception = new MissingOptionException(originalList);
        assertEquals("Missing required options: optA, optB", exception.getMessage());
        assertEquals("Missing required options: ", new MissingOptionException(new ArrayList<>()).getMessage());
    }

    @Test
    void testGetMissingOptions() {
        final List<String> originalList = new ArrayList<>();
        originalList.add("optA");
        originalList.add("optB");
        final MissingOptionException exception = new MissingOptionException(originalList);
        assertEquals(Arrays.asList("optA", "optB"), exception.getMissingOptions());
    }
}
