package com.eccomerce.mapper;

import com.eccomerce.dto.order.OrderItemResponseDTO;
import com.eccomerce.dto.order.OrderResponseDTO;
import com.eccomerce.entity.Order;
import com.eccomerce.entity.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderResponseDTO toResponseDTO(Order order) {
        if (order == null) {
            return null;
        }
        return new OrderResponseDTO(
                order.getId(),
                order.getUser().getId(),
                order.getUser().getName(),
                order.getUser().getEmail(),
                order.getStatus(),
                order.getTotalAmount(),
                order.getShippingAddress(),
                order.getShippingCity(),
                order.getShippingZipCode(),
                order.getItems().stream().map(this::toItemResponseDTO).toList(),
                order.getCreatedAt(),
                order.getUpdatedAt()
        );
    }
    public OrderItemResponseDTO toItemResponseDTO(OrderItem item) {
        if (item == null) {
            return null;
        }
        String image = item.getProduct().getImages() != null && !item.getProduct().getImages().isEmpty()
                ? item.getProduct().getImages().get(0)
                : null;
        return new OrderItemResponseDTO(
                item.getId(),
                item.getProduct().getId(),
                item.getProduct().getName(),
                image,
                item.getQuantity(),
                item.getUnitPrice(),
                item.getSubtotal()
        );
    }
}

