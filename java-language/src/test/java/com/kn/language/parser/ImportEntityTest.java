package com.kn.language.parser;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.kn.language.core.Entity;
import com.kn.language.core.EntityTestBase;

public class ImportEntityTest extends EntityTestBase {
  
  @Test
  public void testStaticImport() {
    final List<Entity> entityList = new JavaEntityStreamer().from(resource("data/StaticImportTest.java"))
      .collect(Collectors.toList());
    
    assertEquals(entityList.toString(), 1, entityList.size());
  }
  
  @Test
  public void testNonStaticImport() {
    
  }
  
  @Test
  public void testStaticStarImport() {
    
  }
  
  @Test
  public void testNonStaticStartImport() {
    
  }
}
