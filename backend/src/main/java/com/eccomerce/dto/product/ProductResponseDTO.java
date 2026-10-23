package com.eccomerce.dto.product;

import com.eccomerce.dto.category.CategoryResponseDTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record ProductResponseDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity,
        boolean active,
        List<String> images,
        CategoryResponseDTO category,
        Instant createdAt,
        Instant updatedAt
) {
}
