package com.kn.language.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import com.github.kn.language.core.Entity;
import com.github.kn.language.core.EntityStreamer;
import com.kn.language.parser.antlr.java.JavaLexer;
import com.kn.language.parser.antlr.java.JavaParser;

public class JavaEntityStreamer implements EntityStreamer {
  public static final String JAVA_LANGUAGE = "java";
  
  @Override
  public Stream<Entity> from(final InputStream inputStream) {
    // http://stackoverflow.com/questions/16432469/is-it-possible-to-parse-big-file-with-antlr
    
    try {
      final CharStream charStream = new ANTLRInputStream(inputStream);
      final JavaLexer lexer = new JavaLexer(charStream);
      final TokenStream tokenStream = new CommonTokenStream(lexer);
      final JavaParser parser = new JavaParser(tokenStream);
      
      // CompilationUnit is the expected initial node
      final JavaEntitySpliterator visitor = new JavaEntitySpliterator(parser.compilationUnit(), tokenStream);
      return StreamSupport.stream(visitor, false);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
  
  @Override
  public String getLanguage() {
    return JAVA_LANGUAGE;
  }
}
