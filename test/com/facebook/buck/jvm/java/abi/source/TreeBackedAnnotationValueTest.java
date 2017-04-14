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

package com.facebook.buck.jvm.java.abi.source;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import com.facebook.buck.jvm.java.testutil.CompilerTreeApiParameterized;
import com.google.common.base.Joiner;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;

@RunWith(CompilerTreeApiParameterized.class)
public class TreeBackedAnnotationValueTest extends CompilerTreeApiParameterizedTest {
  @Test
  public void testBooleanValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  boolean value() default true;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitBoolean(boolean b, Void aVoid) {
        assertTrue((boolean) defaultValue.getValue());
        assertEquals(defaultValue.getValue(), b);
        return null;
      }
    }, null);
  }

  @Test
  public void testByteValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  byte value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitByte(byte b, Void aVoid) {
        assertEquals((byte) 42, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), b);
        return null;
      }
    }, null);
  }

  @Test
  public void testCharValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  char value() default 'x';",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitChar(char c, Void aVoid) {
        assertEquals('x', method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), c);
        return null;
      }
    }, null);
  }

  @Test
  public void testShortValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  short value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitShort(short s, Void aVoid) {
        assertEquals((short) 42, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), s);
        return null;
      }
    }, null);
  }

  @Test
  public void testIntegerValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  int value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitInt(int i, Void aVoid) {
        assertEquals(42, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), i);
        return null;
      }
    }, null);
  }

  @Test
  public void testLongValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  long value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitLong(long l, Void aVoid) {
        assertEquals(42L, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), l);
        return null;
      }
    }, null);
  }

  @Test
  public void testFloatValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  float value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitFloat(float f, Void aVoid) {
        assertEquals(42f, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), f);
        return null;
      }
    }, null);
  }

  @Test
  public void testDoubleValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  double value() default 42;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitDouble(double d, Void aVoid) {
        assertEquals(42.0, method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), d);
        return null;
      }
    }, null);
  }

  @Test
  public void testStringValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  String value() default \"42\";",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitString(String s, Void aVoid) {
        assertEquals("42", method.getDefaultValue().getValue());
        assertEquals(defaultValue.getValue(), s);
        return null;
      }
    }, null);
  }

  @Test
  public void testArrayValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  char[] value() default {'4', '2'};",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitArray(List<? extends AnnotationValue> vals, Void aVoid) {
        assertEquals(vals, defaultValue.getValue());
        assertThat(
            vals.stream().map(AnnotationValue::getValue).collect(Collectors.toList()),
            Matchers.contains('4', '2'));
        return null;
      }
    }, null);
  }

  @Test
  public void testClasspathEnumValue() throws IOException {
    compile(Joiner.on('\n').join(
        "import java.lang.annotation.*",
        "public @interface Foo {",
        "  RetentionPolicy value() default RetentionPolicy.SOURCE;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    VariableElement sourceField =
        findField("SOURCE", elements.getTypeElement("java.lang.annotation.RetentionPolicy"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitEnumConstant(VariableElement constant, Void aVoid) {
        assertSame(sourceField, constant);
        assertSame(constant, defaultValue.getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testLocalEnumValue() throws IOException {
    compile(Joiner.on('\n').join(
        "import java.lang.annotation.*",
        "public @interface Foo {",
        "  FooEnum value() default FooEnum.Bar;",
        "}",
        "enum FooEnum { Foo, Bar, Baz };"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    VariableElement sourceField =
        findField("Bar", elements.getTypeElement("FooEnum"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitEnumConstant(VariableElement constant, Void aVoid) {
        assertSame(sourceField, constant);
        assertSame(constant, defaultValue.getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testPrimitiveClassValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  Class value() default int.class;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitType(TypeMirror t, Void aVoid) {
        assertSameType(types.getPrimitiveType(TypeKind.INT), t);
        assertSame(t, defaultValue.getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testClassValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  Class value() default Foo.class;",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitType(TypeMirror t, Void aVoid) {
        assertSameType(elements.getTypeElement("Foo").asType(), t);
        assertSame(t, defaultValue.getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testClassArrayValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  Class[] value() default {int.class, Foo.class};",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitArray(List<? extends AnnotationValue> vals, Void aVoid) {
        assertEquals(vals, defaultValue.getValue());
        assertSameType(
            types.getPrimitiveType(TypeKind.INT),
            (TypeMirror) vals.get(0).getValue());

        assertSameType(
            elements.getTypeElement("Foo").asType(),
            (TypeMirror) vals.get(1).getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testAnnotationMirrorValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  FooHelper value() default @FooHelper;",
        "}",
        "@interface FooHelper {}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitAnnotation(AnnotationMirror a, Void aVoid) {
        assertSameType(elements.getTypeElement("FooHelper").asType(), a.getAnnotationType());
        assertSame(a, defaultValue.getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testSingleElementAnnotationMirrorValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  FooHelper value() default @FooHelper(42);",
        "}",
        "@interface FooHelper {",
        "  int value();",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitAnnotation(AnnotationMirror a, Void aVoid) {
        AnnotationMirror annotationMirrorValue = (AnnotationMirror) defaultValue.getValue();
        ExecutableElement keyElement = findMethod("value", elements.getTypeElement("FooHelper"));

        assertEquals(1, annotationMirrorValue.getElementValues().size());
        assertEquals(42, annotationMirrorValue.getElementValues().get(keyElement).getValue());
        return null;
      }
    }, null);
  }

  @Test
  public void testMultiElementAnnotationMirrorValue() throws IOException {
    compile(Joiner.on('\n').join(
        "public @interface Foo {",
        "  FooHelper value() default @FooHelper(number=42, string=\"42\");",
        "}",
        "@interface FooHelper {",
        "  int number();",
        "  String string();",
        "}"));

    ExecutableElement method = findMethod("value", elements.getTypeElement("Foo"));
    AnnotationValue defaultValue = method.getDefaultValue();
    defaultValue.accept(new TestVisitor() {
      @Override
      public Void visitAnnotation(AnnotationMirror a, Void aVoid) {
        AnnotationMirror annotationMirrorValue = (AnnotationMirror) defaultValue.getValue();
        ExecutableElement numberKeyElement =
            findMethod("number", elements.getTypeElement("FooHelper"));
        ExecutableElement stringKeyElement =
            findMethod("string", elements.getTypeElement("FooHelper"));

        assertEquals(2, annotationMirrorValue.getElementValues().size());
        assertEquals(
            42,
            annotationMirrorValue.getElementValues().get(numberKeyElement).getValue());
        assertEquals(
            "42",
            annotationMirrorValue.getElementValues().get(stringKeyElement).getValue());
        return null;
      }
    }, null);
  }

  private static class TestVisitor extends SimpleAnnotationValueVisitor8<Void, Void> {
    @Override
    protected Void defaultAction(Object o, Void aVoid) {
      throw new AssertionError(String.format("Called incorrect visit method for %s", o));
    }
  }
}
