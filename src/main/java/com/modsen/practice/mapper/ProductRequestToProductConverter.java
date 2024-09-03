package com.modsen.practice.mapper;

import com.modsen.practice.dto.ProductRequest;
import com.modsen.practice.entity.Category;
import com.modsen.practice.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductRequestToProductConverter implements Converter<ProductRequest, Product> {
    @Override
    public Product convert(ProductRequest source) {
        Product product = new Product();
        product.setId(source.getId());
        Category category = new Category();
        category.setId(source.getCategoryId());
        product.setCategory(category);
        product.setName(source.getName());
        product.setIngredients(source.getIngredients());
        product.setPrice(source.getPrice());
        product.setDescription(source.getDescription());
        product.setWeight(source.getWeight());
        product.setCaloricValue(source.getCaloricValue());

        return product;
    }
}
