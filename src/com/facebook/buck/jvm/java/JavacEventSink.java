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

import com.facebook.buck.event.BuckEventBus;
import com.facebook.buck.model.BuildTarget;
import com.google.common.collect.ImmutableMap;
import java.util.logging.Level;

public interface JavacEventSink {
  void reportThrowable(Throwable throwable, String message, Object... args);

  void reportEvent(Level level, String message, Object... args);

  void reportCompilerPluginStarted(
      BuildTarget buildTarget,
      String pluginName,
      String durationName,
      ImmutableMap<String, String> args);

  void reportCompilerPluginFinished(BuildTarget buildTarget, ImmutableMap<String, String> args);

  void reportJavacPhaseStarted(
      BuildTarget buildTarget, String phase, ImmutableMap<String, String> args);

  void reportJavacPhaseFinished(
      BuildTarget buildTarget, String phase, ImmutableMap<String, String> args);

  void reportAnnotationProcessingEventStarted(
      BuildTarget buildTarget,
      String annotationProcessorName,
      String operation,
      int round,
      boolean isLastRound);

  void reportAnnotationProcessingEventFinished(
      BuildTarget buildTarget,
      String annotationProcessorName,
      String operation,
      int round,
      boolean isLastRound);

  BuckEventBus getEventBus();
}
