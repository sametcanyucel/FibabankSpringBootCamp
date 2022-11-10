package com.example.fibabankinventoryrestapi.controller;


import com.example.fibabankinventoryrestapi.business.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inventory")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProductById(@PathVariable("id")long productId){
        if(productService.getProductById(productId)==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aradığınız Ürün Bulunamadı");
        }
        else return ResponseEntity.ok(productService.getProductById(productId));
    }
    @GetMapping("/products/{categoryid}")
    public ResponseEntity<?> getProductsByCategoryId(@PathVariable("categoryid")long categoryId){

        if(productService.getProductsByCategoryId(categoryId).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aradığınız Id'deki Kategory Bulunamadı");
        }
        else return ResponseEntity.ok(productService.getProductsByCategoryId(categoryId));
    }
}
