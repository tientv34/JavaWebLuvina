package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.Cart;
import com.example.ASM_Luvina.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements ICartService{
    @Autowired
    CartRepository cartRepo;

    @Override
    public List<Cart> listAll() {
        return cartRepo.findAll();
    }

    @Override
    public Cart add(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public Cart update(Cart cart, int id) {
        Cart current = cartRepo.findById(id).get();
        current.setCreated_Date(cart.getCreated_Date());
        return  cartRepo.save(current);
    }

    @Override
    public Cart findById(int id) {
        return cartRepo.findById(id).get();
    }

    @Override
    public void delete(int id) {
        cartRepo.deleteById(id);
    }
}
