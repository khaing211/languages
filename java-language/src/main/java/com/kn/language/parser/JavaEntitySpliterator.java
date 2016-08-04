package com.kn.language.parser;

import java.util.Deque;
import java.util.LinkedList;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

import com.google.common.collect.Lists;
import com.kn.language.core.AntlrHelper;
import com.kn.language.core.Entity;
import com.kn.language.core.EntitySpliterator;
import com.kn.language.parser.antlr.java.JavaBaseVisitor;
import com.kn.language.parser.antlr.java.JavaParser.AnnotationTypeDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.EnumDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.MarkerAnnotationContext;
import com.kn.language.parser.antlr.java.JavaParser.NormalAnnotationContext;
import com.kn.language.parser.antlr.java.JavaParser.NormalClassDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.NormalInterfaceDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.PackageDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.PackageModifierContext;
import com.kn.language.parser.antlr.java.JavaParser.SingleElementAnnotationContext;
import com.kn.language.parser.antlr.java.JavaParser.SingleStaticImportDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.SingleTypeImportDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.StaticImportOnDemandDeclarationContext;
import com.kn.language.parser.antlr.java.JavaParser.TypeImportOnDemandDeclarationContext;

public class JavaEntitySpliterator extends JavaBaseVisitor<Entity>implements EntitySpliterator {
  private final LinkedList<RuleNode> nodes = Lists.newLinkedList();

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
        .property("star", false).build();
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
  public Entity visitStaticImportOnDemandDeclaration(
      final StaticImportOnDemandDeclarationContext ctx) {
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
        nodes.addFirst((RuleNode) parseTree);
      } else {
        break;
      }
    }

    // exclude ';' at the end
    // endIndex is inclusive so -2
    final String value = AntlrHelper.getTextFromRangeOfChild(ctx, foundIndex + 1, ctx.getChildCount() - 2);

    final Entity entity = AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.PACKAGE.name())
        .value(value)
        .build();

    return entity;
  }

  @Override
  public Entity visitSingleElementAnnotation(final SingleElementAnnotationContext ctx) {
    // see Java.g4 / singleElementAnnotation
    // TODO: we are ignoring () bracket
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.ANNOTATION.name())
        .value(ctx.getChild(1).getText())
        .build();
  }

  @Override
  public Entity visitMarkerAnnotation(final MarkerAnnotationContext ctx) {
    // see Java.g4 / markerAnnotation
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.ANNOTATION.name())
        .value(ctx.getChild(1).getText())
        .build();
  }

  @Override
  public Entity visitNormalAnnotation(final NormalAnnotationContext ctx) {
    // see Java.g4 / normalAnnotation
    // TODO: we are ignoring () bracket
    return AntlrHelper.fromParseRuleContext(ctx, tokenStream)
        .type(JavaEntityType.ANNOTATION.name())
        .value(ctx.getChild(1).getText())
        .build();
  }

  @Override
  public Entity visitNormalClassDeclaration(final NormalClassDeclarationContext ctx) {
    // See Java.g4 / normalClassDeclaration
    // TODO Auto-generated method stub
    return super.visitNormalClassDeclaration(ctx);
  }

  @Override
  public Entity visitEnumDeclaration(final EnumDeclarationContext ctx) {
    // See Java.g4 / enumDeclaration
    // TODO Auto-generated method stub
    return super.visitEnumDeclaration(ctx);
  }

  @Override
  public Entity visitNormalInterfaceDeclaration(final NormalInterfaceDeclarationContext ctx) {
    // See Java.g4 / normalInterfaceDeclaration
    // TODO Auto-generated method stub
    return super.visitNormalInterfaceDeclaration(ctx);
  }

  @Override
  public Entity visitAnnotationTypeDeclaration(final AnnotationTypeDeclarationContext ctx) {
    // See Java.g4 / annotationTypeDeclaration
    // TODO Auto-generated method stub
    return super.visitAnnotationTypeDeclaration(ctx);
  }

  @Override
  public Entity visitChildren(final RuleNode node) {
    // Important
    return EntitySpliterator.super.visitChildren(node);
  }

  @Override
  public Deque<RuleNode> nodes() {
    return nodes;
  }

  @Override
  public ParseTreeVisitor<Entity> visitor() {
    return this;
  }
}
