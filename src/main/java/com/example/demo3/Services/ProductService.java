package com.example.demo3.Services;

import com.example.demo3.Model.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);
    public List<Product> getAllProducts();
}
