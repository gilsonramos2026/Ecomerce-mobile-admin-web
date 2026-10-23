package com.eccomerce.dto.product;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.util.List;

public record ProductRequestDTO(
        @NotBlank(message = "O nome do produto é obrigatório")
        @Size(min = 2, max = 180, message = "O nome deve ter entre 2 e 180 caracteres")
        String name,

        @Size(max = 2000, message = "A descrição deve ter no máximo 2000 caracteres")
        String description,

        @NotNull(message = "O preço é obrigatório")
        @DecimalMin(value = "0.01", message = "O preço deve ser maior que zero")
        BigDecimal price,
        @NotNull(message = "A quantidade em estoque é obrigatória")
        @PositiveOrZero(message = "O estoque não pode ser negativo")
        Integer stockQuantity,

        @NotNull(message = "A categoria é obrigatória")
        Long categoryId,

        List<String> images,
        Boolean active
) {
}
