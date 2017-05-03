/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.util;

import com.google.common.base.Preconditions;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.ExecutorService;

public abstract class LineProcessorRunnable extends ManagedRunnable {

  private final InputStream inputStream;
  private final OutputStream outputStream;

  public LineProcessorRunnable(
      ExecutorService threadPool, InputStream inputStream, OutputStream outputStream) {
    super(threadPool);
    this.inputStream = Preconditions.checkNotNull(inputStream);
    this.outputStream = Preconditions.checkNotNull(outputStream);
  }

  protected abstract String process(String line);

  @Override
  protected void run() throws Exception {
    try (LineFetcher reader = new LineFetcher(new InputStreamReader(inputStream));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(process(line));
        writer.newLine();
      }
    }
  }
}
