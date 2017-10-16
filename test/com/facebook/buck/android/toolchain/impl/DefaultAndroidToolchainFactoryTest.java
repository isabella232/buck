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

package com.facebook.buck.android.toolchain.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.facebook.buck.android.AndroidBuckConfig;
import com.facebook.buck.android.FakeAndroidDirectoryResolver;
import com.facebook.buck.android.toolchain.AndroidToolchain;
import com.facebook.buck.config.FakeBuckConfig;
import com.facebook.buck.testutil.integration.TemporaryPaths;
import com.facebook.buck.util.environment.Platform;
import java.nio.file.Paths;
import java.util.Optional;
import org.junit.Rule;
import org.junit.Test;

public class DefaultAndroidToolchainFactoryTest {
  @Rule public TemporaryPaths temporaryFolder = new TemporaryPaths();

  @Test
  public void testAndroidToolchainNotPresentWhenSdkRootNotPresent() throws Exception {
    DefaultAndroidToolchainFactory factory = new DefaultAndroidToolchainFactory();

    FakeAndroidDirectoryResolver androidDirectoryResolver = new FakeAndroidDirectoryResolver();

    Optional<AndroidToolchain> toolchain =
        factory.createToolchain(
            new AndroidBuckConfig(FakeBuckConfig.builder().build(), Platform.detect()),
            androidDirectoryResolver);

    assertFalse(toolchain.isPresent());
  }

  @Test
  public void testAndroidNdkNotPresentWhenSdkRootNotPresent() throws Exception {
    DefaultAndroidToolchainFactory factory = new DefaultAndroidToolchainFactory();

    FakeAndroidDirectoryResolver androidDirectoryResolver =
        new FakeAndroidDirectoryResolver(
            Optional.of(Paths.get("/path/to/sdk")),
            Optional.empty(),
            Optional.empty(),
            Optional.empty());

    Optional<AndroidToolchain> toolchain =
        factory.createToolchain(
            new AndroidBuckConfig(FakeBuckConfig.builder().build(), Platform.detect()),
            androidDirectoryResolver);

    assertTrue(toolchain.isPresent());
    assertFalse(toolchain.get().getAndroidNdk().isPresent());
  }
}
