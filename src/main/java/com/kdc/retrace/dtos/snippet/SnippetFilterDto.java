package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Difficulty;
import com.kdc.retrace.entities.enums.SnippetStatus;

import java.time.LocalDate;
import java.util.Set;

public record SnippetFilterDto(
        String search,
        Set<String> tags,
        SnippetStatus status,
        Difficulty difficulty,
        LocalDate startDate,
        LocalDate endDate
){}
