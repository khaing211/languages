package com.kn.language.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.common.collect.ImmutableMap;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

/**
 * {@link Entity} is creating by parsing the file.
 */
@Builder
@Value
@JsonNaming(SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity {
  private final String type;
  
  private final String value;
  
  // 0-base
  private long startLine;
  
  // 0-base, index in the line
  private long startIndex;
  
  private long endLine;
  
  private long endIndex;
  
  // all properties attached with Entity
  @Singular private ImmutableMap<String, Object> properties;
}
