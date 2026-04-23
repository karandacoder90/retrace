package com.kdc.retrace.dtos.auth;

import com.kdc.retrace.entities.enums.Role;

import java.util.Date;

public record TokenResponseDto(
        String token,
        String refreshToken,
        Role role,
        Date issuedAt,
        Date expiration
) {
}
