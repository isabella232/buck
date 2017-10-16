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

package com.facebook.buck.jvm.java;

import com.facebook.buck.jvm.java.abi.source.api.SourceOnlyAbiRuleInfo;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.rules.BuildRule;
import com.facebook.buck.rules.RuleKeyObjectSink;
import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.rules.SourcePathRuleFinder;
import com.facebook.buck.util.ProcessExecutorParams;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

/** Fake implementation of {@link Javac} for tests. */
public class FakeJavac implements Javac {
  @Override
  public void appendToRuleKey(RuleKeyObjectSink sink) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ImmutableCollection<BuildRule> getDeps(SourcePathRuleFinder ruleFinder) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ImmutableCollection<SourcePath> getInputs() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<String> getCommandPrefix(SourcePathResolver resolver) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ImmutableMap<String, String> getEnvironment(SourcePathResolver resolver) {
    throw new UnsupportedOperationException();
  }

  @Override
  public JavacVersion getVersion() {
    throw new UnsupportedOperationException();
  }

  @Override
  public Invocation newBuildInvocation(
      JavacExecutionContext context,
      BuildTarget invokingRule,
      ImmutableList<String> options,
      ImmutableList<JavacPluginJsr199Fields> pluginFields,
      ImmutableSortedSet<Path> javaSourceFilePaths,
      Path pathToSrcsList,
      Path workingDirectory,
      AbiGenerationMode abiGenerationMode,
      @Nullable SourceOnlyAbiRuleInfo ruleInfo) {
    return new Invocation() {
      @Override
      public int buildSourceAbiJar(Path sourceAbiJar) throws InterruptedException {
        throw new UnsupportedOperationException();
      }

      @Override
      public int buildClasses() throws InterruptedException {
        try {
          return context
              .getProcessExecutor()
              .launchAndExecute(ProcessExecutorParams.ofCommand("javac"))
              .getExitCode();
        } catch (IOException e) {
          return 1;
        }
      }

      @Override
      public void close() {
        // Nothing to do
      }
    };
  }

  @Override
  public String getDescription(
      ImmutableList<String> options,
      ImmutableSortedSet<Path> javaSourceFilePaths,
      Path pathToSrcsList) {
    return String.format("%sDelimiter%sDelimiter%s", options, javaSourceFilePaths, pathToSrcsList);
  }

  @Override
  public String getShortName() {
    throw new UnsupportedOperationException();
  }
}
