package com.kdc.retrace.dtos.auth;

public record LoginResponseDto(
        String username,
        TokenResponseDto authData
) {
}
