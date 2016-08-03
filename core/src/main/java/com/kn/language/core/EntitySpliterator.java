package com.kn.language.core;

import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

public interface EntitySpliterator extends Spliterator<Entity>, ParseTreeVisitor<Entity> {
  // Depth first use less memory (class -> method -> statement)
  Stack<RuleNode> nodes();
  
  ParseTreeVisitor<Entity> visitor();
  
  @Override
  default boolean tryAdvance(Consumer<? super Entity> action) {
    if (nodes().isEmpty()) {
      return false;
    }
    
    final Entity entity = visitor().visit(nodes().pop());
    action.accept(entity);
    return true;
  }
  
  @Override
  default Entity visitChildren(final RuleNode node) {
    for (int i = 0; i < node.getChildCount(); i++) {
      final ParseTree parseTree = node.getChild(i);
      if (parseTree instanceof RuleNode) {
        nodes().push((RuleNode)parseTree);
      }
    }
    
    // No one care about result of this
    return null;
  }

  @Override
  default Spliterator<Entity> trySplit() {
    // never split
    return null;
  }

  @Override
  default long estimateSize() {
    return Long.MAX_VALUE;
  }

  @Override
  default int characteristics() {
    return DISTINCT | IMMUTABLE;
  }
}
