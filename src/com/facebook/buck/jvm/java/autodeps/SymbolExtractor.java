/*
 * Copyright 2016-present Facebook, Inc.
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

package com.facebook.buck.jvm.java.autodeps;

import com.facebook.buck.jvm.java.JavaFileParser;
import com.google.common.base.Charsets;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

final class SymbolExtractor {

  private SymbolExtractor() {}

  public static Symbols extractSymbols(
      JavaFileParser javaFileParser,
      boolean shouldRecordRequiredSymbols,
      ImmutableSortedSet<Path> absolutePaths) {
    Set<String> providedSymbols = new HashSet<>();
    Set<String> requiredSymbols = new HashSet<>();
    Set<String> exportedSymbols = new HashSet<>();

    for (Path src : absolutePaths) {
      String code;
      try {
        code = Files.toString(src.toFile(), Charsets.UTF_8);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

      JavaFileParser.JavaFileFeatures features = javaFileParser.extractFeaturesFromJavaCode(code);
      if (shouldRecordRequiredSymbols) {
        requiredSymbols.addAll(features.requiredSymbols);
        exportedSymbols.addAll(features.exportedSymbols);
      }

      providedSymbols.addAll(features.providedSymbols);
    }

    return new Symbols(
        providedSymbols,
        FluentIterable.from(requiredSymbols).filter(SymbolExtractor::isNotABuiltInSymbol),
        FluentIterable.from(exportedSymbols).filter(SymbolExtractor::isNotABuiltInSymbol));
  }

  private static boolean isNotABuiltInSymbol(String symbol) {
    // We can ignore things in java.*, but not javax.*, unfortunately since sometimes those are
    // provided by JSRs.
    return !symbol.startsWith("java.");
  }
}
