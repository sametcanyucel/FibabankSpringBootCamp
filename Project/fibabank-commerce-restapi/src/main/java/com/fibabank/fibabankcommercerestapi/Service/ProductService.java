package com.fibabank.fibabankcommercerestapi.Service;

import com.fibabank.fibabankcommercerestapi.Model.ProductModel;

import java.util.List;

public interface ProductService {
    public List<ProductModel> getProductsByCategoryId(long categoryId);
    public ProductModel getProductById(long productId);
}
