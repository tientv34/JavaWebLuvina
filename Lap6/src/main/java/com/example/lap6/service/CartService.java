package com.example.lap6.service;


import com.example.lap6.model.Cart;

import java.util.List;

public interface CartService {
    void save(Cart cart);
    Cart findById(Long id);
    public List<Cart> listAllCars();
}
