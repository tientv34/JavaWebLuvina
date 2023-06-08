package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.Product;
import com.example.ASM_Luvina.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductRepo repo;

    @Override
    public List<Product> listAll() {
        return repo.findAll();
    }

    @Override
    public Product add(Product product) {
        return repo.save(product);
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }


}
