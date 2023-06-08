package com.example.lap6.service;

import com.example.lap6.model.Product;

import java.util.List;

public interface IProductService {
    void createOrUpdateProduct (Product prd);
    List<Product> getAllProduct();
    void deleteProduct(Long id);
    Product editProduct(Long id);
    Product getProductByID(Long id);
}
