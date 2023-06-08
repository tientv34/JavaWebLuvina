package com.example.ASM_Luvina.controller;

import com.example.ASM_Luvina.entity.Cart;
import com.example.ASM_Luvina.service.CartService;
import com.example.ASM_Luvina.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartRestController {
    @Autowired
    ICartService cartService;
    @GetMapping("/all")
    public List<Cart> getCartList(){
        return cartService.listAll();
    }
    @PostMapping("/create")
    public Cart createCart(@RequestBody Cart cart){
        return cartService.add(cart);
    }

    @PutMapping("/update/{id}")
    public Cart updateCart(Cart cart,@PathVariable("id") int id ){
        return cartService.update(cart,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCart(@PathVariable("id") int id){
        cartService.delete(id);
    }
}
