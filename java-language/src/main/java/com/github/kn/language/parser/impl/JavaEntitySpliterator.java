package com.github.kn.language.parser.impl;

import java.util.Spliterator;
import java.util.function.Consumer;

import com.github.kn.language.core.Entity;

public class JavaEntitySpliterator implements Spliterator<Entity> {

  @Override
  public boolean tryAdvance(Consumer<? super Entity> action) {
    // TODO Auto-generated method stub
    return false;
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
