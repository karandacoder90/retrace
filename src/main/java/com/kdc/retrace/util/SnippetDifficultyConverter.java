package com.kdc.retrace.util;

import com.kdc.retrace.entities.enums.Difficulty;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SnippetDifficultyConverter implements Converter<String, Difficulty> {

  @Override
  public Difficulty convert(String source) {
    return Difficulty.valueOf(source.trim().toUpperCase());
  }
}
