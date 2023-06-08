package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> listAll();
    Product add(Product product);
    Product update(Product product);
    Product findById(int id);
    void delete(int id);
}
