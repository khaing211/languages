package com.github.kn.language.parser.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import com.github.kn.language.core.Entity;
import com.github.kn.language.core.EntityStreamer;
import com.github.kn.language.parser.impl.model.backend.java.JavaBaseVisitor;
import com.github.kn.language.parser.impl.model.backend.java.JavaLexer;
import com.github.kn.language.parser.impl.model.backend.java.JavaParser;
import com.github.kn.language.parser.impl.model.backend.java.JavaVisitor;

public class JavaEntityStreamer implements EntityStreamer {
  public static final String JAVA_ENTITY_TYPE = "java";
  
  @Override
  public Stream<Entity> fromInputStream(final InputStream inputStream) {
    try {
      final CharStream charStream = new ANTLRInputStream(inputStream);
      final JavaLexer lexer = new JavaLexer(charStream);
      final TokenStream tokens = new CommonTokenStream(lexer);
      final JavaParser parser = new JavaParser(tokens);
      final JavaVisitor<Integer> visitor = new JavaBaseVisitor<Integer>();
      // starting node: compilationUnit
      visitor.visit(parser.compilationUnit());
      
      // TODO:
      return EntityStreamer.super.fromInputStream(inputStream);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }

  }
  
  @Override
  public String getEntityType() {
    return JAVA_ENTITY_TYPE;
  }

}
