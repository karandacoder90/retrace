package com.kdc.retrace.util;

import com.kdc.retrace.entities.enums.SnippetStatus;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SnippetStatusConverter implements Converter<String, SnippetStatus> {

    @Override
    public SnippetStatus convert(String source) {
        return SnippetStatus.valueOf(source.trim().toUpperCase());
    }
}
