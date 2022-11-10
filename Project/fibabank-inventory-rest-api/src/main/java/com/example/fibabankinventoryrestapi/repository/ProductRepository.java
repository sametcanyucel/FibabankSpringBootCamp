package com.example.fibabankinventoryrestapi.repository;

import com.example.fibabankinventoryrestapi.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {
    @Query("select p from Product p where p.category.categoryId=:categoryId")
    List<Product> getProductsByCategoryId(@Param("categoryId") long categoryId);
}
