package com.kn.language.core;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public interface AntlrHelper {
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
  
  /**
   * Get a text from a range of child nodes.
   */
  static String getTextFromRangeOfChild(final ParseTree parseTree, int begin, int endInclusive) {
    final StringBuilder builder = new StringBuilder();
    for (int i = begin; i <= endInclusive && i < parseTree.getChildCount(); i++) {
      builder.append(parseTree.getChild(i).getText());
    }
    return builder.toString();
  }
}
