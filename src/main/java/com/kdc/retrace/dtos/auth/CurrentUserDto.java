package com.kdc.retrace.dtos.auth;

import com.kdc.retrace.entities.enums.Role;

public record CurrentUserDto(
        String firstName,
        String lastName,
        Role role,
        String username
) {}
