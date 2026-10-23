package com.eccomerce.dto.order;

import java.math.BigDecimal;

public record OrderItemResponseDTO(
        Long id,
        Long productId,
        String productName,
        String productImage,
        Integer quantity,
        BigDecimal unitPrice,
        BigDecimal subtotal
) {
}

