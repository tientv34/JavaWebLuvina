package com.example.lap6.controller;


import com.example.lap6.model.Cart;
import com.example.lap6.model.Items;
import com.example.lap6.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
public class CartController {
    @Autowired   private CartService cartService;
    @GetMapping("/addCart")
    public void addCart() {
        Items item1 = new Items("Item 1");  Items item2 = new Items("Item 2");
        Set<Items> items = new HashSet<>();  items.add(item1);  items.add(item2);

        Cart cart = new Cart();
        cart.setItems(items);

        item1.setCart(cart);  item2.setCart(cart);
        // lưu dữ liệu xuống 2 bảng Cart và Items
        cartService.save(cart);
    }
    @GetMapping("/carts")
    public List<Cart> getALLCarts() {
        List<Cart> listCarts = cartService.listAllCars();

        return listCarts;
    }
    @GetMapping("/getCart/{id}")
    public Cart getCart(@PathVariable Long id) {
        return this.cartService.findById(id);
    }
}
