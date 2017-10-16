/*
 * Copyright 2017-present Facebook, Inc.
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

import com.facebook.buck.io.filesystem.ProjectFilesystem;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.NoopBuildRuleWithDeclaredAndExtraDeps;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.rules.keys.SupportsInputBasedRuleKey;

public class JavaAnnotationProcessor extends NoopBuildRuleWithDeclaredAndExtraDeps
    implements SupportsInputBasedRuleKey {
  @AddToRuleKey private final JavacPluginProperties properties;
  private final ResolvedJavacPluginProperties resolvedProperties;

  public JavaAnnotationProcessor(
      BuildTarget buildTarget,
      ProjectFilesystem projectFilesystem,
      BuildRuleParams params,
      SourcePathResolver pathResolver,
      JavacPluginProperties properties) {
    super(buildTarget, projectFilesystem, params);

    this.properties = properties;

    resolvedProperties =
        new ResolvedJavacPluginProperties(properties, getProjectFilesystem(), pathResolver);
  }

  public JavacPluginProperties getUnresolvedProperties() {
    return properties; // Shut up PMD
  }

  public ResolvedJavacPluginProperties getProcessorProperties() {
    return resolvedProperties;
  }
}
