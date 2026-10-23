package com.eccomerce.dto.order;

import com.eccomerce.entity.enums.OrderStatus;
import jakarta.validation.constraints.NotNull;

public record OrderStatusUpdateDTO(
        @NotNull(message = "O status é obrigatório")
        OrderStatus status
) {
}
