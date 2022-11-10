package com.fibabank.fibabankcommercerestapi.Service;

import com.fibabank.fibabankcommercerestapi.Model.ProductModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService {

    public List<ProductModel> getProductsByCategoryId(long categoryId) {
        String url = "http://localhost:8081/inventory/products/"+categoryId;
        RestTemplate restTemplate = new RestTemplate();
        List<ProductModel>result = restTemplate.getForObject(url, List.class);
        return result;

    }
    public ProductModel getProductById(long productId) {

        String url = "http://localhost:8081/inventory/product/" + productId;
        RestTemplate restTemplate = new RestTemplate();
        ProductModel result = restTemplate.getForObject(url, ProductModel.class);
        return result;

    }
}
