package com.eccomerce.mapper;

import com.eccomerce.dto.category.CategoryRequestDTO;
import com.eccomerce.dto.category.CategoryResponseDTO;
import com.eccomerce.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category toEntity(CategoryRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        return Category.builder()
                .name(dto.name())
                .description(dto.description())
                .build();
    }
    public void updateEntityFromDTO(CategoryRequestDTO dto, Category category) {
        category.setName(dto.name());
        category.setDescription(dto.description());
    }
    public CategoryResponseDTO toResponseDTO(Category category) {
        if (category == null) {
            return null;
        }
        long productCount = category.getProducts() != null ? category.getProducts().size() : 0;
        return new CategoryResponseDTO(
                category.getId(),
                category.getName(),
                category.getDescription(),
                productCount
        );
    }
}
