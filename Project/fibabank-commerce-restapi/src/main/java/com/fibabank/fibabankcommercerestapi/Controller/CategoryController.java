package com.fibabank.fibabankcommercerestapi.Controller;

import com.fibabank.fibabankcommercerestapi.Model.CategoryModel;
import com.fibabank.fibabankcommercerestapi.Service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commerce/inventory")
public class CategoryController {
    @Autowired
    CategoryServiceImpl categoryService;
    @GetMapping("/categories")
    public List<CategoryModel> getAllCategories(){

        return categoryService.getAllCategories();
    }

}
