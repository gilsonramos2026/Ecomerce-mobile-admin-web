package com.eccomerce.dto.order;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.List;

public record OrderRequestDTO(
        @NotBlank(message = "O endereço de entrega é obrigatório")
        @Size(max = 300, message = "O endereço deve ter no máximo 300 caracteres")
        String shippingAddress,

        @Size(max = 120, message = "A cidade deve ter no máximo 120 caracteres")
        String shippingCity,

        @Size(max = 20, message = "O CEP deve ter no máximo 20 caracteres")
        String shippingZipCode,

        @NotEmpty(message = "O pedido deve conter ao menos um item")
        @Valid
        List<OrderItemRequestDTO> items
) {
}
