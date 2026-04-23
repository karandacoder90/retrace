package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Difficulty;

import java.util.Set;

public record SnippetUpdateRequestDto(
        String title,
        Difficulty difficulty,
        Set<String> tags,
        Boolean important,
        String memoryNotes
) {}
