package com.example.fibabankinventoryrestapi.business.service;

import com.example.fibabankinventoryrestapi.business.dto.ProductDto;

import java.util.List;

public interface ProductService {
    public ProductDto getProductById(long productId);
    public List<ProductDto>getProductsByCategoryId(long categoryId);
}
