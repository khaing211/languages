package com.kn.language.parser;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.Test;

public class JavaEntityStreamerTest {
  @Test
  public void test() throws IOException {
    new JavaEntityStreamer().from(Paths.get("src/test/resources/data/Test.java"))
          .forEachOrdered(System.out::println);
  }
}
