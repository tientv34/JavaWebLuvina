package com.example.ASM_Luvina.service;

import com.example.ASM_Luvina.entity.Cart;

import java.util.List;

public interface ICartService {
    List<Cart> listAll();
    Cart add(Cart product);
    Cart update(Cart product,int id);
    Cart findById(int id);
    void delete(int id);
}
