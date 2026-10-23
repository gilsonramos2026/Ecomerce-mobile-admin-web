package com.eccomerce.dto.order;

import com.eccomerce.entity.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record OrderResponseDTO(
        Long id,
        Long customerId,
        String customerName,
        String customerEmail,
        OrderStatus status,
        BigDecimal totalAmount,
        String shippingAddress,
        String shippingCity,
        String shippingZipCode,
        List<OrderItemResponseDTO> items,
        Instant createdAt,
        Instant updatedAt
) {
}
