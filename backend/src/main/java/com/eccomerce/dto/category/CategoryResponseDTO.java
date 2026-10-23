package com.eccomerce.dto.category;

public record CategoryResponseDTO(
        Long id,
        String name,
        String description,
        long productCount
) {
}
