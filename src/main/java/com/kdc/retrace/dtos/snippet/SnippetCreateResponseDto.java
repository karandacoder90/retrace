package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Language;

import java.util.UUID;

public record SnippetCreateResponseDto(
        String message,
        UUID snippetId,
        Language language,
        boolean isDuplicate
) {}
