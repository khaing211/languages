package com.github.kn.language.core;

import java.util.Optional;

/**
 * {@link Entity} is a flat data structure 
 */
public interface Entities {
  /**
   * @return true if parent is wrap the child by [startLine:startIndex, endLine:endIndex]
   */
  static boolean isAncestor(final Entity parent, final Entity child) {
    // TODO
    return false;
  }
  
  static String toShortString(final Entity entity) {
    return "Entity(type=" + entity.getType() 
      + ",value=" + entity.getValue() 
      + ",range=[" + entity.getStartLine() + ":" + entity.getStartIndex() + "," + entity.getEndLine() + ":" + entity.getEndIndex() + "])";
  }
  
  static <T> Optional<T> getProperty(final Entity entity, final String key, final Class<T> valueClass) {
    return Optional.ofNullable(valueClass.cast(entity.getProperties().get(key)));
  }
}
