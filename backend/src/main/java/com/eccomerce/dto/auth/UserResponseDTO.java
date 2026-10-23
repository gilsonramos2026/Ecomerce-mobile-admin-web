package com.eccomerce.dto.auth;

import com.eccomerce.entity.enums.Role;

import java.time.Instant;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        Role role,
        boolean enabled,
        Instant createdAt
) {}
