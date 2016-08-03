package com.kn.language.core;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Supplier;

import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import com.google.common.io.Files;

public class EntityTestBase {
  @Rule
  public TemporaryFolder directory = new TemporaryFolder();
  
  public Path write(final String fileName, final Supplier<String> content) {
    return write(fileName, content.get());
  }
  
  public Path write(String fileName, String content) {
    try {
      final File file = directory.newFile(fileName);
      Files.write(content, file, Charset.forName("UTF-8"));
      return file.toPath();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
  
  public static Path resource(String resourcePath) {
    return Paths.get("src/test/resources").resolve(resourcePath);
  }
  
  public static void assertEntity(final Entity expected, final Entity actual) {
    assertEquals("type mismatch", expected.getType(), actual.getType());
    assertEquals("value mismatch", expected.getValue(), actual.getValue());
    assertEquals("startLine mismatch", expected.getStartLine(), actual.getStartLine());
    assertEquals("startIndex mismatch", expected.getStartIndex(), actual.getStartIndex());
    assertEquals("endLine mismatch", expected.getEndLine(), actual.getEndLine());
    assertEquals("endIndex mismatch", expected.getEndIndex(), actual.getEndIndex());
    assertEquals("properties mismatch", expected.getProperties(), actual.getProperties());
  }
}
