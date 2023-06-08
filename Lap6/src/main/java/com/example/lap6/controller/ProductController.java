package com.example.lap6.controller;

import com.example.lap6.model.Product;
import com.example.lap6.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
    @Autowired
    private IProductService productService;

    @CrossOrigin
    @GetMapping("/products")
    public List<Product> getALL() {
        List<Product> listProducts = productService.getAllProduct();

        return listProducts;
    }

    @CrossOrigin
    @GetMapping("/getProdByID/{id}")
    public Product getProdById(@PathVariable Long id) {
        Product prod = productService.getProductByID(id);
        return prod;
    }

    @CrossOrigin
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product prod) throws Exception {
        try {
            productService.createOrUpdateProduct(prod);
            return productService.getProductByID(prod.getId());
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Đã   có");
        }
    }

    @CrossOrigin
    @DeleteMapping("/products/{id}")
    public String  deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return "deleted";
    }

}
