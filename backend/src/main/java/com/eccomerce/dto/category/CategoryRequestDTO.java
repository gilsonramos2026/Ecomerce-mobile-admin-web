package com.eccomerce.dto.category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryRequestDTO(
        @NotBlank(message = "O nome da categoria é obrigatório")
        @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
        String name,

        @Size(max = 500, message = "A descrição deve ter no máximo 500 caracteres")
        String description
) {
}

