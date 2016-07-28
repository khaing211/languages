package com.github.kn.language.core;

import java.io.InputStream;
import java.util.stream.Stream;

/**
 * {@link EntityStreamer} following the registry pattern
 */
public interface EntityStreamer {
  /**
   * @param inputStream
   * @return
   */
  default Stream<Entity> fromInputStream(final InputStream inputStream) {
    return Stream.of();
  }
  
  /**
   * @return string value represent the entity type
   */
  String getEntityType();
}
