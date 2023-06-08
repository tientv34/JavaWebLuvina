package com.example.lap6.service;


import com.example.lap6.model.Cart;
import com.example.lap6.repositorys.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void save(Cart cart) {
        this.cartRepository.save(cart);
    }

    @Override
    public Cart findById(Long id) {

        return this.cartRepository.findById(id).orElse(null);
    }
    public List<Cart> listAllCars() {
        return cartRepository.findAll();
    }
}
