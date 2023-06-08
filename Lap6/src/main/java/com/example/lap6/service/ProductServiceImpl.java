package com.example.lap6.service;

import com.example.lap6.model.Employee;
import com.example.lap6.model.Product;
import com.example.lap6.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createOrUpdateProduct(Product prd) {
        productRepository.save(prd);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product editProduct(Long id) {
        Product prd = productRepository.getOne(id);
        return prd;
    }

    @Override
    public Product getProductByID(Long id) {
        return productRepository.findById(id).get();
    }
}
