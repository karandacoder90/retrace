package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Language;
import com.kdc.retrace.entities.enums.SnippetStatus;

import java.util.UUID;

public record SnippetProgressTracker(
        UUID snippetId,
        SnippetStatus status,
        String message,
        Language language
) {
}
