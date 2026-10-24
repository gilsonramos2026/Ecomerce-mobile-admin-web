package com.eccomerce.mapper;

import com.eccomerce.dto.product.ProductRequestDTO;
import com.eccomerce.dto.product.ProductResponseDTO;
import com.eccomerce.entity.Category;
import com.eccomerce.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductMapper {
    private final CategoryMapper categoryMapper;
    public Product toEntity(ProductRequestDTO dto, Category category) {
        if (dto == null) {
            return null;
        }
        return Product.builder()
                .name(dto.name())
                .description(dto.description())
                .price(dto.price())
                .stockQuantity(dto.stockQuantity())
                .active(dto.active() == null || dto.active())
                .images(dto.images() != null ? new ArrayList<>(dto.images()) : new ArrayList<>())
                .category(category)
                .build();
    }
    public void updateEntityFromDTO(ProductRequestDTO dto, Category category, Product product) {
        product.setName(dto.name());
        product.setDescription(dto.description());
        product.setPrice(dto.price());
        product.setStockQuantity(dto.stockQuantity());
        product.setCategory(category);
        product.setActive(dto.active() == null || dto.active());
        product.setImages(dto.images() != null ? new ArrayList<>(dto.images()) : new ArrayList<>());
    }
    public ProductResponseDTO toResponseDTO(Product product) {
        if (product == null) {
            return null;
        }
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStockQuantity(),
                product.isActive(),
                product.getImages() != null ? List.copyOf(product.getImages()) : List.of(),
                categoryMapper.toResponseDTO(product.getCategory()),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}