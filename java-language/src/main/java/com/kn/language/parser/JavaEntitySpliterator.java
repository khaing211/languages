package com.kn.language.parser;

import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import com.github.kn.language.core.Entity;
import com.kn.language.parser.antlr.java.JavaBaseVisitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaEntitySpliterator extends JavaBaseVisitor<Entity> implements Spliterator<Entity> {
  // Depth first use less memory (class -> method -> statement)
  private final Stack<RuleNode> nodes = new Stack<>();
  
  public JavaEntitySpliterator(final RuleNode initialNode) {
    nodes.add(initialNode);
  }
  
  @Override
  public boolean tryAdvance(Consumer<? super Entity> action) {
    if (nodes.isEmpty()) {
      return false;
    }
    
    final Entity entity = this.visit(nodes.pop());
    action.accept(entity);
    return true;
  }

  @Override
  public Entity visitChildren(final RuleNode node) {
    log.info("Receive ruleNode: {}", node);
    for (int i = 0; i < node.getChildCount(); i++) {
      final ParseTree parseTree = node.getChild(i);
      if (parseTree instanceof RuleNode) {
        nodes.push((RuleNode)parseTree);
      } else {
        log.info("Reach the end of the stream {}", parseTree);
      }
    }
    
    // No one care about result of this
    return null;
  }
  
  @Override
  public Spliterator<Entity> trySplit() {
    // never split
    return null;
  }

  @Override
  public long estimateSize() {
    return Long.MAX_VALUE;
  }

  @Override
  public int characteristics() {
    return DISTINCT | IMMUTABLE;
  }

}
