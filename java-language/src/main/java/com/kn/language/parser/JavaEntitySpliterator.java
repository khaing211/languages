package com.kn.language.parser;

import java.util.Stack;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

import com.kn.language.core.AntlrHelper;
import com.kn.language.core.Entity;
import com.kn.language.core.EntitySpliterator;
import com.kn.language.parser.antlr.java.JavaBaseVisitor;
import com.kn.language.parser.antlr.java.JavaParser.AnnotationContext;
import com.kn.language.parser.antlr.java.JavaParser.PackageDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.PackageModifierContext;
import com.kn.language.parser.antlr.java.JavaParser.SingleStaticImportDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.SingleTypeImportDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.StaticImportOnDemandDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.TypeImportOnDemandDeclarationContext;

public class JavaEntitySpliterator extends JavaBaseVisitor<Entity> implements EntitySpliterator {
  private final Stack<RuleNode> nodes = new Stack<>();
  
  private final TokenStream tokenStream;
  
  public JavaEntitySpliterator(final RuleNode initialNode, final TokenStream tokenStream) {
    nodes.add(initialNode);
    this.tokenStream = tokenStream;
  }

  @Override
  public Entity visitSingleStaticImportDeclaration(final SingleStaticImportDeclarationContext ctx) {
    // Java.g4 / singleStaticImportDeclaration
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.IMPORT.name())
        // typeName + "." + Identifier
        .value(AntlrHelper.getTextFromRangeOfChild(ctx, 2, 4))
        .property("static", true)
        .property("star", false)
        .build();
  }
  
  @Override
  public Entity visitSingleTypeImportDeclaration(final SingleTypeImportDeclarationContext ctx) {
    // Java.g4 / singleTypeImportDeclaration
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.IMPORT.name())
        .value(ctx.getChild(1).getText())
        .property("static", false)
        .property("star", false)
        .build();
  }

  @Override
  public Entity visitTypeImportOnDemandDeclaration(final TypeImportOnDemandDeclarationContext ctx) {
    // Java.g4 / typeImportOnDemandDeclaration
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.IMPORT.name())
        .value(AntlrHelper.getTextFromRangeOfChild(ctx, 1, 3))
        .property("static", false)
        .property("star", true)
        .build();
  }
  
  @Override
  public Entity visitStaticImportOnDemandDeclaration(final StaticImportOnDemandDeclarationContext ctx) {
    // Java.g4 / staticImportOnDemandDeclaration
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.IMPORT.name())
        .value(AntlrHelper.getTextFromRangeOfChild(ctx, 2, 4))
        .property("static", false)
        .property("star", true)
        .build();
  }

  @Override
  public Entity visitPackageDeclaration(final PackageDeclarationContext ctx) {
    // Push all package annotation to the stack
    int foundIndex = 0;
    for (; foundIndex < ctx.getChildCount(); foundIndex++) {
      final ParseTree parseTree = ctx.getChild(foundIndex);
      if (!(parseTree instanceof PackageModifierContext)) {
        break;
      }
      
      if (parseTree instanceof RuleNode) {
        nodes.push((RuleNode)parseTree);
      } else {
        break;
      }
    }
    
    final Entity entity = AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.PACKAGE.name())
        // exclude ';' at the end
        // endIndex is inclusive so -2
        .value(AntlrHelper.getTextFromRangeOfChild(ctx, foundIndex+1, ctx.getChildCount()-2))
        .build();
    
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
