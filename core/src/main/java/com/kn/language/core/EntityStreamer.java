package com.kn.language.core;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import lombok.SneakyThrows;

/**
 * {@link EntityStreamer} read an {@link InputStream} into {@link Stream} of {@link Entity}
 */
public interface EntityStreamer {
  @SneakyThrows
  default Stream<Entity> from(final Path path) {
    final InputStream inputStream = new BufferedInputStream(Files.newInputStream(path));
    final Stream<Entity> stream = from(inputStream);
    stream.onClose(() -> {
      try {
        inputStream.close();
      } catch (IOException e) {
        throw new UncheckedIOException(e);
      }
    });
    return stream;
  }
  
  /**
   * Caller should handle open/close of {@link InputStream} 
   * 
   * @return {@link Stream} of {@link Entity}
   */
  Stream<Entity> from(final InputStream inputStream);
  
  /**
   * @return language value represent {@link EntityStreamer} can language
   */
  String getLanguage();
}
