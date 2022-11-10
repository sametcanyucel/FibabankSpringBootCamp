package com.fibabank.fibabankcommercerestapi.Controller;

import com.fibabank.fibabankcommercerestapi.Model.ProductModel;
import com.fibabank.fibabankcommercerestapi.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commerce/inventory")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @GetMapping("/products/{categoryid}")
    public List<ProductModel> getProductsByCategoryId(@PathVariable("categoryid")long categoryId)
    {
        return productService.getProductsByCategoryId(categoryId);
    }

    @GetMapping("/product/{id}")
    public ProductModel getProductById(@PathVariable("id")long productId)
    {
        return productService.getProductById(productId);
    }

}
