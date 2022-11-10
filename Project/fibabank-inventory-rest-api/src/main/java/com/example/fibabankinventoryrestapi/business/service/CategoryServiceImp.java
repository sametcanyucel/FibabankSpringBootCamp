package com.example.fibabankinventoryrestapi.business.service;

import com.example.fibabankinventoryrestapi.business.dto.CategoryDto;
import com.example.fibabankinventoryrestapi.entity.Category;
import com.example.fibabankinventoryrestapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImp implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategories() {
        Iterable<Category>categories=categoryRepository.findAll();
        List<CategoryDto>categoryDtos=new ArrayList<>();
        for (Category category:categories) {
            CategoryDto categoryDto=new CategoryDto();
            categoryDto.setCategoryId(category.getCategoryId());
            categoryDto.setCategoryName(category.getCategoryName());
            categoryDtos.add(categoryDto);
        }

        return categoryDtos;
    }
}
