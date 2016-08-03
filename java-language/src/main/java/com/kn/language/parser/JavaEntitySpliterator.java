package com.kn.language.parser;

import java.util.Stack;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

import com.kn.language.core.Entities;
import com.kn.language.core.Entity;
import com.kn.language.core.EntitySpliterator;
import com.kn.language.parser.antlr.java.JavaBaseVisitor;
import com.kn.language.parser.antlr.java.JavaParser.AnnotationContext;
import com.kn.language.parser.antlr.java.JavaParser.ImportDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.PackageDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.QualifiedNameContext;

public class JavaEntitySpliterator extends JavaBaseVisitor<Entity> implements EntitySpliterator {
  private final Stack<RuleNode> nodes = new Stack<>();
  
  private final TokenStream tokenStream;
  
  public JavaEntitySpliterator(final RuleNode initialNode, final TokenStream tokenStream) {
    nodes.add(initialNode);
    this.tokenStream = tokenStream;
  }

  @Override
  public Entity visitImportDeclaration(final ImportDeclarationContext ctx) {
    
    int qualifiedNameIndex = 1;
    boolean staticImport = false;
    // see Java.g4
    for (; qualifiedNameIndex <= 2; qualifiedNameIndex++) {
      final ParseTree child = ctx.getChild(qualifiedNameIndex);
      if (child instanceof QualifiedNameContext) {
        break;
      } else {
        staticImport = true;
      }
    }

    final StringBuilder qualifiedNameBuilder = new StringBuilder();
    // ignore the last child which is ';'
    for (; qualifiedNameIndex < ctx.getChildCount() - 1; qualifiedNameIndex++) {
      qualifiedNameBuilder.append(ctx.getChild(qualifiedNameIndex).getText());
    }
    
    final Entity entity = Entities.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.IMPORT.name())
        .value(qualifiedNameBuilder.toString())
        .property("static", staticImport)
        .build();
    
    return entity;
  }

  @Override
  public Entity visitPackageDeclaration(final PackageDeclarationContext ctx) {
    final Entity entity = Entities.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.PACKAGE.name())
        .build();

    // TODO: check for annotation
    //super.visitPackageDeclaration(ctx);
    
    return entity;
  }
  
  @Override
  public Entity visitAnnotation(AnnotationContext ctx) {
    // TODO Auto-generated method stub
    return super.visitAnnotation(ctx);
  }
  
  @Override
  public Entity visitChildren(final RuleNode node) {
    // Important
    return EntitySpliterator.super.visitChildren(node);
  }
  
  @Override
  public Stack<RuleNode> nodes() {
    return nodes;
  }

  @Override
  public ParseTreeVisitor<Entity> visitor() {
    return this;
  }
}
