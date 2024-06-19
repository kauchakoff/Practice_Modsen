package com.modsen.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private CategoryResponse category;
    private String name;
    private String ingredients;
    private BigDecimal price;
    private String description;
    private Short weight;
    private Short caloric_value;
}
