package com.kn.language.parser;

import org.junit.Ignore;
import org.junit.Test;

import com.kn.language.core.EntityTestBase;

//@Ignore
public class JavaEntityStreamerTest extends EntityTestBase {
  @Test
  public void testTestJava() {
    new JavaEntityStreamer().from(resource("data/Test.java"))
          .forEachOrdered(System.out::println);
  }
}
