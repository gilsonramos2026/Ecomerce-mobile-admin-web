package com.eccomerce.dto.dashboard;

import com.eccomerce.dto.order.OrderResponseDTO;
import com.eccomerce.entity.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public record DashboardResponseDTO(
        BigDecimal totalRevenue,
        long totalOrders,
        long totalUsers,
        long totalProducts,
        long totalCategories,
        Map<OrderStatus, Long> ordersByStatus,
        List<OrderResponseDTO> recentOrders
) {
}
