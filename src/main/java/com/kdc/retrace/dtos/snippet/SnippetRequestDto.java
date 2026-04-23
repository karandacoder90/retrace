package com.kdc.retrace.dtos.snippet;

import com.kdc.retrace.entities.enums.Language;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public record SnippetRequestDto(
    @Size(max = 160) String title,
    @NotNull(message = "Snippet Image is required.") MultipartFile snippetImage,
    Language language) {}
