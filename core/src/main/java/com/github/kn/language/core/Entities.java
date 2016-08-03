package com.github.kn.language.core;

import java.util.Optional;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

/**
 * {@link Entity} is a flat data structure 
 */
public interface Entities {
  /**
   * @return true if parent is wrap the child by [startLine:startIndex, endLine:endIndex]
   */
  static boolean isAncestor(final Entity parent, final Entity child) {
    return parent.getStartLine() <= child.getStartLine() &&
        parent.getStartIndex() <= child.getStartIndex() &&
        child.getEndIndex() <= parent.getEndIndex() &&
        child.getEndLine() <= parent.getEndIndex();
  }
  
  static String toShortString(final Entity entity) {
    return "Entity(type=" + entity.getType() 
      + ",value=" + entity.getValue() 
      + ",range=[" + entity.getStartLine() + ":" + entity.getStartIndex() + "," + entity.getEndLine() + ":" + entity.getEndIndex() + "])";
  }
  
  /**
   * @return a partial build Entity with the positional information
   */
  static Entity.EntityBuilder fromParseRuleContext(final ParserRuleContext context, final TokenStream tokenStream) {
    final Token firstToken = tokenStream.get(context.getSourceInterval().a);
    final Token lastToken = tokenStream.get(context.getSourceInterval().b);
    return Entity.builder()
        .startLine(firstToken.getLine())
        .startIndex(firstToken.getCharPositionInLine())
        .endLine(lastToken.getLine())
        .endIndex(lastToken.getCharPositionInLine() + lastToken.getText().length());
  }
  
  static <T> Optional<T> getProperty(final Entity entity, final String key, final Class<T> valueClass) {
    return Optional.ofNullable(valueClass.cast(entity.getProperties().get(key)));
  }
}
