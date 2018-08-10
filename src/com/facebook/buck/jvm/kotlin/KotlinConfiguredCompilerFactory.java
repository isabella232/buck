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

package com.facebook.buck.jvm.kotlin;

import com.facebook.buck.core.rules.BuildRuleResolver;
import com.facebook.buck.core.rules.SourcePathRuleFinder;
import com.facebook.buck.core.toolchain.ToolchainProvider;
import com.facebook.buck.jvm.java.ConfiguredCompiler;
import com.facebook.buck.jvm.java.ConfiguredCompilerFactory;
import com.facebook.buck.jvm.java.ExtraClasspathProvider;
import com.facebook.buck.jvm.java.Javac;
import com.facebook.buck.jvm.java.JavacFactory;
import com.facebook.buck.jvm.java.JavacOptions;
import com.facebook.buck.jvm.java.JvmLibraryArg;
import com.google.common.base.Preconditions;
import java.util.function.Function;
import javax.annotation.Nullable;

public class KotlinConfiguredCompilerFactory extends ConfiguredCompilerFactory {

  private final KotlinBuckConfig kotlinBuckConfig;
  private final Function<ToolchainProvider, ExtraClasspathProvider> extraClasspathProviderSupplier;
  private final JavacFactory javacFactory;

  public KotlinConfiguredCompilerFactory(
      KotlinBuckConfig kotlinBuckConfig, JavacFactory javacFactory) {
    this(kotlinBuckConfig, (toolchainProvider) -> ExtraClasspathProvider.EMPTY, javacFactory);
  }

  public KotlinConfiguredCompilerFactory(
      KotlinBuckConfig kotlinBuckConfig,
      Function<ToolchainProvider, ExtraClasspathProvider> extraClasspathProviderSupplier,
      JavacFactory javacFactory) {
    super();
    this.kotlinBuckConfig = kotlinBuckConfig;
    this.extraClasspathProviderSupplier = extraClasspathProviderSupplier;
    this.javacFactory = javacFactory;
  }

  @Override
  public ConfiguredCompiler configure(
      @Nullable JvmLibraryArg args,
      JavacOptions javacOptions,
      BuildRuleResolver buildRuleResolver,
      ToolchainProvider toolchainProvider) {
    return new KotlincToJarStepFactory(
        kotlinBuckConfig.getKotlinc(),
        kotlinBuckConfig.getKotlinHomeLibraries(),
        Preconditions.checkNotNull((KotlinLibraryDescription.CoreArg) args)
            .getExtraKotlincArguments(),
        extraClasspathProviderSupplier.apply(toolchainProvider),
        getJavac(buildRuleResolver, args),
        javacOptions);
  }

  private Javac getJavac(BuildRuleResolver resolver, @Nullable JvmLibraryArg arg) {
    return javacFactory.create(new SourcePathRuleFinder(resolver), arg);
  }
}
