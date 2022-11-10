package com.fibabank.fibabankcommercerestapi.Service;

import com.fibabank.fibabankcommercerestapi.Model.CategoryModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    public List<CategoryModel> getAllCategories() {
        String url = "http://localhost:8081/inventory/categories";
        RestTemplate restTemplate = new RestTemplate();
        List<CategoryModel>result = restTemplate.getForObject(url, List.class);
        return result;

    }
}
