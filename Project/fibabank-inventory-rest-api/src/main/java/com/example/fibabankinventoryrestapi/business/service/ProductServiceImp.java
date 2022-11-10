package com.example.fibabankinventoryrestapi.business.service;

import com.example.fibabankinventoryrestapi.business.dto.ProductDto;
import com.example.fibabankinventoryrestapi.entity.Product;
import com.example.fibabankinventoryrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDto getProductById(long productId) {
        Optional<Product>optional=productRepository.findById(productId);
        if (optional.isPresent()){
            Product product=optional.get();
            ProductDto productDto=new ProductDto();
            productDto.setProductId(product.getProductId());
            productDto.setProductName(product.getProductName());
            productDto.setSalesPrice(product.getSalesPrice());
            return productDto;
        }
        return null;



    }

    @Override
    public List<ProductDto> getProductsByCategoryId(long categoryId) {
        List<Product>products=productRepository.getProductsByCategoryId(categoryId);
        List<ProductDto>productDtos=new ArrayList<>();
        for (Product product:products) {
            ProductDto productDto=new ProductDto();
            productDto.setProductId(product.getProductId());
            productDto.setProductName(product.getProductName());
            productDto.setSalesPrice(product.getSalesPrice());
            productDtos.add(productDto);

        }
        return productDtos;

    }
}
