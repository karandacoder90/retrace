package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Language;

public record AnalyzeRequest(
        Language language
) {}
