package com.example.fibabankinventoryrestapi.controller;


import com.example.fibabankinventoryrestapi.business.service.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/inventory")
public class CategoryController {
    @Autowired
    CategoryServiceImp categoryServiceImp;

    @GetMapping("/categories")
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categoryServiceImp.getAllCategories());
    }
}
